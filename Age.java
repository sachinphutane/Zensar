import java.util.Scanner; 

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your agesa: ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are an adult ");
        }
        else
        {
             System.out.println("You are not an adult ");
        }
    }
}