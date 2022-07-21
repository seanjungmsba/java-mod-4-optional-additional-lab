package org.example;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class JOptional<T> {
    public static <T> JOptional<T> ofNullable(T t) {
        //
    }

    public <U> JOptional<U> map(Function<T, U> mapper) {

    }

    public Stream<T> stream() {

    }

    public T get() {

    }

    public T orElse(T backup) {

    }

    public T orElseGet(Supplier<T> backupCallback) {

    }
}
