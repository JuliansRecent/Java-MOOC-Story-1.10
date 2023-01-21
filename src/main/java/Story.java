
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\nWhat is the main character called?");
        String character_name = scanner.nextLine();
        System.out.println("What is their job?");
        String character_job = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was " + character_name + ", who was " + character_job
                + ".\nOn the way to work, " + character_name + " reflected on life.\nPerhaps "
                + character_name + " will not be " + character_job + " forever.");
    }
}
