import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the purchase value: ");
        double purchaseValue = scanner.nextDouble();
        
        double discount = 0.0;
        if (purchaseValue >= 500 && purchaseValue <= 1000) {
            discount = 0.10; // 10% discount
        } else if (purchaseValue > 1000) {
            discount = 0.20; // 20% discount
        }
        
        // Calculate final price after discount
        double discountAmount = purchaseValue * discount;
        double finalPrice = purchaseValue - discountAmount;
        
 
        System.out.printf("Original Purchase Value: %.2f\n", purchaseValue);
        System.out.printf("Discount Applied: %.2f%%\n", discount * 100);
        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Final Price after Discount: %.2f\n", finalPrice);
        
        scanner.close();
    }
}
