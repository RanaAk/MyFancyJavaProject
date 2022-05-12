package com.mycompany.myfancyjavaproject;


import java.util.*;


/**
 *
 * @author RANA
 */

public class MyFancyJavaProject {

    public static void main(String[] args) {

    char operator;
    Double n1, n2, Result;

    
    Scanner input = new Scanner(System.in);

    
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

   
    System.out.println("Enter first number");
    n1 = input.nextDouble();

    System.out.println("Enter second number");
    n2 = input.nextDouble();

    switch (operator) {

      
      case '+':
        Result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + Result);
        break;

     
      case '-':
        Result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + Result);
        break;

     
      case '*':
        Result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + Result);
        break;

    
      case '/':
        Result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + Result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }


}


