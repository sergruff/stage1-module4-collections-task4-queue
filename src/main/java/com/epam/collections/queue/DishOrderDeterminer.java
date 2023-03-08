package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new PriorityQueue<>();
        for (int i = 1; i < numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> resultList = new ArrayList<>();
        int dishNumber;
        int counter=0;
        while (!dishes.isEmpty()){
            for (Integer dish : dishes) {
                dishNumber = dish;
                if (++counter % everyDishNumberToEat == 0) {
                    resultList.add(dishNumber);
                }
            }
        }
        return resultList;
    }
}
