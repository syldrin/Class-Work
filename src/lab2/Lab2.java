/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author software
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    
    public static int dateFashion(int you, int date){
        int seat = 0;
        if (you<=2 || date<=2)
            seat = 0;
        else if (you>=8 || date>=8)
            seat = 2;
        else seat = 1;
        return seat;
        
            
    }
    public static void main(String[] args) {
        System.out.println(dateFashion(5,10));
        System.out.println(dateFashion(5,2));
        System.out.println(dateFashion(5,5));
    }
    

    
}
