/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validatortestapp;
import java.util.Scanner;
/**
 * The OOValidator class contains various method for getting and validating user
 * input.
 */
public class OOValidator
{
    protected Scanner sc;
    protected int i;
    protected double d;
    
    public OOValidator() 
    {
        sc = new Scanner(System.in);
        i = 0;
        d = 0.0;
    }
    
    /**getInt
     * prompts user to enter an integer
     * returns a valid integer
     * @param prompt
     * @return 
     */
    public int getInt(String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                return sc.nextInt();
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
                sc.nextLine();
            }  
        }
    }
    
    /**
     * overloaded getInt to accept minimum and maximum values 
     * @param prompt
     * @param min
     * @param max
     * @return
     */
    public int getInt(String prompt, int min, int max)
    {
        while (true)
        {
            i = getInt(prompt);
            if (i < min || i > max)
            {
                System.out.println("Error! Integer must be from " + min + " to " + max);
            }
            else
            {
                sc.nextLine();
                return i;
            }
        }
    }
    
    /** getDouble
     * prompts user to enter a valid double
     * @param prompt
     * @return
     */
    public double getDouble(String prompt)
    {
        //loop until user enters a valid int
        while (true)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                break;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();
        }
        return d;
    }
    
    /**
     * getDouble
     * overloaded getDouble which accepts minimum and maximum values
     * @param prompt
     * @param min
     * @param max
     * @return
     */
    public double getDouble(String prompt, double min, double max)
    {
        while (true)
        {
            d = getDouble(prompt);
            if (d < min || d > max)
            {
                System.out.println("Error! Decimal value must be from " + min + " to " + max);
            }
            else
            {
                return d;
            }
            sc.nextLine();
        }
    }
    
    
}
