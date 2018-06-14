package com.emusicstore.deo;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDeo {

    private List<Product> productList;

    public List<Product> productList(){

        Product product1= new Product();
        product1.setProductName("Gitar");
        product1.setProductCategory("instrument");
        product1.setProductDescription("this is a fender strat gitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("fender");

        productList = new ArrayList<Product>();
        productList.add(product1);
        return productList;
    }
}
