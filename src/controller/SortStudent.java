/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import common.StudentManagement;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import view.Menu;

/**
 *
 * @author huynh
 */
public class SortStudent extends Menu<String> {

    protected Library library;
    protected StudentManagement stuMan;

    public SortStudent() {
        super("=====Collection Sort Program=====");
        library = new Library();
        stuMan = new StudentManagement();
    }

    @Override
    public void execute() {
        char continueAdd = 'Y';
        String name;
        String classes;
        float mark;
        List<Student> list = new ArrayList<>();
        
        while(continueAdd == 'Y' || continueAdd == 'y') {
            System.out.println("Please input student information");
            name = library.getString("Name: ");
            classes = library.getString("Classes: ");
            mark = library.getFloat("Mark: ");
            
            list.add(new Student(name, mark, classes));
            continueAdd = library.getChar("Do you want to enter more student information?(Y/N): ");
        }
        stuMan.sortStudent(list);
        stuMan.display(list);
    }
}