package us.rigual.studentsystem.repository;


import org.springframework.stereotype.Repository;
import us.rigual.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
