package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book_category")
public class BookCategory {

	private int id;
	@NotNull
	private String name;

	public BookCategory() {

	}
	public BookCategory(int id) {
		this.id = id;
	}

	public BookCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public BookCategory(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
