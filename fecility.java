package com.company;

import java.util.Scanner;

class fecility  extends methfeci//Sorry Facility but do not change the name
{
    String fec_name;
   public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
 public   void show_feci()
    {
        System.out.println(fec_name);
    }
}
