package com.facebook.react.bridge.queue;

import defpackage.v07;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
@v07
public interface MessageQueueThread {
    @v07
    void assertIsOnThread();

    @v07
    void assertIsOnThread(String str);

    @v07
    <T> Future<T> callOnQueue(Callable<T> callable);

    @v07
    MessageQueueThreadPerfStats getPerfStats();

    @v07
    boolean isOnThread();

    @v07
    void quitSynchronous();

    @v07
    void resetPerfStats();

    @v07
    void runOnQueue(Runnable runnable);
}
