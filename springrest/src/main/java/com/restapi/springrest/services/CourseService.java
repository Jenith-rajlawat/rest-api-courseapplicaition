package com.restapi.springrest.services;

import java.util.List;

import com.restapi.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public  Course getCourse(long courseId);
	public Course addCourse(Course course);

}
