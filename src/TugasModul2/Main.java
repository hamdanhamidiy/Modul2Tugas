package TugasModul2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String[] bookList;
    public String[] userStudent;
    public String Inim;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih;
        do {
        System.out.println("===== Library Sytem =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        pilih = input.nextInt();

        switch (pilih){
            case 1:
                break;
            case 2:
                Admin objadmin = new Admin();

                System.out.print("Enter your username: ");
                String user = input.next();
                System.out.print("Enter your password: ");
                String pass = input.next();

                if (user.equals(objadmin.adminUsername) && pass.equals(objadmin.adminPassword)){
                    System.out.println("Succesful login as Admin.");
                    menuAdmin();
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Maaf anda salah input");
                break;
        }
    } while (pilih != 3);
    }

    void inputNim(Scanner input){
        System.out.print("Enter your NIM (Input 99 untuk back): ");
        Inim = input.nextLine();
    }
    void chekNim(){
        for (String i : userStudent) {
            if (Inim.equals(i)){
                System.out.println("Anda berhasil Login");
            } else {
                System.out.println("Anda tidak berhasil login");
            }
        }
    }

    void menuStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("===== Student Menu =====");
        System.out.println("1. Buku terpinjam");
        System.out.println("2. Pinjam buku");
        System.out.println("3. Pinjam buku atau Logout");
        System.out.print("Choose option (1-3): ");
        int pilihAdmin = input.nextInt();
    }

    static void menuAdmin(){
        Scanner input = new Scanner(System.in);
        final ArrayList<Admin> ListMahasiswa = new ArrayList<>();


        int pilihAdmin;
        do {
        System.out.println("===== Admin Menu =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display Registered Students");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        pilihAdmin = input.nextInt();

        switch (pilihAdmin){
            case 1:
                Admin objadmin = new Admin();
                objadmin.addStudent();
                ListMahasiswa.add(objadmin);
                break;
            case 2:
                tampilkanDataMahasiswa(ListMahasiswa);
            case 3:
                break;
            default:
                System.out.println("Maaf anda salah input");
                break;
        }
        } while (pilihAdmin != 3);
    }

    static void tampilkanDataMahasiswa(ArrayList<Admin> daftarMahasiswa) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("\nBelum ada data mahasiswa.");
        } else {
            System.out.println("\n\u001B[3m\u001B[35mData\u001B[0m Mahasiswa:");
            for (Admin mahasiswa : daftarMahasiswa) {
                mahasiswa.displayStudent();
            }
        }
    }
}
