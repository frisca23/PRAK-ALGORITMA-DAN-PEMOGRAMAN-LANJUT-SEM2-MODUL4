import java.util.Scanner;
public class Lat2Modif {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int mhs, jml, banyakTes = 3, nilai[][], ntt[], ntr[];
        float rata[], jumlah[], rtt, rtr;
        String nama[], nim[], jurusan[];
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = input.nextInt();
        nama = new String[mhs];
        nim = new String[mhs];
        jurusan = new String[mhs];
        nilai = new int[mhs][banyakTes];
        jumlah = new float[mhs];
        rata = new float[mhs];
        ntt = new int[banyakTes];
        ntr = new int[banyakTes];
        System.out.println();
        for(int h=0; h<mhs; h++){
			//Mahasiswa
            System.out.println("Mahasiswa " + (h+1));
            System.out.print("Nama\t: ");
            nama[h] = input.next();
            System.out.print("NIM\t: ");
            nim[h] = input.next();
            System.out.print("Jurusan\t: ");
            jurusan[h] = input.next();
            for(int i=0; i<banyakTes; i++){
				//Tes keberapa
                System.out.print("Nilai Tes " + (i+1) + " : ");
                nilai[h][i] = input.nextInt();
                jumlah[h] = jumlah[h] + nilai[h][i];
            }
            rata[h] = jumlah[h]/banyakTes;
            System.out.println();
        }
        for(int i=0;i<banyakTes;i++){
            ntt[i] = nilai[0][i];
            ntr[i] = nilai[0][i];
        }
        rtt = rata[0];
        rtr = rata[0];
        for(int i=0;i<banyakTes;i++){
            for(int j=0;j<mhs;j++){
                if(ntt[i] < nilai[j][i]){
                    ntt[i] = nilai[j][i];
                }
                if(ntr[i] > nilai[j][i]){
                    ntr[i] = nilai[j][i];
                }
            }
        }
        for(int i=0;i<mhs;i++){
          if(rtt < rata[i]){
                    rtt = rata[i];
                }
                if(rtr > rata[i]){
                    rtr = rata[i];
                }
        }
         System.out.println("---------------------------");
		        System.out.println("Daftar Nilai Mahasiswa :   ");
		        System.out.println("---------------------------");
		        System.out.println();
		        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Nama", "NIM", "Jurusan", "Test 1", "Test 2", "Test 3", "Rata-rata");
		        for (int j = 0; j < mhs; j++) {
		            System.out.printf("%-15s%-15s%-15s", nama[j], nim[j], jurusan[j]);
		            for (int k = 0; k < banyakTes; k++) {
		                System.out.printf("%-15d", nilai[j][k]);
		            }
		            System.out.printf("%-15.2f\n", rata[j]);
		        }
		        System.out.println();
		        System.out.print("Nilai Tertinggi\t");
		        for (int j = 0; j < banyakTes; j++) {
		            System.out.printf("%-15d", ntt[j]);
		        }
		        System.out.printf("%-15.2f", rtt);
		        System.out.println();
		        System.out.print("Nilai Teredah\t");
		        for (int j = 0; j < banyakTes; j++) {
		            System.out.printf("%-15d", ntr[j]);
		        }
		        System.out.printf("%-15.2f", rtr);
		        System.out.println();
		    }
}