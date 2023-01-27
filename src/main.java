import java.util.Scanner;

//1-Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. +
// Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.+
//2-Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.+
//3-Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.+
//4-Калькулятор умеет работать только с целыми числами.+
//5-Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.+
//6-При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.+
//7-При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.+
//8-При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.+
//9-Результатом операции деления является целое число, остаток отбрасывается.+
//10-Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение

public class main extends Exception {
    public static void main(String[] args) {
        calc("");
    }


    public static void calc(String input) {


        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();


        String[] values = input.split("[\\+|\\*|\\/|\\-]");


        for (String number : values) {

        }


        Converter converter = new Converter();

        if (converter.isRoman(values[0]) == converter.isRoman(values[1])) {
            int a, b;

            boolean isRoman = converter.isRoman(values[0]);
            if (isRoman) {

                a = converter.romanToInt(values[0]);
                b = converter.romanToInt(values[1]);

                if (values.length == 2) {

                    String operatorOne = String.valueOf(input.charAt(1));
                    switch (operatorOne) {
                        case "+":
                            System.out.println(converter.intToRoman(a + b));
                            break;
                        case "-":
                            System.out.println(converter.intToRoman(a - b));
                            break;
                        case "/":
                            System.out.println(converter.intToRoman(a / b));
                            break;
                        case "*":
                            System.out.println(converter.intToRoman(a * b));
                            break;
                    }

                }else {
                    String operatorTwo = String.valueOf(input.charAt(2));
                    switch (operatorTwo) {
                        case "+":
                            System.out.println(converter.intToRoman(a + b));
                            break;
                        case "-":
                            System.out.println(converter.intToRoman(a - b));
                            break;
                        case "/":
                            System.out.println(converter.intToRoman(a / b));
                            break;
                        case "*":
                            System.out.println(converter.intToRoman(a * b));
                            break;

                    }
                }


            } else if (true){
                a = Integer.parseInt(values[0]);
                b = Integer.parseInt(values[1]);


                Integer a1 = Integer.valueOf(values[0]);
                Integer a2 = Integer.valueOf(values[1]);


                if (a1 > 10 || a2 > 10) {
                    try {
                        throw new ScannerException();
                    } catch (ScannerException e) {
                        e.printStackTrace();
                        System.err.println("Введите число не больше 10");
                    }
                } else {

                    if (a1 >= 10 || a2 >= 10) {
                        String operatorTwo = String.valueOf(input.charAt(2));
                        switch (operatorTwo) {
                            case "+":
                                System.out.println(a1 + a2);
                                break;
                            case "-":
                                System.out.println(a1 - a2);
                                break;
                            case "/":
                                System.out.println(a1 / a2);
                                break;
                            case "*":
                                System.out.println(a1 * a2);
                                break;
                        }
                    } else if (values.length == 2) {
                        String operatorOne = String.valueOf(input.charAt(1));

                        switch (operatorOne) {
                            case "+":
                                System.out.println(a1 + a2);
                                break;
                            case "-":
                                System.out.println(a1 - a2);
                                break;
                            case "/":
                                System.out.println(a1 / a2);
                                break;
                            case "*":
                                System.out.println(a1 * a2);
                                break;
                        }
                    }

                }
            }else {
                try {
                    throw new ScannerException();
                } catch (ScannerException e) {
                    e.printStackTrace();
                    System.err.println(" строки не соответсвуют вышеописанным арифметическим операциям");
                }
            }


        } else {
            try {
                throw new ScannerException();
            } catch (ScannerException e) {
                e.printStackTrace();
            }
            System.err.println("используются одновременно разные системы счисления");
            System.exit(0);

        }


    }

}

















