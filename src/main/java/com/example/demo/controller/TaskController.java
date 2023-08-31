package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Goutham linga
 *
 */

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@PostMapping
	public Task createTask(@RequestBody Task Task) {
		return taskService.createTask(Task);
	}

	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Long id, @RequestBody Task Task) {
		Task.setId(id);
		return taskService.updateTask(Task);
	}

	@DeleteMapping
	public void deleteTask(@RequestBody Task Task) {
		taskService.deleteTask(Task);
	}
}
