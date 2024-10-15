class Solution {
    public long minimumSteps(String s) {
        char[] nums = s.toCharArray();
        long cnt = 0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]=='1') left.add(i);
            else right.add(i);
        }
        int i=0;
        int j = right.size()-1;
        while(i<left.size() && j>=0){
            if(left.get(i)>right.get(j)) break;
             cnt += Math.abs(left.get(i)-right.get(j));
            i++;
            j--;
        }
        return cnt;
    }
}