package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractIdleService.DelegateService f53601b;

    public /* synthetic */ e(AbstractIdleService.DelegateService delegateService, int i14) {
        this.f53600a = i14;
        this.f53601b = delegateService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53600a) {
            case 0:
                this.f53601b.lambda$doStop$1();
                break;
            default:
                this.f53601b.lambda$doStart$0();
                break;
        }
    }
}
