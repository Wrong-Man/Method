package methodproject;

/**
 *
 * @author Wrong Man
 */
public class MethodProject {

    static void CallMultiple() {
    System.out.println("Bentar, lu siapa dah :v");
  }
    static void Palkon(String fname) {
    System.out.println(fname + " Gayn");
  }
  static int bjirrKembar(int x) {
    return 1 * x;
  }
  static int daysinyear(int x, int y) {
    return x * y;}
 static void Umur(int umur) {
  if (umur < 10) {
      System.out.println("Akses Ditolak - Bocah lu!");}
  else if (umur < 17) {
      System.out.println("Akses Ditolak - ABG Labil!");}
  else {
      System.out.println("Akses Diterima - Silakan masuk, Mas/Mbak");}
  }
 static void checkIPK(double ipk) {
    if (ipk > 3.5) {
      System.out.println("Caumlaude");}
    else if (ipk > 3.0) {
      System.out.println("Sangat memuaskan");}
    else if (ipk > 2.75){
      System.out.println("Memuaskan");}
    else if (ipk > 2.5){
      System.out.println("Cukup");}
    else {
      System.out.println("Jelek. kuliah ngapain aja");}
  }
  public static void main(String[] args) {
  System.out.println("==================== Memanggil lebih dari 1 Method ====================");
    CallMultiple();
    CallMultiple();
    CallMultiple();
  System.out.println("==================== Parameter Method ====================");
    Palkon("Mamad");
    Palkon("Febby");
    Palkon("Danz");
    Palkon("BangSat");
    Palkon("Rey");
    Palkon("Rizky");
 System.out.println("==================== Nilai Kembali ====================");   
  System.out.println("Angka Kembar " + bjirrKembar(1111111));
 System.out.println("==================== Nilai Kembali 2 ====================");
  int z = daysinyear(30, 12);
  System.out.println("Jika sebulan jumlahnya 30 hari, dan setahun jumlahnya 12 bulan, maka dalam setahun jumlah harinya ada " + z +" hari");
  System.out.println("==================== Method dengan If Else ====================");
  Umur(20);
  System.out.println("==================== Cek IPK menggunakan Method ====================");
  checkIPK(2.46);
  }
}
