package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();
        resultDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
        resultDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
        resultDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
        resultDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
        while (!firstQueue.isEmpty()&&!secondQueue.isEmpty()){
            firstQueue.add(resultDeque.removeLast());
            resultDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
            resultDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
            secondQueue.add(resultDeque.removeLast());
            resultDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
            resultDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
        }
        return resultDeque;
    }
}
