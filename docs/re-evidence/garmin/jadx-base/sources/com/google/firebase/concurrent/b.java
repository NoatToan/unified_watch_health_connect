package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f53661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f53662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f53663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f53664e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j8, TimeUnit timeUnit, int i14) {
        this.f53660a = i14;
        this.f53661b = delegatingScheduledExecutorService;
        this.f53664e = obj;
        this.f53662c = j8;
        this.f53663d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f53660a) {
            case 0:
                return this.f53661b.lambda$schedule$2((Runnable) this.f53664e, this.f53662c, this.f53663d, completer);
            default:
                return this.f53661b.lambda$schedule$5((Callable) this.f53664e, this.f53662c, this.f53663d, completer);
        }
    }
}
