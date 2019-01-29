public class Utilities {

    public static void swap(int[] arr, int i) {
        int hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }
}
