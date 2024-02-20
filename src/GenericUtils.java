public class GenericUtils {
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

    public static <T extends java.lang.Number> double sum(T[] array){
        double sum = 0.0;
        for(T elem : array){
            sum += elem.doubleValue();
        }
        return sum;
    }
}
