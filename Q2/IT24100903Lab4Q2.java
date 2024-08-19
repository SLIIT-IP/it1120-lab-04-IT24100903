import java.util.Scanner;

public class IT24100903Lab4Q2
{ 
   public static void main(String[]args)
   {
      Scanner input=new Scanner(System.in);
      
      double examMarks,labMarks,percentageExam,percentageLab,finalMark;

      System.out.print("Please enter exam marks (out of 100): ");
      examMarks=input.nextDouble();
    
      if(examMarks>100 || examMarks<0)
         {
            System.out.println("Invalid input for exam marks. Terminating program.");       
         }
      else
         {
            System.out.print("Please enter lab submission marks (out of 100): ");
            labMarks=input.nextDouble();
            
            if(labMarks>100 || labMarks<0)
              {
                  System.out.println("Invalid input for exam marks. Terminating program.");
              }
            else
            {
                  System.out.print("Please enter the percentage given for the exam: ");
                  percentageExam=input.nextDouble();
       
                  System.out.print("Please enter the percentage given for the lab submission: ");
                  percentageLab=input.nextDouble();

                  if(percentageExam+percentageLab==100)
                   {
                      finalMark=(labMarks*percentageLab/100.0)+(examMarks*percentageExam/100.0);
                      System.out.print(" ");
                      System.out.print("Final Exam Mark is : "+finalMark);
                   }
                  
                  else
                   {
                     System.out.print("The percentages must add up to 100. Terminating program.");
                   }
                
            }
    
         }
     }
}