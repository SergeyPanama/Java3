public class Main {
    public static void main(String[] args) {


        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int amount = 20;
        int result = service.calculate(10_000);
        System.out.println("Бонусные мили: " + result);
    }
}
