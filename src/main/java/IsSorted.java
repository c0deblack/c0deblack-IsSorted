public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int last_max = arr[arr.length - 1];
        for(int i = arr.length - 2; i != -1; --i)
        {
            if(arr[i] > last_max) return false;
            else last_max = arr[i];
        }
        return true;
    }
}
