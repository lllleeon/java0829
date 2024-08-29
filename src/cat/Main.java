package cat;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.setName("aicat");
        cat.setBreeds("persian");
        cat.setWeight(3);

        System.out.printf("* 냐이이름: %s\n", cat.getName());
        System.out.printf("* 냥니품좀: %s\n", cat.getBreeds());
        System.out.printf("* 냔니무게: %.2fkg\n", cat.getWeight());

        System.out.print(cat.getName()+"이");
        cat.claw();

        System.out.print(cat.getName()+"이");
        cat.meow();
    }
}