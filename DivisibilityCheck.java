import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        
        
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 and 5.");
        }
        
        
        scanner.close();
    }
}