import java.util.Scanner;
 
 /**
    Walther Alvarez
    CISC 500
    Assignment #4
    This program prompts the user to insert a sequence of numbers
    it then calculates the average, max, min and range of the values. 
 */
 public class Assignment4
 {
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter input, use q to end sequence: ");
       double input = in.nextDouble();
       double min = input; 
       double max = input;     
       int count = 1; 
       double total = input; 
       double average = 0;   
 
       while (in.hasNextDouble())
       {
          input = in.nextDouble();
          
             total = total + input; 
             count++;
    
             if (input < min) 
             {
                min = input;
             }
             else if (input > max)
             {
                max = input;
             }  
             if (count > 0)
             {
                 average = total / count;   
             }                

       }  
         
       System.out.println("Minimum: " + min);
       System.out.println("Maximum: " + max);
       System.out.println("Average: " + average);
       System.out.println("Range: " + (max - min));
     }
  }


