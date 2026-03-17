public class ArrayExample {
    public static void main(String[] args) {

        // Declare and initialize an integer array of size 4
        int[] numbers = {2, 4, 6, 8};

        // Traverse the array and display elements
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Reassign the third element to 100
        numbers[2] = 100;

        // Print the updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}