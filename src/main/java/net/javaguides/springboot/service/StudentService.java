package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Student;

import java.util.List;

public interface StudentService {
	Student createUser(Student user);

	Student getUserById(Long userId);

    List<Student> getAllUsers();

    Student updateUser(Student user);

    void deleteUser(Long userId);

	Student createUser1(Student user);
}