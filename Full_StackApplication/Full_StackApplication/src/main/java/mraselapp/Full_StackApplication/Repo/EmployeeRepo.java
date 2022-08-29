package mraselapp.Full_StackApplication.Repo;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import ch.qos.logback.core.net.SyslogOutputStream;
import mraselapp.Full_StackApplication.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    ResponseEntity<Employee> deleteEmployeeById(Long id);
    
  
     
    Employee findEmployeeById(Long id);
}
