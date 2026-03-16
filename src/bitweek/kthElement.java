package bitweek;

public class kthElement {
    public static int largestkthElement(int[] arr,int k)
    {

        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    count++;
                    System.out.println("----");
                }
            }
            if(count==k-1)
            {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String args[])
    {
        int[] arr={3,2,1,5,6,4};
        int k=2;
        System.out.println(largestkthElement(arr,k));
        int[] arr1={3,2,3,1,2,4,5,5,6};
        int k1=4;
        System.out.println(largestkthElement(arr1,k1));

    }
}
