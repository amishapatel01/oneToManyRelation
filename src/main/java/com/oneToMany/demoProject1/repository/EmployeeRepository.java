package com.oneToMany.demoProject1.repository;



import com.oneToMany.demoProject1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

