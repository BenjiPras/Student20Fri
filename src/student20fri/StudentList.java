/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student20fri;

/**
 *
 * @author Ben Praseuth
 */
public class StudentList {
    
    public static void main(String[] args){
        Student20Fri s1 = new Student20Fri("s1","ben");
        Student20Fri[] StudentList = new Student20Fri[3];
        StudentList[0]= new Student20Fri("s1", "ben");
        StudentList[0]= new Student20Fri("s2", "abc");
        StudentList[0]= new Student20Fri("s3", "xyz");
        
        for( int i =0; i < StudentList.length; i++){
            System.out.println(StudentList[i].getStudentName());
        }
    
}
    
}
