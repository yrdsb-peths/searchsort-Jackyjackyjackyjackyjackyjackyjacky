package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        // sort the array first

        int min = 0;
        int max = arr.length - 1;

        while(min != max) {
            int middle = (max + min) / 2;
            if(arr[middle] == target) {
                return middle;
            }

            if(arr[middle] > target) {
                max = middle;
            }
            else {
                min = middle;
            }
        }

        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {


        return -1;
    }

}
