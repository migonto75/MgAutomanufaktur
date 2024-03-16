package de.mgonzales.model;

/**
 * Modellklasse für Autos aus der realen Welt
 */
public class Car {

    //region Konstanten
    public static final int DEFAULT_INT_VALUE = -1;
    public static final String DEFAULT_STRING_VALUE = ">no value set<";
    private static final double DEFAULT_DOUBLE_VALUE = -1;
    private int doors;
    //endregion Konstanten

    //region Variablen
    private String color;
    private double price;
    private int wheels;
    //endregion Variablen

    //region Methoden
    public Car() {
        doors = DEFAULT_INT_VALUE;
        color = DEFAULT_STRING_VALUE;
        price = DEFAULT_DOUBLE_VALUE;
        wheels = DEFAULT_INT_VALUE;
    }

    public Car(int doors, String color, double price, int wheels) {
        this.doors = doors;
        this.color = color;
        this.price = price;
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", wheels=" + wheels + "'" +
                "} " + super.toString();
    }
    //endregion Methoden
}
