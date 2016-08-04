package com.example.Controller;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by enyeah on 03/08/2016.
 *
 */

@RestController
public class CustomerController {
    @Autowired //don't forget the setter
    private CustomerRepository repository;

    @RequestMapping("/customer")
    public void greeting(@RequestParam(value="name", defaultValue="Tim") String name) {
        Customer model = new Customer(new Date().toString(), "Li");
        repository.save(model);
        //return repository.findByLastName(name);
    }
}
