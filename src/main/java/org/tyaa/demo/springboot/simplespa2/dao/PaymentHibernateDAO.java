package org.tyaa.demo.springboot.simplespa2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tyaa.demo.springboot.simplespa2.entity.Payment;

import java.util.List;

@Repository
public interface PaymentHibernateDAO extends JpaRepository<Payment, Long> {
    List<Payment> findByVendor(String vendor);
}
