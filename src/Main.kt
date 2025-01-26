/*Операции с числами*/
/*Задание 1*/
/*fun main(){
    println("Введите двузначное число")
    val a = readln().toInt()
    println("Число десятков в нём ${a/10}")
    println("Число единиц в нём ${a%10}")
    println("Сумма его цифр ${(a/10)+(a%10)}")
    println("Произведение его цифр ${(a/10)*(a%10)}")

}*/

/*Задание 2*/
/*fun main(){
    println("Введите трёхзначное число")
    val a = readln().toInt()
    println("Число единиц в нём ${a%100%10}")
    println("Число десятков в нём ${a%100/10}")
    println("Сумма его цифр ${(a/100)+(a%100/10)+(a%100%10)}")
    println("Сумма его цифр ${(a/100)*(a%100/10)*(a%100%10)}")
}*/

/*Задание 3*/
/*fun main(){
    println("Введите делимое")
    var a = readln().toInt()
    println("Введите делитель")
    var b = readln().toInt()
    println("Частное равно ${a / b}")

}*/

/*Задание 4*/
/*import kotlin.math.pow
fun main(){
    println("Введите число")
    val a = readln().toDouble()
    println("Ведите степень")
    var b = readln().toInt()
    println("${a} В степени ${b} будет = ${a.pow(b)}")
}*/
/*Задание 5*/
/*
import kotlin.math.sqrt
fun main(){
    println("Введите число")
    val a = readln().toDouble()
    println("Корень числа ${a} будет равен:" +
            " ${sqrt(a)}")
}
*/


/*Логическое операции*/
/*Задание 1*/
/*fun main() {
    val a = true
    val b = false
    val c = false
    println("а)${a or b}")
    println("б)${a and b}")
    println("в)${b or c}")
}*/
/*Задание 2*/
/*fun main() {
    val x = false
    val y = true
    val z = false
    println("а)${x or z}")
    println("б)${x and y}")
    println("в)${x and z}")
}*/

/*Задание 3*/

/*
fun main() {
    val a = true
    val b = false
    val c = false
    println("а)${a.not() and b}")
    println("б)${a or b.not()}")
    println("в)${a and b or c}")
}
*/

/*Задание 4*/
/*fun main() {
    val x = true
    val y = true
    val z = false
    println("а)${x.not() and y}")
    println("б)${x or y.not()}")
    println("в)${x or y and z}")
}*/

/*Задание 5*/
/*fun main() {
    val x = true
    val y = true
    val z = false
    println("а)${x.not() and y}")
    println("б)${x or y.not()}")
    println("в)${x or y and z}")
}*/

/*Задание 6*/
/*fun main() {
    val x = false
    val y = false
    val z = true
    println("а)${x or y and z.not()}")
    println("г)${x and y.not() or z}")
    println("б)${x.not() and y.not()}")
    println("д)${x and (y.not() or z )}")
    println("в)${(x and z).not() or y }")
    println("е)${x or((y or z).not())}")
}*/

/*Задание 7*/
/*fun main() {
    val a = true
    val b = false
    val c = false
    println("a)${a or (a and b).not() or c}")
    println("б)${a.not() or a and (b or c)}")
    println("в)${(a and b and c.not()) and c}")
}*/

