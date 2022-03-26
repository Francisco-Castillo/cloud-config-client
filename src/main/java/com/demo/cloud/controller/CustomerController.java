/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cloud.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcastillo
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

  @GetMapping
  public ResponseEntity<Object> getCustomers() {
    Map<String, Object> response = new HashMap<>();
    response.put("message", "Hola");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
