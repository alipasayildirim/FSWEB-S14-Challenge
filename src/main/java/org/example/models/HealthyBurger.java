package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

        double newPrice = getPrice() + price;
        setPrice(newPrice);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

        double newPrice = getPrice() + price;
        setPrice(newPrice);
    }

    @Override
    public double itemizeHamburger() {
        super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
        }

        return getPrice();
    }
}
