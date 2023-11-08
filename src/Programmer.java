public class Programmer extends Person {
    private String companyName;



    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("Programming coding");
    }

    @Override
    public String toString() {
        return "Programmer " +super.toString()+
                "\ncompanyName: " + companyName
                ;
    }
}
