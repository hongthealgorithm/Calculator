package com.company;


import java.util.Scanner;

public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    public void add(){
        System.out.println("Enter the first number:");
        double firstValue = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondValue = scanner.nextDouble();
        double total = firstValue + secondValue;
        System.out.println(firstValue + " + " + secondValue + " = " + total);
    }

    public void sub(){

        System.out.println("Enter the first number:");
        double firstValue = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondValue = scanner.nextDouble();
        double total = firstValue - secondValue;
        System.out.println(firstValue + " - " + secondValue + " = " + total);
    }

    public void mul(){
        System.out.println("Enter the first number:");
        double firstValue = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondValue = scanner.nextDouble();
        double total = firstValue * secondValue;
        System.out.println(firstValue + " * " + secondValue + " = " + total);
    }

    public void div(){
        System.out.println("Enter the first number:");
        double firstValue = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondValue = scanner.nextDouble();
        double total = firstValue / secondValue;
        System.out.println(firstValue + " / " + secondValue + " = " + total);

    }

    public void square(){
        System.out.println("Enter the value");
        double value = scanner.nextDouble();
        double total = value * value;
        System.out.println("The squared value of " + value + " = " + total);
    }


    public void cube(){
        System.out.println("Enter the value");
        double value = scanner.nextDouble();
        double total = value * value * value;
        System.out.println("The cubed value of " + value + " = " + total);
    }


    public void powerOf(){
        System.out.println("Enter first number:");
        double firstValue = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondValue = scanner.nextDouble();
        double firstValue1 = firstValue;
        for (int i = 1; i < secondValue; i++){

            firstValue1 *= firstValue;
        }


        double total = firstValue1;
        System.out.println(firstValue + " to the power of " + secondValue + " = " + total);

    }

    public void printOptions(){
        System.out.println("\nPress");
        System.out.println("0: To quit the application");
        System.out.println("1: To add 2 numbers");
        System.out.println("2: To subtract  number from another number");
        System.out.println("3: To multiply 2 numbers");
        System.out.println("4: To divide a number from another number");
        System.out.println("5: To square a number(multiply it by itself)");
        System.out.println("6: To cube a number(multiply it by itself 2 times)");
        System.out.println("7: To power the first number by the second(multiply itself by the other number's times)");
        System.out.println("8: To print the list of options");

    }




}
