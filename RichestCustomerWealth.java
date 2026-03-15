package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
    {
        int arr[][]={
            {3,2,1},
            {1,5,4},
            {4,9,3}
        };
        int max=Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++)
        {
            int rowsum=0;
            for(int c=0;c<arr[r].length;c++)
            {
                rowsum+=arr[r][c];
                   
            }
            if(rowsum>max)
            {
                max=rowsum;
            }
        }       
        System.out.println(max);
    }
}
    
}
