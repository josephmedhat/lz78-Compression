package com.company;

public class Tag {
    private int dictionaryIndex;
    private char nextChar;

    public Tag() {
    }

    public Tag(int dictionaryIndex, char nextChar) {
        this.dictionaryIndex = dictionaryIndex;
        this.nextChar = nextChar;
    }

    public int getDictionaryIndex() {
        return dictionaryIndex;
    }

    public char getNextChar() {
        return nextChar != '\0' ? nextChar : ' ';
    }

    public String getTag(){
        return "<"+dictionaryIndex+","+nextChar+">";
    }
}
