class Solution {
    public int arraySign(int[] nums) {

        int negatives=0;

        for(int n:nums){
             
             if(n==0){
                return 0;
             }
             if(n<0){
                negatives++;
             }
        }
             if(negatives%2==0){
                return 1;
             }
             return -1;
        }
        
    }
    
