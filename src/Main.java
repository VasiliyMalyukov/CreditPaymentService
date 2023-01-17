public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 0.0999, 12);
        System.out.println(payment);

        double payment1 = service.calculate(1_000_000, 0.0999, 24);
        System.out.println();
        System.out.println(payment1);

        double payment2 = service.calculate(1_000_000, 0.0999, 36);
        System.out.println();
        System.out.println(payment2);
    }
}