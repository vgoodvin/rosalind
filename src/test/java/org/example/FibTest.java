package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FibTest {
    @ParameterizedTest
    @MethodSource("dataFib")
    public void testFib(int n, int k, int expected) {
        int actual = Fib.calc(n, k);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> dataFib() {
        return Stream.of(
                //Arguments.of(5, 3, 19),
                Arguments.of(32, 2, 1431655765)
        );
    }
}
