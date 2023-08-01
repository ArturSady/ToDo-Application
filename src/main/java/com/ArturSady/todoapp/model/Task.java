package com.ArturSady.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
    private int id;
    private String description;
    private boolean done;

}
