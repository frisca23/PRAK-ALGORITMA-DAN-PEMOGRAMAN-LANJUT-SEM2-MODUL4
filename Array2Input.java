import java.util.Scanner;
public class Array2Input {
    public static void main(String[] args) {
        String cats[][] = {{"terry", "brown"},
                {"kitty", "white"},
                {"toby", "gray"},
                {"fido", "black"}};
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Kucing\tWarna");
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                System.out.print(cats[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
        System.out.println("Masukkan nama kucing: ");
        String namaKucing = input.nextLine();
        System.out.println("Masukkan warna kucing: ");
        String warnaKucing = input.nextLine();
        System.out.println("Nama Kucing\tWarna");
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                System.out.print(cats[i][j]);
                System.out.print("\t");
			}
            System.out.println(" ");
		}
        System.out.println(namaKucing + "\t" + warnaKucing);
	}
}