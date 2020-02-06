package org.example.Sweet;

public class Chocolates extends Sweet
{

    public int choco[] ;
    public Chocolates(int wt, int studentNumber, int choc[], String studentName[])
    {
        studentNumbers = studentNumber;
        sweetWeight = wt;

        studentNames = new String[studentNumber];

        choco = new int[studentNumber];

        for(int i = 0 ; i < studentNumber ; i++)
        {
            choco[i] = choc[i];

            studentNames[i] = studentName[i];
        }
    }

    public int chocNumber()
    {
        int total = 0;
        for(int i = 0 ; i < studentNumbers ; i++)
        {
            total += choco[i];
        }
        return total;
    }

    public void findMax()
    {
        int max = -1;

        int temp = -100;

        for(int i = 0 ; i < studentNumbers ; i++)
        {
            if(max < choco[i])
            {
                max = choco[i];
                temp = i;
            }
        }

        System.out.println(choco[temp] + " got max chocolates of " + max);
    }

    public int chocWeight()
    {
        return sweetWeight*chocNumber();
    }

    void display()
    {

        for(int i = 0 ; i < studentNumbers ; i++)
            System.out.println( studentNames[i] + " have " + choco[i] + ".");
    }

    public void sortArray()
    {
        for(int i = 0 ; i < studentNumbers ; i++)
        {
            for(int j = 0 ; j < studentNumbers-1 ; j++)
            {
                if(choco[i] < choco[j])
                {
                    String tempStr = studentNames[i];
                    studentNames[i] = studentNames[j];
                    studentNames[j] = tempStr;

                    int temp = choco[i];
                    choco[i] = choco[j];
                    choco[j] = temp;
                }
            }
        }

        System.out.println("Sorted order ");
        display();
    }

    public void displayEverything()
    {
        System.out.println("Chocolates " + chocNumber() + " and total weight " + chocWeight());
        System.out.println("Complete List is below " );
        display();
        findMax();
    }

    public int[] getArray() {
        int temp[] = new int[studentNumbers];
        for (int i = 0; i < studentNumbers; i++)
            temp[i] = choco[i] * sweetWeight;
        return temp;
    }
}
