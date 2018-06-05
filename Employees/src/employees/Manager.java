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
public abstract class Manager extends Employee {
    private double businessAmount;
    private double commission;
    
    public Manager(String name, double salary, double businessAmount){
        this.name = name;
        this.salary = salary;
        this.businessAmount=businessAmount;
    }
    
    public double getBusinessAmount() {
        return businessAmount;
    }

    public void setBusinessAmount(double businessAmount) {
        this.businessAmount = businessAmount;
    }
    
    @Override
    public double calculatePay(){
        if (businessAmount>50000) {
            commission=0.1*businessAmount;}
        else {
            commission=0.05*businessAmount;
        }
        return (commission+businessAmount);
    };

    @Override
    public void display(){
        System.out.println("Manager: Ten: "+getName()+" Business Amount="+ businessAmount+" Salary= "+getSalary()+" Total pay included commission= "+calculatePay());
    }
}
