package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes22.dex */
public interface RejectedExecutionHandler {
    void rejected(Runnable runnable, SingleThreadEventExecutor singleThreadEventExecutor);
}
