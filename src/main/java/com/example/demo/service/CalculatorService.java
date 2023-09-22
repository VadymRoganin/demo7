package com.example.demo.service;

import com.example.demo.model.MultiplyDTO;

public interface CalculatorService {
    Integer add(Integer number1, Integer number2);
    Integer multiply(MultiplyDTO dto);
    Integer invert(Integer id);
}
