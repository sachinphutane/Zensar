package Age;

import java.util.Scanner; 

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextString();
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are an adult ")
        }
        else
        {
             System.out.println("You are not an adult ")
        }
    }
}