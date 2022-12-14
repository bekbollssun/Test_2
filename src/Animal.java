public abstract class Animal {
    private String name;
    private String liked;
    private int age;
    private int weigh;

    public Animal(String name, String liked, int age, int weigh) {
        this.name = name;
        this.liked = liked;
        this.age = age;
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", liked='" + liked + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                '}';
    }
}

