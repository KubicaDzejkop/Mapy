import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("polski", 5);
        maps.put("matematyka", 3);
        maps.put("historia", 2);
        maps.put("fizyka", 4);
        maps.put("matematyka", 4);

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("--------------------------------------------");

        Map<String, Double> products = new HashMap<>();
        products.put("Banan", 0.99);
        products.put("Mleko", 2.35);
        products.put("Chleb", 3.65);
        products.put("Płatki", 1.49);
        products.put("Ciasteczka", 8.99);
        for (Map.Entry<String, Double> entryProducts : products.entrySet()) {
            System.out.println(entryProducts.getKey() + ": " + entryProducts.getValue());
        }

        System.out.println(products.containsKey("Chleb"));
        products.remove("Banan");

        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Double> entryProducts : products.entrySet()) {
            System.out.println(entryProducts.getKey() + ": " + entryProducts.getValue());
        }

        System.out.println("--------------------------------------------");

        Iterator<String> iterator = products.keySet().iterator();
        while (iterator.hasNext()){
            String itr = iterator.next();
            System.out.println(itr + ": ");
        }

        System.out.println("--------------------------------------------");

        Map<String, String> mapProduct = new TreeMap<>();
        mapProduct.put("olej", "tłuszcze");
        mapProduct.put("masło", "tłuszcze");
        mapProduct.put("mleko", "nabiał");
        mapProduct.put("ser biały", "nabiał");
        mapProduct.put("cukier", "słodycze");

        for(Map.Entry<String, String> entry : mapProduct.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("--------------------------------------------");

        Map<User, String> users = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getPesel().compareTo(u2.getPesel());
            }
        });
        User user1 = new User("Kamil", 15, "123456789");
        User user2 = new User("Anna", 29, "23456789");
        User user3 = new User("Marcin", 36, "323456789");
        User user4 = new User("Kasia", 12, "423456789");

        users.put(user1, "5BT");
        users.put(user2, "4BT");
        users.put(user3, "3BT");
        users.put(user4, "5BT");

        for (Map.Entry<User, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}