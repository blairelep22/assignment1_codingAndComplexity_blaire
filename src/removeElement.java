
/*

Blaire Lepore
1.24.24
Given an integer array nums and an integer val, remove all occurrences of val in nums inplace.
Then return the number of elements in nums which are not equal to val.
 */


public class removeElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            //if the current number is not the value want to remove
            if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    } }
