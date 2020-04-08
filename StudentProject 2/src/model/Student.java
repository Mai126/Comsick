package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Umaporn
 */
public class Student {
    private long studentId;
    private double collectedCredits;
    private double gpax;
    private int gradeF;
    private int gradeW;
    private int year;
    private StudentStatus status;

    public Student(long studentId, int year, double collectedCredits, double gpax, int gradeF, int gradeW) {
        this.studentId = studentId;
        this.year = year;
        this.gpax = gpax;
        this.collectedCredits = collectedCredits;
        this.status = StudentStatus.NORMAL;
        this.gradeF = gradeF;
        this.gradeW = gradeW;
    }

    private void classify() {
        //graduated students
        if (collectedCredits >= 135 && gpax >= 2.0) {
            status = StudentStatus.GRADUATED;
            if (year <= 4 && gradeF == 0 && gradeW == 0) {
                if (gpax >= 3.5) {
                    status = StudentStatus.FIRST_CLASS_HONORS;
                } else if (gpax >= 3.25) {
                    status = StudentStatus.SECOND_CLASS_HONORS;
                }
            }

        } //not graduated students
        else if (gpax >= 2.0) {
            status = StudentStatus.NORMAL;
        } else if (gpax >= 1.8) {
            status = StudentStatus.PROBATION_TYPE2;
        } else if (gpax >= 1.5) {
            status = StudentStatus.PROBATION_TYPE1;
        } else {
            status = StudentStatus.QUIT;
        }

    }

    private StudentStatus classify2() {
        if (gpax < 1.5) {
            return StudentStatus.QUIT;
        }
        if (gpax < 1.8) {
            return StudentStatus.PROBATION_TYPE1;
        }
        if (gpax < 2.0) {
            return StudentStatus.PROBATION_TYPE2;
        }
        if (collectedCredits < 135) {
            return StudentStatus.NORMAL;
        }
        if (year > 4 || gradeF >= 1 || gradeW >= 1) {
            return StudentStatus.GRADUATED;
        }
        if (gpax < 3.25) {
            return StudentStatus.GRADUATED;
        }
        if (gpax < 3.5) {
            return StudentStatus.SECOND_CLASS_HONORS;
        }
        return StudentStatus.FIRST_CLASS_HONORS;

    }

    public StudentStatus getStatus() {
        //classify();
        status = classify2();
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentId != other.studentId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", collectedCredits=" + collectedCredits + ", gpax=" + gpax + ", gradeF=" + gradeF + ", gradeW=" + gradeW + ", year=" + year + ", status=" + status + '}';
    }

}
