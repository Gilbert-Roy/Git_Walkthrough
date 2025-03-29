public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;

        
        int smallest = findSmallest(num1, num2, num3);

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
