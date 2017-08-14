package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.domain.Product;

public class ProductDao extends HibernateTemplate{
    @SuppressWarnings("unchecked")
	public List<Product> list() {
        return (List<Product>) find("from Product");
    }
    
    public void add(Product p) {
        save(p);
    }
}
