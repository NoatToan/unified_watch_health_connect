package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f53666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f53667c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i14) {
        this.f53665a = i14;
        this.f53666b = runnable;
        this.f53667c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f53665a) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f53666b, this.f53667c);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f53666b, this.f53667c);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f53666b, this.f53667c);
                break;
        }
    }
}
