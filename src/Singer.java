public class Singer extends Person{
    private String bandName;

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("Singer is singing");
    }
    public  void playGitar(){
        System.out.println("Singer is play gitar");
    }

    @Override
    public String toString() {
        return "Singer " + super.toString()+
                "\nbandName: " + bandName ;
    }
}
