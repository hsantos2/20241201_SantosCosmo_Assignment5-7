public class App {
    public static void main(String[] args) throws Exception {
        //Calculate total tuition cost
        int totalCost = 0;
        int tuition = 10000;
        int tenYearTuition = 0;

        for (int year=1; year <= 14; year++){
            //Increase tuition cost by 5% per year
            tuition += (tuition * 0.05);
            
            if (year>10)
                totalCost += tuition;


            //Calculate cost of tuition after ten years
            if(year==10)
                tenYearTuition = tuition;
        }

        //Display tuition cost after ten years
        System.out.println("Tuition cost after ten years: $" + tenYearTuition);

        //Display cost of four years of tuition after the tenth year
        System.out.println("Total cost for four years worth of tuition after the tenth year: $" +totalCost);
    }
}
