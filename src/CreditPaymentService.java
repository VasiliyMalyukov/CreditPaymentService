public class CreditPaymentService {
    public double calculate(int credit, double percent, int month){
        double percent_month = percent / 12;
        double coefficient = (percent_month * Math.pow((1 + percent_month), month)) / ((Math.pow((1 + percent_month), month)) -1);
        double payment = Math.round(credit * coefficient);
        return payment;
    }
}
