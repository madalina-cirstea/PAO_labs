package com.patient;

import com.medical.Doctor;

public class Adult extends Patient {
    private float mothlyIncome;

    public Adult (String name, String CNP, int age, String sex, float mothlyIncome, Doctor assignedDoctor) {
        super(name, CNP, age, sex, assignedDoctor);
        this.mothlyIncome = mothlyIncome;
    }

    public float getMothlyIncome() {
        return mothlyIncome;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("monthly income: " + mothlyIncome);
    }

}
