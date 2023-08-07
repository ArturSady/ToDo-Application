package com.ArturSady.todoapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@
@ConfigurationProperties("task")
public class TaskConfigurationProperties {
    private boolean allowMultipleTasksFromTemplate;

    boolean isAllowMultipleTasksFromTemplate(){
        return allowMultipleTasksFromTemplate;
    }


    public void setAllowMultipleTasksFromTemplate(boolean allowMultipleTasksFromTemplate) {
        this.allowMultipleTasksFromTemplate = allowMultipleTasksFromTemplate;
    }
}
