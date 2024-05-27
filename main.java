/*
Name :- Sama Anudeep
Work assigned:- Code alpha Internship on JAVA Programming

Task

Develop a program that allows a teacher to enter
students' grades and compute their average,
highest, and lowest scores. You can use arrays or
ArrayLists to store the student data
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the teacher
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store grades
        int[] grades = new int[numStudents];

        // Get grades from the teacher for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter grade for student %d (0-100): ", i + 1);
            int grade = scanner.nextInt();

            // Validate grade input (0-100)
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Please enter a value between 0 and 100.");
                i--; // Decrement i to repeat grade entry for invalid input
            } else {
                grades[i] = grade;
            }
        }

        // Calculate class statistics
        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        // Print the results
        System.out.println("\nClass Statistics:");
        System.out.printf("Average grade: %.2f\n", average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }

    // Function to calculate average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Function to find the highest grade
    public static int findHighest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Function to find the lowest grade
    public static int findLowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
