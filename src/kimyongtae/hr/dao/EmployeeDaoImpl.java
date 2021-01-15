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
	public int insertEmployee(String empName, LocalDate hireDate) {
		return empMap.insertEmployee(empName, hireDate);
	}
	
	@Override
	public int updateEmployee(Employee emp) {
		return empMap.updateEmployee(emp);
	}
	
	@Override
	public int deleteEmployee(int empId) {
		return empMap.deleteEmployee(empId);
	}
}
