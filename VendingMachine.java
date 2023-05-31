import java.util.ArrayList;
import java.util.List;

import Task.Produkt;

public class VendingMachine {
    
    private List<Produkt> productList = new ArrayList<>();

    public List<Produkt> getProductList(){
        return productList;
    }

    public void addProduct(Produkt product){
        this.productList.add(product);
    }

    public Produkt getProductByName(String name){
        for (Produkt product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String text = "";
        for (Produkt product : productList){
            text += product.toString() + "\n";
        }
        return text;
    }





}
