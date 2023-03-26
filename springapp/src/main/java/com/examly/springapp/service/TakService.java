package com.examly.springapp.service;

import com.examly.springapp.entity.Task;
import com.examly.springapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public String saveNewTask(Task task){
        taskRepository.save(task);
        return "Task Saved Successfully";
    }

    public Task changeTaskStatus(int taskId){
        Task task= taskRepository.findById(taskId).get();

        task.setTaskStatus("Completed");
        taskRepository.save(task);
        return taskRepository.findById(taskId).get();
    }

    public Task deleteTask(int taskId){
        Task task= taskRepository.findById(taskId).get();
        taskRepository.delete(task);
        return task;
    }

    public Task getTask(int taskId){
        return taskRepository.findById(taskId).get();
    }
    public Iterable<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
