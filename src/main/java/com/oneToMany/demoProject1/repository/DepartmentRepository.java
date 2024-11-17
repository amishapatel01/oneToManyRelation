package com.oneToMany.demoProject1.repository;



import com.oneToMany.demoProject1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
