package com.journaldev;

import com.journaldev.dao.CustomerDAO;
import com.journaldev.model.Customer;
import com.journaldev.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerDAO customerDAO= ctx.getBean(CustomerDAO.class);
        System.out.println("List of customers is:");

        for(Customer p: customerDAO.getAllCustomers()){
            System.out.println(p);
        }

        System.out.println("\nGet customer with ID 2");

        Customer customerById = customerDAO.getCustomerById(2);
        System.out.println(customerById);
/*
        System.out.println("\nCreating customer: ");
        Customer customer = new Customer(6, "anud singh dhaka", "anud@gmail.com", "9822422023",
                "ARRAY[ (1, ‘lasagana’, 1)::orders, (2, ‘cold coffee’, 1)::orders]");
        System.out.println(customer);
        customerDAO.createCustomer(customer);
        System.out.println("\nList of customer is:");

        for (Customer p : customerDAO.getAllCustomers()) {
            System.out.println(p);
        }

 */
    }
}
