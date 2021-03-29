package com.cozla.stream1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Runner {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /*
        * QUESTION
         */
        //1. Find all transactions in the year 2011 and sort them by value (small to high).
        //2. What are all the unique cities where the traders work?
        //3. Find all traders from Cambridge and sort them by name.
        //4. Return a string of all traders’ names sorted alphabetically.
        //5. Are any traders based in Milan?
        //6. Print all transactions’ values from the traders living in Cambridge.
        //7. What’s the highest value of all the transactions?
        //8. Find the transaction with the smallest value.

        /*
         * REPONSE
         */
        //1. Find all transactions in the year 2011 and sort them by value (small to high).
//        List<Transaction> transactions2011 = transactions.stream()
//                .filter(transaction -> transaction.getYear() == 2011)
//                .sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
//        transactions2011.forEach(System.out::println);

        //2. What are all the unique cities where the traders work?
//        List<String> cities = transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getCity)
//                .distinct()
//                .collect(toList());
//        cities.forEach(System.out::println);

        //3. Find all traders from Cambridge and sort them by name.
//        List<Trader> traders = transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(trader -> "Cambridge".equals(trader.getCity()))
//                .sorted(Comparator.comparing(Trader::getCity))
//                .distinct()
//                .collect(toList());
//        traders.forEach(System.out::println);

        //4. Return a string of all traders’ names sorted alphabetically.
//        String nameSorted = transactions.stream()
//                .map(transaction -> transaction.getTrader().getName())
//                .distinct()
//                .sorted()
//                .reduce(" ", (s1, s2) -> s1 + " " + s2);
//        System.out.println(nameSorted);

        //5. Are any traders based in Milan?
//        boolean isMilan = transactions.stream()
//                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
//        System.out.println(isMilan);

        //6. Print all transactions’ values from the traders living in Cambridge.
//        transactions.stream()
//                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
//                .map(transaction -> transaction.getValue())
//                .forEach(System.out::println);

        //7. What’s the highest value of all the transactions?
//        Optional<Integer> maxValue = transactions.stream()
//                .map(transaction -> transaction.getValue())
//                .reduce(Integer::max);
//        System.out.println(maxValue.get());

        //8. Find the transaction with the smallest value.
//        Optional<Transaction> smallesTransaction = transactions.stream()
//                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1:t2);

//        Optional<Transaction> smallesTransaction = transactions.stream()
//                .min(Comparator.comparing(Transaction::getValue));
//        System.out.println(smallesTransaction);

    }
}
