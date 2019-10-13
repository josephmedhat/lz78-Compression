package com.company;

import java.util.ArrayList;

public class Lz78 {
    private String text;
    private Dictionary dictionary;
    private ArrayList<Tag> Compressed;

    public Lz78(String text) {
        this.text = text;
        dictionary = new Dictionary();
        Compressed = new ArrayList<Tag>();
    }

    public void Compress() {

        int i = 0;
        while (i < text.length()){
            Tag tag;
            String charSequence = String.valueOf(text.charAt(i));
            int dictionaryIndex = dictionary.elementIndex(charSequence);
            if (dictionaryIndex == -1) {
                dictionary.insertElement(charSequence);
                tag = new Tag(0, text.charAt(i));
            } else {
                int nextCharachterIndex = i + 1;
                if (nextCharachterIndex < text.length()) {
                    while (dictionary.elementIndex(charSequence) != -1) {
                        dictionaryIndex = dictionary.elementIndex(charSequence);
                        if (nextCharachterIndex < text.length() && dictionaryIndex != -1) {
                            charSequence = charSequence + text.charAt(nextCharachterIndex) ;
                            nextCharachterIndex++;
                        } else{
                            break;
                        }
                    }
                    dictionary.insertElement(charSequence);
                    tag = new Tag(dictionaryIndex, text.charAt(i+charSequence.length()-1));
                }else {
                    tag = new Tag(dictionaryIndex, '\0');
                }
            }
            Compressed.add(tag);
            i += charSequence.length();
        }
    }

    public void getCompressedText() {
        for (int i = 0; i < Compressed.size(); i++) {
            System.out.println(Compressed.get(i).getTag());
        }
        System.out.println("--------------------- Dictionary ------------------------");
        dictionary.getDictionary();
    }
}
