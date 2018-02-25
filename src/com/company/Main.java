package com.company;




import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	printOptions();

	boolean quit = false;
	while (!quit) {
       int action = 1;

	      try {

           System.out.println("Enter your action(No decimals):");
           action = scanner.nextInt();
       }catch (RuntimeException ex){
              System.out.println("You entered a letter,word or sentence.Please restart the program");

        }



            Calculator calculator = new Calculator();
        switch (action) {

            case 0:
                System.out.println("Are you sure you want to quit?");
                System.out.println("Type 1 if you are sure you want to quit.");
                System.out.println("Type 2 if you are not sure you want to quit.");
                int action1 = scanner.nextInt();
                        switch (action1) {
                            case 1:
                                System.out.println("Exiting calculator.......");
                                quit = true;

                            case 2:

                        }

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
                calculator.sqr();
                break;
            case 9:
                calculator.cubeRoot();
                break;
            case 10:
                printOptions();
                break;

                default:
                        System.out.println("Oops! There was no option for the number " + action + ". All available actions are from 0 to 8.\n" +
                                "(Enter 8 to print the list of options)");


        }



    }




    }










    public static void printOptions(){
        System.out.println("\nPress");
        System.out.println("0: To quit the application");
        System.out.println("1: To add 2 numbers");
        System.out.println("2: To subtract a number from another number");
        System.out.println("3: To multiply 2 numbers");
        System.out.println("4: To divide a number from another number");
        System.out.println("5: To square a number(multiply it by itself)");
        System.out.println("6: To cube a number(multiply it by itself 2 times)");
        System.out.println("7: To power the first number by the second(multiply itself by the other number's times)");
        System.out.println("8: To square root the number");
        System.out.println("9: To cube root the number");
        System.out.println("10: To print the list of options");
        System.out.println("And, if you enter a letter, you will have to restart the program.");




    }


}




