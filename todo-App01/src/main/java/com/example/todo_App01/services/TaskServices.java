package com.example.todo_App01.services;

import com.example.todo_App01.models.Task;
import com.example.todo_App01.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    private final TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<Task> getAllTasks() {
         return taskRepository.findAll();
    }
    public void addTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(()->new IllegalArgumentException("invalid task Id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);

    }
}
