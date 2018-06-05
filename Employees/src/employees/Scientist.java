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
public abstract class Scientist extends Employee {
    private int publication;
    private double commission;
    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }
    
    @Override
    public class calculatePay(publication){
    if (publication > 20) {
        commission = 0.2*this.salary;}
    else {commission = 0.1*this.salary;}
    return (salary+commission);
    };
}
