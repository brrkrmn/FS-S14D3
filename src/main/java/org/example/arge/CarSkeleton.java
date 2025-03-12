package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        name = "Default name";
        description = "Default description";
    }

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car started");
    }

    public void drive() {
        System.out.println("Car is being driven");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine running");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
