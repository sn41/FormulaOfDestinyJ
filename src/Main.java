//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Оцените следующие утверждения по шкале от 1(совсем не согласен) до 10(абсолютно согласен)");
        String result = FormulaOfDestiny.getFormulaOfDestiny();
        System.out.println(result);
    }

}