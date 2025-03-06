import java.awt.Color;

class Figura {
    protected int pole;
    protected int obwod;
    private Color kolor;

    protected void rysuj() {
        System.out.println("Rysowanie figury");
    }

    protected void usun() {
        System.out.println("Usuwanie figury");
    }

    protected void przesun() {
        System.out.println("Przesuwanie figury");
    }

    protected String podajParametry() {
        return "Parametry figury";
    }

    public Figura(int pole, int obwod, Color kolor) {
        this.pole = pole;
        this.obwod = obwod;
        this.kolor = kolor;
    }

    public Figura() {
        // Default constructor
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public Color getKolor() {
        return kolor;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }
}

class Elipsa extends Figura {
    private int a;
    private int b;
    private int F1x, F1y, F2x, F2y;
    private double c;

    public Elipsa(int pole, int obwod, Color kolor, int a, int b, int F1x, int F1y, int F2x, int F2y) {
        super(pole, obwod, kolor);
        this.a = a;
        this.b = b;
        this.F1x = F1x;
        this.F1y = F1y;
        this.F2x = F2x;
        this.F2y = F2y;
        obliczOdlegloscOgnisk();
    }

    public void obliczOdlegloscOgnisk() {
        c = Math.sqrt(a * a - b * b);
    }

    // Override the rysuj method
    @Override
    protected void rysuj() {
        System.out.println("Rysowanie elipsy");
    }
}

class Wielokat extends Figura {
    private int liczbaWierzcholkow;
    private int liczbaBokow;
    private int sumaKatowWewnetrznych;

    public Wielokat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, int sumaKatowWewnetrznych) {
        super(pole, obwod, kolor);
        this.liczbaWierzcholkow = liczbaWierzcholkow;
        this.liczbaBokow = liczbaBokow;
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    public void obliczSumeKatowWewnetrznych() {
        sumaKatowWewnetrznych = (liczbaBokow - 2) * 180;
    }

    // Override the usun method
    @Override
    protected void usun() {
        System.out.println("Usuwanie wielokata");
    }
}

// Classes inheriting from Elipsa
class Okrag extends Elipsa {
    public Okrag(int pole, int obwod, Color kolor, int a, int b, int F1x, int F1y, int F2x, int F2y) {
        super(pole, obwod, kolor, a, b, F1x, F1y, F2x, F2y);
    }
}

// Classes inheriting from Wielokat
class Trojkat extends Wielokat {
    private int h;
    private int a;

    public Trojkat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, int sumaKatowWewnetrznych, int h, int a) {
        super(pole, obwod, kolor, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.h = h;
        this.a = a;
    }
}

class Prostokat extends Wielokat {
    private int h;
    private int b;

    public Prostokat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, int sumaKatowWewnetrznych, int h, int b) {
        super(pole, obwod, kolor, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.h = h;
        this.b = b;
    }
}

class Kwadrat extends Prostokat {
    public Kwadrat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, int sumaKatowWewnetrznych, int h, int b) {
        super(pole, obwod, kolor, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych, h, b);
    }
}
