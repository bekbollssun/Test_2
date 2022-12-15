public class Main {
    public static void main(String[] args) {
        Animal animal0 = new Cat("Alicie", "Milk", 2, 1);
        Animal animal1 = new Cow("Ferdinand", "Trava", 7, 148);
        Animal animal2 = new Dog("Starkya", "Bones", 3, 2);
        System.out.println(animal0 + "\n" + animal1 + "\n" + animal2);

        Run run1=new Run() {
            @Override
            public void methods() {
                System.out.println("drink milk");
            }
        };run1.methods();
        Run run2=new Run() {
            @Override
            public void methods() {
                System.out.println("eat grass");
            }
        };run2.methods();
        Run run3=new Run() {
            @Override
            public void methods() {
                System.out.println("eat meat");
            }
        } ;run3.methods();
    }
}