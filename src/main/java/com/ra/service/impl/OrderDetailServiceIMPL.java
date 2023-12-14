package com.ra.service.impl;

import com.ra.repository.IOrderDetailRepository;
import com.ra.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceIMPL implements IOrderDetailService {
	@Autowired
	private IOrderDetailRepository orderDetailRepository;
}
