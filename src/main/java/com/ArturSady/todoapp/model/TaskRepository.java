package com.ArturSady.todoapp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<TaskGroup> findAll();
    Page<TaskGroup> findAll(Pageable page);
    Optional<TaskGroup> findById(Integer id);
    boolean existsById(Integer id);
    List<TaskGroup> findByDone(@Param("state") boolean done);
    TaskGroup save(TaskGroup entity);

}
