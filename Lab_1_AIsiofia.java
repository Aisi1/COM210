
package lab_1_a.isiofia;
import java.util.Arrays; 
public class Lab_1_AIsiofia 
{

 // Question 6
    
    public static void main(String[] args) 
{
  
    String[] B = {"eggs", "cereal", "toast", "bacon"};
    int[] I = {10, 20, 30, 40};
    
    System.out.println(B[2]); //Print out 3rd term of B
    
    System.out.println(I[3]); //Print out 4th term I
    
    System.out.println();
    
    //Update 2nd term of B to oatmeal
     B[1] = "oatmeal";
    
 //Print all values in B
 System.out.println(Arrays.toString(B));
 

 //Print the sum of all integers in I
 System.out.println();
     int sum = 0;

     for (int i = 0; i < I.length; i++)
     { 
        sum = sum + I[i];
     }
     System.out.println(sum); 
     
     
 //Print the cross of all Breakfast, Integer combos (in that order) 
 System.out.println();
  for( int i=0; i<=B.length-1; i++)
  {
    for(int j=0; j<=I.length-1; j++)
    {
        System.out.println(B[i] +""+ I[j]);
    }
  }
  System.out.println("It took me 3 steps to print out all of the pairs");
  
}
 
}
