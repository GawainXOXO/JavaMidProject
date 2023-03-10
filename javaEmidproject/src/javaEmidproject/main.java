package javaEmidproject;

public class main {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class Main {
	    static ArrayList<Karyawan> karyawanList = new ArrayList<>();
	    static Scanner input = new Scanner(System.in);
	    class Employee {
	    	  private String code;
	    	  private String name;
	    	  private String gender;
	    	  private String position;
	    	  private int salary;
	    	  
	    	  public Employee(String code, String name, String gender, String position, int salary) {
	    	    this.code = code;
	    	    this.name = name;
	    	    this.gender = gender;
	    	    this.position = position;
	    	    this.salary = salary;
	    	  }
	    	  
	    	  public String getCode() {
	    	    return code;
	    	  }
	    	  
	    	  public String getName() {
	    	    return name;
	    	  }
	    	  
	    	  public String getGender() {
	    	    return gender;
	    	  }
	    	  
	    	  public String getPosition() {
	    	    return position;
	    	  }
	    	  
	    	  public int getSalary() {
	    	    return salary;
	    	  }
	    	  
	    	  public void setCode(String code) {
	    	    this.code = code;
	    	  }
	    	  
	    	  public void setName(String name) {
	    	    this.name = name;
	    	  }
	    	  
	    	  public void setGender(String gender) {
	    	    this.gender = gender;
	    	  }
	    	  
	    	  public void setPosition(String position) {
	    	    this.position = position;
	    	  }
	    	  
	    	  public void setSalary(int salary) {
	    	    this.salary = salary;
	    	  }
	    	  
	    	  public void display() {
	    	    System.out.println("Code: " + code);
	    	    System.out.println("Name: " + name);
	    	    System.out.println("Gender: " + gender);
	    	    System.out.println("Position: " + position);
	    	    System.out.println("Salary: " + salary);
	    	  }
	    	}

	    	class EmployeeData {
	    	  private ArrayList<Employee> employees;
	    	  
	    	  public EmployeeData() {
	    	    employees = new ArrayList<Employee>();
	    	  }
	    	  
	    	  public void insertData(Employee employee) {
	    	    employees.add(employee);
	    	  }
	    	  
	    	  public void viewData() {
	    	    Collections.sort(employees, new Comparator<Employee>() {
	    	      public int compare(Employee e1, Employee e2) {
	    	        return e1.getName().compareTo(e2.getName());
	    	      }
	    	    });
	    	    
	    	    System.out.println("Employee Data:");
	    	    for (int i = 0; i < employees.size(); i++) {
	    	      System.out.println("\nEmployee " + (i + 1));
	    	      employees.get(i).display();
	    	    }
	    	  }
	    	  
	    	  public void updateData(int index, Employee employee) {
	    	    employees.set(index, employee);
	    	  }
	    	  
	    	  public void deleteData(int index) {
	    	    employees.remove(index);
	    	  }
	    	}

	    	public class Main {
	    	  private static Scanner input = new Scanner(System.in);
	    	  
