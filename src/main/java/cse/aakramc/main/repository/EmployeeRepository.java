package cse.aakramc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cse.aakramc.main.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
