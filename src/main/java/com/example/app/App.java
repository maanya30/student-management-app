package com.example.app;

public class App {

    public static void main(String[] args) {

        String result =
                getStudentDetails("Maanya", 85);

        System.out.println(result);
    }

    public static String getStudentDetails(String name, int marks) {

        String grade;

        if (marks >= 90) {
            grade = "A";
        }
        else if (marks >= 75) {
            grade = "B";
        }
        else if (marks >= 50) {
            grade = "C";
        }
        else {
            grade = "Fail";
        }

        return "Student: " + name +
                ", Marks: " + marks +
                ", Grade: " + grade;
    }
}
