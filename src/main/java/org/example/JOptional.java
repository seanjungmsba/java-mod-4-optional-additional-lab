package org.example;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class JOptional<T> {

    public static <T> JOptional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public <U> JOptional<U> map(Function<T, U> mapper) {
        return null;
    }

    public Stream<T> stream() {
        if (!isPresent()) {
            return Stream.empty();
        } else {
            return Stream.of(t);
        }
    }

    public T get() {
        if (t == null) {
            throw new NoSuchElementException("No value present");
        }
        return t;
    }

    public T orElse(T backup) {
        return t != null ? t : backup;
    }

    public T orElseGet(Supplier<T> backupCallback) {
        return t != null ? t : backupCallback.get();
    }

    /* Additional variables and methods */
    private static final JOptional<?> EMPTY = new JOptional<>();

    private final T t;

    private JOptional() {
        this.t = null;
    }

    private JOptional(T t) {
        this.t = Objects.requireNonNull(t);
    }

    public static <T> JOptional<T> empty() {
        @SuppressWarnings("unchecked")
        JOptional<T> t = (JOptional<T>) EMPTY;
        return t;
    }

    public static <T> JOptional<T> of(T value) {
        return new JOptional<>(value);
    }

    public boolean isPresent() {
        return t != null;
    }

}
