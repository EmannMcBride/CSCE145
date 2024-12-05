//Emmanuel McBride

import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

        // Start the game
        startAdventure(key);

        // Close the scanner
        key.close();
    }

    // Start the adventure
    public static void startAdventure(Scanner key) {
        System.out.println("Welcome to the 'Choose Your Own Adventure' game!");
        System.out.println("You are in a room with three doors: a red door, a blue door, and a green door.");
        System.out.println("Which door will you choose?");

        // First decision: Choosing one of the three doors
        System.out.print("Enter 'red', 'blue', or 'green': ");
        String firstChoice = key.nextLine().toLowerCase();

        // Branching logic based on the first choice
        if (firstChoice.equals("red")) {
            redDoorPath(key);
        } else if (firstChoice.equals("blue")) {
            blueDoorPath(key);
        } else if (firstChoice.equals("green")) {
            greenDoorPath(key);
        } else {
            System.out.println("Invalid choice! Please restart and choose a valid door.");
            startAdventure(key);
        }
    }

    // Path for the red door
    public static void redDoorPath(Scanner key) {
        System.out.println("\nYou enter the room behind the red door. It's dim and you see two paths.");
        System.out.println("Do you take the left path or the right path?");
        
        // Second decision: Choosing between left or right path
        System.out.print("Enter 'left' or 'right': ");
        String secondChoice = key.nextLine().toLowerCase();

        if (secondChoice.equals("left")) {
            System.out.println("You encounter a treasure chest! Do you open it?");
            System.out.print("Enter 'yes' or 'no': ");
            String thirdChoice = key.nextLine().toLowerCase();
            
            // Third decision with string comparison and compound Boolean expression
            if (thirdChoice.equals("yes")) {
                System.out.println("Congratulations! You found gold and jewels. Ending 1.");
            } else {
                System.out.println("You decided to leave the treasure behind. Suddenly, the floor collapses beneath you. Ending 2.");
            }
        } else {
            System.out.println("You walk down the right path and encounter a sleeping dragon. Do you sneak past or fight the dragon?");
            System.out.print("Enter 'sneak' or 'fight': ");
            String thirdChoice = key.nextLine().toLowerCase();

            if (thirdChoice.equals("sneak")) {
                System.out.println("You successfully sneak past the dragon and escape. Ending 3.");
            } else {
                System.out.println("You bravely fight the dragon, but it overpowers you. Ending 4.");
            }
        }
    }

    // Path for the blue door
    public static void blueDoorPath(Scanner key) {
        System.out.println("\nYou step into a cold, icy room behind the blue door.");
        System.out.println("Ahead of you are two portals: One glows with a warm light, and the other is dark.");
        System.out.println("Do you enter the warm portal or the dark portal?");
        
        // Second decision: Choosing between warm or dark portal
        System.out.print("Enter 'warm' or 'dark': ");
        String secondChoice = key.nextLine().toLowerCase();

        if (secondChoice.equals("warm")) {
            System.out.println("You enter the warm portal and find yourself in a peaceful village.");
            System.out.println("Do you settle in the village or continue exploring?");
            System.out.print("Enter 'settle' or 'explore': ");
            String thirdChoice = key.nextLine().toLowerCase();

            if (thirdChoice.equals("settle")) {
                System.out.println("You live happily ever after in the village. Ending 5.");
            } else {
                System.out.println("While exploring, you discover a hidden cave with ancient artifacts. Ending 6.");
            }
        } else {
            System.out.println("You enter the dark portal and find yourself in a spooky forest.");
            System.out.println("Do you follow the strange sound or head back?");
            System.out.print("Enter 'follow' or 'back': ");
            String thirdChoice = key.nextLine().toLowerCase();

            if (thirdChoice.equals("follow")) {
                System.out.println("You are lost in the forest forever. Ending 7.");
            } else {
                System.out.println("You manage to return safely. Ending 8.");
            }
        }
    }

    // Path for the green door
    public static void greenDoorPath(Scanner key) {
        System.out.println("\nYou step into a jungle behind the green door. You see a river and a cave.");
        System.out.println("Do you follow the river or enter the cave?");
        
        // Second decision: Choosing between river or cave
        System.out.print("Enter 'river' or 'cave': ");
        String secondChoice = key.nextLine().toLowerCase();

        if (secondChoice.equals("river")) {
            System.out.println("As you follow the river, you notice something shiny in the water.");
            System.out.println("Do you investigate it or continue along the river?");
            System.out.print("Enter 'investigate' or 'continue': ");
            String thirdChoice = key.nextLine().toLowerCase();

            if (thirdChoice.equals("investigate")) {
                System.out.println("You find a treasure hidden in the river. Ending 9.");
            } else {
                System.out.println("You continue along the river and safely make it out of the jungle. Ending 10.");
            }
        } else {
            System.out.println("You enter the cave and find a sleeping monster. Do you sneak past it or try to wake it?");
            System.out.print("Enter 'sneak' or 'wake': ");
            String thirdChoice = key.nextLine().toLowerCase();

            if (thirdChoice.equals("sneak")) {
                System.out.println("You sneak past the monster and find the cave exit. Ending 11.");
            } else {
                System.out.println("The monster wakes up and you narrowly escape with your life. Ending 12.");
            }
        }
    }
}