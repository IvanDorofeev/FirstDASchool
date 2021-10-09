package ru.dataart.academy.java;

public class TwoSums {
    public int[] getTwoSum(int[] nums, int target) {
        int[] c=new int[target+1];
        for(int i=0;i<=target;i++){
            c[i]=0;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<=target){
                if(c[target-nums[j]]!=0){
                    return new int[]{target-nums[j],nums[j]};
                }
                c[nums[j]]=1;
            }
        }
        return new int[]{0, 1};
    }
}
