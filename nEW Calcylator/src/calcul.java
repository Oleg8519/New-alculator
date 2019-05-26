public class calcul {
    public static int calc(int num1, int num2, char oper){
        int result ;
        switch (oper){
            case '+' : result = num1 + num2;
            break;
            case '-' : result = num1 - num2;
            break;
            case '*' : result = num1 * num2;
            break;
            case '/' : result = num1 / num2;
            break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, operation.getOperation());
        }
        return result;
    }
}
