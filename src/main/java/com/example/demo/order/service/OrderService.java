package com.example.demo.order.service;


import com.example.demo.order.dto.Order;
import com.example.demo.orderitems.dto.OrderItems;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrderItems();

    int createOrderItems(Order order);

    Order getAllOrderItems(int customerId);

    Boolean validatereasonCode(int productCode);
}
