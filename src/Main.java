import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine().replace(" " , "");
        if (name.equals("ohad")) {
            System.out.println("based");
        }
        else {
            System.out.println("unbased");
        }


    }
}