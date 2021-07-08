package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(DemoDataGenerator.GenerateChar(true));
        System.out.println(DemoDataGenerator.GenerateChar(false));
        System.out.println(DemoDataGenerator.GenerateWord(3, 8, true));
        System.out.println(DemoDataGenerator.GenerateWord(4, 15, false));
        System.out.println(DemoDataGenerator.GenerateSentence(3, 9, 2, 8, true));
        System.out.println(DemoDataGenerator.GenerateSentence(4, 15, 6, 9, false));
        System.out.println(DemoDataGenerator.GenerateParagraph(3, 12, 3, 9, 2, 8, true));
        System.out.println(DemoDataGenerator.GenerateParagraph(6, 9, 4, 15, 6, 9, false));
        System.out.println(DemoDataGenerator.GenerateUUID());
        System.out.println(DemoDataGenerator.GenerateCell());
        System.out.println(DemoDataGenerator.GenerateTCNO());
        System.out.println(DemoDataGenerator.GenerateCreditCardNumber());
        System.out.println(DemoDataGenerator.GenerateComplexPassword(12));

        for(int i = 0; i < 40; ++i) {
            System.out.println("+90" + DemoDataGenerator.GenerateCell());
        }
    }
}
