package com.posgrado.relaciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "courses")
public class Course {
  @Id
  @GeneratedValue
  private Long id;
  private String code;
  @OneToMany(mappedBy = "course",
            fetch = FetchType.LAZY)
  private List<Student> students;

}
