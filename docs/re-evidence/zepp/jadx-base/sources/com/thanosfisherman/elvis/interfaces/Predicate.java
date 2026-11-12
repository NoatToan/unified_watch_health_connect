package com.thanosfisherman.elvis.interfaces;

/* JADX INFO: loaded from: classes18.dex */
@FunctionalInterface
public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
