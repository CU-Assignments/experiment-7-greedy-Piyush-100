import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int maxUnits = 0;

        for (int[] box : boxTypes) {
            int boxCount = box[0];  
            int unitsPerBox = box[1]; 

            if (truckSize <= 0) break; 

            int boxesToTake = Math.min(truckSize, boxCount); 
            maxUnits += boxesToTake * unitsPerBox;
            truckSize -= boxesToTake;

        return maxUnits;
    }
}
