package com.ronipur.mtisd.service;

import com.ronipur.mtisd.model.CustomerTab;
import com.ronipur.mtisd.repository.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
public class CustomerService {
    private CustomerRepo repo;

    @Autowired
    public CustomerService(CustomerRepo repo) {
        this.repo = repo;
    }

    public List<CustomerTab> getAll(){
        return this.repo.findAll();
    }

    public Optional<CustomerTab> getById(String id){
        return this.repo.findById(id);
    }

    public Optional<CustomerTab> save(CustomerTab data){
        try{
            String id = UUID.randomUUID().toString().replace("-","");
            data.setId(id);
            this.repo.save(data);
            return Optional.of(data);
        }catch (Exception e){
            log.error("Failed Save, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
