import java.util.Scanner;
class posstivenegative
{
    public static void main(String[]args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("given num is positive");
        }
        else if (num<0)
        {
            System.out.println("given num is negative");
        }
        else
        {
            System.out.println("given number is zero");
        }
    }
}