
package Task;


public class Produkt {
 
    private String name;
    private double price;

    public Produkt(String name2, double cost) {
    }

    public void Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %f", this.name, this.price);
    }






}
