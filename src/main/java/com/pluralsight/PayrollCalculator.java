package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        //Create a scanner for user input
        Scanner payScanner = new Scanner(System.in);

        //ask the use for their name
        System.out.print("What is your name? ");
        //scanner reads input
        String name = payScanner.nextLine();

        //ask the user for their hours worked
        System.out.print("Hours worked: ");
        //scanner reads input
        double hours = payScanner.nextDouble();

        //ask the use for their pay rate
        System.out.print("Rate: ");
        //scanner reads input
        double payRate = payScanner.nextDouble();

        //possible scannerln

        //create a variable that calculates gross pay
        double grossPay = hours * payRate;

        //if statement that considers overtime pay of 1.5
        if (hours > 40) {
            //create variable for overtime and overtime pay
            double overtime = hours - 40;
            double overtimePay = (40 * payRate) + (overtime * payRate * 1.5);
            //create a print statement that displays name and overtime pay
            System.out.printf("%s earns $%.2f", name, overtimePay);
        }else{
            //create a print statement that displays name and gross pay
            System.out.printf("%s earns $%.2f", name, grossPay);
        }

    }

}
