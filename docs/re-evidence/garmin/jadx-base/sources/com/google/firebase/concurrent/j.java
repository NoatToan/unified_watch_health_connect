package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f53686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53687c;

    public /* synthetic */ j(Object obj, int i14, Runnable runnable) {
        this.f53685a = i14;
        this.f53686b = runnable;
        this.f53687c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f53685a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$0(this.f53686b, this.f53687c);
            default:
                return PausableExecutorServiceImpl.lambda$submit$0(this.f53686b, this.f53687c);
        }
    }
}
