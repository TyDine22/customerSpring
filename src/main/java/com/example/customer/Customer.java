package com.example.customer;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    @Column(nullable = false)
    private String customer_last_name;
    private String customer_first_name;
    private  String customer_phone;

    public Customer() {

    }

    public Customer(int customer_id, String customer_last_name, String customer_first_name, String customer_phone) {
        this.customer_id = customer_id;
        this.customer_last_name = customer_last_name;
        this.customer_first_name = customer_first_name;
        this.customer_phone = customer_phone;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_last_name() {
        return customer_last_name;
    }

    public void setCustomer_last_name(String customer_last_name) {
        this.customer_last_name = customer_last_name;
    }

    public String getCustomer_first_name() {
        return customer_first_name;
    }

    public void setCustomer_first_name(String customer_first_name) {
        this.customer_first_name = customer_first_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }
}
