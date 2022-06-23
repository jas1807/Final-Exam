/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    public enum STATUS{zero , one , two , three};
   
    private STATUS status;
    public void statusDetail()
{
System.out.println(status.values()[0]);
System.out.println(status.values()[1]);
System.out.println(status.values()[2]);
System.out.println(status.values()[3]);
}
    
}
 

