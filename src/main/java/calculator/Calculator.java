package calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String args[])
    {
        int choice, flag=0;
        double num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        do {
            System.out.println("1 for Square Root\n2 for Factorial\n3 for Logarithm\n4 for Power\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){



                switch(choice) {
                    case 1: System.out.println("Enter number");

                        num1 = scan.nextDouble();
                        System.out.println("Square Root of "+num1+":" +squareroot(num1));
                        break;
                    case 2: System.out.println("Enter number");

                        num1 = scan.nextDouble();
                        System.out.println("Factorial of"+num1+":" +factorial(num1));
                        break;
                    case 3: System.out.println("Enter number");

                        num1 = scan.nextDouble();
                        System.out.println("Logarithm of "+num1+":"+log(num1));
                        break;
                    case 4: System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        num1 = scan.nextDouble();
                        System.out.print("Enter number 2: ");
                        num2 = scan.nextDouble();
                        System.out.println("Power of "+num1 +":"+power(num1,num2));
                        break;
                    default: System.out.println("Exiting, Bye");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }

    public static double squareroot(double number1) {
        logger.info("[SQUARE ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public static int factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        int result = 1;
        if(number1 == 1)
            return 1;
        for(int i=2; i<=number1; i++){
            result*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }


    public static double log(double number1) {
        logger.info("[LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - LOG] - " + result);
        return result;
    }

    public static double power(double number1, double number2) {
        logger.info("[POWER] - " + number1 +","+number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }


}
