package works.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import works.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
