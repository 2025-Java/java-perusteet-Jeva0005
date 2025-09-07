package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
        if (arr.length == 0) {
            return 0.0;
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return (double) sum / arr.length;
        }
    }
    public static int max(int[] arr) {
        // TODO
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

        if (arr[i] > max) {
            max = arr[i];
        };
    }
    return max;
    }
}
