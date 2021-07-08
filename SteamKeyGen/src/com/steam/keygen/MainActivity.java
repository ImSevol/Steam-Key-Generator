package com.steam.keygen;

import java.io.*;

public class MainActivity {

    public static void main(String[] args) throws IOException {
        GenerateFile("D:\\", "Generated", ".txt", 2);
        System.out.println("Key Generated. Try It!");
    }
    /*remove lines 17, 18, 20, 21 if long keys generation not needed*/
    private static void GenerateFile(String directory, String fileName, String format, int keysCount) throws IOException {
        File file = new File(directory + fileName + format);
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < keysCount; i++) {
            int RandomKeyID = (int) (Math.random() * 10 + 1); //fuck random now i hate this word
            if (RandomKeyID > 3)
                pw.println(RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol());
            else
                pw.println(RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol());
        }
        pw.close();
    }

}
