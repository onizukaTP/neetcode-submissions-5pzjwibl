class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = k - 1;
        while (right != nums.length) {
            int max = subArrayMax(nums, left, right);
            list.add(max);
            left++;
            right++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int subArrayMax (int[] nums, int left, int right) {
        int max = Integer.MIN_VALUE;
        while (left <= right) {
            max = Math.max(max, nums[left]);
            left++;
        }
        return max;
    }
}
