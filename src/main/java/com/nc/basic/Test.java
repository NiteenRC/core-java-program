package com.nc.basic;

public class Test {
    public static void main(String[] args) {
        //Find steps taken to type a word, using a unique keypad.
        //keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba", start_pos=0, answer=4
        String word = "cba";
        String keyboard = "abcdefghijklmnopqrstuvwxyz";

        int temp = 0;
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < keyboard.length(); j++) {
                count++;
                char a = word.charAt(i);
                char b = keyboard.charAt(j);

                if ( a == b) {
                    //System.out.println(j);
                    count = count - 1;
                    temp += count - j;
                    break;
                }
            }
            //System.out.println(count);
        }

    }

}
