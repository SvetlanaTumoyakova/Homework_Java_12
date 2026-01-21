import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 1);
        map.put("Y", 2);
        map.put("Z", 3);
        System.out.println("Исходный Map: " + map);
        System.out.println("Изменённый Map: " + reverseMap(map));
    }

    public static Map<Integer, String> reverseMap(Map<String, Integer> map) {
        Map<Integer, String> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}