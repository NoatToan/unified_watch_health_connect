package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53599b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f53598a = i14;
        this.f53599b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53598a) {
            case 0:
                ((AbstractExecutionThreadService.AnonymousClass1) this.f53599b).lambda$doStart$1();
                break;
            case 1:
                ((JdkFutureAdapters.ListenableFutureAdapter) this.f53599b).lambda$addListener$0();
                break;
            case 2:
                WrappingExecutorService.lambda$wrapTask$0((Callable) this.f53599b);
                break;
            case 3:
                ClosingFuture.lambda$closeQuietly$0((AutoCloseable) this.f53599b);
                break;
            default:
                ((Future) this.f53599b).cancel(false);
                break;
        }
    }
}
