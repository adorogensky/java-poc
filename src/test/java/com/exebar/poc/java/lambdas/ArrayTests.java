package com.exebar.poc.java.lambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// of(2), ofNullable, empty
// filter
// map, mapToInt, mapToLong, mapToDouble
// flatMap, flatMapToInt, flatMapToLong, flatMapToDouble
// collect(3) ??
// distinct, min, max, count
// sorted(2)
// peek
// forEach, forEachOrdered
// takeWhile, dropWhile ???
// reduce(3) ?
//
// anyMatch, allMatch, noneMatch ???
// findFirst, findAny ???
// iterate ???
// generate ???
// concat ???
class ArrayTests {

    private final int [] numbers = { 1, 2, 3, 4 };

    private final int [][] inversions = { { 1, 2 }, { 5, 8 }, { 9, 11 } };

    @Test
    void processAndPrintNumbers() {
        IntStream.of(numbers).map(x -> x / 2).forEach(System.out::println);

    }

    @Test
    void printInversionIndexes() {
        Arrays.stream(inversions).flatMapToInt(Arrays::stream).forEach(System.out::println);
    }

    @Test
    void countDistinctNumbers() {
        assertEquals(numbers.length, IntStream.of(numbers).distinct().count());
    }

    @Test
    void findMaxNumber() {
        assertEquals(4, IntStream.of(numbers).max().getAsInt());
    }
}
