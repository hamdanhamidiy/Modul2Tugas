package TugasModul2;

import java.util.Scanner;
public class Admin {
    Student student = new Student();
    Main main = new Main();
    String adminUsername = "admin";
    String adminPassword = "admin";
    String studentList;

    void displayStudent(){
        System.out.println("List Mahasiswa yang terdaftar: ");
        System.out.println("Nama: " + student.name);
        System.out.println("Fakultas: " + student.faculty);
        System.out.println("NIM: " + student.Nim);
        System.out.println("Program Studi: " + student.programStudi);
    }

    void addStudent(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        student.name = inp.nextLine();
        System.out.print("Masukkan Nim mahasiswa: ");
        student.Nim = inp.nextLine();
        long length = String.valueOf(student.Nim).length();
        while (length != 15) {
            System.out.println("Nim harus 15 digit!!!");
            System.out.print("Masukkan Nim mahasiswa: ");
            student.Nim = inp.nextLine();
            length = String.valueOf(student.Nim).length();
        }
        System.out.print("Masukkan fakultas mahasiswa: ");
        student.faculty = inp.nextLine();
        System.out.print("Masukkan jurusan mahasiswa: ");
        student.programStudi = inp.nextLine();
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }
}
