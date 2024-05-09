import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    println("Enter a number to calculate its factorial:")
    val number = scanner.nextInt()

    val factorial = calculateFactorial(number)
    println("Factorial of $number is: $factorial")
}

fun calculateFactorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        var result: Long = 1
        for (i in 2..n) {
            result *= i
        }
        result
    }
}
