package sorting

import java.util.Scanner

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        when (args[0] == "-dataType") {
            (args[1] == "long") -> long()
            (args[1] == "line") -> line()
            (args[1] == "word") -> word()
            else -> word()
        }
    } else word()
}

fun long() {
    val scanner = Scanner(System.`in`)
    val numbersOnly = mutableListOf<Int>()
    var greatestNumber = 0
    var greatestNumOccur = 0
    while (scanner.hasNext()) {
        val tempVar = scanner.nextInt()
        numbersOnly.add(tempVar)
        if (tempVar > greatestNumber) {
            greatestNumber = tempVar
            greatestNumOccur = 1
        } else if (tempVar == greatestNumber) {
            greatestNumOccur += 1
        }
    }
    println("Total numbers: ${numbersOnly.size}.")
    println("The greatest number: $greatestNumber ($greatestNumOccur time(s), ${greatestNumOccur/numbersOnly.size}%).")
}

fun line() {
    val scanner = Scanner(System.`in`)
    val linesOnly = mutableListOf<String>()
    var longestLine = ""
    var longestLineOccur = 0
    while (scanner.hasNext()) {
        val tempVar = scanner.nextLine()
        linesOnly.add(tempVar)
        if (tempVar.length > longestLine.length) {
            longestLine = tempVar
            longestLineOccur = 1
        } else if (tempVar == longestLine) {
            longestLineOccur += 1
        }
    }
    println("Total lines: ${linesOnly.size}.")
    println("The longest line:")
    println(longestLine)
    println("(${longestLineOccur} time(s), ${((longestLineOccur.toDouble()/linesOnly.size.toDouble()) * 100).toInt()}%).")
}

fun word() {
    val scanner = Scanner(System.`in`)
    val wordsOnly = mutableListOf<String>()
    var longestWord = ""
    var longestWordOccur = 0
    while (scanner.hasNext()) {
        val tempVar = scanner.next()
        wordsOnly.add(tempVar)
        if (tempVar.length > longestWord.length) {
            longestWord = tempVar
            longestWordOccur = 1
        } else if (tempVar == longestWord) {
            longestWordOccur += 1
        }
    }
    println("Total words: ${wordsOnly.size}.")
    println("The longest word: $longestWord ($longestWordOccur time(s), ${((longestWordOccur.toDouble()/wordsOnly.size.toDouble()) * 100).toInt()}%).")
}