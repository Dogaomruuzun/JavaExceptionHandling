import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Warning{
    public static void main(String[] args)
    {
        int creditHrs;
        double qualityPts;
        double gpa;
        String name, inputName = "students.dat";
        String outputName = "warning.dat";
        try
        {
            try (Scanner sc = new Scanner(new File(inputName))) {
                PrintWriter outFile = new PrintWriter(new FileWriter(outputName));
                outFile.println();
                outFile.println("Students on Academic  Warning");
                outFile.println();
                while(sc.hasNext())
                {
                    name = sc.next();
                    creditHrs = sc.nextInt();
                    qualityPts = sc.nextDouble();
                    gpa = qualityPts/ creditHrs; 
                    if(creditHrs < 30 && gpa< 1.5 || creditHrs < 60 && gpa <1.75 || creditHrs >= 60 && gpa < 2.0 )
                    {
                        outFile.printf( name + " " + creditHrs +" " + "%.2f\n", gpa);
                        
                    }
                }
                outFile.close();
            }
        }
        catch(FileNotFoundException e)
            {
        System.out.println("The file " + inputName+ "was not found");
            }
        catch( InputMismatchException e )
        {
        System.out.println("Format error in input file: " + e);
        }
        catch(IOException e)
        {
        System.out.println(e);
        }
   }
}
