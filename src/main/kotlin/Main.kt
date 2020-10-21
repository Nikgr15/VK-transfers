fun main() {
    val amount = 5_000
    val minimumPercent = 3_500

    if (amount > minimumPercent) {
        val commission = (amount * 0.75 / 100).toInt()
        print("Комиссия составляет: $commission копеек")
    } else {
        print("Невозможно совершить перевод, недостаточная сумма.")
    }
}