package com.learning.springbootmongo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springbootmongo.model.Task;
import com.learning.springbootmongo.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
    private TaskRepository repository;
	

	public Task saveTask(Task task) {
		task.setTaskid(UUID.randomUUID().toString().split("-")[0]);
		return repository.save(task);
	
	}
	public List<Task> findAllTask(){
		return repository.findAll();
		
	}
	
	public Task findbyTaskId(String taskid) {
		return repository.findById(taskid).get();
	}
	
	public List<Task> findbySeverity(int severity) {
		return repository.findBySeverity(severity);
	}
	
	public  List<Task> findbyAssignee(String assignee) {
		return repository.getTasksByAssignee(assignee);
	}
	
	public Task updateTask(Task taskrequest) {
	Task existingTask =	repository.findById(taskrequest.getTaskid()).get();
	existingTask.setAssignee(taskrequest.getAssignee());
	existingTask.setDescription(taskrequest.getDescription());
	existingTask.setSeverity(taskrequest.getSeverity());
	existingTask.setStoryPoint(taskrequest.getStoryPoint());
	
	return repository.save(existingTask);
		
		
	}
	
	public String deleteTask(String taskid) {
		 repository.deleteById(taskid);
		 
		 return "Task Deleted"+ taskid;
	}
	
	
}
