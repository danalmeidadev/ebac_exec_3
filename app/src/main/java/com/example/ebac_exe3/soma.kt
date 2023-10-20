package com.example.ebac_exe3

class soma {
}

fun main() {
    val somaNumber: (Int, Int) -> Int = {number1, number2 -> number1 + number2}
    val multNumber: (Int, Int) -> Int = {number1, number2 -> number1 * number2}
    println(somaNumber(2, 2))
    println(multNumber(2, 2))

   funcCalc(2, 2) { number1: Int, number2: Int ->
       val resultInt = number1 + number2
       println(resultInt)
   }

}

fun funcCalc(number1: Int, number2: Int, calculator: (Int, Int) -> Unit) {
     calculator(number1, number2)
}