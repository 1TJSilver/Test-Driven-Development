public class Calculator {
    private double credit;
    private double mustBeGiven;
    private double percent;
    private int months;

    public Calculator(int credit, double percent, int months){
        this.months = months;
        this.percent = percent / 100;
        this.credit = credit;
        this.mustBeGiven = credit + (credit * this.percent);
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setPercent(int percent) {
        this.percent = percent / 100;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int monthlyPayment() {
        return (int) mustBeGiven / months;
    }

    public int totalAmount() {
        return (int) mustBeGiven;
    }

    public double overpayment() {
        return mustBeGiven - credit;
    }
}
