package calculator;

/**
 * Created by Zornitsa Petkova on 4/28/15.
 */
public class CalculatingMachine {
  private  Printer printer;
  private Calculator calculator;

  public CalculatingMachine(Printer printer, Calculator calculator){
    this.printer = printer;
    this.calculator = calculator;
  }

  public void add(int i , int i1){
    int result = calculator.add(i,i1);
    printer.printer(result);
  }
}
