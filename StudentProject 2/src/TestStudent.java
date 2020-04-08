
import model.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umaporn
 */
public class TestStudent {
    public static void main(String[] args) {
       // long studentId, int year, double collectedCredits, double gpax, int gradeF, int gradeW
        Student s1=new Student(1, 4, 135, 3.7, 1, 0);
        Student s2=new Student(2, 1, 115, 1.4, 0, 0);
        Student s3=new Student(3, 3, 130, 3.8, 0, 0);
        Student s4=new Student(4, 4, 137, 2.0, 0, 0);
        Student s5=new Student(5, 2, 135, 1.87, 0 ,0 );
        Student s6=new Student(6, 2, 10, 1.55, 0, 0);
        Student s7=new Student(7, 4, 135, 3.26, 0, 0);
     
        
        
        System.out.println("s1: "+s1.getStatus());
        System.out.println("s2: "+s2.getStatus());
        System.out.println("s3: "+s3.getStatus());
        System.out.println("s4: "+s4.getStatus());
        System.out.println("s5: "+s5.getStatus());
        System.out.println("s6: "+s6.getStatus());
        System.out.println("s7: "+s7.getStatus());
        
        
    }
}
