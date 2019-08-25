package hibernate;

import java.io.Serializable;

public class Person implements Serializable{

    private String name;
    private int age;
    private String adress;
    private int salary;
    private int id;
    private String strucnoz;

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public String getAdress() {

        return adress;

    }

    public int getSalary() {

        return salary;

    }
    public int getId(){
    return id;
    
    }
    public String getStrucnoz(){
    
    return strucnoz;
    
    }
   

    public void setname(String name) {

        this.name = name;

    }

    public void setage(int age) {

        this.age = age;

    }

    public void setadress(String adress) {

        this.adress = adress;

    }

    public void setsalary(int salary) {

        this.salary = salary;

    }
    public void setid(int id){
    
    this.id = id;
    
        
    }
    public void setstrucnoz(String strucnoz){
    
    this.strucnoz = strucnoz;
    
    }

    public Person(String name, int age, String adress, int salary,String strucnoz) {

        this.name = name;
        this.age = age;
        this.adress = adress;
        this.salary = salary;
        this.id = id;
        this.strucnoz = strucnoz;

    }

    public Person() {

    }
    @Override
    public String toString(){
    
    return name + ":" + age + adress + salary + id + strucnoz;
    
    
    }

    

}
