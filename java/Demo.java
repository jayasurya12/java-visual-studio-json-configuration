import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // System.out.println("hi");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("hey" + x);
        scanner.close();
    }
}