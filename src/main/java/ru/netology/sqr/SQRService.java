package ru.netology.sqr;

public class SQRService {

    public int sqrCount (int lowerLimit, int upperLimit){
        int count = 0;
        for (int i = 10; i <= 99; i++){
            if (lowerLimit <= i*i && i*i <= upperLimit){
                count++;
            }
        }
        return count;
    }

}
