package com.bruno.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.agenda.dto.TaskDTO;
import com.bruno.agenda.models.Task;
import com.bruno.agenda.repository.TaskRepository;

@RestController
@RequestMapping ("/task")
public class TaskController {
	@Autowired
	private TaskRepository taskRepository;

	@GetMapping
	public ResponseEntity<List<TaskDTO>> listTask() {
		return ResponseEntity.ok(TaskDTO.toTaskDTOList(taskRepository.findAll()));
	}
	
	@PostMapping
	public ResponseEntity<TaskDTO> addTask(@RequestBody TaskDTO task) {
		return ResponseEntity.ok(TaskDTO.toTaskDTO(taskRepository.save(new Task(task.getTitle(), task.getBody(), task.getExpirationDate()))));
	}
}
