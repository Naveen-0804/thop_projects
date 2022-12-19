import java.util.*;
import java.lang.*;
import java.io.*;

class calc
{
void table(int n)
{
    int i,res;
    for(i=1;i<=10;i++)
    {
        res=i*n;
        System.out.println(n+" * "+i+" = "+res);
    }
}
}
class hii1
{
    public static void main(String args[])
    {
        calc c = new calc();
        System.out.println("enter the table u want:");
        Scanner s = new Scanner(System.in);
        int x;
        x=s.nextInt();
        c.table(x);
    }
}