package com.ronipur.mtisd.repository;

import com.ronipur.mtisd.model.CustomerTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerTab, String> {
}
