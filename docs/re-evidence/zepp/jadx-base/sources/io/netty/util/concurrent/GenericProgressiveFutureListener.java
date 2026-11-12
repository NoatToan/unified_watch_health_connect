package io.netty.util.concurrent;

import io.netty.util.concurrent.ProgressiveFuture;

/* JADX INFO: loaded from: classes22.dex */
public interface GenericProgressiveFutureListener<F extends ProgressiveFuture<?>> extends GenericFutureListener<F> {
    void operationProgressed(F f, long j, long j2) throws Exception;
}
