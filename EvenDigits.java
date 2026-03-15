package leetcode;

public class EvenDigits {
    public static void main(String[] args) {
        int nums[]={12,2,6,1795,4321};
          int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean even(int num)
    {
        int numberofdigits=digits(num);
        return numberofdigits%2==0;
    }
    static int digits(int num)
    {
        return (int)(Math.log10(num))+1;
    }
}


