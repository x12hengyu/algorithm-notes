package greedy;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                count++;
                if (i - 2 < 0) {
                    nums[i-1] = nums[i];
                } else if (nums[i] < nums[i-2]) {
                    nums[i] = nums[i-1];  
                } else {
                    nums[i-1] = nums[i];
                }
            }
        }
        return count <= 1;
    }
}
