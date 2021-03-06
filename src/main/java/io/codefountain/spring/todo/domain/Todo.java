package io.codefountain.spring.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	private String todoItem;
	private String completed;
	
	public Todo(String todoItem, String completed) {
		super();
		this.setTodoItem(todoItem);
		this.setCompleted(completed);
	}

	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public String getTodoItem() {
		return todoItem;
	}

	public void setTodoItem(String todoItem) {
		this.todoItem = todoItem;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}
}