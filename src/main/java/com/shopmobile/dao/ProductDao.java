package com.shopmobile.dao;

import com.shopmobile.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

  private List<Product> productList;
  public List<Product> getProductList(){
    Product product = new Product();
    product.setProductId("s10");
    product.setProductName("Iphone X");
    product.setProductCategory("Intrument");
    product.setProductDescription("This is product of Apple");
    product.setProductPrice(1000);
    product.setProductCondition("new");
    product.setProductStatus("Active");
    product.setUnitInstock(11);
    product.setProductManuFacturer("Fender");

    Product product1 = new Product();
    product1.setProductId("s11");
    product1.setProductName("Iphone 11");
    product1.setProductCategory("Intrument");
    product1.setProductDescription("This is product of Apple");
    product1.setProductPrice(1200);
    product1.setProductCondition("new");
    product1.setProductStatus("Active");
    product1.setUnitInstock(11);
    product1.setProductManuFacturer("Fender");

    Product product2 = new Product();
    product2.setProductId("s13");
    product2.setProductName("Iphone 12");
    product2.setProductCategory("Intrument");
    product2.setProductDescription("This is product of Apple");
    product2.setProductPrice(1500);
    product2.setProductCondition("new");
    product2.setProductStatus("Active");
    product2.setUnitInstock(11);
    product2.setProductManuFacturer("Fender");
    productList = new ArrayList<Product>();
    productList.add(product);
    productList.add(product1);
    productList.add(product2);
    return productList;
  }
  public Product getProductById(String productId) throws IOException {
    for (Product product: getProductList()){
      if(product.getProductId().equals(productId)){
        return product;
      }
    }
    throw  new IOException("No product found");
  }
}
