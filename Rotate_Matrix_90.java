import java.util.Arrays;

public class Rotate_Matrix_90 {
    public static void rotate90(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                swap(arr, i, j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[0].length - 1;
            while (low < high) {
                swap(arr, low, high, i);
                low++;
                high--;
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

    public static void swap(int arr[][], int l, int h, int i) {
        int temp = arr[l][i];
        arr[l][i] = arr[h][i];
        arr[h][i] = temp;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        rotate90(arr);

    }
}
