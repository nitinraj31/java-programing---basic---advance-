// import java.util.*;
// public class first {
// /**
//  * @param args
//  */
// public static void main(String[] args)
//  {
//     Scanner sc = new Scanner(System.in);
//     int vote=sc.nextInt();
//     if(vote>=18)
//     {
//         System.out.println("You are eligible for voting");
//     }
    
//     }
//     else{
//         System.out.println("You are not eligible for voting");
//     }
// }
    import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int vote = sc.nextInt();

        if (vote >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }

        sc.close();
    }
}
