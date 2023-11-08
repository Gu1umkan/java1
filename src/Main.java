
class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Gulumkan", "programmer", "Peaksoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();
        Dancer dancer= new Dancer("Zarina","dancer","Symabat");
        System.out.println("\n"+dancer);
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dancing();
        Singer singer= new Singer("Kanymai","Singer","Kyz-Burak");
        System.out.println("\n"+singer);
        singer.playGitar();
        singer.learn();
        singer.eat();
        singer.singing();
        singer.walk();


    }
}
