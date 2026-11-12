package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f53669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f53670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f53671d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i14) {
        this.f53668a = i14;
        this.f53669b = delegatingScheduledExecutorService;
        this.f53670c = runnable;
        this.f53671d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53668a) {
            case 0:
                this.f53669b.lambda$scheduleWithFixedDelay$10(this.f53670c, this.f53671d);
                break;
            case 1:
                this.f53669b.lambda$scheduleAtFixedRate$7(this.f53670c, this.f53671d);
                break;
            default:
                this.f53669b.lambda$schedule$1(this.f53670c, this.f53671d);
                break;
        }
    }
}
