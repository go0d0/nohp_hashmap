import java.util.Scanner;
import java.util.HashMap;

class al{
    public static void main(String[] args)throws Exception{
        try{
        HashMap<String, String> Nohp = new HashMap<>();
        Scanner sn = new Scanner(System.in);
        System.out.println("masukkan nama dan nomor hp dibawah ini.");
        System.out.print("nama: ");
        String nm = sn.nextLine();
        while(true){
            if (!nm.isEmpty() && nm.matches("[a-zA-Z]+")){
                System.out.print("nomor: ");
                String nh = sn.nextLine();
                Nohp.put(nm, nh);
                System.out.println("Nama: " + nm + ", nomor hp: " + nh);
                break;
            }
        }
        }catch(Exception e){
            throw new Exception("Terdapat kesalahan: " + e.getMessage());
        }
    }
}