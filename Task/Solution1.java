//Sum to N
import java.util.*;
class Solution1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int x=sc.nextInt();
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(x-a[0],0);
        int a1=-1,a2=-1;
        for (int i=1;i<n;i++)
        {
            if (m.containsKey(a[i]))
            {
                a1=i;
                a2=m.get(a[i]);
                break;
            }
            else m.put(x-a[i],i);
        }
        if (a1==-1 || a2==-1)
        System.out.println("Not found");
        else 
        System.out.println("Positions : "+a1+" "+a2);
    }
}