/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatortestapp;

/**
 *
 * @author Paul
 */
public class ValidatorTestApp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MyValidator val = new MyValidator();
        
        System.out.println("Welcome to the Validation Tester application");
        
        System.out.println("Int test");
        val.getInt("Enter an integer bewteen -100 and 100: ", -100, 100);
        
        System.out.println("\nDouble Test");
        val.getDouble("Enter any number between -100 and 100: ", -100, 100);
        
        System.out.println("\nRequired String Test");
        val.getString("Enter your email address: ");
        
        System.out.println("\nString Choice Test");
        val.getChoice("Select one (x/y): ", "x", "y");
        
        System.out.println("DONE");
    }
    
}
