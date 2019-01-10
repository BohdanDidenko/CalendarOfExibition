package com.calendarofexibition.service.implementation;

import com.calendarofexibition.model.Order;
import com.calendarofexibition.model.Ticket;
import com.calendarofexibition.persistence.implementation.OrderDAOImpl;
import com.calendarofexibition.persistence.interfaces.OrderDAO;
import com.calendarofexibition.service.interfeices.OrderService;

public class OrderServiceImpl implements OrderService {

    OrderDAO orderDAO = OrderDAOImpl.getInstance();

    @Override
    public int createOrder(Order order) {
        return orderDAO.createOrder(order);
    }

    @Override
    public int createTicket(Ticket ticket) {

        return orderDAO.createTicket(ticket);
    }
}