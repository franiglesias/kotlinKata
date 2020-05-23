package org.talkingbit.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanNumeralsTest {

    @Test
    fun `Should convert numbers to roman`() {
        assertConvertsToRoman(1, "I")
        assertConvertsToRoman(2, "II")
        assertConvertsToRoman(3, "III")
        assertConvertsToRoman(5, "V")
        assertConvertsToRoman(6, "VI")
        assertConvertsToRoman(10, "X")
        assertConvertsToRoman(11, "XI")
        assertConvertsToRoman(20, "XX")
    }

    private fun assertConvertsToRoman(arabic: Int, roman: String) {
        assertEquals(roman, RomanNumerals().toRoman(arabic))
    }
}