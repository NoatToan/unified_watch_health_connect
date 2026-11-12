package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f53684b;

    public /* synthetic */ i(Runnable runnable, int i14) {
        this.f53683a = i14;
        this.f53684b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f53683a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$1(this.f53684b);
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(this.f53684b);
        }
    }
}
