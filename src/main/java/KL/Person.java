package KL;

public abstract class Person {

    protected String name;
    protected String surname;
    protected long pesel;

    public Person(String name, String surname, long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }



}
