class Solution {
    public void sortColors(int[] nums) {
      int count0 = 0;
      int count1 = 0;
      int count2 = 0;
      for(int n : nums) {
        if (n==0) count0++ ;
        if (n==1) count1++ ;
        else count2 ++;
      }  
      for (int i = 0 ; i<nums.length ; i++) {
        if (count0 > 0){
            nums[i] = 0;
            count0 --;
        }
        else if ( count1 > 0){
            nums[i] = 1 ;
            count1 -- ;
        }
        else {
            nums[i] = 2 ;
            count2 -- ;
        }
      }
    }
}