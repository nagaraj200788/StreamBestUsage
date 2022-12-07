import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUsage {

    public static void main(String[] args) {
        long A[] = {2 ,2,2,2,2,3, 1, 1, 2, 4, 2, 0, 1, 1};
        Map<String, Long> collect1 =  Arrays.stream(A).mapToObj(a -> a).collect( Collectors.groupingBy(Object::toString,  Collectors.counting()));
        System.out.println(collect1);
        Map<String, Long> collect = "aaabb".chars().mapToObj(s -> (char)s).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        System.out.println(collect);
        Map<String, Long> ddd = "AAs"
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        System.out.println(ddd);
        ddd = "AAs"
                .chars()
                .mapToObj(i -> String.valueOf( (char)i))
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        System.out.println(ddd);
        Stream<String> stringStream = "AAassssssssssssssssssssssssssssssssssssssss"
                .chars()
                .mapToObj(i -> String.valueOf((char) i));
        System.out.println("hihihi "+stringStream.collect(Collectors.groupingBy(Object::toString,Collectors.counting() )));


    }
}
