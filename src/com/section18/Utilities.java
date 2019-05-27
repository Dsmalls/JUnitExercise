package com.section18;

public class Utilities {

    // return a char array containing every nth char
    // when sourceArray.length < n returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){
        if (sourceArray == null || sourceArray.length < n){
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int j = n-1; j< sourceArray.length; j += n){
            result[index++] = sourceArray[j];
        }

        return result;
    }

    // remove pairs of the same character that next to each other
    // by removing on e occurred of the character
    // example "ABBCDEEF" = "ABCDEF
    public String removePairs(String source){

        // if length is less than 2, there wont be any pairs
        if (source == null || source.length() < 2){
            return source;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] string = source.toCharArray();

        for (int j=0; j< string.length - 1; j++){
            System.out.println(string[j]);
            if (string[j] != string[j+1]){
                stringBuilder.append(string[j]);
            }
        }

        System.out.println(string[string.length - 1]);
        // add the final character
        stringBuilder.append(string[string.length - 1]);

        return stringBuilder.toString();
    }

    // preform a conversion based on some internal business rule
    public int converter(int a, int b){
         return (a/b) + (a * 30) -2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0){
            return source;
        }

        return null;
    }

}
