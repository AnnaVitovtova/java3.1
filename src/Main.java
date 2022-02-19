public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(1000);
        System.out.println("Бонусных миль:" + result);
    }
}
