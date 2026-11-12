package io.netty.util.internal;

import java.util.Queue;

/* JADX INFO: loaded from: classes22.dex */
public interface PriorityQueue<T> extends Queue<T> {
    void clearIgnoringIndexes();

    boolean containsTyped(T t);

    void priorityChanged(T t);

    boolean removeTyped(T t);
}
