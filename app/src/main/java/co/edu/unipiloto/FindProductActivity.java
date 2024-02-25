package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindProductActivity extends AppCompatActivity {
    private ProductsExpert productsExpert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_products);
        productsExpert = new ProductsExpert(this);
    }
    public void onClickFindProduct(View view){
        TextView type = (TextView) findViewById(R.id.type);
        Spinner color = (Spinner) findViewById(R.id.color);
        String productType = String.valueOf(color.getSelectedItem());
        String products = productsExpert.getProducts(productType);
        type.setText(products);
    }
}