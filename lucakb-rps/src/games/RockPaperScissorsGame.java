package games;

import java.util.Scanner;

public class RockPaperScissorsGame {

    Player player;

    Fist aIFist;

    RockPaperScissorsGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("Guoqiang", 0);
        game.playGame();
    }

    void playGame() {
        System.out.println(player.getName());

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++);
        int hand = aIFist.play();
        boolean playerChoice = true;
        int guess = 0;
        while (playerChoice) {
        System.out.println("Pick Rock (0), Paper (1) or Scissors (2): ");
        guess = scanner.nextInt();
        if (guess == hand) {
            playerChoice = false;
            System.out.println("It's a draw");

        } else if (guess == 0 && hand == 2) {
            playerChoice = true;
            System.out.println("Rock beats Scissors, you win!");

        } else if (guess == 0 && hand == 1) {
            playerChoice = false;
            System.out.println("Paper beats Rock, you lose.");

        } else if (guess == 1 && hand == 0) {
            playerChoice = true;
            System.out.println("Paper beats Rock, you win!");

        } else if (guess == 1 && hand == 2) {
            playerChoice = false;
            System.out.println("Scissors beats Paper, you lose.");

        } else if (guess == 2 && hand == 1) {
            playerChoice = true;
            System.out.println("Scissors beats Paper, you win!");

        } else if (guess == 2 && hand == 0) {
            playerChoice = false;
            System.out.println("Rock beats Scissors, you lose.");


        }
            System.out.println("You chose: " + guess + "\n" + "Your opponent chose: " + hand);
        }


    }
    //slumpa fram ett tal 0-2
    //be anv. om ett tal 0-2
    //jämföra för att se vem som vann
}

