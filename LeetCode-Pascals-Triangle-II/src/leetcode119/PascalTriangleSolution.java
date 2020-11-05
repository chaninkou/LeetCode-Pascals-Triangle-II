package leetcode119;

import java.util.Arrays;
import java.util.List;

public class PascalTriangleSolution {
    public List<Integer> getRow(int rowIndex) {
        // rowIndex + 1 cause it's always plus 1 index
        Integer[] array = new Integer[rowIndex + 1];
    
        // To fill complete array with a particular value   
        Arrays.fill(array, 0);
    
        // Cause the first one always start with 1
        array[0] = 1;

        for (int i = 1; i <= rowIndex; i++)
        {
            for (int j = i; j > 0; j--){
                array[j] = array[j] + array[j - 1];
            }
        }
        
        // Get the list view of Array 
        return Arrays.asList(array);
    }
}
