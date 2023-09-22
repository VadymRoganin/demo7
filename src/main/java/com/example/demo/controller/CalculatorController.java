package com.example.demo.controller;

import com.example.demo.model.MultiplyDTO;
import com.example.demo.service.CalculatorService;
import com.example.demo.service.SimpleCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public Integer add(@RequestParam(value = "number1") Integer number1, @RequestParam("number2") Integer number2) {
        return calculatorService.add(number1, number2);
    }

    @PostMapping
    public Integer multiply(@RequestBody MultiplyDTO dto) {
        return calculatorService.multiply(dto);
    }

    @GetMapping("hello/{id}")
    public Integer invert(@PathVariable("id") Integer id, @RequestHeader(value = "test_header", required = false) String testHeader) {
        System.out.println("Test header: " + testHeader);
        return calculatorService.invert(id);
    }
}
