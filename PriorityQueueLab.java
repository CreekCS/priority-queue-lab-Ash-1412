// import statements
import java.util.*;
import java.io.*;

public class PriorityQueueLab
{
    public static void main(String[] args)
    {
        File file = new File("RandIntegers.txt");
        Scanner scan;
        PriorityQueue<Integer> smolToLarge = new PriorityQueue<Integer>();

        try
        {
            scan = new Scanner(file);

            while(scan.hasNextInt())
            {
                smolToLarge.add(scan.nextInt());
            }           
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (Exception e)
        {
            System.out.println("Error- something is wrong with your file");
        }

        System.out.println("Contents: ");
        for(int num : smolToLarge)
        {
            System.out.println(num);
        }
    }
  
}

