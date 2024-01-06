package com.posgrado.relaciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name = "tasks")
public class Task {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  @ManyToMany
  private List<Student> students;

  public Task() {
  }

  public Task(Long id, String title, List<Student> students) {
    this.id = id;
    this.title = title;
    this.students = students;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }
}
