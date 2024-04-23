
// package com.pluralsight;

import java.util.Scanner;
public class Calculators {
    public Calculators() {
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select which calculator you would like: option 1: Mortgage Calculator option 2: Future Value ");
        int option = scanner.nextInt();
        switch (option) {
            case 1 :
                mortgageCalculator();
                break;
            case 2 :
                futureValue();
                break;

            default:
                System.out.println("Invalid input");
                break;

        }




    }
    public static void mortgageCalculator() {
        System.out.println();

        System.out.print("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the yearly interest rate: ");
        double yearlyRate = scanner.nextDouble();

        System.out.print("Enter the loan length: ");
        double loanLength = scanner.nextDouble();

        double loanLengthInMonths = loanLength * 12;

        double monthlyInterest = yearlyRate / 1200;

        double monthlyPayment = principal * monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -loanLengthInMonths));

        double totalInterest = monthlyPayment * yearlyRate - principal;

        System.out.printf("Your monthly payment is $%.2f: The total interest paid $%.2f: " ,monthlyPayment,totalInterest);
    }



    public static void futureValue() {
            System.out.println();

            System.out.print("Please enter the deposit amount: ");
            double depositAmount = scanner.nextDouble();

            System.out.print("Please enter the interest rate: ");
            double interestRate = scanner.nextDouble();

            System.out.print("Please enter the amount of years: ");
            double numOfYears = scanner.nextDouble();

        double futureValue = depositAmount / 1200;

        double monthlyPayment = depositAmount *
                futureValue / (1 - Math.pow(1 + futureValue, -interestRate));

        double totalInterest = monthlyPayment * interestRate - depositAmount;

        System.out.printf(" The future value would be $%.2f: The total interest earned is $%.2f : ",futureValue,totalInterest);


        }




    }


