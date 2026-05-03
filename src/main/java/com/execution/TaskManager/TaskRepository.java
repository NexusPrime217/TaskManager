package com.execution.TaskManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    public Task save(Task task);
}
