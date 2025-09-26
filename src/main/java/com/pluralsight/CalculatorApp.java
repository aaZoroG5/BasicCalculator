package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        //Create a scanner that allows inputs
        Scanner calcScanner = new Scanner (System.in);

        //Ask the question for the user
        System.out.println("Enter your first number: ");
        //scanner reads input
        int num1 = calcScanner.nextInt();

        //Ask the second question for the user
        System.out.println("Enter your second number: ");
        //scanner reads input
        int num2 = calcScanner.nextInt();

        //get rid of the leftover 'enter'
        calcScanner.nextLine();

        //ask user what operation they are going to execute
        System.out.println("What operation are you doing? +, -, /, *");

        //create a scanner that read operation used (we were instructed only to multiply)
        String operator = calcScanner.nextLine();

        //create a variable that multiples the two user inputs
        int multiply = num1 * num2;

        //create a scanner that outputs the multiplication
        System.out.println("Answer: " + multiply);

    }

}
