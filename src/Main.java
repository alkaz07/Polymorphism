public class Main {
    public static void main(String[] args) {
        Aircraft a = new Aircraft("ghfjfj");

        Plane p = new Plane("");
        Helicopter h = new Helicopter("iy8966");

        a.takeOff("А");
        p.takeOff("А");
        h.takeOff("А");
        a.land("А");
        p.land("А");
        h.land("А");
        System.out.println("--------Путешествие (пример полиморфизма):-----------");
        a.travel("B", "C");
        p.travel("B", "C");
        h.travel("B", "C");
        //объединим наши объекты в один массив
        Aircraft[] aircrafts = {p, h, a};
        System.out.println("-----------общее путешествие--------------");
        for (Aircraft x: aircrafts ) {
            x.travel("C", "D");
        }
    }
}

class Aircraft{
    String name;

    public Aircraft(String name) {
        this.name = name;
    }

    public void takeOff(String place){
        System.out.println("ЛА взлетает в "+place);
    }

    public void land(String place){
        System.out.println("ЛА приземляется в "+place);
    }

    public void fly(String from, String to){
        System.out.println("ЛА летит из "+from+" в "+to);
    }

    public void travel(String from, String to){
        takeOff(from);
        fly(from, to);
        land(to);
    }
}

class Plane extends Aircraft{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff(String place) {
        System.out.println("самолет делает разбег и взлетает в "+place);
    }

    @Override
    public void land(String place) {
        System.out.println("самолет плавно снижается и делает пробег по полосе в "+place);
    }
}

class Helicopter extends Aircraft{
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void takeOff(String place) {
        System.out.println("вертолет взлетает вертикально в "+place);
    }

    @Override
    public void land(String place) {
        System.out.println("вертолет зависает на месте и опускается в "+place);
    }
}