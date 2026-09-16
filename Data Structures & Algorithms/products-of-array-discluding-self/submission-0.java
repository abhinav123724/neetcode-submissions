class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int[] output=new int[nums.length];
        for(int x:nums){
            if(x==0){
                count++;
            }
        }
        if(count>=2){
            return output;

        }
        if(count==1){
            int product=1;
            for(int x:nums){
                if(x!=0){
                    product=product*x;
                }
            }
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                output[i]=product;
            }else{
                output[i]=0;
            }
        }

        }else{
            int product=1;
            for(int x:nums){
                product*=x;
            }
            for(int i=0;i<nums.length;i++){
                output[i]=product/nums[i];
            }
        }
        return output;
    }
}  
