public class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    public Animal(String name, int age){
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

    @Override
    public String toString() {
        return "Имя животного: " + name;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getName().compareTo(o.getName());
    }
}
