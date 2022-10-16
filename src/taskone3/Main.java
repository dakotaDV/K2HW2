package taskone3;

public class Main {

    public static void main(String[] args) {

        car lada = new car("Lada", "Granta", "1,7", "желтого", "2015", "в России");
        lada.specifications();
        car audi = new car("Audi", "A8 50 L TDI quattro", "3,0", "черный ", "2020", "в Германии");
        audi.specifications();
        car bmw = new car("BMW", "Z8", "3.0", "черный", "2021", "в Германии");
        bmw.specifications();
        car kia = new car("Kia", "Sportage 4-го поколения", "2.4", "красный", "2018", "в Южной Корее");
        kia.specifications();
        car hyundai = new car("Hyundai", "Avante", "1.6", "оранжевый", "2016", "в Южной Корее");
        hyundai.specifications();



    }
}