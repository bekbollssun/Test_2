public class Dog extends Animal{

    public Dog(String name, String liked, int age, int weigh) {
        super(name, liked, age, weigh);
    }
    Run run = new Run() {
        @Override
        public void metods() {
            System.out.println("Ну как сказать собаки лучше чем кошки ");
        }
    };
}

