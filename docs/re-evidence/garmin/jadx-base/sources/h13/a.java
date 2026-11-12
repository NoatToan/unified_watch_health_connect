package h13;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> extends AtomicInteger implements x03.e<T> {
    @Override // x03.h
    public final boolean offer(T t7) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
