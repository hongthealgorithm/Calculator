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

    public void sqr(){
        System.out.println("Enter the value:");
      double firstValue = scanner.nextDouble();
     double firstValue1 = Math.sqrt(firstValue);
        System.out.println("The square root of " + firstValue + " is " + firstValue1);

    }

    public void cubeRoot(){
        System.out.println("Enter the value");
        double firstValue = scanner.nextDouble();
        double firstValue1 = Math.cbrt(firstValue);
        System.out.println("The cube root of " + firstValue + " is " + firstValue1);


    }


}
