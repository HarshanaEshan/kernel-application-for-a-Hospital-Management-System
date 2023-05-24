package com.company;
import jdk.jshell.spi.ExecutionControl;

import java.util.*;
import java.util.Calendar;

public class HospitalManagement
{
    public static void main(String[] args) {
        //Calander
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4, count7 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System  ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        //endCalander
        //array class
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];
        bill[] b = new bill[200];
        //end array class
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new fecility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        for (i = 0; i < 100; i++)
            s[i] = new staff();
        for (i = 0; i < 200; i++)
            b[i] = new bill();
//first doctor
        d[0].did = "22";
        d[0].dname = "Dr.Karunarathna";
        d[0].specilist = "ENT";
        d[0].appoint = "5-10AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 12;
        //
        d[1].did = "32";
        d[1].dname = "Dr.Udara";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 4;
        //second doctor
        d[2].did = "17";
        d[2].dname = "Dr.Eshan";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        //
        d[3].did = "33";
        d[3].dname = "Dr.Kavindu";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;
//first pacient
        p[0].pid = "12";
        p[0].pname = "Randila";
        p[0].disease = "Mental";
        p[0].sex = "Female";
        p[0].admit_status = "y";
        p[0].age = 30;
        //
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        //
        p[2].pid = "14";
        p[2].pname = "Rashmi";
        p[2].disease = "Maleriya";
        p[2].sex = "Female";
        p[2].admit_status = "y";
        p[2].age = 45;
        //
        p[3].pid = "15";
        p[3].pname = "Ravindu";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;
// 1 medical os
        m[0].med_name = "jasd";
        m[0].med_comp = "jaffna";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        //2 medical os
        m[1].med_name = "penadol";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        //3 medical os
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        //4meidical os
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;
//lab 1
        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 1000;
        //lab2
        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;
        //lab 3
        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;
        //lab 4
        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;
//f1
        f[0].fec_name = "Ambulance";
        //f2
        f[1].fec_name = "Admit Facility ";
        //f3
        f[2].fec_name = "Canteen";
        //f4
        f[3].fec_name = "Emergency";
//staff 1
        s[0].sid = "22";
        s[0].sname = "ishara";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        //staff2
        s[1].sid = "23";
        s[1].sname = "Gihani";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        //staff 3
        s[2].sid = "24";
        s[2].sname = "Sanju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        //staff 4
        s[3].sid = "25";
        s[3].sname = "Ranil";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        //bill

        b[0].bida = "20";
        b[0].bname = "Kalana";
        b[0].lab = 1250.00;
        b[0].doctor = 1500;
        b[0].medicine = 1263;
        b[0].fecility = 30000;
        b[0].hosfree = 1250;
//
        b[1].bida = "02";
        b[1].bname = "Kalana";
        b[1].lab = 1250.00;
        b[1].doctor = 1500;
        b[1].medicine = 1263;
        b[1].fecility = 30000;
        b[1].hosfree = 1250;
//
        b[2].bida = "03";
        b[2].bname = "Kalana";
        b[2].lab = 1250.00;
        b[2].doctor = 1500;
        b[2].medicine = 1263;
        b[2].fecility = 30000;
        b[2].hosfree = 1250;
//
        b[3].bida = "04";
        b[3].bname = "Kalana";
        b[3].lab = 1250.00;
        b[3].doctor = 1500;
        b[3].medicine = 1263;
        b[3].fecility = 30000;
        b[3].hosfree = 1250;
        //password

        userPassword up = new userPassword();
        Scanner in = new Scanner(System.in);
        int un;
        int pw;
        do {
            try {

                System.out.print("Enter the user name:");
                un = in.nextInt();
                up.setUserName(un);
                System.out.print("Enter the password:");
                pw = in.nextInt();
                up.setPassword(pw);

                if ((up.getUserName() == 1111) && (up.getPassword() == 1833)) {
                    System.out.println("user name and password is exist:");
                } else {
                    System.out.println("*** Invalid user name or password ***");
                    System.out.println("*** reenter the user name and password ***");
                }
            } catch (Exception e) {
                System.out.println("There is an error");
            }
        } while (!((up.getUserName() == 1111) && (up.getPassword() == 1833)));

//end password
//en class initilization
        try {
            Scanner input = new Scanner(System.in);

            int choice, j, c1, status = 1;
            int s1, s2, s3, s4, s5, s6, s7;
            while (status == 1) {
                System.out.println("\n                                             MAIN MENU");
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("1.Doctor 2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff  7.Bill");
                System.out.println("------------------------------------------------------------------------------------------------------");

                choice = input.nextInt();

                switch (choice) {
                    //doctor section
                    case 1: {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("                             **DOCTOR SECTION**");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1) {
                            System.out.println("1).Add New Entry\n 2).Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    d[count1].new_doctor();
                                    count1++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("----------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count1; j++) {
                                        d[j].doctor_info();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                    //patient section
                    case 2: {
                        System.out.println("---------------------------------------------------------------------------------------------------------------   ");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1) {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    p[count2].new_patient();
                                    count2++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count2; j++) {
                                        p[j].patient_info();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                    //medicine section
                    case 3: {
                        s3 = 1;
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        while (s3 == 1) {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    m[count3].new_medi();
                                    count3++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("Name \t Company \t Expiry Date \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count3; j++) {
                                        m[j].find_medi();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                    //laborartory
                    case 4: {
                        s4 = 1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------- -------");
                        while (s4 == 1) {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    l[count4].new_feci();
                                    count4++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("Fecilities\t\t Cost");
                                    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count4; j++) {
                                        l[j].feci_list();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                    //hospital facility
                    case 5: {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                        while (s5 == 1) {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    f[count5].add_feci();
                                    count5++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("Hospital  Facility are:");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count5; j++) {
                                        f[j].show_feci();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                    //staff section
                    case 6: {
                        s6 = 1;
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                        while (s6 == 1) {
                            String a = "nurse", bo = "worker", c = "security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    s[count6].new_staff();
                                    count6++;
                                    break;
                                }
                                case 2: {
                                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++) {
                                        if (a.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++) {
                                        if (bo.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++) {
                                        if (c.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                    default: {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
                    //bill
                    {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("                      **BILL SECTION**");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                        s7 = 1;
                        while (s7 == 1) {
                            System.out.println("1).Add New Entry\n 2).Existing Payment");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1: {
                                    b[count7].new_bill();
                                    count7++;
                                    break;
                                }
                                case 2: {
                                    // lab,doctor,medicine,fecility,hosfree,totalpay;
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("id \t Name\t lab \t doctor \t medicine \t fecility \thospitalfree \ttotalpay");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                                    for (j = 0; j < count7; j++) {
                                        b[j].bill_info();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                    //end bill
                }
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = input.nextInt();
            }
        }catch (Exception  e1){
            System.out.println(e1);
        }

    }
    }
