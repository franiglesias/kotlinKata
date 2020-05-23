package org.talkingbit.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class FizzBuzzTest {

    @Test
    fun `it counts from 1 to 100`() {

        assertEquals(
                100,
                actual = FizzBuzz().generate().size
        )
    }

    @Test
    fun `says the numbers with transformations needed`() {
        assertNumberAsItSelf(1)
        assertNumberAsItSelf(2)
        assertNumberAsFizz(3)
        assertNumberAsBuzz(5)
        assertNumberAsFizz(6)
        assertNumberAsBuzz(10)
        assertNumberAsFizzBuzz(15)
        assertNumberAsFizzBuzz(30)
    }

    private fun assertNumberAsFizz(number: Int) {
        assertEquals("Fizz", actual = obtainSaidNumber(number))
    }

    private fun assertNumberAsBuzz(number: Int) {

        assertEquals("Buzz", obtainSaidNumber(number))
    }

    private fun assertNumberAsFizzBuzz(number: Int) {
        assertEquals("FizzBuzz", obtainSaidNumber(number))
    }

    private fun assertNumberAsItSelf(number: Int) {
        assertEquals(number.toString(), obtainSaidNumber(number))
    }

    private fun obtainSaidNumber(number: Int): String {
        return FizzBuzz().generate().elementAt(number - 1)
    }

}