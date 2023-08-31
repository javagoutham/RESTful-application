package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

/**
 * @author Goutham linga
 *
 */

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}
	
	public void deleteTask(Task task) {
		 taskRepository.delete(task);
	}
}
