class Calculator4 {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left+this.right);
    }

    public void avg() {
        System.out.println((this.left+this.right)/2);
    }
}

public class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator4 c1 = new Calculator4(); // nwe Calculator()를 통해서 인스턴스를 생성. 인스턴스는 c1이라는 변수에 담김.
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator4 c2 = new Calculator4();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
