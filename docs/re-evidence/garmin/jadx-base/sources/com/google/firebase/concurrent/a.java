package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53659c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f53657a = i14;
        this.f53658b = obj;
        this.f53659c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53657a) {
            case 0:
                ((CustomThreadFactory) this.f53658b).lambda$newThread$0((Runnable) this.f53659c);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) this.f53658b, (DelegatingScheduledFuture.Completer) this.f53659c);
                break;
            default:
                ((LimitedConcurrencyExecutor) this.f53658b).lambda$decorate$0((Runnable) this.f53659c);
                break;
        }
    }
}
