package com.lambton;

import java.time.LocalDate;

public class MainExample
{
    public static void main(String[] args)
    {
        Person p1;

        Student s1 = new Student(1,"varinder","Dhillon", LocalDate.now(),"Female","MADT",2);


      p1 =s1;
      p1.display();
      p1.print();

        Faculty f1= new Faculty(10,
                "Varinder",
                "Dhillon",
                LocalDate.now(),
                "Female",
                "Professor",
                1000.50F,
                "Android Developer") {
            @Override
            public void calculateTotalSalary() {

            }
        };

        f1.calculateTotalSalary();

        p1=f1;
        p1.display();

       double a = 1000.00;

       int x =0b01010;
          System.out.println(x);
        int y =0017;
        System.out.println(y);


        int z =0x17ABC;
        System.out.println(z);

        int b =1_00_000/1_00;
        System.out.println(b);

        double c =1______001.0_______0;
        System.out.println(c);





    }
}
