package com.li.springfullstack.Service;

import com.li.springfullstack.entity.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor loadInstructorById(Long instructorId);

    List<Instructor> findInstructorsByName(String name);

    Instructor loadInstructorByEmail(String email);

    Instructor createInstructor(String firstName, String lastName, String summary, String email, String password);

    Instructor updateInstructor(Instructor instructor);

    List<Instructor> fetchInstructors();

    void removeInstructor(Long instructorId);
}
