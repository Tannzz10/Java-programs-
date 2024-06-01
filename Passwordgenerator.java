import java.util.Scanner;
import java.util.Random;

public class Passwordgenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter the desired length of the password: ");
        int length = sc.nextInt();
        String password = generatepassword(length, rd);
        System.out.println("Generated Password: " + password);
    }

    public static String generatepassword(int length, Random rd) {
        char[] password = new char[length];
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        for (int i = 0; i < length; i++) {
            int index = rd.nextInt(characters.length());
            password[i] = characters.charAt(index);
        }
        return String.valueOf(password);
    }
}