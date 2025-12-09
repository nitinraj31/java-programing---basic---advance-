import java.util.*;
public class odd{
    public static void main (String args[])
    {

        Scanner sc= new Scanner (System.in);
        System.out.print("Enter  a year : ");
        int yr=sc.nextInt();
        if (yr%400==0){
            System.out.println(yr+" is a leap year");
        }
        else if (yr%100==0){
            System.out.println(yr+" is not a leap year");
        }
        else if (yr%4==0){
            System.out.println(yr+" is a leap year");
        }
        else{
            System.out.println(yr+" is not a leap year");
            
        }
        sc.close();
    }
}
