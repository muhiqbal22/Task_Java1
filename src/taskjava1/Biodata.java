package taskjava1;

/**
 *
 * @author miqba
 */
public class Biodata {

String namaLengkap="Muhamad Iqbal";
String tempatLahir="Pekanbaru";
String tanggalLahir="22 juni 2003";
String hobi="Makan";
String zodiak="Cancer";
String makananFavorite="Tongseng";
String citaCita="Membahagiakan Orang Tua";

void getFullName(){
System.out.println("Nama Lengkap : "+namaLengkap);
}
void ttl(){
System.out.println("Tempat Tanggal Lahir : "
 + ""+tempatLahir+" "+tanggalLahir);
}    
void hobi(){
System.out.println("Hobi : "+hobi);
}
void makananFavorite(){
System.out.println("Makanan Kesukaan : "+makananFavorite);
}
void citacita(){
System.out.println("Cita Cita : "+citaCita);
}
void zodiak(){
System.out.println("Zodiak : "+zodiak);
    
    }
}
