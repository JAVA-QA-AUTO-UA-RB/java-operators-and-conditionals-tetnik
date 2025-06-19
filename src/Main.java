import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int luck = 50;
        System.out.println("Welcome to the fairy forest!Many adventures await ahead!");
        System.out.println("Your task is to go through the forest, making the right decisions.");
        System.out.println("Your current Health: " + health + ", Luck: " + luck );
        System.out.println("You have found a crossroad.Choose a path : 1 - Old shaky path , 2 - Treasure among the bushes");
        Scanner sc = new Scanner(System.in);
        int choice1 = 2;
        if (choice1 == 1) {
            System.out.println("You took the old shaky path. You twisted your ankle. Health decreased by 35.");
            health -=35;
        } else if (choice1 == 2) {
            System.out.println("You have found a treasure among the bushes! Luck increased by 25 points.");
            luck +=25;
        } else {
            System.out.println("You stand still, unsure what to do. It's already dark, you are starving. Health -15.");
            health -=15;
        }
         System.out.println("Here is a mysterious well. What will you do? 1 - Drink from the well , 2 - Ignore");
        int choice2 = 1;
        if (choice2 == 1) {
            System.out.println("You decided to drink from the well... Magic water has restored you to 30 health points.");
            health +=30;
        } else if (choice2 == 2) {
            System.out.println("Keep going, there's a lot of interesting things ahead!");
        } else {
            System.out.println("You stand still, unsure what to do. It's already dark, you are starving. Health -5.");
            health -=5;
        }
        System.out.println("You have met a magical creature. What will happen next?The creature was not friendly! You had a fight with it. -50 from health.");
        health -=50;
        System.out.println("Final score");
        System.out.println("Health: " + health);
        System.out.println("Luck: " + luck);

        scanner.close();
    }

}
