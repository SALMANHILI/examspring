package com.example.exam.controller;


import com.example.exam.model.Project;
import com.example.exam.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/assign")
    public String showAssignPage(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "assign";
    }

    @PostMapping("/assign")
    public String assignEmployeeToProject(@RequestParam Long employeeId, @RequestParam Long projectId) {
        // Logic to assign employee to project
        return "redirect:/assign";
    }
}
