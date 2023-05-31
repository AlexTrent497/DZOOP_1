import Task.Produkt;

public class Chocolate extends Produkt{
    
    int percentageOfCocoa;

    public Chocolate(String name, double cost, int percentageOfCocoa) {
        super(name, cost);
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", percentageOfCocoa: %s", this.percentageOfCocoa);
    }
}
