public class Demo {
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != object.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && java.util.Objects.equals(name, demo.name);
    }

    @override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;
}
