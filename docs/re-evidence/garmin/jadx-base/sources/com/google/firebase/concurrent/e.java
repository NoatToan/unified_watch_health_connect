package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f53673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f53674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f53675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f53676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f53677f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j8, long j14, TimeUnit timeUnit, int i14) {
        this.f53672a = i14;
        this.f53673b = delegatingScheduledExecutorService;
        this.f53674c = runnable;
        this.f53675d = j8;
        this.f53676e = j14;
        this.f53677f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f53672a) {
            case 0:
                return this.f53673b.lambda$scheduleAtFixedRate$8(this.f53674c, this.f53675d, this.f53676e, this.f53677f, completer);
            default:
                return this.f53673b.lambda$scheduleWithFixedDelay$11(this.f53674c, this.f53675d, this.f53676e, this.f53677f, completer);
        }
    }
}
