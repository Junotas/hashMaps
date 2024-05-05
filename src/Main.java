import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String,Integer> drinksCalories = new HashMap<>();

        drinksCalories.put("Redbull", 100);
        drinksCalories.put("Coca Cola", 130);
        drinksCalories.put("Fanta", 115);
        drinksCalories.put("Powerking", 110);

        System.out.println(drinksCalories.get("Redbull"));


    }
}