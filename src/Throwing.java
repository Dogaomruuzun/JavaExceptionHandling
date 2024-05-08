import java.util.Scanner; 

public class Throwing
 {
    public static void main(String[]args) 
    {
        int x = getInt();
        System.out.println(x);
    }
    
    @SuppressWarnings("resource")
    public static int getInt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("put an integer: ");
        int a = 0; 
        if(scanner.hasNextInt())
        {
             a = scanner.nextInt();
            return a;

        }
        else
        {
            System.out.println("You did not enter an intager");
            
        }
        scanner.close();
        return a;
    }
}
