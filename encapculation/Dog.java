package oop.encapculation;

public class Dog {
    private String color;

    Dog(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
