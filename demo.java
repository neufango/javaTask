package com.insurancepolicy.AgentModule;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by kishan on 29/01/18.
 */

public class demo extends LinkedList<Integer> {
    private final int maxSize;

    public demo(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * add data one by one in list
     * at a time add only one data
     */
    @Override
    public boolean add(Integer integer) {
        if (size() == maxSize) {
            removeFirst();
        }
        return super.add(integer);
    }

    /**
     * add data on specific location
     */
    @Override
    public void add(int index, Integer element) {
        if (size() == maxSize) {
            removeFirst();
        }
        super.add(index, element);
    }

    /**
     * Add collection of data
     */
    @Override
    public boolean addAll(Collection<? extends Integer> collection) {
        final int totalNeededSize = size() + collection.size();
        final int overhead = totalNeededSize - maxSize;
        if (overhead > 0) {
            removeRange(0, overhead);
        }
        return super.addAll(collection);
    }

    /**
     * Remove all data from list
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return super.removeAll(c);
    }
}
