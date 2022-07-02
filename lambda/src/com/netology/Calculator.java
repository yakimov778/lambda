package com.netology;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    Predicate<Integer> isPositive = x -> x > 0;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;


    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0; // нельзя делить на ноль
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;



    Consumer<Integer> println = System.out::println;
}
