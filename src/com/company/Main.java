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
                System.out.println(answer);
                break;
            } else if (answer.equals("2")) {
                System.out.println(answer);
                break;
            } else {
                System.out.println("Please enter valid answer");
            }
        }
    }
}
