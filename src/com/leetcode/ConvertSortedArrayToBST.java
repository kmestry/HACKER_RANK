package com.leetcode;

public class ConvertSortedArrayToBST {

    public static void main(String[] args) {
        new ConvertSortedArrayToBST().sortedArrayToBST(new int[]{1, 2, 3, 4});
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) return null;

        return helper(nums, 0, nums.length - 1);

    }


    private TreeNode helper(int[] nums, int left, int right) {

        if (left <= right) {

            int mid = left + (right - left) / 2;

            TreeNode node = new TreeNode(nums[mid]);
            node.left = helper(nums, left, mid - 1);
            node.right = helper(nums, mid + 1, right);
            return node;
        } else {
            return null;
        }
    }
}
