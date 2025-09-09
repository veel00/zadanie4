//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите первое число: ")
    val num1 = readln().toDouble()
    print("Введите вто4рое число: ")
    val num2 = readln().toDouble()
    print("Введите операцию ( /, *, +, -): ")
    val opera = readln()

    if(num1 != 0.0 || num2 != 0.0)
    {
        if(opera == "/"){val res = num1/num2
            print(res)}
    }
    else{print("нельзя делить на ноль")}
    if(opera == "+"){val res = num1+num2
        print(res)}
    else if(opera == "-"){val res = num1-num2
        print(res)}
    else if(opera == "*"){val res = num1*num2
        print(res)}
}