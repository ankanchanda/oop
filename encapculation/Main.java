package oop.encapculation;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("brown");
        System.out.println("Color of Dog: " + dog.getColor());
        dog.setColor("black");
        System.out.println("Color of Dog: " + dog.getColor());
    }
}
