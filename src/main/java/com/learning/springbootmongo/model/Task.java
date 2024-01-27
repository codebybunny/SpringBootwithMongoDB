package com.learning.springbootmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "task")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	
	@Id
	private String taskid;
	private String description;
	private int severity;
	private String assignee;
	private int storyPoint;
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public int getStoryPoint() {
		return storyPoint;
	}
	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}
	
	
	
	
}
