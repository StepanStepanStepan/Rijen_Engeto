package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
           //calculatorOndra();
           calculator();
        //      calculatorValidInput();
           //   calendarQuaters ( 13);
           //   printPole ();

       }


    //  Scanner sc = new Scanner(System.in); // for reading from input
    //    sc.useLocale(Locale.US); // setting locale so input accepts decimal point instead of comma
    //  final String line = sc.nextLine();
       /* System.out.println("Zadej vstup strana a: " );
        final double decimal_a = sc.nextDouble();
        System.out.println("Zadej vstup strana b: " );
        final double decimal_b = sc.nextDouble();
        System.out.println("Zadej vstup strana c: " );
        final double decimal_c = sc.nextDouble();
      //  System.out.println("Vstup: " + line);
        double triangle_circumference = decimal_a + decimal_b + decimal_c;
        System.out.println("triangle_circumference: " + triangle_circumference );*/


    // write your code here
    //    int firstVariable = 8;
    //    System.out.println("firstVariable " +  firstVariable);
      /*  int a = 1;
        int b = 2;
        int c = 5;
        double perimeter= 5;
        int triangle_circumference = 0;
        triangle_circumference = a + b + c;
        double plocha_kruhu_2 = Math.PI* (perimeter * perimeter);
        double plocha_kruhu = Math.PI * (Math.pow(perimeter, 2));
        char text_lowercase = 'c';
        char text_uppercase= 'a';
        text_uppercase = (char) (text_lowercase - 32);
        System.out.println("text_lowercase: " + text_lowercase);
        System.out.println("text_uppercase: " +  text_uppercase);*/

       /*  System.out.println("triangle_circumference: " + triangle_circumference);
        System.out.println("plocha_kruhu_2: " + plocha_kruhu_2);
        System.out.println("plocha_kruhu: " + plocha_kruhu); */


    //}

  //  public static void main(String[] args) {

