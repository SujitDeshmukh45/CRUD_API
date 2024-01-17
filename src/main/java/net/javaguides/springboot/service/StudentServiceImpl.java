package net.javaguides.springboot.service;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.Student;
import net.javaguides.springboot.entity.Student;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.StudentService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private UserRepository userRepository;

    public Student createUser1(Student user) {
        return userRepository.save(user);
    }

    @Override
    public Student getUserById(Long userId) {
        Optional<Student> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<Student> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Student updateUser(Student user) {
    	Student existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        Student updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

	@Override
	public Student createUser(Student user) {
		
		return null;
	}
}