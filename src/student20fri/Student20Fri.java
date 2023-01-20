/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student20fri;

/**
 *
 * @author Ben Praseuth
 */
public class Student20Fri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       private String studentId;
       private String studentName;
       
       public Student20Fri(String studentId,String studentName){
           this.studentId = studentId;
           this.studentName = studentName;
       }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    
    }//end of class
    

