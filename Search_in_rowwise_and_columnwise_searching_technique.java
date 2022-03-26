public class Search_in_rowwise_and_columnwise_searching_technique {
    public static void search(int arr[][], int x) {
        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == x) {
                System.out.print(x + " Found at (" + (i + 1) + "," + (j + 1) + ") Position.");
                return;
            } else if (arr[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        search(arr, 9);
    }
}
