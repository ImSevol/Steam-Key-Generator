package com.steam.keygen;

import java.io.*;

public class MainActivity {

    public static void main(String[] args) {
        GenerateFile("D:\\", "Generated", ".txt", 2);
    }

    /*remove lines 17, 18, 20, 21 if long keys generation not needed*/
    private static void GenerateFile(String directory, String fileName, String format, int keysCount) {
        try {
            File file = new File(directory + fileName + format);
            file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < keysCount; i++) {
                int RandomKeyID = (int) (Math.random() * 10 + 1);
                if (RandomKeyID > 3)
                    pw.println(RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol());
                else
                    pw.println(RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + "-" + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol() + RandSymbols.RandomSymbol());
            }
            pw.close();
            System.out.println("Key Generated. Try It!");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Select Real Directory!");
        }
    }
}
