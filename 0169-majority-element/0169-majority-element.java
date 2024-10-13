class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int cur= 0;
        for(int i=0; i<nums.length; i++){
            if(cnt==0){
                cnt=1;
                cur = nums[i];
            }
            else if(cur==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return cur;
    }
}