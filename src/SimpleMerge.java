/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int arrLength = arr1.length+arr2.length;
        int index = 0;
        int[] array = new int[arrLength];

        //merges the two arrays into a single array
        while(index < arrLength) {
            for (int i = 0; i < arr1.length; i++) {
                array[index] = arr1[i];
                index++;
            }
            for (int j = 0; j < arr2.length; j++) {
                array[index] = arr2[j];
                index++;
            }
        }

        //A bubblesort of the merged array
            boolean loop = true;
            boolean swaps = false;
            int i = 0;
            int cnt = 0;

            //A Loop that runs while there are still swaps to be potentially made
            while (loop) {
                //Swaps index values if the one on the left is greater than the right value
                if (array[i] > array[i + 1]) {
                    Utility.swap(array, i);
                    swaps = true;
                }
                i++;

                //Once iteration reaches end of array go back to the beginning if there are swaps to be potentially made
                if(i == array.length-1 && swaps == true)
                {
                    i = 0;
                    swaps = false;
                    cnt++;
                }
                //Once iteration reaches end of array ends while loop if there are no more swaps to be made
                if(i == array.length-1 && swaps == false)
                {
                    cnt++;
                    loop = false;
                }
            }

            return array;
        }
}
