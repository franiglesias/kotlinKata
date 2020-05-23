package org.talkingbit.kata

class RomanNumerals {
    fun toRoman(decimal: Int): String {
        var arabic = decimal
        var roman = ""

        while (arabic >= 10) {
            roman += "X"
            arabic -= 10
        }

        if (arabic >= 5) {
            roman += "V"
            arabic -= 5
        }

        while (arabic >= 1) {
            roman += "I"
            arabic -= 1
        }
        return roman
    }
}
