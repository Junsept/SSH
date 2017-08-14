package com.service;

import java.util.List;

import com.dao.ProductDao;
import com.domain.Product;

public class ProductService {
	ProductDao productDao;
    public List<Product> list() {
        List<Product> products= productDao.list();
        if(products.isEmpty()){
            for (int i = 0; i < 5; i++) {
                Product p = new Product();
                p.setName("product " + i);
                productDao.add(p);
                products.add(p);
            }
        }
        return products;
    }
    public ProductDao getProductDao() {
        return productDao;
    }
 
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
