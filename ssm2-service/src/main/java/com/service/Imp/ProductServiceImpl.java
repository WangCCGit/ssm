package com.service.Imp;

import com.dao.ProductDao;
import com.domain.Product;
import com.github.pagehelper.PageHelper;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAll();
    }
}
