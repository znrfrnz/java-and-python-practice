// Day 1 – Hello Variations

// Goal:
// Use variables and formatted output
// Requirements:
// Ask for name, age, and 2 hobbies
// Print in 1 formatted sentence

// Constraints:
// No hardcoding values
// Must use input

// Stretch:
// Format output in multiple lines neatly

import java.util.Scanner;

public class day1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("Give me 2 hobbies: ");
        String hobby1 = scanner.next();
        String hobby2 = scanner.next();

        System.out.println(
            "Hello, i am " +
                name +
                " , " +
                "I am currently " +
                age +
                " years old." +
                " " +
                "I enjoy " +
                hobby1 +
                " and " +
                hobby2
        );

        scanner.close();
    }
}
