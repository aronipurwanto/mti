package com.ronipur.mtisd.controller;

import com.ronipur.mtisd.model.CustomerTab;
import com.ronipur.mtisd.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok().body(
                service.getAll()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String request){
        return ResponseEntity.ok().body(
                service.getById(request)
        );
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody CustomerTab request){
        return ResponseEntity.ok().body(
                service.save(request)
        );
    }
}
