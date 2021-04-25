package com.company;
public class Main{
    public static void main(String [] args ){
        MyArrayList Students= new MyArrayList();
        Students.add(0 ,"Akbala");
        Students.add(1 ,"Amina");
        Students.add(2 ,"Dias");
        Students.add(3 ,"Zhanarys");
        Students.add(4 ,"Alisher");
        Students.remove(4);
        for( int i=0; i<Students.getSize(); i++){
            System.out.println(Students.get(i));
        }
        System.out.println(Students.find("Akbala"));
    }
}

