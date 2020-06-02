//Sum to N
import java.util.*;
class Solution2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        String s=sc.next();
        int n=s.length();
        boolean b=true;
        for (int i=0;i<n/2;i++)
        {
            if (s.charAt(i)!=s.charAt(n-i-1))
            {
                b=false;
                break;
            }
        }
        if (b)
        System.out.println("True");
        else 
        System.out.println("False");
    }
}