	    	  public static void main(String[] args) {
	    	    EmployeeData employeeData = new EmployeeData();
	    	    int choice = 0;
	    	    
	    	    do {
	    	      System.out.println

	    private static void insertDataKaryawan() {
	        System.out.print("Masukkan nama karyawan: ");
	        String nama = input.next();
	        System.out.print("Masukkan jenis kelamin (Laki-Laki / Perempuan): ");
	        String jenisKelamin = input.next();
	        System.out.print("Masukkan jabatan (Manager / Supervisor / Admin): ");
	        String jabatan = input.next();

	        int gaji = 0;
	        switch (jabatan) {
	            case "Manager":
	                gaji = 8000000;
	                break;
	            case "Supervisor":
	                gaji = 6000000;
	                break;
	            case "Admin":
	                gaji = 4000000;
	                break;
	        }

	        int jumlahJabatan = 0;
	        for (Karyawan karyawan : karyawanList) {
	            if (karyawan.getJabatan().equals(jabatan)) {
	                jumlahJabatan++;
	            }
	        }

	        if (jumlahJabatan % 3 == 0) {
	            double bonus = 0;
	            switch (jabatan) {
	                case "Manager":
	                    bonus = gaji * 0.1;
	                    break;
	                case "Supervisor":
	                    bonus = gaji * 0.075;
	                    break;
	                case "Admin":
	                    bonus = gaji * 0;
	            }
	        }
	    }

	    public static void viewDataKaryawan(ArrayList<Karyawan> listKaryawan) {
	        System.out.println("Data Karyawan PT Meksiko");
	        System.out.println("---------------------------------");
	        System.out.println("No.\tKode\tNama\tJenis Kelamin\tJabatan\tGaji");
	        Collections.sort(listKaryawan, new Comparator<Karyawan>() {
	            @Override
	            public int compare(Karyawan karyawan1, Karyawan karyawan2) {
	                return karyawan1.getNama().compareTo(karyawan2.getNama());
	            }
	        });
	        int i = 1;
	        for (Karyawan karyawan : listKaryawan) {
	            System.out.println(i + "\t" + karyawan.getKode() + "\t" + karyawan.getNama() + "\t" + karyawan.getJenisKelamin() + "\t\t" + karyawan.getJabatan() + "\t" + karyawan.getGaji());
	            i++;
	        }
	    }

	    private static void updateDataKaryawan() {
	    System.out.println("Update Data Karyawan");
	    System.out.println("====================");
	    System.out.println();
	    
	    // Menampilkan data karyawan yang tersedia
	    System.out.println("Daftar Karyawan: ");
	    sortDataKaryawan();
	    for (int i = 0; i < daftarKaryawan.size(); i++) {
	        Karyawan k = daftarKaryawan.get(i);
	        System.out.println((i + 1) + ". " + k.getKodeKaryawan() + " - " + k.getNamaKaryawan());
	    }
	    
	    // Meminta user memilih data karyawan yang akan diupdate
	    System.out.print("Masukkan nomor data yang akan diupdate: ");
	    int pilihan = input.nextInt();
	    if (pilihan <= 0 || pilihan > daftarKaryawan.size()) {
	        System.out.println("Data tidak ditemukan.");
	        return;
	    }
	    
	    // Meminta user memasukkan data karyawan yang baru
	    Karyawan k = daftarKaryawan.get(pilihan - 1);
	    System.out.println("Data saat ini:");
	    System.out.println("Kode Karyawan: " + k.getKodeKaryawan());
	    System.out.print("Masukkan kode karyawan baru (0 jika tidak ingin diupdate): ");
	    String kodeKaryawanBaru = input.nextLine().trim();
	    if (!kodeKaryawanBaru.equals("0")) {
	        k.setKodeKaryawan(kodeKaryawanBaru);
	    }
	    
	    System.out.println("Nama Karyawan: " + k.getNamaKaryawan());
	    System.out.print("Masukkan nama karyawan baru (0 jika tidak ingin diupdate): ");
	    String namaKaryawanBaru = input.nextLine().trim();
	    if (!namaKaryawanBaru.equals("0")) {
	        k.setNamaKaryawan(namaKaryawanBaru);
	    }
	    
	    System.out.println("Jenis Kelamin: " + k.getJenisKelamin());
	    System.out.print("Masukkan jenis kelamin baru (0 jika tidak ingin diupdate): ");
	    String jenisKelaminBaru = input.nextLine().trim();
	    if (!jenisKelaminBaru.equals("0")) {
	        k.setJenisKelamin(jenisKelaminBaru);
	    }
	    
	    System.out.println("Jabatan: " + k.getJabatan());
	    System.out.print("Masukkan jabatan baru (0 jika tidak ingin diupdate): ");
	    String jabatanKaryawanBaru = input.nextLine().trim();
	    if (!jabatanKaryawanBaru.equals("0")) {
	        k.setJenisKelamin(jabatanKaryawanBaru);
	        }
	    }
	    
	    public static void showDataKaryawan() {
	    // sorting array karyawan by namaKaryawan
	    Arrays.sort(karyawan, (Karyawan a, Karyawan b) -> a.namaKaryawan.compareTo(b.namaKaryawan));
	    
	    System.out.println("Data Karyawan:");
	    System.out.println("No.\tKode Karyawan\tNama Karyawan\tJenis Kelamin\tJabatan\tGaji");
	    
	    int i = 1;
	    for (Karyawan k : karyawan) {
	        if (k == null) {
	        continue;
	        }
	        System.out.println(i + "\t" + k.kodeKaryawan + "\t\t" + k.namaKaryawan + "\t\t" + k.jenisKelamin + "\t\t" + k.jabatan + "\t\t" + k.gaji);
	        i++;
	    }
	    }

	    private static void deleteDataKaryawan() {
	    System.out.println("Menghapus data karyawan");
	    System.out.println("Daftar data karyawan:");

	    // Menampilkan daftar karyawan
	    showDataKaryawan();

	    System.out.print("Masukkan nomor karyawan yang ingin dihapus: ");
	    int deleteIndex = scanner.nextInt() - 1;
	    scanner.nextLine();

	    // Menghapus data karyawan dari list
	    karyawanList.remove(deleteIndex);

	    System.out.println("Data karyawan berhasil dihapus");
	    }
	}

}
