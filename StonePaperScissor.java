import java.util.*;
import java.util.Random;

public class StonePaperScissor {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("How many Rounds do you want to Play:");
    int n = sc.nextInt();
    int ComputerScore = 0;
    int HumanScore = 0;
    for (int i = 1; i < n + 1; i++) {
      System.out.println("\n*****GAME START*****\n\nPress 0 for STONE\nPress 1 for Paper\nPress 2 for Scissor");

      Random rand = new Random();
      int Computer_Choice = rand.nextInt(0, 3);

      int Human_Choice = sc.nextInt();
      System.out.println("You Choose " + Human_Choice + "\n");

      if (Computer_Choice == Human_Choice) {
        System.out.println("Computer Choose " + Computer_Choice);
        System.out.println("\nTHE MATCH IS DRAW");
      } else if (Human_Choice != 0 && Human_Choice != 1 && Human_Choice != 2) {
        System.out.println("\nPlease Enter a valid number 0 , 1 or 2!!!!!!!!!");
      } else if (Computer_Choice == 0 && Human_Choice == 1 || Computer_Choice == 1 && Human_Choice == 2 || Computer_Choice == 2 && Human_Choice == 0) {
        System.out.println("Computer Choose " + Computer_Choice);
        System.out.println("\nYOU WIN");
        HumanScore++;
      } else {
        System.out.println("Computer Choose " + Computer_Choice);
        System.out.println("\nCOMPUTER WINS");
        ComputerScore++;
      }
      System.out.println("\nRound " + i + " Over ");

      System.out.println("The Score of Human is " + HumanScore + " and The Score of Computer is " + ComputerScore);

    }
    if (ComputerScore > HumanScore) {
      System.out.println("COMPUTER WINS THE SERIES");
    } else if (ComputerScore == HumanScore) {
      System.out.println("SERIES DRAW");
    } else {
      System.out.println("HUMAN WINS THE SERIES");
    }
  }
}
