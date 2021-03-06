package com.yorix.hillel.java_elementary.tasks_from_1_to_29.task16_17;

import com.yorix.hillel.java_elementary.tasks_from_1_to_29.task16_17.abstraction.Book;
import com.yorix.hillel.java_elementary.tasks_from_1_to_29.task16_17.abstraction.ModernDigital;

public class ModernDigitalBook extends Book implements ModernDigital {

    public ModernDigitalBook() {
        super("modern digital", 2018);
    }

    @Override
    public String getContent() {
        return getTitle() + " - " + getYear();
    }

    @Override
    public void display() {
        System.out.println(getContent());
    }

    @Override
    public int found(String text) {
        updateFirmWare();
        return (int) (Math.random() * 1001);
    }

    @Override
    public void updateFirmWare() {
        System.out.println("Update...");
    }
}
