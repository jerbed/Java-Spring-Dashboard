package com.li.springfullstack;

import com.li.springfullstack.dao.*;
import com.li.springfullstack.utility.OperationUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringfullstackApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private InstructorDao instructorDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private RoleDao roleDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringfullstackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        OperationUtility.usersOperations(userDao);
        OperationUtility.rolesOperations(roleDao);
        OperationUtility.assignRolesToUsers(userDao, roleDao);
        OperationUtility.instructorsOperations(userDao, instructorDao, roleDao);
        OperationUtility.studentsOperations(userDao, studentDao, roleDao);
//		OperationUtility.coursesOperations(courseDao, instructorDao, studentDao);
	}
}
