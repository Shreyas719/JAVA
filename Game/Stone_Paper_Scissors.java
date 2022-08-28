package com.company;
import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(3);
        String playerMove = new String();
        String computerMove = new String();

        System.out.println("Enter your move (Stone / Paper / Scissors) : ==>");
        playerMove = sc.next().toUpperCase();

//SB
        if (randomNumber == 0) {
            computerMove = "STONE";
            System.out.println("Player move is : " + playerMove);
            System.out.println("Computer move is : " + computerMove);


        } else if (randomNumber == 1) {
            computerMove = "PAPER";
            System.out.println("Player move is : " + playerMove);
            System.out.println("Computer move is : " + computerMove);


        } else if (randomNumber == 2) {
            computerMove = "SCISSORS";
            System.out.println("Player move is : " + playerMove);
            System.out.println("Computer move is : " + computerMove);


        }

        if (playerMove.equals(computerMove)) {
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("   Match was tie!!!  ");
            System.out.println("- - - - - - - - - - - - ");
        }


    }
}


