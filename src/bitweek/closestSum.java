package bitweek;

import java.util.Arrays;

public class closestSum {
    public static int CloseThreeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int closeSum = nums[0] + nums[1] + nums[2];
        System.out.println("closeSumFirst "+closeSum);
        int diff1;
        int diff2;
        int sum = 0;
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                System.out.println("Sum "+sum);
                if (Math.abs(sum - target) < Math.abs(closeSum - target)) {
                    closeSum = sum;
                    System.out.println("CloseSum "+closeSum);
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    right--;
                } else{
                    left++;

                }
            }
        }



        return closeSum;


    }
    public static void main(String args[])
    {
        int[] nums1={-1,2,1,-4};
        int target1=1;
        System.out.println(CloseThreeSum(nums1,target1));

        int[] nums2={0,0,0};
        int target2=1;
        System.out.println(CloseThreeSum(nums2,target2));
    }
}
