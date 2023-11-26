package ru.gb.oseminar.data;

import java.util.List;

// Принцип ISP(разделения интерфейсов. Добавил узконаправленный интейфейс для Teacher
public interface Grading {
    public void GradingOfExaminations(List<Student> studentList, Integer mistake);
}
