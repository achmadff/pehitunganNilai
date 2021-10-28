import java.util.Scanner;

public class perhitunganNilai07323 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int jumlah07323,temp07323,rata07323,nilai07323 = 0;

        System.out.print ("Jumlah Mata Kuliah: ");
        jumlah07323 = input.nextInt();
        
        String [] matKul = new String [jumlah07323];
        int [] nilai = new int [jumlah07323];
        
        int i = 0;
        do{
            System.out.print ("Nama Matkul : ");
            matKul [i] = input.next();
            
            System.out.print ("Nilai : ");
            temp07323 = input.nextInt();
            nilai[i] = temp07323;
            
            System.out.println(" ");
            nilai07323 += temp07323;
            // nilai = nilai + temp
            i++;
        }while(i != jumlah07323);
        
        rata07323 = nilai07323 / jumlah07323;
        
        System.out.println ("\nRata-rata: "+rata07323);
        
        if(rata07323 >= 71){
            System.out.println("\nAnda LULUS");
        }else{
            System.out.println("\nAnda TIDAK LULUS");
        }
        input.close();
    }
}
