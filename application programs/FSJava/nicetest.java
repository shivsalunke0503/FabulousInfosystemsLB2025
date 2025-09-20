package FSJava;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static FSJava.OrderStatus.*;

public class nicetest {


    public static List<Order> getOrders()
    {

        return List.of(

                new Order("O1", "Alice", 250.0, DELIVERED),

                new Order("O2", "Bob", 300.0, PLACED),

                new Order("O3", "Alice", 150.0, SHIPPED),

                new Order("O4", "Charlie", 500.0, DELIVERED),

                new Order("O5", "Alice", 200.0, CANCELLED)

        );
    }
    public static void main(String[] args) {


    //total amount
        List<Order> orderList = getOrders();

//problem statement : total amount spent per custmer
//        {'name':totalamount}
//        Amount spent per customer: {Alice=600.0, Bob=300.0, Charlie=500.0}

        Map<String, Double> totalByCustomer = orderList.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getAmount)
                ));
        System.out.println(totalByCustomer);

        List<List<String>> names = List.of(

                List.of("Alice", "Bob"),

                List.of("Charlie","Alice"),

                List.of("David", "Bob")

        );

        List<String> uniquelist = names.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(uniquelist);

//        output: "ALICE,BOB,CHARLIE,DAVID"


    }


}
