package sorting

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbersOnly = mutableListOf<Int>()
    var greatestNumber = 0
    var greatestNumOccur = 0
    var numbersTotal = 0
    while (scanner.hasNext()) {
        val tempVar = scanner.nextInt()
        numbersTotal += 1
        numbersOnly.add(tempVar)
        if (tempVar > greatestNumber) {
            greatestNumber = tempVar
            greatestNumOccur = 1
        } else if (tempVar == greatestNumber) {
            greatestNumOccur += 1
        }
    }
    println("Total numbers: $numbersTotal.")
    println("The greatest number: $greatestNumber ($greatestNumOccur time(s)).")
}
