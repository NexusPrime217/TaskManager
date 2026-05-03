package com.execution.TaskManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/fetchtask")
    public String fetchAllTasks(){
        return "List of tasks in JSON format";
    }

    @PostMapping("/addtask")
    public String addNewTask(@RequestBody String title){
        return "new task added with title: "+title;
    }
}
