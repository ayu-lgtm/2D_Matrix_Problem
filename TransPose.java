import java.util.Arrays;

public class TransPose {
    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                swap(arr, i, j);
            }
        }
        for (int x[] : arr) {
            System.out.println(Arrays.toString(x));
        }
    }

    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        transpose(arr);

    }
}
