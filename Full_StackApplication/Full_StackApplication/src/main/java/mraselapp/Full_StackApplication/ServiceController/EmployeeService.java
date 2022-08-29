package mraselapp.Full_StackApplication.ServiceController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mraselapp.Full_StackApplication.Repo.EmployeeRepo;
import mraselapp.Full_StackApplication.model.Employee;

@Service
@Component
public class EmployeeService {
  

    @Autowired
    private final EmployeeRepo employeeRepo;
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);

    }
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id);
        // .orElseThrow(() -> new UserNotFoundException ("User by id"+id+"was not found"));
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);

    }
    // public ResponseEntity<Employee> deleteEmployee(Long id) {
    //    return employeeRepo.deleteEmployeeById(id);
        
    // }
    public AddResponse deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        AddResponse display = new AddResponse();
        display.setMsg("Employee Removed");
        display.setId(id);
        return display;
        // System.out.println("selected"+ id +"Employee Romoved");
    }

    
}
 