package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public  int find(int[] arr, int target) {
        //SelectionSort.sort(arr);
        int min = 0;
        int max = arr.length - 1;

        while(min <= max) {
            int middle = (max + min) / 2;

            if(arr[middle] == target) {
                return middle;
            }

            if(arr[middle] > target) {
                
                max = middle - 1;
            }
            else {
                min = middle + 1;
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
        //SelectionSort.sort(arr);
        return recursiveBinary(arr, target, arr.length - 1, 0);
    }

    public int recursiveBinary(int[] arr, int target, int max, int min) {
        if(max < min) {
            return -1;
        }

        int mid = (max + min) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] > target) {
            return recursiveBinary(arr, target, mid - 1, min);
        }
        return recursiveBinary(arr, target, max, min + 1);
    }
}
