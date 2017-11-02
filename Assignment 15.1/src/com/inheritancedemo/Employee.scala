package com.inheritancedemo

class Employee{  
    var salary:Float = 10000  
     def increment = {
        salary = salary + 5000
      }
}  
  
class Programmer extends Employee{  
    var bonus:Int = 5000  
    println("Salary = "+salary)  //inherited from base class Employee
    println("Bonus = "+bonus)  
    increment
    println("New Salary = "+salary)  //inherited from base class Employee
 
}  
  
object MainObject{  
    def main(args:Array[String]){  
        new Programmer()  
    }  
}  
