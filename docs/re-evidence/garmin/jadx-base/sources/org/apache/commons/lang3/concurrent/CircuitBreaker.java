package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes3.dex */
public interface CircuitBreaker<T> {
    boolean checkState();

    void close();

    boolean incrementAndCheckState(T t7);

    boolean isClosed();

    boolean isOpen();

    void open();
}
