import java.util.*;

public class input {
    public static void main(String[] args) {
        //string input
        System.out.println("enter sentence : ");
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();    //take only one word
        String input = sc.nextLine();  // take sentence
        System.out.println(input);

        System.out.println("enter integer : ");
        //integer input
        int number = sc.nextInt();
        System.out.println(number);

        System.out.println("Enter float value : ");
        //float input
        float num = sc.nextFloat();
        
        System.out.println(num);
    }
}
