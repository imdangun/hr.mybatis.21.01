package kimyongtae.hr.dao;

import java.time.LocalDate;
import java.util.List;

import kimyongtae.hr.config.Configuration;
import kimyongtae.hr.dao.map.EmployeeMap;
import kimyongtae.hr.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private EmployeeMap empMap;
	
	public EmployeeDaoImpl() {
		this.empMap = Configuration.getMapper(EmployeeMap.class);
	}
	
	@Override
	public List<Employee> selectEmployees() {
		return empMap.selectEmployees();
	}
	
	@Override
	public Employee selectEmployee(int empId) {
		return empMap.selectEmployee(empId);
	}
	
	@Override
	public boolean insertEmployee(String empName, LocalDate hireDate) {
		return empMap.insertEmployee(empName, hireDate) > 0;
	}
	
	@Override
	public boolean updateEmployee(Employee emp) {
		return empMap.updateEmployee(emp) > 0;
	}
	
	@Override
	public boolean deleteEmployee(int empId) {
		return empMap.deleteEmployee(empId) > 0;
	}
}
