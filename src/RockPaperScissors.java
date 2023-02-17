import java.awt.*;
import java.util.*;
import java.util.List;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception {

        List<String> choiceOptions = Arrays.asList("Rock", "Paper", "Scissors");
        String userChoice = "";
        int userScore = 0;
        int computerScore = 0;
        Scanner scanner = new Scanner(System.in);
        String cont = "y";

        System.out.print("Time to play");
        Thread.sleep(250);
        System.out.print(".");
        Thread.sleep(250);
        System.out.print(".");
        Thread.sleep(250);
        System.out.println(".");
        Thread.sleep(750);
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


        while (cont.equals("y")) {
            while (true) {
                try {
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
                        Thread.sleep(500);
                        System.out.println();
                        System.out.println("¯\\(°_o)/¯");
                        System.out.println("Invalid input. Your choice must be a number 1-3.");
                        System.out.println();
                        Thread.sleep(500);
                    }
                } catch (InputMismatchException e) {
                    Thread.sleep(500);
                    System.out.println();
                    System.out.println("¯\\(°_o)/¯");
                    System.out.println("Invalid input. Your choice must be a number 1-3.");
                    System.out.println();
                    scanner.nextLine();
                    Thread.sleep(500);
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
                System.out.println();
                System.out.println("IT'S A TIE!");
                Thread.sleep(750);
                System.out.println();
                System.out.println("***CURRENT SCORE***\n" +
                        "You: " + userScore + "\n" +
                        "Computer: " + computerScore + "\n");
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors") || userChoice.equals("Paper") && computerChoice.equals("Rock") || userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
                Thread.sleep(750);
                System.out.println();
                System.out.println("YOU WON!");
                userScore++;
                Thread.sleep(750);
                System.out.println();
                Toolkit.getDefaultToolkit().beep();
                System.out.println("***CURRENT SCORE***\n" +
                        "You: " + userScore + " *\n" +
                        "Computer: " + computerScore + "\n");
            } else {
                Thread.sleep(750);
                System.out.println();
                System.out.println("THE COMPUTER WON!");
                computerScore++;
                Thread.sleep(750);
                System.out.println();
                System.out.println("***CURRENT SCORE***\n" +
                        "You: " + userScore + "\n" +
                        "Computer: " + computerScore + " *\n");
            }

            while (true) {
                Thread.sleep(750);
                System.out.println("Would you like to play again? (Y/N)");
                cont = scanner.next().toLowerCase();

                if (cont.equals("n")) {
                    Thread.sleep(750);
                    System.out.println();
                    System.out.println("Thanks for playing! Goodbye!");
                    System.out.println(	"☉ ‿ ⚆");
                    break;
                } else if (cont.equals("y")) {
                    Thread.sleep(750);
                    System.out.print("As you wish");
                    Thread.sleep(250);
                    System.out.print(".");
                    Thread.sleep(250);
                    System.out.print(".");
                    Thread.sleep(250);
                    System.out.println(".");
                    Thread.sleep(750);
                    System.out.println();
                    break;
                } else {
                    Thread.sleep(500);
                    System.out.println("¯\\(°_o)/¯");
                    System.out.println("You must enter 'Y' for YES or 'N' for NO. ");
                }
            }
        }
    }
}