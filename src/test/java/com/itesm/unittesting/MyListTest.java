package com.itesm.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    @Test
    void shouldGetSizeOfList() {
        // Scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Test
        Assertions.assertEquals(3, list.size());
    }

    @Test
    void shouldClearTheList() {
        // Scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Test
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void shouldAddItemsToList() {
        // Scenario
        List<Integer> list = new ArrayList<>();

        // Test
        assertTrue(list.add(1));
    }

    @Test
    void shouldCheckIfItemExists() {
        // Scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // Test
        assertTrue(list.contains(1));
    }

    @Test
    void shouldGetElementByIndex() {
        // Scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Test
        assertEquals(2, list.get(1));
    }

    @Test
    void shouldSearchIndexOfObject() {
        // Scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Test
        assertEquals(1, list.indexOf(2));
    }

    @Test
    void shouldRemoveElementByIndex() {
        // Scenario
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        // Test
        assertTrue(list.remove("1"));
    }



}