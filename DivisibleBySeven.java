/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible.by.seven;

/**
 *
 * @author ARES
 */
public class DivisibleBySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int check;
        
        System.out.println("Numbers divisible by 7 are: ");
        
            for(int i=0;i<101;i++)
            {
                check = i % 7;
                if(check == 0)
                {
                    System.out.print(i + " " );
                } 
              
            }
            
            
    
    
    
    }


    }
    

