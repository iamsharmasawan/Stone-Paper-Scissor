import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int computerScore = 0;
    int playerScore = 0;

    while (true) {
      // Display the score
      System.out.println("Computer: " + computerScore + " Player: " + playerScore);

      // Get the player's choice
      System.out.print("Enter 's' for stone, 'p' for paper, or 'x' for scissors: ");
      String playerChoice = scanner.nextLine();

      // Generate the computer's choice
      int computerChoice = random.nextInt(3);
      String computerChoiceString = "";
      if (computerChoice == 0) {
        computerChoiceString = "s";
      } else if (computerChoice == 1) {
        computerChoiceString = "p";
      } else {
        computerChoiceString = "x";
      }

      // Determine the winner
      if (playerChoice.equals(computerChoiceString)) {
        System.out.println("It's a tie!");
      } else if (playerChoice.equals("s") && computerChoiceString.equals("p")) {
        System.out.println("Computer wins!");
        computerScore++;
      } else if (playerChoice.equals("s") && computerChoiceString.equals("x")) {
        System.out.println("Player wins!");
        playerScore++;
      } else if (playerChoice.equals("p") && computerChoiceString.equals("s")) {
        System.out.println("Player wins!");
        playerScore++;
      } else if (playerChoice.equals("p") && computerChoiceString.equals("x")) {
        System.out.println("Computer wins!");
        computerScore++;
      } else if (playerChoice.equals("x") && computerChoiceString.equals("s")) {
        System.out.println("Computer wins!");
        computerScore++;
      } else if (playerChoice.equals("x") && computerChoiceString.equals("p")) {
        System.out.println("Player wins!");
        playerScore++;
      }
    }
  }
}

