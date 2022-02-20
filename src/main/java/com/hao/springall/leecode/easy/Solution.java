package com.hao.springall.leecode.easy;

import java.util.Arrays;

public class Solution {
    public static int search(int[] nums, int target) {
        if(nums[nums.length/2]>target){
            int[] num = Arrays.copyOfRange(nums,0,nums.length/2);
            return search(num,target);
        }else if(nums[nums.length/2]<target){
            int[] num = Arrays.copyOfRange(nums,nums.length/2,nums.length);
            return search(num,target);
        }else{
            return target;
        }
    }
    public static void main(String[] args) {
        int[] nums =new int[]{-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
}
