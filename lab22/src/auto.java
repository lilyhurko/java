public class auto {
    int seatNumber ;
    String model;

    auto(int s, String m){
        seatNumber=s;
        model = m;

    }
    auto(){
        seatNumber=0;
        model = "Underfined";

    }

    void displayValues(){
        System.out.println("seats: " + seatNumber);
        System.out.println("model: " + model);
    }

    public static void main(String[] args) {

        auto auto1 = new auto(3, "Renault");
        auto1.seatNumber = 4;
        System.out.println("seats: " + auto1.seatNumber);
        auto auto2 = new auto();
        auto2.seatNumber = 3;
        System.out.println("seats: " + auto2.seatNumber);
        auto1.displayValues();
        auto2.displayValues();
        chair c = new chair();
        c.setLegs(1);
        System.out.println("Chair legs: " +c.getLegs());
        /*





        int seatNumber = 4;
        System.out.println("seats: " + seatNumber);

        if (seatNumber == 4) {
            System.out.println("Samochod osobowy ");
        }
        else {
            System.out.println("Inny samochod: ");
        }

        int dayNumber =2;

        switch (dayNumber){
            case 1:
                System.out.println( "Monday"); break;
            case 2:
                System.out.println("Thurthday"); break;

            default:
                System.out.println("Inny dzien tygodnia");
        }

        int[] tab = new int [10];
        //int [][] tab20 = new int [10] [5];


        for (int i = 0; i < 10; i++) {
            System.out.println("for i: " +i );
            tab[i] = i+1;

        }

        for (int t:tab) {
            System.out.println(t);
        }


        int i=1;

        while (i<10) {
            System.out.println("while i: " + i++);



        }

        do{
            if (i==4)break;
            System.out.println("do ... while i: " +i--);
        } while (i>0);
*/
        }
    }

class chair {
    private int legs;
    public void setLegs (int legs){
        if(legs>2)
        this.legs=legs;
        System.out.println("Liczba nog musi byc wieceksz od 2");
    }

    public int getLegs(){
       return legs;
    }

}