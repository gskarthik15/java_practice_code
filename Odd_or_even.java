package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.print("Type 'ODD' or 'EVENT : ");
        String userChoice = sc.nextLine().toLowerCase();

        System.out.print("Please enter you number : ");
        int userNum = sc.nextInt();

        int compNum =rn.nextInt(11);
        System.out.print("Computer Chooses : " +compNum);

        if (userNum == compNum){
            System.out.print("Both are same, You're OUT");
        }
        else {
            int sum = userNum + compNum;
            System.out.print("Sum = " + sum);

            if ((sum % 2 == 0 && userChoice.equals("even")) ||
                    (sum % 2 != 0 && userChoice.equals("odd"))) {
                System.out.print("you Win!");
            } else {
                System.out.print("You lost :(");
            }
        }

    }
}
