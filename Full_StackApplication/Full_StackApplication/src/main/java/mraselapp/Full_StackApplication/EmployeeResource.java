package mraselapp.Full_StackApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import mraselapp.Full_StackApplication.ServiceController.AddResponse;
// import mraselapp.Full_StackApplication.ServiceController.AddResponse;
import mraselapp.Full_StackApplication.ServiceController.EmployeeService;
import mraselapp.Full_StackApplication.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees () {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable ("id")Long id) {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable ("id")Long id, @RequestBody Employee employee ) {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    // @DeleteMapping("/delete/{id}")
    // public ResponseEntity<?> deleteEmployee(@PathVariable ("id")Long id) {
    //     employeeService.deleteEmployee(id);
    //     return new ResponseEntity<>(HttpStatus.OK);
    // }
    
    @DeleteMapping("/delete/{id}")
    public AddResponse deleteEmployee(@PathVariable ("id")Long id) {
       return employeeService.deleteEmployee(id);
       
    }

    // @DeleteMapping("/delete/{id}")
    // public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id) {

    //     var isRemoved = postService.delete(id);

    //     if (!isRemoved) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }

    //     return new ResponseEntity<>(id, HttpStatus.OK);
    // }

    // @DeleteMapping("/delete/{id}")
    // public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id) {
    //     return employeeService.deleteEmployee(id);
    //     // if(result != null)
        //     return ResponseEntity.ok("User deleted Successfully!!");
        // else
        // return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    // }


}
