import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Student {
        private String imie;
        private String nazwisko;
        private String email;
        private List<Obecnosc> obecnosci;

    public Student (String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.obecnosci = new ArrayList<>();
        }

        public void dodajObecnosc(Obecnosc obecnosc) {
            obecnosci.add(obecnosc);
        }

        public List <String> przedmiotyZawszeObecny() {
        List<String> przedmioty = new ArrayList<>();
        for (Obecnosc obecnosc : obecnosci) {
            if (obecnosc.getTypObecnosci().equals("0")){
                przedmioty.add(obecnosc.getPrzedmiot());
                            }
        }
        }
    }
