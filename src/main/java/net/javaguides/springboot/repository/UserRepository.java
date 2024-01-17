package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long> {
}