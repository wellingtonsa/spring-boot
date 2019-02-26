package school.repository;

import org.springframework.data.repository.CrudRepository;

import school.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{


}
