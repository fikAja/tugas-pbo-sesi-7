import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericExample<T> {
    
    // Generic class
    private T data;
    
    public GenericExample(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    // Generic method
    public static <E> void printList(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {
        // Menggunakan generic class
        GenericExample<Integer> integerGeneric = new GenericExample<>(10);
        System.out.println("Data: " + integerGeneric.getData());
        
        GenericExample<String> stringGeneric = new GenericExample<>("Hello");
        System.out.println("Data: " + stringGeneric.getData());
        
        // Menggunakan generic method dengan ArrayList
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("Integer List:");
        printList(integerList);
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        System.out.println("String List:");
        printList(stringList);
        
        // Menggunakan generic method dengan HashMap
        Map<String, Integer> fruitPriceMap = new HashMap<>();
        fruitPriceMap.put("Apple", 10);
        fruitPriceMap.put("Banana", 5);
        fruitPriceMap.put("Orange", 8);
        System.out.println("Fruit Prices:");
        printMap(fruitPriceMap);
    }
    
    // Generic method untuk mencetak isi Map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
