public class CreditPaymentService {
    public double calculate(int credit, double percent, int month) {
        double percentMonth = percent / 12;
        double coefficient = (percentMonth * Math.pow((1 + percentMonth), month)) / ((Math.pow((1 + percentMonth), month)) - 1);
        double payment = Math.round(credit * coefficient);
        return payment;
    }
}
