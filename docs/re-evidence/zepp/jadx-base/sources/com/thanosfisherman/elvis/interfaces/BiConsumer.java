package com.thanosfisherman.elvis.interfaces;

/* JADX INFO: loaded from: classes18.dex */
@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);
}
