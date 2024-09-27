package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Excepcion controlada");
        } catch (Exception e) {
            System.err.println("Excepcion: " + e.getMessage());
        }
    }
}
