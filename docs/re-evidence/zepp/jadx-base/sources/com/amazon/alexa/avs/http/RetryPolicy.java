package com.amazon.alexa.avs.http;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public interface RetryPolicy {
    void tryCall(Callable<Void> callable, Class<? extends Throwable> cls) throws Exception;
}
