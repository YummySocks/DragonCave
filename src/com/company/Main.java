package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner answerObj = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. in front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. THe other dragon");
        System.out.println("is hungry and will eat you on sight.");
        String answer = null;

        while ((answer!="1")||(answer!="2")) {

            System.out.println("Which cave will you go into? (1 or 2)");
            answer = answerObj.nextLine();
            if (answer.equals("1")) {
                System.out.println("you approach the cave...");
                System.out.println("It is dark and spooky..");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");

                break;
            } else if (answer.equals("2")) {
                System.out.println("you approach the cave...");
                System.out.println("It is dark and spooky..");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Yells hey man! you want some gold??!");
                break;
            } else {
                System.out.println("Please enter valid answer");
            }
        }
    }
}
