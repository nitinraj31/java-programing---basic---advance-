import java.util.Scanner;

public class operation{
    public static void main (String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print Hello world:");
        a = sc.nextInt();
        for(int i=0;i<a;i++)
            {
                System.out.println("Hello world");
        }
    }
}