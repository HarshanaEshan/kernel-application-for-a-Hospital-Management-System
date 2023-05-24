package com.company;

import java.util.Scanner;

public class bill {
    String bida, bname;
    double lab,doctor,medicine,fecility,hosfree,totalpay=0;
    void new_bill()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        bida = input.nextLine();
        System.out.print("name:-");
        bname = input.nextLine();
        System.out.print("labcost:-");
      lab=input.nextDouble();
        System.out.print("doctor charge:-");
     doctor=input.nextDouble();
        System.out.print("medicine:-");
       medicine=input.nextDouble();
        System.out.print("facility.:-");
      fecility=input.nextDouble();
        System.out.print("hospital free");
        hosfree=input.nextDouble();
        totalpay=(lab+doctor+medicine+fecility+hosfree)+totalpay;
    }
    public void bill_info()
    {
        System.out.println(bida + "\t" +bname + "  \t" + lab + "     \t" + doctor + "    \t" + medicine + "       \t" + fecility+"       \t"+hosfree+"      \t"+ totalpay);
    }
}
