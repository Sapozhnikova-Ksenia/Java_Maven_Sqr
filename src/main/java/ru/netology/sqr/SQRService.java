package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int numberDown, int numberUp) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrForI= i*i;
            if (sqrForI >= numberDown && sqrForI <= numberUp) {
                count++;
            }
        }
        return count;
    }
}
