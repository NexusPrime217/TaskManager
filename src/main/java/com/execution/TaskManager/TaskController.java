package com.execution.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/fetchtask")
    public String fetchAllTasks(){
        return "List of tasks in JSON format";
    }

    @PostMapping("/createTask")
    public Task addNewTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }
}
