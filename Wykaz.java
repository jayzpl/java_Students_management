
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Wykaz extends Student {
    ArrayList wykaz = new ArrayList();

    public void wstawStudenta(int id, String imie){
        Student student = new Student();
        student.id = id;
        student.imie = imie;
        wykaz.add(student);
    }
    public void wstawOcene(int idd, int ocena){
    for(Object i : wykaz){
        Student x = (Student) i;
        if(x.id == idd){
            x.oceny.add(ocena);
        }
    }
    }
    public String wypisz(int idd) {
        for (Object i : wykaz) {
            Student x = (Student) i;
            if (x.id == idd) {
                return "ID: " + x.id + " Imie: " + x.imie + " Oceny: " + x.oceny;
            }
            else{
                return null;
            }
        }
        return null;
    }
    public String wypisz(){
        for (Object i : wykaz) {
            Student x = (Student) i;
            System.out.println("ID: " + x.id + " Imie: " + x.imie + " Oceny: " + x.oceny);
        }
        return null;
    }
    public void sortujA(){

    }

}
