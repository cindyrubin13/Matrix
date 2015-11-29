import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class MainActivity {

    public static void main(String[] args) throws IOException {
       
        String Input;

     /*   BufferedReader br = new BufferedReader(new FileReader("testFile.txt"));

        Input = br.readLine();
        PrintStream prOut = new PrintStream(new FileOutputStream("OutputFile.txt"));*/

             int temp = 2;
              int cols = temp ;
             /*  int temp2 = Integer.parseInt(Input);*/
               int rows = temp ;
               int num = rows *rows;
               int count = (int)Math.pow(2, num);
               for (int i=0; i<count; i++)
               {
                   String s = String.format("%"+num+"s", Integer.toString(i, 2)).replaceAll(" ", "0");
                   System.out.println("Matrix "+i+", string "+s);
                   int[][] matrix = newMatrix(rows, cols, s);
               //    System.out.print("matrix " + matrix.length);
                 /*  System.setOut(prOut);*/
                  
              //     printMatrix(matrix);
               }
    }

           private static int[][] newMatrix(int rows, int cols, String s)
           {
          
           
               int result[][] = new int[rows][cols];
              
          
          int r =0; int c=0;
            for(int x=0; x<s.length();x++){
               
                int t = s.charAt(x)-'0'; 
              
                System.out.printf("%2d",t);
                    if ((x+1) %2 ==0){
                   System.out.println();}
        
                       
        
                       
       
          
            }
             /*  for (int c=0; c<cols; c++)
                  
               {
                  
                 int r = s.charAt(c)-'0';
                 System.out.println("Col" + c + "result" + r );
                //int t = s.charAt(c)-'0' ;
                for(int i=0 ;i<rows;i++){
                   
               
               
              
                  result[c][i] = r;
                
                }
               } */
             
            return result;}
         // }
   
           private static void printMatrix(int matrix[][]) throws FileNotFoundException
           {
           
       
               for (int rows=0; rows<matrix.length; rows++)
               {
                   for (int columns=0; columns<matrix[rows].length; columns++)
                   {
                   
                   
                       System.out.printf("%2d", matrix[rows][columns]);
                     
                   }
                   System.out.println();
               }
          
           }
         
           }