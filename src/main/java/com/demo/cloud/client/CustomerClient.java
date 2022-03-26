/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fcastillo
 */
@FeignClient(name = "customer-service")
public interface CustomerClient {
  
  @GetMapping("/customers")
  public ResponseEntity<Object> getCustomers();
  
}
