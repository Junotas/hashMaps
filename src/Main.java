import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String,String> countries = new HashMap<>();


        //key and their value, here it's country and capital
        countries.put("USA    ","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        // System.out.println(countries.size());
        //countries.remove("USA");
       // System.out.println(countries.get("Russia"));
        /*countries.clear();
        System.out.println(countries);*/
        //System.out.println(countries);
       /* countries.replace("USA","Detroit");
        System.out.println(countries);*/
        /*System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("Beijing"));*/

        for (String i : countries.keySet()) {
            System.out.print(i+"\t"+ "= ");
            System.out.println(countries.get(i));
        }




/*
        HashMap<String,Integer> drinksCalories = new HashMap<>();
        //key and their value, here it's a drink and calories of that drink

        drinksCalories.put("Redbull", 100);
        drinksCalories.put("Coca Cola", 130);
        drinksCalories.put("Fanta", 115);
        drinksCalories.put("Powerking", 110);

        //System.out.println(drinksCalories.get("Redbull"));


        //System.out.println();
*/

    }
}