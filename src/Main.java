import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String,String> countries = new HashMap<>();


        //key and their value, here it's country and capital
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");


        //countries.remove("USA");
        System.out.println(countries);




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