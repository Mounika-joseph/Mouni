public class  EvenOdd {
    public static void main(String[] args) {
        int number = 10; // You can change this value to test other numbers
        
        // Determine if the number is even or odd using the modulus operator
        String[] results = {"Odd", "Even"};
        
        // Output result
        System.out.println(number % 2 == 0 ? results[1] : results[0]);
    }
}