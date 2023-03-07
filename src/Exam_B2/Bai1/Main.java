package Exam_B2.Bai1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Student> studentList = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            Student student = new Student().inputData(studentList);
            student.displayData();
            studentList.put(student.getStudentId(), student);
        }
    }
}
