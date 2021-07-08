package com.company;

import java.util.Random;
import java.util.UUID;

public class DemoDataGenerator {
    private static final Random rnd = new Random();

    public DemoDataGenerator() {
    }

    public static char GenerateChar(boolean uppercase) {
        return uppercase ? (char)(rnd.nextInt(26) + 65) : (char)(rnd.nextInt(26) + 97);
    }

    public static String GenerateWord(int Min, int Max, boolean uppercase) {
        String Word = "";
        int length = rnd.nextInt(Min) + (Max - Min);

        for(int i = 0; i < length; ++i) {
            Word = Word + GenerateChar(uppercase);
        }

        return Word;
    }

    public static String GenerateSentence(int Min, int Max, int WordMin, int WordMax, boolean uppercase) {
        String Sentence = "";
        int length = rnd.nextInt(Min) + (Max - Min);

        for(int i = 0; i < length - 1; ++i) {
            Sentence = Sentence + GenerateWord(WordMin, WordMax, uppercase) + " ";
        }

        Sentence = Sentence + GenerateWord(WordMin, WordMax, uppercase) + ".";
        return Sentence;
    }

    public static String GenerateParagraph(int Min, int Max, int SentenceMin, int SentenceMax, int WordMin, int WordMax, boolean uppercase) {
        String Paragraph = "";
        int length = rnd.nextInt(Min) + (Max - Min);

        for(int i = 0; i < length - 1; ++i) {
            Paragraph = Paragraph + GenerateSentence(SentenceMin, SentenceMax, WordMin, WordMax, uppercase) + " ";
        }

        return Paragraph;
    }

    public static UUID GenerateUUID() {
        return UUID.randomUUID();
    }

    public static long GenerateTCNO() {
        long result = 0L;
        long _prefix = (long)(rnd.nextInt(900000000) + 100000000);
        int d1 = (int)_prefix % 10;
        int d2 = (int)_prefix % 100 - d1;
        int d3 = (int)_prefix % 1000 - (d1 + d2);
        int d4 = (int)_prefix % 10000 - (d1 + d2 + d3);
        int d5 = (int)_prefix % 100000 - (d1 + d2 + d3 + d4);
        int d6 = (int)_prefix % 1000000 - (d1 + d2 + d3 + d4 + d5);
        int d7 = (int)_prefix % 10000000 - (d1 + d2 + d3 + d4 + d5 + d6);
        int d8 = (int)_prefix % 100000000 - (d1 + d2 + d3 + d4 + d5 + d6 + d7);
        int d9 = (int)_prefix % 1000000000 - (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8);
        int _suffix1 = ((d1 + d3 + d5 + d7 + d9) * 7 - (d2 + d4 + d6 + d8)) % 10;
        int _suffix2 = (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + _suffix1) % 10;
        result = _prefix * 100L + (long)(_suffix1 * 10) + (long)_suffix2;
        return result;
    }

    public static long GenerateCell() {
        long result = 0L;
        int[] cell_prefix = new int[]{501, 505, 506, 507, 551, 552, 553, 554, 555, 559, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 561, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549};
        int cell_prefixId = rnd.nextInt(cell_prefix.length);
        long _prefix = (long)cell_prefix[cell_prefixId];
        long _suffix = (long)rnd.nextInt(10000000);
        result = _prefix * 10000000L + _suffix;
        return result;
    }

    public static String GenerateComplexPassword(int CharCount) {
        char[] SpecialChars = new char[]{'.', ',', '_', '$', '&', '(', ')', '[', ']', '!', '#', '|'};
        char[] Upper = new char[4];
        char[] Lower = new char[2];
        int[] Number = new int[4];
        char[] Specials = new char[2];

        int i;
        for(i = 0; i < Upper.length; ++i) {
            Upper[i] = GenerateChar(true);
        }

        for(i = 0; i < Lower.length; ++i) {
            Lower[i] = GenerateChar(false);
        }

        for(i = 0; i < Number.length; ++i) {
            Number[i] = rnd.nextInt(10);
        }

        for(i = 0; i < Specials.length; ++i) {
            Specials[i] = SpecialChars[rnd.nextInt(SpecialChars.length)];
        }

        String ComplexPassword = Upper + String.valueOf(Lower) + Specials;
        int[] var7 = Number;
        int var8 = Number.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            int item = var7[var9];
            ComplexPassword = ComplexPassword + item;
        }

        return ComplexPassword;
    }

    public static String GenerateCreditCardNumber(){
        Random rnd = new Random();
        int counter=0;
        StringBuffer stringBuffer = new StringBuffer();
        while(counter<=15){
            int generate = rnd.nextInt(9);
            stringBuffer.append(generate);
            counter++;
        }
        return stringBuffer.toString();
    }
}
