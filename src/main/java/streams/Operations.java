package streams;

import java.util.ArrayList;

public class Operations {
    private ArrayList<String> list = new ArrayList<>();

    public Operations(){
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
    }

    public boolean contains(String content){
        return list.stream().anyMatch(element -> element.contains(content));
    }

    public ArrayList<String> getList() {
        return list;
    }
}
