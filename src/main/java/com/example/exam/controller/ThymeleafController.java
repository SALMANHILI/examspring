package com.example.exam.controller;


import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-management")
    public String showEmployeeManagementPage(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-management";
    }
}
