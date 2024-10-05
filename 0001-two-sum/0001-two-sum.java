class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(mpp.containsKey(rem)){
                arr[0] = i;
                arr[1] = mpp.get(rem);
            }
            mpp.put(nums[i],i);
        }
        return arr;
    }
}