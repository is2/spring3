package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Pig4 {
    private final Lamb5 lamb5;
    public Pig4 (Lamb5 lamb5) {
        this.lamb5 = lamb5;
    }
    @Override
    public String toString() {
        return "which is stuffed inside a lamb, "+lamb5.toString();
    }
}
