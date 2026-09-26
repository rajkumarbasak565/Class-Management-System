/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author Administrator
 */
public class Lab3 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.read();
        student1.name = "Abrar";
        student1.id = "252-15-476";
        student1.section = "69_I";
        student1.address = "Gazipur";
        student1.display();
        Student student2= new Student();
        student2.name = "SAKIB";
        student2.id = "252-15-  042";
        student2.section = "69_I";
        student2.address = "SHODORGHAT";
        student2.display();
        Section i_69 = new Section();
        i_69.showStudentInfo();
        
    }
}

class Student {

    String id;
    String name;
    String section;
    String address;
void read() {
        System.out.println("student is reading ");

    }

    void display() {
        System.out.println("NAme: " + name);
        System.out.println("ID: : " + id);
        System.out.println("Section: " + section);
        System.out.println("Address: " + address);

    }
}
       
    

