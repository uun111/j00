import java.util.Arrays;

public class Sort {
    public static int[] sort(int[] numbers){
        if (numbers == null || numbers.length <= 1) {
            return Arrays.copyOf(numbers, numbers == null ? 0 : numbers.length);
        }
        
        int[] arr = Arrays.copyOf(numbers, numbers.length);
        int len = arr.length;
        
        for (int i = 0; i < len - 1; i++) { 
            int minIndex = i; 
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] i = {5,2,9,1,5,6};
        System.out.println(Arrays.toString(sort(i))); // [1, 2, 5, 5, 6, 9]
    }
}