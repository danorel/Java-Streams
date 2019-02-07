import streams.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.contains("ta"));
        List<Integer> integers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(integers.stream().reduce(0, (summary, value) -> summary += value));
        List<String> strings = operations.getList();
        String result = strings.stream().reduce("", (res, value) -> res+= value);
        System.out.println(result);
        String[] elements = operations.getList().stream().filter(element -> element.contains("ly")).reduce("", (res, value) -> res += value + " ").split(" ");
        Arrays.stream(elements).forEach(element -> System.out.println(element));
    }
}
