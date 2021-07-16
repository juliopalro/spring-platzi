package com.juliopalromarket.persistence;

import com.juliopalromarket.persistence.crud.ProductoCrudRepository;
import com.juliopalromarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
