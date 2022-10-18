import java.util.Scanner;

public class FrontDoor {
    public static void main(String[] args) {

        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your yes-no question and I will answer it: ");
        String question = scan.nextLine();

        // Get a random number from 1 to 6
        int randomNumber = (int)(Math.random() * 10) +1;
        if (randomNumber == 1)
        {
            System.out.println("Critical failure, take 4d20 necrotic damage and roll a constitution saving throw. Your are frightened for 3 rounds");
        }
        else if (randomNumber == 2)
        {
            System.out.println("May more than god have mercy on your soul");
        }
        else if (randomNumber == 3)
        {
            System.out.println("Oh the Misery");
        }
        else if (randomNumber == 4)
        {
            System.out.println("Nah bro fr");
        }
        else if (randomNumber == 5)
        {
            System.out.println("Perhaps");
        }
        else if (randomNumber == 6)
        {
            System.out.println("Possible with enough explosives");
        }
        else if (randomNumber == 7)
        {
            System.out.println("Good luck, though you might not need it");
        }
        else if (randomNumber == 8)
        {
            System.out.println("Definitely if you use more gun");
        }
        else if (randomNumber == 9)
        {
            System.out.println("Gods will be watching over you");
        }
        else if (randomNumber == 10)
        {
            System.out.println("Those blessed by the Hakurei never fail");
        }
        // Use selection statements (if, if-else, else-if)
        // to choose from 1 of 6 responses to yes-no questions, then print it out!
    }
}
