package be.intecbrussel.eatables;

public class IceRocket implements Eatable {
    public IceRocket() {


        public IceRocket(String massage) {
            System.out.println(massage);
        }

    }


        @Override
    public void eat() {
        System.out.println("Eating an iceRocket");
        }
}
