package com.mibi.sdk.common.account;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public interface IServiceTokenFuture {
    IServiceTokenResult get();

    IServiceTokenResult get(long j, TimeUnit timeUnit);

    boolean isCancelled();

    boolean isDone();
}
