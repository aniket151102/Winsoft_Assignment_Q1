package merging;

import java.util.Scanner;

public class Merging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array (m): ");
        int m = scanner.nextInt();

        System.out.println("Enter the size of the second array (n): ");
        int n = scanner.nextInt();

        if (m < n) {
            System.out.println("Error: m should be greater than or equal to n");
            return;
        }

        System.out.println("Enter the elements of the first array: ");
        int[] X = new int[m];
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        int[] Y = new int[n];
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        mergeArrays(X, Y);

        System.out.println("Merged array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(X[i] + " ");
        }
    }

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - n;
        int j = 0;

        while (i < m && j < n) {
            if (X[i] == 0 || X[i] > Y[j]) {
                X[i] = Y[j];
                j++;
            }
            i++;
        }

        while (j < n) {
            X[i] = Y[j];
            i++;
            j++;
        }
    }
}