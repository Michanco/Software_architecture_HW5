package calculatorHW5.calculator.operation;

public class Addition implements IOperation{
    Double num1;
    Double num2;

    @Override
    public Double run(Double first, Double second) {
        first = this.num1;
        second = this.num2;
        Double result = first + second;
        return result;
    }
}
