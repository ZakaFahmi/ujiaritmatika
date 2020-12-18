package ujiaritmatika;

public class Aritmatika {

    public int hasil;

    public int penambahan(int nilai1, int nilai2) {
        hasil = nilai1 + nilai2;
        return hasil;
    }

    public int pengurangan(int nilai1, int nilai2) {
        hasil = nilai1 - nilai2;
        return hasil;
    }

    public int perkalian(int nilai1, int nilai2) {
        hasil = nilai1 * nilai2;
        return hasil;
    }

    public int pembagian(int nilai1, int nilai2) {
        hasil = nilai1 / nilai2;
        return hasil;
    }

    public String perbandingan(int nilai1, int nilai2) {
        String out = "";
        if (nilai1 > nilai2) {
            out = nilai1 + " Lebih Besar Daripada " + nilai2;
        } else if (nilai1 < nilai2) {
            out = nilai1 + " Lebih Kecil Daripada " + nilai2;
        } else if (nilai1 == nilai2) {
            out = "Kedua Angka Bernilai sama";
        }
        return out;
    }

    public int[] binkedes(int nilai) {
        int biner[] = new int[14];
        int index = 0;
        while (nilai > 0) {
            biner[index++] = nilai % 2;
            nilai = nilai / 2;
        }
        return biner;
    }

    public int deskebin(int nilai) {
        int desimal = 0, p = 0;
        while (true) {
            if (nilai == 0) {
                break;
            } else {
                int temp = nilai % 10;
                desimal += temp * Math.pow(2, p);
                nilai = nilai / 10;
                p++;
            }
        }
        return desimal;
    }
}

