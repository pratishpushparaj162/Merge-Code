public class Utility {

    public static void swap(int[] arr, int i) {
        int hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }
    public static int[] print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
