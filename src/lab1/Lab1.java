/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author software
 */
public class Lab1 {

    /**
     * 
     * @param args the command line arguments
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        
        boolean a = false;
        if (cigars >= 40){
            if (isWeekend) a= true;
            else{
                if(cigars<=60) a= true;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        boolean t; 
        System.out.println(cigarParty(30,false));
        System.out.println(cigarParty(50,false));
        System.out.println(cigarParty(70,true));
        
        
        
    }
    
}
