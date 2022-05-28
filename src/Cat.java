public class Cat {

    private String name;
    private String pattern;
    private int age;

    public Cat(String name, String pattern, int age) {
        this.name = name;
        this.pattern = pattern;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPattern() {
        return pattern;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
