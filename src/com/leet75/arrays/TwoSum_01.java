package com.leet75.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/**
 * @author Gerald
 * 
 * https://leetcode.com/problems/two-sum/
 * 
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class TwoSum_01 {

	public int[] twoSum(int[] nums, int target) {
		int[] finalResult = new int[2];
		Map<Integer, Integer> indxFinder = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(indxFinder.containsKey(nums[i])) {
				finalResult[0]=indxFinder.get(nums[i]);
				finalResult[1]=i;
			}else
				indxFinder.put(target-nums[i], i);
		}
		return finalResult;
	}

	public static void main(String[] args) {

		//Test Case 1:
		//int[] nums = {2,7,11,15};
		//int target = 9;
		
		//Test Case 2:
		//int[] nums = {3,2,4};
		//int target = 6;
		
		//Test Case 3:
		int[] nums = {3,3};
		int target = 6;
		
		int[] result = new TwoSum_01().twoSum(nums, target);
		System.out.println("Result: "+Arrays.toString(result));
	}

}
