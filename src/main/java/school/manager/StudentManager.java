package school.manager;

import java.util.ArrayList;
import java.util.List;

import school.model.Student;

public class StudentManager {
	
	private static List<Student> students = new ArrayList<Student>();
	
	public List<Student> listAll() {
		return students;
	}
	
	public Student save(Student student) {
		student.setId(students.size() + 1);
		students.add(student);
		return student;
	}
	
	public Student obtainValueKey(long id) {
		return students.get(((int) id) -1);
	}
	
	public void delete(long id) {
		students.remove(((int) id) -1);
	}
	
	public void update(Student student, long id) {
		students.set(((int) id) -1, student);
	}

	public List<Student> search(String name) {
		List<Student> students_ = new ArrayList<Student>();
		for(Student s : students)
			if(s.getName().contains(name))
				students_.add(s);
		
		return students_;
	}


}
