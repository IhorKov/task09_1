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

        List<String> result= checkListMethod(listStr);

        for (String str : result){
            System.out.println(str);
        }
    }
    public static List<String> checkListMethod(List<String> list){
        List<String> copy = new ArrayList<>(list);

        for (int i = 0; i < copy.size();) {
            if (!copy.get(i).matches(".{0,4}[^0-9]")){
                copy.remove(i);
                continue;
            }
            i++;
        }
        return copy;
    }
}
