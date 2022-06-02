package se.lexicon;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int numToGuess = ran.nextInt(500);
        Scanner input = new Scanner(System.in);
        boolean win = true;
        while (win == true) {
            System.out.println("Guess a number between 1 and 500");
            int guess = input.nextInt();

            if (numToGuess == guess) {
                System.out.println("CONGRATS! This is the right number.");
                win = false;
            } else if (numToGuess > guess) {
                System.out.println("Your number is too low");
            } else if (numToGuess < guess) {
                System.out.println("Your number is to high");
            }
        }
    }
}
