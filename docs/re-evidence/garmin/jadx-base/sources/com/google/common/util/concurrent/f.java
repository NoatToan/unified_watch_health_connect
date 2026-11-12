package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractScheduledService.ServiceDelegate f53603b;

    public /* synthetic */ f(AbstractScheduledService.ServiceDelegate serviceDelegate, int i14) {
        this.f53602a = i14;
        this.f53603b = serviceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53602a) {
            case 0:
                this.f53603b.lambda$doStart$1();
                break;
            default:
                this.f53603b.lambda$doStop$2();
                break;
        }
    }
}
