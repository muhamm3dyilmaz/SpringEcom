package com.project.SpringEcom.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "All Prducts Are Here!";
    }
    

}