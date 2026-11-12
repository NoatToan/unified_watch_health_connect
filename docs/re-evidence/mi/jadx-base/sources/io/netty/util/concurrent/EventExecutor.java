package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public interface EventExecutor extends EventExecutorGroup {
    boolean inEventLoop();

    boolean inEventLoop(Thread thread);

    <V> Future<V> newFailedFuture(Throwable th);

    <V> ProgressivePromise<V> newProgressivePromise();

    <V> Promise<V> newPromise();

    <V> Future<V> newSucceededFuture(V v);

    @Override // io.netty.util.concurrent.EventExecutorGroup
    EventExecutor next();

    EventExecutorGroup parent();
}
