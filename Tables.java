import java.util.Scanner; 

public class Tables {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=s1.nextInt();
        int i=1;

        while(i<=10)
        {
            System.out.println(i*num);
            i++;
        }
    }
}