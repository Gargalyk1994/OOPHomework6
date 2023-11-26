package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Teacher extends User implements Grading{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    
    // ISP принцип. Реализован метод из интерфейса
    @Override
    public void GradingOfExaminations(List<Student> studentList, Integer mistake) {
        int score = 0;
        for (Student student: studentList) {
            if(mistake == 0){
                score = 5;
                System.out.printf("Cтудент $s получил оценку $d",student.getStudentId(),score);
            }
            else if(mistake == 1){
                score = 4;
                System.out.printf("Cтудент $s получил оценку $d",student.getStudentId(),score);
            }
            else if(mistake == 2){
                score = 3;
                System.out.printf("Cтудент $s получил оценку $d",student.getStudentId(),score);
            }
            else if(mistake == 3){
                score = 2;
                System.out.printf("Cтудент $s получил оценку $d",student.getStudentId(),score);
            }
            else if(mistake == 4){
                score = 1;
                System.out.printf("Cтудент $s получил оценку $d",student.getStudentId(),score);
            }
        }
    }

    /* Принцип SRP нужен для выделиния данного метода сравнения в отдельный класс TeacherComparator

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }*/
}
