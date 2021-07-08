package com.Lecture6;

public class Employee extends Person{
    int Y_O_E;
    public Employee(String name, int age,int y_o_e) {
        super(name, age);
        this.Y_O_E=y_o_e;
    }
    
public String job (){
       return "im working";
}

}
