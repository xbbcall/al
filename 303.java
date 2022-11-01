class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        int sum = 0;
        sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int leftSum = 0;
        if (left != 0) {
            leftSum = sums[left - 1];
        }
        return sums[right] - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */