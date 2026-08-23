
class Solution {
    public int[] replaceElements(int[] arr) {
        // Loop through each element except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            
            // 1. Copy ONLY the elements to the right of index i
            int[] rightSide = Arrays.copyOfRange(arr, i + 1, arr.length);
            
            // 2. Sort that right-side slice in ascending order
            Arrays.sort(rightSide);
            
            // 3. The maximum element is now at the very end of rightSide
            int maxElement = rightSide[rightSide.length - 1];
            
            // 4. Replace the current element with that max value
            arr[i] = maxElement;
        }
        
        // The last element is always replaced with -1
        arr[arr.length - 1] = -1;
        
        return arr;
    }
}
