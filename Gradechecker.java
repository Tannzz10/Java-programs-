import java.util.Scanner;

public class Gradechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int totalsub = sc.nextInt();

        int totalmarks = 0;
        for (int i = 1; i <= totalsub; i++) {
            System.out.print("Enter marks for subject " + (i) + ": ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                i--; 
                continue;
            }
            totalmarks += marks;
        }

        double averagePercentage = (double) totalmarks / totalsub ;

        String grade;
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("The total marks" + totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}