package com.miui.tsmclientsdk;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public interface MiTsmFuture<V> {
    boolean cancel(boolean z);

    V getResult() throws ExecutionException, OperationCanceledException, IOException;

    V getResult(long j, TimeUnit timeUnit) throws ExecutionException, OperationCanceledException, IOException;

    boolean isCancelled();

    boolean isDone();
}
