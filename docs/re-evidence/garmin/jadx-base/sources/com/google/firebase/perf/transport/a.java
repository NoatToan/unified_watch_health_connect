package com.google.firebase.perf.transport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransportManager f53804b;

    public /* synthetic */ a(TransportManager transportManager, int i14) {
        this.f53803a = i14;
        this.f53804b = transportManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53803a) {
            case 0:
                this.f53804b.lambda$onUpdateAppState$1();
                break;
            default:
                this.f53804b.syncInit();
                break;
        }
    }
}
