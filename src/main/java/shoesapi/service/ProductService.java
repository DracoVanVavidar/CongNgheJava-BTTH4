package com.example.shoesapi.service;

import com.example.shoesapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return List.of(
            new Product("4DFWD PULSE SHOES", 160.00, "adidas", "This product is excluded from all promotional discounts and offers", "/images/img1.png"),
            new Product("FORUM MID SHOES", 100.00, "Adidas", "This product is excluded from all promotional discounts and offers", "/images/img2.png"),
            new Product("SUPERNOVA SHOES", 150.00, "Adidas", "NMD City Stock 2", "/images/img3.png"),
            new Product("BEACH SEASON SHOES", 160.00, "Adidas", "Summer collection", "/images/img4.png"),
            new Product("BLACK THADER", 120.00, "Adidas", "Speed Run", "/images/img5.png"),
            new Product("FLOWAIR MID SHOES", 160.00, "Adidas", "Speed Run", "/images/img6.png")
        );
    }
}
