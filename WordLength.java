import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; 

public class WordLength
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];

        for(int i=0;i<n;i++)
        arr[i]=sc.nextLine();
        
        int len=0;
        ArrayList<String> wordLength=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            len=arr[i].length();
            if(len%2==1)
            wordLength.add(arr[i]);
        }

        if(wordLength.size()==0)
        System.out.println("Better luck next time");
        else 
        {
            Iterator itr=wordLength.iterator();
            int max=-1;
            String res="";
            while(itr.hasNext())
            {
                String temp=(String)itr.next();
                if(temp.length()>max)
                {
                    res=temp;
                    max=temp.length();
                }
            }
            System.out.println(res);
        }
    }
        
}
