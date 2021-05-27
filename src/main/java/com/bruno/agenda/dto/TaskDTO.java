package com.bruno.agenda.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bruno.agenda.models.Task;

public class TaskDTO {
	
	public TaskDTO(String title, String body, LocalDate expirationDate) {
		
		this.title = title;
		this.body = body;
		this.expirationDate = expirationDate;
		this.nome = "Marina";
		
	}

	private String title;

	private String body;

	private LocalDate expirationDate;

	private String nome;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public static TaskDTO toTaskDTO(Task task) {

		TaskDTO taskdto = new TaskDTO(task.getBody(), task.getTitle(),task.getExpirationDate());

		return taskdto;
	}

	public static List<TaskDTO> toTaskDTOList(List<Task> taskList) {

		List<TaskDTO> listDTO = new ArrayList<TaskDTO>();
		taskList.forEach(task -> {
			listDTO.add(toTaskDTO(task));
		});
		return listDTO;

	}

}
