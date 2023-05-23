import java.util.*;

public class Main {
  public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();


  }
  public static void task1() {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    for (Integer num : nums) {
      if (num % 2 == 1) {
        System.out.println(num);
      }
    }
  }
  public static void task2() {
    List<Integer> nams = new ArrayList<>(List.of(10, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    Set<Integer> set = new TreeSet<>(nams);
    for (Integer nam : set) {
      if (nam % 2 == 0) {
        System.out.println(nam);
      }
    }
  }
  public static void task3() {

    List<String> stringList = new ArrayList<>(Arrays.asList("qwe","rty","asd","asd","wer"));
    Set<String> set = new HashSet<>(stringList);
    System.out.println(set);
  }

  public static void task4() {
    List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      if (map.containsKey(word)) {
        Integer count = map.get(word)+1;
        map.put(word, count);
      } else {
        map.put(word,1);
      }
    }
    System.out.println(map.values());

  }
}

