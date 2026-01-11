class Solution {
    public double average(int[] salary) {

        int minimum=salary[0];
        int maximum=salary[0];
        int sum=0;

        for(int i=0;i<salary.length;i++){
            sum = sum + salary[i];

            if(salary[i]<minimum){
                minimum=salary[i];
            }

            if(salary[i]>maximum){
                maximum=salary[i];
            }

        }

        sum=sum-minimum-maximum;

        return (double)sum/(salary.length-2);

        
    }
}