package org.example.Sweet;

public class Candy extends Sweet{
    public int can[] ;
    public Candy(int wt, int studentNumber, int cand[], String studentName[])
    {
        studentNumbers = studentNumber;
        sweetWeight = wt;

        studentNames = new String[studentNumber];

        can = new int[studentNumber];

        for(int i = 0 ; i < studentNumber ; i++)
        {
            can[i] = cand[i];

            studentNames[i] = studentName[i];
        }
    }

    public int candyNumber()
    {
        int total = 0;
        for(int i = 0 ; i < studentNumbers ; i++)
        {
            total += can[i];
        }
        return total;
    }

    public void findMax()
    {
        int max = -1;

        int temp = -100;

        for(int i = 0 ; i < studentNumbers ; i++)
        {
            if(max < can[i])
            {
                max = can[i];
                temp = i;
            }
        }

        System.out.println(studentNames[temp] + " got max candies of " + max);
    }

    public int candyWeight()
    {
        return sweetWeight*candyNumber();
    }

    void display()
    {

        for(int i = 0 ; i < studentNumbers ; i++)
            System.out.println( studentNames[i] + " have " + can[i] + ".");
    }

    public void sortArray()
    {
        for(int i = 0 ; i < studentNumbers ; i++)
        {
            for(int j = 0 ; j < studentNumbers-1 ; j++)
            {
                if(can[i] < can[j])
                {
                    String tempStr = studentNames[i];
                    studentNames[i] = studentNames[j];
                    studentNames[j] = tempStr;

                    int temp = can[i];
                    can[i] = can[j];
                    can[j] = temp;
                }
            }
        }

        System.out.println("Sorted order ");
        display();
    }

    public void displayEverything()
    {
        System.out.println("Candies " + candyNumber() + " and total weight " + candyWeight());
        System.out.println("Complete List is below " );
        display();
        findMax();
    }

    public int[] getArray() {
        int temp[] = new int[studentNumbers];
        for (int i = 0; i < studentNumbers; i++)
            temp[i] = can[i] * sweetWeight;
        return temp;
    }
}
