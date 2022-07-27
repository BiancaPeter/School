public class Student extends Person {
    private String grupClass;

    public Student(String firstName, String lastName, String grupClass) {
        super(firstName, lastName);
        this.grupClass = grupClass;
    }

    public String getGrupClass() {
        return grupClass;
    }

    public void setGrupClass(String grupClass) {
        this.grupClass = grupClass;
    }

    @Override
    public void introduce() {
        System.out.println("I am " + getFirstName() + " " + getLastName() + ", I am in " + grupClass + " class and I am a student.");
    }
}
