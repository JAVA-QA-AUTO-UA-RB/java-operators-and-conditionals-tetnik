import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int health = 100;
        int luck = 50;
        System.out.println("Welcome to the fairy forest!Many adventures await ahead!");
        System.out.println("Your task is to go through the forest, making the right decisions.");
        System.out.println("Your current Health: " + health + ", Luck: " + luck);
        System.out.println("You have found a crossroad. Choose a path:");
        System.out.println("1 - Old shaky path");
        System.out.println("2 - Treasure among the bushes");
        System.out.print("Your choice: ");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("You took the old shaky path. You twisted your ankle. Health decreased by 35.");
            health -= 35;
        } else if (choice1 == 2) {
            System.out.println("You have found a treasure among the bushes! Luck increased by 25 points.");
            luck += 25;
        } else {
            System.out.println("You stand still, unsure what to do. It's already dark, you are starving. Health -15.");
            health -= 15;
        }
        System.out.println("Here is a mysterious well. What will you do?");
        System.out.println("1 - Drink from the well");
        System.out.println("2 - Ignore it and move on");
        System.out.print("Your choice: ");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            System.out.println("You decided to drink from the well... Magic water has restored you to 50 health points.");
            health += 50;
        } else if (choice2 == 2) {
            System.out.println("It looks like you got tired and need some rest . Luck -10 points");
            luck -= 10;
        } else {
            System.out.println("You stand still, unsure what to do.");
        }

        Random rand = new Random();
        int randomCreatureType = rand.nextInt(3) + 1;  // 1 to 3

        System.out.println("You have met a magical creature. What will happen next?");
        switch (randomCreatureType) {
            case 1:
                System.out.println("The creature is friendly and shares food with you! Health +20.");
                health += 20;
                break;
            case 2:
                System.out.println("The creature is hostile and attacks you! Health -30.");
                health -= 30;
                break;
            case 3:
                System.out.println("The creature is indifferent and ignores you. Nothing changes.");
                break;
        }
            System.out.println("Final score");
            System.out.println("Health: " + health);
            System.out.println("Luck: " + luck);

            sc.close();
        }
    }