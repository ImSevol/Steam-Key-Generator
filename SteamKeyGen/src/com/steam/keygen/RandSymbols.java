package com.steam.keygen;

public class RandSymbols {
    public static String RandomCharacter() {
        String ResultCharacter;
        int Character = (int) (Math.random() * 26);
        ResultCharacter = MyArrays.ABC[Character];
        return ResultCharacter;
    }

    public static String RandomNumber() {
        String ResultNumber;
        int Number = (int) (Math.random() * 10);
        ResultNumber = MyArrays.NUMBERS[Number];
        return ResultNumber;
    }

    public static String RandomSymbol() {
        int id = (int) (Math.random() * 2);
        if (id == 1)
            return RandomNumber();
        else
            return RandomCharacter();
    }
}
