/**
 * Main class tests methods from class GenericUtils
 * @author julia
 * @version 2024-02-21
 */
public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

        GenericUtils.reverse(intArray);
        GenericUtils.reverse(doubleArray);

        System.out.println("Reversed Integer Array:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Reversed Double Array:");
        for (Double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate sum of arrays
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(intArray));
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));
    }
}