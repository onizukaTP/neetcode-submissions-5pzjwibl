class Solution {
    public int maxArea(int[] heights) {
        int maxStored = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int min = Math.min(heights[left], heights[right]);
            maxStored = Math.max(maxStored, min * (right - left));
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return maxStored;
    }
}
