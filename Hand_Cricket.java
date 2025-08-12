package org.example;

import java.util.Random;
import java.util.Scanner;

public class Hand_Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.print("Type 'ODD' or 'EVENT : ");
        String userChoice = sc.nextLine().toLowerCase();

        System.out.print("Please enter you number : ");
        int userNum = sc.nextInt();

        int compNum = rn.nextInt(11);
        System.out.print("Computer Chooses : " + compNum);

        int sum = userNum + compNum;
        System.out.println(" Sum = " + sum);

        boolean userWinsToss = ((sum % 2 == 0 && userChoice.equals("even")) ||
                (sum % 2 != 0 && userChoice.equals("odd")));

        boolean playerBatsFirst, compBatsFirst;

        if (userWinsToss){
            System.out.println(" Won the toss, choose bat or bowl : ");
            playerBatsFirst = sc.next().equalsIgnoreCase("bat");
        }else {
            System.out.println(" Computer won toss");
            compBatsFirst = rn.nextBoolean();
            System.out.println(" Computer choose to " + (compBatsFirst ? "bat":"bowl") + " first.");
            playerBatsFirst = ! compBatsFirst;
        }

        int playerScore, compScore;

        if (playerBatsFirst) {
            playerScore = playBatting(sc, rn, "Player");
            System.out.println("\nTarget for Computer: " + (playerScore + 1));
            compScore = playBatting(sc, rn, "Computer", playerScore + 1);

        } else {
            compScore = playBatting(sc, rn, "Computer");
            System.out.println("\nTarget for Player: " + (compScore + 1));
            playerScore = playBatting(sc, rn, "Player", compScore + 1);
        }

        // Result
        System.out.println("\n=== Final Scores ===");
        System.out.println("Player: " + playerScore);
        System.out.println("Computer: " + compScore);

        if (playerScore > compScore) {
            System.out.println(" You Win!");
        } else if (playerScore < compScore) {
            System.out.println(" Computer Wins!");
        } else {
            System.out.println("It's a Tie!");
        }

        sc.close();
    }

        public static int playBatting(Scanner sc, Random rn, String batsman){
            int score =0;
            System.out.println(batsman +"Batting");
            {
                while (true){
                    int player, comp;
                    if (batsman.equals("Player")){
                        System.out.print("Your shot (0-6) : ");
                        player = sc.nextInt();
                        comp = rn.nextInt(6)+1;
                        System.out.print("Computer bowls : "+ comp);
                    }
                    else {
                        System.out.print("You bowl (0-6): ");
                        player = sc.nextInt();
                        comp = rn.nextInt(6)+1;
                        System.out.print("Computer hits : "+ comp);
                    }

                    if (player == comp){
                        System.out.print(batsman + " is OUT");
                        break;
                    }else {
                        score += batsman.equals("Player") ? player : comp;
                        System.out.println(batsman + " score: " + score);
                    }
                }return score;

            }
            
        }
        public static int playBatting(Scanner sc, Random rn, String batsman, int target){
            int score =0;
            System.out.println(batsman +"Batting");
            {
                while (true){
                    int player, comp;
                    if (batsman.equals("Player")){
                        System.out.print("Your shot (0-6) : ");
                        player = sc.nextInt();
                        comp = rn.nextInt(6)+1;
                        System.out.print("Computer bowls : "+ comp);
                    }
                    else {
                        System.out.print("You bowl (0-6): ");
                        player = sc.nextInt();
                        comp = rn.nextInt(6)+1;
                        System.out.print("Computer hits : "+ comp);
                    }

                    if (player == comp){
                        System.out.print(batsman + " is OUT");
                    }else {
                        score += batsman.equals("Player") ? player : comp;
                        System.out.println(batsman + " score: " + score);

                        if (score > target){
                            System.out.print(batsman + " has chased the target, you WIN");
                            break;
                        }
                    }
                }return score;

            }

        }

    }


