import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws InterruptedException {

        List<String> choiceOptions = Arrays.asList("Rock", "Paper", "Scissors");
        String userChoice;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        char cont = 'y';

        while (cont == ('y')) {
            System.out.print("Time to play");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(250);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println("______               _        \n" +
                    "| ___ \\             | |       \n" +
                    "| |_/ /  ___    ___ | | __    \n" +
                    "|    /  / _ \\  / __|| |/ /    \n" +
                    "| |\\ \\ | (_) || (__ |   <  _  \n" +
                    "\\_| \\_| \\___/  \\___||_|\\_\\( ) \n" +
                    "                          |/  \n");
            Thread.sleep(500);
            System.out.println("______                               \n" +
                    "| ___ \\                              \n" +
                    "| |_/ /  __ _  _ __    ___  _ __     \n" +
                    "|  __/  / _` || '_ \\  / _ \\| '__|    \n" +
                    "| |    | (_| || |_) ||  __/| |    _  \n" +
                    "\\_|     \\__,_|| .__/  \\___||_|   ( ) \n" +
                    "              | |                |/  \n" +
                    "              |_|                    ");
            Thread.sleep(500);
            System.out.println(" _____        _                              _  \n" +
                    "/  ___|      (_)                            | | \n" +
                    "\\ `--.   ___  _  ___  ___   ___   _ __  ___ | | \n" +
                    " `--. \\ / __|| |/ __|/ __| / _ \\ | '__|/ __|| | \n" +
                    "/\\__/ /| (__ | |\\__ \\\\__ \\| (_) || |   \\__ \\|_| \n" +
                    "\\____/  \\___||_||___/|___/ \\___/ |_|   |___/(_) \n" +
                    "                                                \n" +
                    "                                                ");
            Thread.sleep(500);

            while (true) {
                System.out.println("Type in the number of your choice: (1) Rock, (2) Paper, or (3) Scissors");
                int choiceNumber = scanner.nextInt();
                if (choiceNumber == 1) {
                    userChoice = "Rock";
                    break;
                } else if (choiceNumber == 2) {
                    userChoice = "Paper";
                    break;
                } else if (choiceNumber == 3) {
                    userChoice = "Scissors";
                    break;
                } else {
                    System.out.println("Your choice must be a number.");

                }
            }
            Thread.sleep(500);
            System.out.println("You chose " + userChoice + ".");

            Random rand = new Random();
            String computerChoice = choiceOptions.get(rand.nextInt(choiceOptions.size()));

            Thread.sleep(750);
            System.out.println("The computer chose " + computerChoice + ".");

            if (userChoice.equals(computerChoice)) {
                Thread.sleep(750);
                System.out.println("IT'S A TIE!");
                Thread.sleep(750);
                System.out.println("Your current score is " + score);
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors") || userChoice.equals("Paper") && choiceOptions.equals("Rock") || userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
                Thread.sleep(750);
                System.out.println("YOU WON!");
                score++;
                Thread.sleep(750);
                System.out.println("Your current score is " + score);
            } else {
                Thread.sleep(750);
                System.out.println("THE COMPUTER WON!");
                Thread.sleep(750);
                System.out.println("Your current score is " + score);
            }

            Thread.sleep(750);
            System.out.println("Would you like to play again? (Y/N)");
            cont = scanner.next().toLowerCase().charAt(0);

            if (cont == 'n'){
                System.out.println("Thanks for playing! Goodbye!");
            }
        }
    }
}