package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        do{
            System.out.print("Num1 : ");
            double n1 = sc.nextDouble();

            System.out.print("enter operator : ");
            char opp = sc.next().charAt(0);

            System.out.print("Num2 : ");
            double n2 = sc.nextDouble();

            double result = 0;

            switch (opp){
                case '+' : result = n1 + n2; break;
                case '-' : result = n1 - n2; break;
                case '*' : result = n1 * n2; break;
                case '/' :
                    if(n2 == 0){
                        System.out.print("0 lam poda mudiyathu");
                        continue;
                    }
                    result = n1 / n2;
                    break;
            }
            System.out.println ("Result = " + result);
            System.out.print("Do you want to calculate again? (yes/no): ");
            choice = sc.next();
        }while (choice.equalsIgnoreCase("yes"));
        System.out.println("Calculator terminated.");
        sc.close();

    }
}
