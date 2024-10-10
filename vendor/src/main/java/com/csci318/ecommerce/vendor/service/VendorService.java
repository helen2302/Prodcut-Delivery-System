package com.csci318.ecommerce.vendor.service;

import com.csci318.ecommerce.vendor.model.Product;
import com.csci318.ecommerce.vendor.model.Vendor;
import com.csci318.ecommerce.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.web.client.RestTemplate;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;
    //private RestTemplate restTemplate;

    // CreateVendor
    public Vendor createVendor(Vendor vendor) {
            vendorRepository.save(vendor);
            return vendorRepository.findById(vendor.getId())
                    .orElseThrow(() -> new RuntimeException("Vendor can not be created!!!!"));
    }

    // Find vendor by Id
    public Vendor getVendorById(Long id) {
        return vendorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vendor not found with id: " + id));
    }

    // Find all vendors
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }



}

