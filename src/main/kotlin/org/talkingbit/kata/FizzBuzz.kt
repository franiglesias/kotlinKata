package org.talkingbit.kata

class FizzBuzz {
    fun generate(): Collection<String> {
        val numbers = List(100) { it + 1 }
        return numbers
                .map { it.convertFizzBuzz() }
    }
}

fun Int.isDivisibleBy(divisor: Int): Boolean = this % divisor == 0

fun Int.convertFizzBuzz(): String {
    return when {
        this.isDivisibleBy(15) -> "FizzBuzz"
        this.isDivisibleBy(3) -> "Fizz"
        this.isDivisibleBy(5) -> "Buzz"
        else -> this.toString()
    }
}