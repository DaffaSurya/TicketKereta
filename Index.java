import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
     Myfunc();
  }

  static void Myfunc() {
    System.out.println("Masukkan Nama anda");
     Scanner Myobj = new Scanner(System.in);
     String Name = Myobj.nextLine();

     System.out.println("==================== Ticket List =====================");
     
    //  datalist ticket

    int Price1 = 100000;
    int Price2 = 200000;
    int Price3 = 350000;

    System.out.println("Harga Ticket Ekonomi adalah Rp." + Price1 + " per orang");
    System.out.println("Harga Ticket Eksekutif adalah Rp." + Price2 + " per orang");
    System.out.println("Harga Ticket Bisnis adalah Rp." + Price3 + " per orang");

    // dataList ticket

    // Input penumpang

    System.out.println("Masukkan Jumlah Penumpang");
    Scanner Input = new Scanner(System.in);
    int Mynum = Input.nextInt();

    // Input penumpang

    // Input Ticket class
    
    System.out.println("Masukkan kelas kereta yang anda mau pilih sesuai yang tertera di List");
    Scanner Ticket = new Scanner(System.in);
    String MyTicket = Ticket.nextLine();

    // Input Ticket class

    // conditional if you choice a ticket class

    switch (MyTicket) {
        case "Ekonomi":
            int Result = (Price1*Mynum);
            System.out.println("Total pesanan Ticket anda sebesar Rp." + Result + " untuk " + Mynum + " orang");
            System.out.println("Atas Nama " + Name);
            break;
        
        case "Eksekutif":
             int Result1 = (Price2*Mynum);
             System.out.println("Total pesanan Ticket anda sebesar Rp."  + Result1 + " untuk " + Mynum + " orang");
             System.out.println("Atas Nama " + Name);
             break;

        default:
            int Result2 = (Price3*Mynum);
            System.out.println("Total pesanan Ticket anda sebesar Rp." + Result2 + " untuk " + Mynum + " orang");
            System.out.println("Atas Nama " + Name);
            break;
    }

    System.out.println("======================== Bukti pembayaran ========================");








  }
}