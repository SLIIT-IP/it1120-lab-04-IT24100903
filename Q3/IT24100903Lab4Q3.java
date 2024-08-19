import java.util.Scanner;

public class IT24100903Lab4Q3
{
   public static void main(String[]args)
    {

       Scanner input=new Scanner(System.in);
          
       double number;
       String output;

       System.out.print("Enter a number: ");
       number=input.nextDouble();

       
       output=(number==0) ? ("The number is Zero") : ( (number>0) ? ("The number is: Positive"):("The number is: Negative"));
       System.out.print(output);
    } 
}