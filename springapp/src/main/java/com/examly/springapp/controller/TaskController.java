package com.examly.springapp.controller;

import com.examly.springapp.entity.Task;
import com.examly.springapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    //    POST - /saveTask
//    Request Body:
    @PostMapping("/saveTask")
    public String saveNewTask(@RequestBody Task task) {
        return taskService.saveNewTask(task);
    }

    @GetMapping("/changeStatus")
    public Task changeStatus(@RequestParam(value = "id", defaultValue = "") int taskId) {
        return taskService.changeTaskStatus(taskId);
    }

    @GetMapping("/deleteTask")
    public Task deleteTask(@RequestParam(value = "id", defaultValue = "") int taskId) {
        return taskService.deleteTask(taskId);
    }

    @GetMapping("/getTask")
    public Task getTask(@RequestParam(value = "id", defaultValue = "") int taskId) {
        return taskService.getTask(taskId);
    }

    @GetMapping("/alltasks")
    public Iterable<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}