import streams.Operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.contains("ta"));
        List<Integer> integers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(integers.stream().reduce(0, (summary, value) -> summary += value));
        List<String> strings = operations.getList();
        String result = strings.stream().reduce("", (res, value) -> res+= value);
        System.out.println(result);
        Arrays.stream(operations.getList().stream().filter(element -> element.contains("ly")).reduce("", (res, value) -> res += value + " ").split(" ")).forEach(System.out::println);
        int MAXIMUM = Stream.iterate(0, value -> ++value).limit(10).filter(value -> value >= 5 && value <= 8).max((firstValue, secondValue) -> (int)(firstValue.longValue() - secondValue.longValue())).get();
        System.out.println(operations.getList().stream().max((firstString, secondString) -> firstString.length() - secondString.length()).get());
        List<String> list = operations.getList().stream().sorted((first, second) -> first.length() - second.length()).sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(list);
    }
}
