public class Test {
    public static void main(String[] args) {
        Animal an1 = Animal.builder()
                .name("Cat1")
                .id(1)
                .build();

        Animal an2 = Animal.builder()
                .name("Cat2")
                .id(2)
                .build();

        System.out.println(an1);
    }
}
