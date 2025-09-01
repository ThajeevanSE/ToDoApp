package com.example.todo_App01.controller;


import com.example.todo_App01.models.Task;
import com.example.todo_App01.repository.TaskRepository;
import com.example.todo_App01.services.TaskServices;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;



@Controller
//@RequestMapping("/tasks")
public class TaskController {


    private TaskServices taskServices;
    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }
    @GetMapping
    public String getTasks(Model model)
    {
        List<Task> tasks=taskServices.getAllTasks();
        model.addAttribute("tasks" ,tasks);
        return "tasks";

    }
    @PostMapping
    public String addTask(@RequestParam String title)
    {
       taskServices.addTask(title);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public  String deleteTask(@PathVariable Long id)
    {
        taskServices.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id)
    {
        taskServices.toggleTask(id);
        return "redirect:/";
    }



}
