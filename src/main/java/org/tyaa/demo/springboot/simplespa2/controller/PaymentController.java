package org.tyaa.demo.springboot.simplespa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tyaa.demo.springboot.simplespa2.entity.PaymentResponseModel;
import org.tyaa.demo.springboot.simplespa2.model.PaymentModel;
import org.tyaa.demo.springboot.simplespa2.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/payNow")
    public PaymentResponseModel payInstant(@RequestBody PaymentModel payment) {
        return service.pay(payment);
    }

    @GetMapping("/getTransactionsByVendor/{vendor}")
    public PaymentResponseModel getTransaction(@PathVariable String vendor) {
        return service.getTx(vendor);
    }
}
