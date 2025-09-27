package com.pluralsight;

import java.util.Scanner;

public class BetterCalculator {
    //THIS IS A COPIED EXAMPLE FROM WORKBOOK 1, PAGE 96, I ADDED COMMENTS TO BREAK DOWN THE CODE
    public static void main(String[] args) {

        //creating a scanner to read user inputs
        Scanner scanner = new Scanner(System.in);
        //creating a statement that asks user to add or subtract
        System.out.print(
                "What do you want to do (add, subtract) ? ");
        //creating a string variable named command that stores either 'add' or 'subtract'
        String command = scanner.nextLine();
        if (command.equals("add")) { //<--this is how you write conditions for string because they are non-primitive datatypes
            doAdd(scanner); //I believe we are calling the doAdd scanner that we make on line 27
        }
        else if (command.equals("subtract")) {
            doSubtract(scanner);
        }
        else {//if all other conditions fail, print invalid command
            System.out.printf(
                    "%s -- Invalid command!", command);
        }
    }//create a method that adds 2 numbers
    public static void doAdd(Scanner scanner) {
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);
    }//create a method that subtracts 2 numbers
    public static void doSubtract(Scanner scanner) {
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double difference = num1 - num2;
        System.out.printf(
                "%f + %f = %f", num1, num2, difference);
    }

}


