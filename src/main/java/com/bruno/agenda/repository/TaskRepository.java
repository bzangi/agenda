package com.bruno.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.agenda.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
