package codegym;

public class AlexInsertionSort {
    public static int[] insertionSort(int[] input) {
        int template;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (input[j] < input[j - 1]) {
                    template = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = template;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = insertionSort(arr1);

        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}
