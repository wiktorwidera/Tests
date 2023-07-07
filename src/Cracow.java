public class Cracow extends Cities {
    public static void main(String[] args) {
        Cracow cracow = new Cracow();
        cracow.cityPopulation = 100000;
        cracow.menAmount = 50000;
        cracow.womenAmount = 60000;
        cracow.whoIsMore();
    }

    @Override
    public int whoIsMore() {
        super.whoIsMore();
        System.out.println("Percentage of men in the city's population: ");
        return menAmount / cityPopulation;
    }
}
