public class Cities {
    int cityPopulation;
    int womenAmount;
    int menAmount;

    public int whoIsMore() {
        if (menAmount > womenAmount)
            System.out.println("There are more men in the city. Amount: " + menAmount);
        else
            System.out.println("There are more women in the city. Amount: " + womenAmount);
        return 0;
    }
}
