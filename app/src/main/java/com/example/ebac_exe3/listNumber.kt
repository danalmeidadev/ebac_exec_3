package com.example.ebac_exe3

class listNumber {
}

fun main() {
    var numberList: IntArray = IntArray(99){it + 1}
    val result = numberList.filter { it % 2 == 0 }
    println(result)

    val names = listOf<String>("Ana", "Dan", "Ariana", "Mauro")
    val hello = names.map { "Olá $it!" }
    println(hello)

    hello.forEach { it }
}