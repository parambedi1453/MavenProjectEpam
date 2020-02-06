package org.example.NewYearGift;

public class NewYearGift {
    public int chocolates[],candies[];
    public String studentNames[];

    public NewYearGift(String []studentName,int[] choco,int[] candy)
    {
        studentNames = new String[studentName.length];
        chocolates = new int[studentName.length];
        candies = new int[studentName.length];

        for(int i = 0 ; i < studentName.length ; i++)
        {
            studentNames[i] = studentName[i];
            chocolates[i] = choco[i];
            candies[i] = candy[i];
        }
    }

    public void displayEverything()
    {
        for(int i = 0 ; i < studentNames.length ; i++)
        {
            int temp = candies[i] + chocolates[i];
            System.out.println(studentNames[i] + " total weight : " + temp);
        }
    }
}
