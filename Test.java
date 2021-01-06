import java.util.*;
import java.lang.*;
import java.io.*;

class Employee  {
 
 private String name;
 private int age;
 
 public Employee(String name, int age) {
  super();
  this.name = name;
  this.age = age;
 }
 
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public int getAge() {
  return age;
 }
 
 public void setAge(int age) {
  this.age = age;
 }
 
 
  
 @Override
  public String toString() {
   return " [  age=" + age + " , name=" + name + "]";
  }
 
}

public class Test {

    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("tarun", 28));
        employee.add(new Employee("arun", 29));
        employee.add(new Employee("varun", 22));
        employee.add(new Employee("arun", 2));

        Collections.sort(employee, Comparator.comparingInt(Employee::getAge)
    .thenComparing(Employee::getName));
        for(Employee emp : employee) {
		if(emp.getAge()>=10)
			System.out.println(emp);
	}

    }
}