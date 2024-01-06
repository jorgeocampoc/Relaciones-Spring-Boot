package com.posgrado.relaciones.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table
public class Student {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private int age;
  @OneToOne
  @JoinColumn(name = "address_id")
  private Address address;
  @ManyToOne
  @JoinColumn(name = "course_id")
  private Course course;
  @ManyToMany
  @JoinTable(
      name = "students_tasks",
      joinColumns = @JoinColumn(name = "student_id"),
      inverseJoinColumns = @JoinColumn(name = "task_id")

  )
  private List<Task> tasks;
}
