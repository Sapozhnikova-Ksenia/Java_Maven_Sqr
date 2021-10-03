package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int numberDown, int numberUp) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= numberDown && i * i <= numberUp) {
                count++;
            }
        }
        return count;
    }
}
