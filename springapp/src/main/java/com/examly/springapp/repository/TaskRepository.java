package com.examly.springapp.repository;

import com.examly.springapp.entity.Task;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<Task, Integer> {

}
