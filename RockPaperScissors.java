/**
 * Class rock paper scissors.
* This program plays rock paper scissors with the user
* @author  John Junior Omage
* @version 1.0
* @since   2020-09-26
*/

import java.util.*;

public class RockPaperScissors { 
 public static void main(String[] args) {
        playOneMatch();

        }

    public static void playOneMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User, pick either Rock, Scissors or Paper: ");
        String playerChoice = scanner.nextLine().toUpperCase();
        String computerChoice = "PAPER";
        // Print out choices
        System.out.println("Player has picked " + playerChoice + " and Computer has picked " + computerChoice + ".");

        // Determine who wins the match
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Players Tied!");
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("PAPER")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (computerChoice.equals("ROCK") && playerChoice.equals("PAPER")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("SCISSORS") && playerChoice.equals("PAPER")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("ROCK") && playerChoice.equals("SCISSORS")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else {
            System.out.println("Something broke in seeing who wins...");
        }

        //Play again?\
        System.out.println("Want to try again? (y/n): ");
        String playAgainResp = scanner.nextLine();

        if (playAgainResp.toLowerCase().equals("y") || playAgainResp.toLowerCase().equals("yes")) {
            playOneMatch();
        } else {
            System.out.println("Game Over: Thank you for playing!");
        }
        scanner.close();
    }

}