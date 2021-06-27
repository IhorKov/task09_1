import java.util.ArrayList;
import java.util.List;

public class CheckList {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();

        listStr.add("asdada");
        listStr.add("asda2");

        listStr.add("ad");
        listStr.add("d");
        listStr.add("asd");
        listStr.add("asds");

        List<String> result= checkList(listStr);

        for (String str : result){
            System.out.println(str);
        }
    }
    public static List<String> checkList(List<String> list){
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).matches(".{0,4}[^0-9]")){
                continue;
            }
            result.add(list.get(i));
        }
        return result;
    }
}
