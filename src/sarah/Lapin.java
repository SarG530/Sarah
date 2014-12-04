package sarah;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Lapin {
    private String name;
    private int age;
   
public Lapin (String n, int a){
        this.name = n;
        this.age = a;
}

public void crier(){
        System.out.println("HAAA");  
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        
}
