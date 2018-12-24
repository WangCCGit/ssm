package com.service;

import com.domain.Orders;

import java.util.List;

public interface OrderService {

    List<Orders> find(int page, int size);

    Orders findById(String id);
}
