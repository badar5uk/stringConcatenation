import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        scanner();
    }
    public static void scanner() {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String firstString = firstScanner.nextLine();
        Scanner secondScanner = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String secondString = secondScanner.nextLine();
        int size1 = firstString.length();
        int size2 = secondString.length();
        int minimumlength = Math.min(size1, size2);
        String result1 = firstString.substring(size1 - minimumlength);
        String result2 = secondString.substring(size2 - minimumlength);
        System.out.println(result1 + result2);
    }
}


