package com.leet75.arrays;

import java.util.Arrays;

public class Contains_Duplicate_217 {

	public void bubbleSortElements(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public boolean containsDuplicate(int[] nums) {
		bubbleSortElements(nums);
		boolean result = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return result;
	}

	public static void main(String[] args) {
		// int[] nums = {1,2,3,1};
		int[] nums = { 7, 8, 3, 1, 2 };
		boolean result = new Contains_Duplicate_217().containsDuplicate(nums);
		System.out.println("Result: " + result);
	}

}
