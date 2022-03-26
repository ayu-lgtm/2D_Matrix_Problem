public class Boundry_Element {
    public static void pattern(int arr[][]) {
        if (arr.length == 1) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (arr[0].length == 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][0] + " ");
            }
        } else {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i] + " ");
            }
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[j][arr.length - 1] + " ");
            }
            for (int i = arr[0].length - 2; i >= 0; i--) {
                System.out.print(arr[arr.length - 1][i] + " ");
            }
            for (int j = arr.length - 2; j >= 1; j--) {
                System.out.print(arr[j][0] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        pattern(arr);
    }
}
