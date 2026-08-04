class Solution {

    public int minPatches(int[] nums, int n) {
        return countPatches(nums, n);
    }

    public int countPatches(int[] nums, int n) {

        long reach = 1;   // smallest number we cannot form
        int patches = 0;
        int i = 0;

        while (reach <= n) {

            if (i < nums.length && nums[i] <= reach) {
                reach += nums[i];
                i++;
            } else {
                reach += reach;
                patches++;
            }
        }

        return patches;
    }
}