package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product1= new Product();
        product1.setProductName("Gitar");
        product1.setProductCategory("instrument");
        product1.setProductDescription("this is a fender strat gitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("fender");

        Product product2= new Product();
        product2.setProductName("recordl");
        product2.setProductCategory("record");
        product2.setProductDescription("this is a nice thing");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("active");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("EMI");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        return productList;
    }
}
