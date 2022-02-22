package edu.bristol;

public class IMDBRating
{
    private float currentAverage = 0;
    private int ratingCount = 0;

    public float addNewRating(int newRating)
    {
        int previousTotal = (int) (currentAverage * ratingCount);
        float newTotal = previousTotal + newRating;
        ratingCount++;
        currentAverage = Math.round ((newTotal /ratingCount)*1.00);
        return currentAverage;
    }
}
