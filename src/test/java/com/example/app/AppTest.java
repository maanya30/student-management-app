package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testStudentGradeB() {

        String result =
                App.getStudentDetails("Maanya", 85);

        assertEquals(
                "Student: Maanya, Marks: 85, Grade: B",
                result
        );
    }
}
