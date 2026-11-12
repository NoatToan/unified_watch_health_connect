package io.netty.util.internal;

/* JADX INFO: loaded from: classes2.dex */
public interface LongCounter {
    void add(long j);

    void decrement();

    void increment();

    long value();
}
