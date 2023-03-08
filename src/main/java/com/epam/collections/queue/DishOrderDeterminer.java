package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new PriorityQueue<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> resultList = new ArrayList<>();
        int counter = 0;
        while (!dishes.isEmpty()) {
            for (Integer dish : dishes) {
                if (++counter % everyDishNumberToEat == 0) {
                    resultList.add(dish);
                }
            }
            dishes.removeAll(resultList);
        }
        return resultList;
    }
}
