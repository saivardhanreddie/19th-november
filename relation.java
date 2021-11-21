
import java.util.Scanner;

public class relation {
    public static float a, b, t;
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("enter first number");
        a = scanner.nextFloat();
        System.out.println("enter second number");
        b = scanner.nextFloat();
        if (a == b) {
            System.out.println("a=b");
        }
        if (a > b) {
            System.out.println(" a > b");
        }
        if (a < b) {
            System.out.println(" a < b");
        }
    }
}
