/**
 * Contains two generic methods reverse and sum
 * @author julia
 * @version 2024-02-21
 */
public class GenericUtils {
    /**
     * Method reverse takes a generic array and reverses the elements+
     * @param array the generic array getting reversed
     * @param <T> the type variable T
     */
    public static <T> void reverse(T[] array){
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T elem = array[left];
            array[left] = array[right];
            array[right] = elem;
            left++;
            right--;
        }
    }

    /**
     * Method sum takes in a generic array containing explicitly elements from the Number class and calculates the sum
     * @param array the generic array
     * @return the sum of all the elements of the array
     * @param <T> type variable T
     */
    public static <T extends java.lang.Number> double sum(T[] array){
        double sum = 0.0;
        for(T elem : array){
            sum += elem.doubleValue();
        }
        return sum;
    }
}
