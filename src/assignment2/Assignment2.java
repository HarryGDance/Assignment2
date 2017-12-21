/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

// Just display no need for a scanner 

/**
 *
 * @author sonyb
 */
public class Assignment2 {

    /** 

     * @param args the command line arguments
     */

    public static void main(String[] args) {
    
           
//Display the method 
        displaynames();
    }
                
  
    private static void displaynames() {
        //initialize the array for students and there grades
        int[][] grades = { {88,99,33,56, 56}, {23,56,45,76,87},
                        {99,39,43,54,54}, {99,60,66,50,66}, {67, 56, 56 ,56, 56} };
        String[] names = {"Tod", "Ron", "Ben", "Fry", "Pam"};
        //print header
        System.out.println("Student Course 1 Course 2 Course 3 Course 4 Course 5");
         //print grades in a row
        for(int z = 0; z<grades.length; z++){
             System.out.print(names[z]+"     ");
        for(int r = 0; r<grades.length; r++) {
              System.out.print(grades[z][r]+"       ");       
        
        }
               System.out.println("            ");    
        }
      
        //find the highest average of the 
        int highest =0;
        int counter=0;
        double sum = 0;
        for(int i=0;i<grades.length;i++){
        for(int j=0;j<grades[i].length;j++){
            sum = sum+grades[3][j];
         counter++;
        }
        }
          double avg = sum/counter;
        System.out.print("The student with the highest average in the class is Fry("+avg+"%)");
    }
        
        }
    

