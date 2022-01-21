import java.util.Random;
public class App {

    public static void main(String[] args) {

        Card c = new Card("BOMB TOWER", Types.BUILDING);
        System.out.println(c);
        c.addTrait(Trait.DEFENSE, 3);
        System.out.println(c);
        System.out.println(CardList.random);
    }

}

