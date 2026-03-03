package bitweek;

public class profit {
    public static int profitValue(int[] nums)
    {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int pri = nums[i];
            for(int j=i+1;j<nums.length-1;j++) {

                if (pri < nums[j + 1]) {
                    result = Math.max(nums[j] - nums[i], result);
                    //System.out.println(result);
                }
            }

        }
        return result;
    }
    public static void main(String args[])
    {
        int[] nums={7,1,5,3,6,4};
        System.out.println(profitValue(nums));
        int[] nums1={7,6,4,3,1};
        System.out.println(profitValue(nums1));

    }

}
