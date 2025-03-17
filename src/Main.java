import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> arra = new ArrayList<>();
        arra.add("kenedy");
        arra.add("kalllyedson");
        arra.add("kaique");
        arra.add("kallebe");
        Collections.sort(arra);
        for (String name : arra){
            System.out.println(name);

        }

        }
    }
