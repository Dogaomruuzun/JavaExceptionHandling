import java.io.IOException;
import java.util.Scanner; 
public class Throwing2
{
    public static void main(String[] args)
    {
        try
        {
            int d = getInt();
            
        }
        catch(IOException a)
        { 
            System.out.println(a);
        }
    }
    public static int getInt() throws IOException
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer : ");
            int x = 0;
            if(sc.hasNextInt())
            {
                x = sc.nextInt();
                System.out.println("You entered : " + x);
                
            }
            else
            {
                throw new IOException("this is not an intager number please try again");
            }
            return x ;
        } 
    }
}