/*       public enum operator {
           *//* PLUS(operator: '+'),
            MINUS(operator: '+'),
            MULTIPLY(operator: '*'),
            DIVIDE(operator: '/')*//*
           PLUS,
           MINUS
        }*/

   /* public static void calculatorOndra(); {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        boolean terminateProgram = false;
        double terminationNumber = 999;
      //  while (terminateProgram == false) {
            System.out.println("Enter two numbers: ");
            System.out.print("first: ");
           // double first = scanner.nextDouble();
            int first = scanner.nextInt();
            //boolean validNumber_a = validityCheck(first);
           *//* if (first == terminationNumber) {
                terminateProgram = true;
                break;
            }*//*
            scanner.nextLine();
            System.out.print("second: ");
          //  double second = scanner.nextDouble(); // code duplicity
            int second = scanner.nextInt(); // code duplicity
           *//* if (second == terminationNumber) {
                terminateProgram = true;
                break;
            }*//*
            scanner.nextLine();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0); // danger -> potential source of error
            *//*if (operator == 'x') {
                terminateProgram = true;
                break;
            }*//*
            //double result;
            int result;
            result = 0;
                        if (operator == '+') { // use switch
                result = first + second;
            } else if (operator == '-') {
                result = first - second;
            } else if (operator == '*') {
                result = first * second;
            } else if (operator == '/') {
                try {
                    result = first / second;
                }
                catch (Exception e) {

                    System.out.println("Something went wrong.");
                }
            } else {
                // operator doesn't match any case constant (+, -, *, /)
                System.out.printf("Error! operator is not correct");
                return;
            }
            System.out.printf(first + " " + operator + " " + second + " = " + result);
        }*/



   private static void printPole() { // just to create an array and print it

       String[] cars = {"Volvo", "Ford", "Mazda", "Skoda"} ;
       double[] numbers = new double[7];
       String[] stars = new String [4];

        for  (int i = 0;  i < stars.length; i++) {
            stars[i]= "*";
            for (int j = 0; j < i; j++) {
                stars[i] =  stars[i] + "*";
                            }
        }
        System.out.println();
        System.out.println(Arrays.toString(stars));
        System.out.println();
        //printArrayCycle(stars);

      for  (int i = 0;  i < cars.length; i++){
           System.out.println("Auto na " + (i+1) + ". pozici je " + cars[i]);
       }
        System.out.println();
        for  (int i = 0;  i < numbers.length; i++){
            numbers[i]= 2*i;
            System.out.println("Number on " + (i+1) + ". position is " + numbers[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println(Arrays.toString(cars));

    }

    private static void printArrayCycle(String[] hvezdicky) { // prints elements of input array
        for  (int i = 0;  i < hvezdicky.length; i++) {
            System.out.println("Array on " + (i + 1) + ". position is " + hvezdicky[i]);
        }
        System.out.println();
        for (String i : hvezdicky) {
            System.out.println(i);
        }
    }

    private static void calendarQuaters  (int month) { // returns quarter in  a year 
        if (month <= 3) {
            System.out.println("Month " + month + " is within first quarter");
        }
        else if (month >= 4 && month <=6) {
            System.out.println("Month " + month + " is within second quarter");
        }
        else if (month >= 7 && month <=9) {
            System.out.println("Month " + month + " is within third quarter");
        }
        else if (month >= 10 && month <=12) {
            System.out.println("Month " + month + " is within fourth quarter");
        }
        else  {
            System.out.println("Month " + month + " is outside quarters in a year");
        }
    }

    private static void calculatorValidInput () {

        Scanner sc = new Scanner(System.in); // for reading from input
        sc.useLocale(Locale.US); // setting locale so input accepts decimal point instead of comma
        //  final String line = sc.nextLine();
        // Calculator
        // Adding
        System.out.println("Enter input (validity check on input), number a: " );
        String input_a = sc.nextLine();
        //final double decimal_a = sc.nextDouble();
        boolean validNumber_a = validityCheck(input_a);
        System.out.println("Enter input, number b: ");
        String input_b = sc.nextLine();
        boolean validNumber_b = validityCheck(input_b);
        if (validNumber_a && validNumber_b) {

            double decimal_a = Double.parseDouble(input_a); //converting string to double
            double decimal_b = Double.parseDouble(input_b); //converting string to double

           // final double decimal_b = sc.nextDouble();
            double sum_of_two_numbers = decimal_a + decimal_b;
            double subtract_of_two_numbers = decimal_a - decimal_b;
            double product_of_two_numbers = decimal_a * decimal_b;
            double division_of_two_numbers = 0;
            double modulo_of_two_numbers = 0;

            System.out.println("input_a: " + input_a);
            System.out.println("input_b: " + input_b);
            System.out.println();

            if (decimal_b == 0) {
                System.out.println("Division by 0, not allowed!");
                System.out.println("sum_of_two_numbers: " + sum_of_two_numbers);
                System.out.println("subtract_of_two_numbers: " + subtract_of_two_numbers);
                System.out.println("product_of_two_numbers: " + product_of_two_numbers);
            } else {
                division_of_two_numbers = decimal_a / decimal_b;
                modulo_of_two_numbers = decimal_a % decimal_b;

                System.out.println("sum_of_two_numbers: " + sum_of_two_numbers);
                System.out.println("subtract_of_two_numbers: " + subtract_of_two_numbers);
                System.out.println("product_of_two_numbers: " + product_of_two_numbers);
                System.out.println("division_of_two_numbers: " + division_of_two_numbers);
                System.out.println("modulo_of_two_numbers: " + modulo_of_two_numbers);
            }
        }
        else {
            System.out.println("Incorrect input");
        }
    }



    private static boolean validityCheck (String strNum) { //checks whether string on input can be represented as decimal, if not returns error, if yes ready to convert to double

        return strNum.matches("-?\\d+(\\.\\d+)?");
        //    double decimal_check = Double.parseDouble(text); //converting string to double
    }




    private static void calculator () {

            Scanner sc = new Scanner(System.in); // for reading from input
            sc.useLocale(Locale.US); // setting locale so input accepts decimal point instead of comma
            //  final String line = sc.nextLine();
        // Calculator
        // Adding
        System.out.println("This is suppose to be second version of the code aka new commit. It does not check for valid data on input. " );
        System.out.println("Enter input, number a: " );
        final double decimal_a = sc.nextDouble();
        System.out.println("Enter input, number b: " );
        final double decimal_b = sc.nextDouble();
        double sum_of_two_numbers = decimal_a + decimal_b;
        double subtract_of_two_numbers = decimal_a - decimal_b;
        double product_of_two_numbers = decimal_a * decimal_b;
        double division_of_two_numbers = 0;
        double modulo_of_two_numbers = 0;


        if (decimal_b == 0) {
            System.out.println("Division by 0, not allowed!");
            System.out.println("sum_of_two_numbers: " + sum_of_two_numbers );
            System.out.println("subtract_of_two_numbers: " + subtract_of_two_numbers );
            System.out.println("product_of_two_numbers: " + product_of_two_numbers );
        } else
        {division_of_two_numbers = decimal_a / decimal_b;
            modulo_of_two_numbers = decimal_a % decimal_b;

        System.out.println("sum_of_two_numbers: " + sum_of_two_numbers );
        System.out.println("subtract_of_two_numbers: " + subtract_of_two_numbers );
        System.out.println("product_of_two_numbers: " + product_of_two_numbers );
        System.out.println("division_of_two_numbers: " + division_of_two_numbers );
        System.out.println("modulo_of_two_numbers: " + modulo_of_two_numbers );
        }
    }
}
