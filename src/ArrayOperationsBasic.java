import java.util.Arrays;

public class ArrayOperationsBasic {

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    static long sum(int[] arr) {
        long s = 0; for (int n : arr) s += n; return s;
    }

    static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int[] reverse(int[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) r[i] = arr[arr.length - 1 - i];
        return r;
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i;
        return -1;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) if (arr[i] > arr[i+1]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] data = {34, 7, 23, 32, 5, 62, 18, 45, 9, 71};
        System.out.println("Data    : " + Arrays.toString(data));
        System.out.println("Min     : " + findMin(data));
        System.out.println("Max     : " + findMax(data));
        System.out.println("Sum     : " + sum(data));
        System.out.printf( "Average : %.2f%n", average(data));
        System.out.println("Reversed: " + Arrays.toString(reverse(data)));
        System.out.println("Sorted? : " + isSorted(data));

        System.out.println("\n=== Linear Search ===");
        int[] targets = {62, 100, 5};
        for (int t : targets) {
            int idx = linearSearch(data, t);
            System.out.printf("Search %3d → %s%n", t, idx >= 0 ? "index " + idx : "not found");
        }

        // Frequency count
        System.out.println("\n=== Frequency Count ===");
        int[] nums = {1,2,3,1,2,1,3,4,5,3,3};
        int[] freq = new int[6];
        for (int n : nums) freq[n]++;
        for (int i = 1; i <= 5; i++) System.out.printf("  %d appears %d time(s)%n", i, freq[i]);
    }
}
