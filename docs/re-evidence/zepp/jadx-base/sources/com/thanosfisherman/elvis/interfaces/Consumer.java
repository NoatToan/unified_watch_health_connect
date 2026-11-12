package com.thanosfisherman.elvis.interfaces;

/* JADX INFO: loaded from: classes18.dex */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T> consumer);
}
