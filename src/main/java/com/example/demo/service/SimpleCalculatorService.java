package com.example.demo.service;

import com.example.demo.model.MultiplyDTO;
import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService implements CalculatorService {
    @Override
    public Integer add(Integer number1, Integer number2) {
        return number1 + number2;
    }

    @Override
    public Integer multiply(MultiplyDTO dto) {
        return dto.number1() * dto.number2();
    }

    @Override
    public Integer invert(Integer id) {
        return -id;
    }
}
