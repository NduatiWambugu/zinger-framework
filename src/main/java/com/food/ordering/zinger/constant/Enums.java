package com.food.ordering.zinger.constant;

public class Enums {
    public enum OrderStatus {
        PENDING, TXN_FAILURE, PLACED, CANCELLED_BY_USER, ACCEPTED, CANCELLED_BY_SELLER, READY, OUT_FOR_DELIVERY, COMPLETED, DELIVERED
    }

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public enum UserRole {
        CUSTOMER, SELLER, SHOP_OWNER, SUPER_ADMIN
    }
}