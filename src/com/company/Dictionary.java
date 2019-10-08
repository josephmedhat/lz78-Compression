package com.company;

import java.util.ArrayList;

public class Dictionary {

    private ArrayList<String> dictionary = new ArrayList<String>();

    public Dictionary() {
        dictionary.add(null);
    }

    public int elementIndex(String ch) {
        if (dictionary.size() > 1){
            for (int i = 1; i < dictionary.size(); i++) {

                if (dictionary.get(i).equals(ch)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public void insertElement(String newEntry) {
        dictionary.add(newEntry);
    }

    public int dictionarySize() {
        return dictionary.size();
    }

    public void getDictionary() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.println(i+"-------------------"+dictionary.get(i));
        }
        System.out.println("-------------------------------------------");

    }
}
