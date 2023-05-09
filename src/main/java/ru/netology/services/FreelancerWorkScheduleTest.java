package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class FreelancerWorkScheduleTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/dataTest1.csv")
    void Test1(int threshold, int income, int expense) {
        FreelancerWorkSchedule workSchedule = new FreelancerWorkSchedule();
        long res = workSchedule.calculate(threshold, income, expense);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/dataTest.csv")
    void Test2(int threshold, int income, int expense) {
        FreelancerWorkSchedule workSchedule = new FreelancerWorkSchedule();
        long res = workSchedule.calculate(threshold, income, expense);
        int expected = 2;
        Assertions.assertEquals(expected, res);
    }
}
