/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cloud.service;

import com.demo.cloud.client.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcastillo
 */
@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  CustomerClient customerClient;

  @Override
  public String getCustomers() {

    Object body = customerClient.getCustomers().getBody();

    return body.toString();
  }

}
