import java.util.Random;
import java.util.Scanner;

public class Numbergame{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int attempts=0;
    int maxAttempts =5 ;
   int a=1;
   int b=100;
    System.out.println("WELCOME TO THE RANDOM NUMBER GUESSING GAME");
    System.out.println("The no ranges from 1 to 100,you will get 5 attempts to guess the number");
    boolean play = true;
    while (play) {
      int guessingno = rd.nextInt(b-a*2) +a;
      while (attempts < maxAttempts) {
        attempts++;
        System.out.println("Enter the number you are guessing");
        int guess = sc.nextInt();
        if (guess == guessingno) {
          System.out.println("Congratulations! You guessed the number");
        } else if (guess < guessingno) {
          System.out.println(" Oops! Guess too low. Try again.");
        } else {
          System.out.println(" Oops! Guess too high. Try again.");
        }
      }
      System.out.println("The random number is: " + guessingno);
      System.out.println("Do you want to play again? (yes/no)");
      String yn = sc.next();
      play = yn.equalsIgnoreCase("yes");
    }

    System.out.println("Thanks for playing!");
  }
}