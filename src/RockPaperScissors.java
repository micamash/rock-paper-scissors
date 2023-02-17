import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        List<String> choiceOptions = Arrays.asList("Rock", "Paper", "Scissors");
        String choiceString;

        System.out.println("Time to play Rock,Paper, Scissors!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type in the number of your choice: (1) Rock, (2) Paper, or (3) Scissors");
            int choiceNumber = scanner.nextInt();
            if (choiceNumber == 1) {
                choiceString = "Rock";
                break;
            } else if (choiceNumber == 2) {
                choiceString = "Paper";
                break;
            } else if (choiceNumber == 3) {
                choiceString = "Scissors";
                break;
            } else {
                System.out.println("Your choice must be a number.");

            }
        }

        System.out.println("You chose " + choiceString + "!");


    }
}