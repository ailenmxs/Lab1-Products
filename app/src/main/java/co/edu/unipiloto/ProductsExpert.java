package co.edu.unipiloto;

import android.content.Context;
public class ProductsExpert {
    public String[] products;
    public ProductsExpert(Context context){
        this.products = context.getResources().getStringArray(R.array.products);
    }
    public String getProducts(String product){
        switch (product) {
            case "solid goods":
                return this.products[0];
            case "agricultural products":
                return this.products[1];
            case "liquids":
                return this.products[2];
            case "chemical products":
                return this.products[3];
        }
        return "Product type not selected";
    }
}
