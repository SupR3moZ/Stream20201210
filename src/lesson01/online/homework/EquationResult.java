package lesson01.online.homework;

public class EquationResult {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int c = 1000;
        int d = 10000;

        System.out.println(equation(a, b, c, d));
    }
        //создадим метод, который будет возвращать результат уравнения
        public static float equation (int valueA, int valueB, float valueC,float valueD){
        return (valueA * (valueB +(valueC / valueD)));
    }
        /*Интересно, что если в аргументах метода указать для значений valueC и valueD тип int - Idea ругается но возвращает результат который является неверным.
        10 * (100 + (1000 / 10000) = 1001 верно, однако если указать для вышеупомянутых значений тип int в консоль выводится результат 1000 - неверно
         */
        //Я еще новичок в GitHub поэтому добавляю этот коммент чтобы наконец получить ссылку на Pull request
}

