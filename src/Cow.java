public class Cow extends Animal{

    public Cow(String name, String liked, int age, int weigh) {
        super(name, liked, age, weigh);
    }
    Run run = new Run() {
        @Override
        public void metods() {
            System.out.println("Ну как сказать собаки лучше чем кошки ");
        }
    };
}

