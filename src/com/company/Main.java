package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.printOptions();

	boolean quit = false;
	while (!quit) {
        System.out.println("Enter your action:");
        int action = scanner.nextInt();
        switch (action) {
            case 0:
                System.out.println("Exiting calculator.......");
                quit = true;
                break;
            case 1:
                calculator.add();
                break;
            case 2:
                calculator.sub();
                break;
            case 3:
                calculator.mul();
                break;
            case 4:
                calculator.div();
                break;
            case 5:
                calculator.square();
                break;
            case 6:
                calculator.cube();
                break;
            case 7:
                calculator.powerOf();
                break;
                case 8:
                calculator.printOptions();
                break;
        }

    }
    }
}
