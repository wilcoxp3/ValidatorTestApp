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
public class MyValidator extends OOValidator
{
    protected boolean answer;
    
    public MyValidator()
    {
        super();
    }
    
    /**
     * getChoice prompts the user to enter one of two choices. Returns an error
     * and re-prompts if neither choice is entered. Returns true if first choice
     * selected, and false if second choice is selected. Choices are not case
     * sensitive.
     * @param prompt
     * @param choice1
     * @param choice2
     * @return boolean
     */
    public boolean getChoice(String prompt, String choice1, String choice2)
    {
        System.out.print(prompt);
        String choice = sc.next();
        
        while(true)
        {
            if (choice.equalsIgnoreCase(choice1))
            {
                answer = true;
                break;
            }
            else if (choice.equalsIgnoreCase(choice2))
            {
                answer = false;
                break;
            }   
            else
            {
                System.out.print("Invalid choice. Please choose '" + choice1 + 
                        "' or '" + choice2 + "': ");
                sc.nextLine();
                choice = sc.next();
            }
        }
        return answer;
    }
    
    /**
     * getContinue
     * prompts the user to continue by entering 'y' or 'n'
     * returns boolean true or false corresponding to yes or no respectively
     * @param prompt
     * @return
     */
    public boolean getContinue(String prompt)
    {
        return getChoice(prompt, "Y", "N");
    }
    
    /**
     * getString displays a prompt to the user, gets the entire line, and
     * returns that line as a string.
     * @param prompt
     * @return String
     */
    public String getString(String prompt)
    {
        System.out.print(prompt);
        return sc.next();
    }
}
