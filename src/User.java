public class User {
    private String name;
    private int age;
    private String pesel;

    public User(String name, int age, String pesel) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
