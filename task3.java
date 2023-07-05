import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 3, 2};
        int[] array2 = {9, 7, 5, 0, 4};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Different length of arrays");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("You can't divide by zero!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}