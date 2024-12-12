import kotlin.math.*


fun main() {
    println(calcSum())
}

// Завдання 1.1, 2 варіант
fun expression1(z: Double): Double {
    return (ln(2 * abs(z)) + atan(2 * z * z)) / (3 * (z + 1).pow(2) + 2.1 * 1_000_000)
}
fun expression2(x: Double, z: Double, b: Double): Boolean {
    return ln(abs(x + z)) > 0 && b in 0.0..1.0
}

// Завдання 1.2, 2 варіант, див. файл "Порядок дій.png"
fun calculateExpression(x: Double): Double {
    val part1 = (x + 7) / 3 * x
    val part2 = 3 * atan(x) / (2 * x)
    val part3 = 1.0e7
    val part4 = sqrt(1.0 / 3.0 * x.pow(5))
    return part1 + part2 + part3 - part4
}

// Завдання 1.3, 2 варіант, Сума усіх парних чисел від 2 до 50*N
// N – номер варіанту за списком групи
fun calcSum(N: Int = 2) : Int {
    val limit = 50 * N
    val count = limit / 2
    val sum = count * (count + 1)
    return sum
}