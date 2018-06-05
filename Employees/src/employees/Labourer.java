/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author c1710L4084
 */
public class Labourer extends Employee {
    private int hoursWorked;
    private double commmission;
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    @Override
    public class calculatePay(hoursWorked){
        if(hoursWorked>50){
        commission=0.15*this.salary;}
        else {commission=0.08*this.salary;}
        return (commission+salary);
    }
    
    
}
