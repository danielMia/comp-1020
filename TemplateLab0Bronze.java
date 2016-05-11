
/**
 * Template
 * Lab 0 Bronze exercise
 * COMP 1020 - Summer 2016
 */
import java.util.Scanner; //Allows the use of Scanner input

public class TemplateLab0Bronze {
    
  public static void main(String[] args) {
    int numberRead = 1;
    int counter = 0;
    double ave =0;
    double median = 0;
    int[] number = new int[counter];
    int i,temp;
    //Call the readData() method to test it,
    while(numberRead != 0){
    numberRead = readData();
    //and print out the result that was returned.
    if (numberRead <100 && numberRead>0)
    {
    System.out.println("Entry "+numberRead+" acceoted.");
    int[] result = number;
    number = new int[counter+1];
    for(i = 0;i<counter;i++)
    {
    number[i] = result[i]; 
    }
    counter ++;
    number[counter-1] = numberRead;
    }
    else if (numberRead >100 || numberRead<0)
    {
    System.out.println("Invalid entry rejected");
    }
    else if (numberRead == 0)
    {
    System.out.println(counter +" valid entries were read in:");
    }
    }
    for ( i = 0;i<counter-1;i++)
    {
      for(int j=i+1;j<counter;j++)
      {
        if(number[i]>number[j])
        {
        temp=number[i];
        number[i]=number[j];
        number[j]=temp;
        }
      }
    }
    
    printArray(number, counter);
    ave = average(number, counter);
    median = median(number, counter);
    System.out.println("");
    System.out.println("Their average is "+ave);
    System.out.println("Their median is "+median);
  }//main
  
  static int readData() {
    /* Prompt the user to enter integer values, one at a time.
     * Values between 1 and 100 are valid. They will be accepted,
     * and echoed in a suitable message. A value of 0 will
     * cause the method to terminate. All other values will
     * cause an error message to be printed. The number of valid
     * values entered (1-100, but not 0) will be returned.
     */
     Scanner keyboard = new Scanner(System.in);
     
    //**********YOUR CODE HERE******************
     int result;
     System.out.println("Enter an integer from 1 to 100(0 to quit):");
     result = keyboard.nextInt();
     return result;
  }//readData
  public static void printArray(int[] a, int n)
  {
   int i;
   for (i = 0; i<n; i++)
   {
   System.out.print(a[i]+", ");
   }
  }
  public static double average(int[] a, int n)
  {
    int i,sum = 0;
    double result;
    for (i = 0; i<n; i++)
    {
    sum += a[i];
    }
    result = sum/n;
    return result;
  }
  public static double median(int[] a, int n)
  {
    
    double median = (a[a.length/2]+a[a.length/2 - (1-a.length%2)])/2;
    return median;
  }
}//SampleSolutionLab0Bronze
