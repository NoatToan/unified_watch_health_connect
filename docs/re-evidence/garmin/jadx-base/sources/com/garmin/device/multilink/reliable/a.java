package com.garmin.device.multilink.reliable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50798a;

    public /* synthetic */ a(int i14) {
        this.f50798a = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50798a) {
            case 0:
                int i14 = MLRConnectionHelper.AnonymousClass1.f50797a;
                MLRConnectionHelper.mlrReliableRunProtocol();
                break;
            default:
                MLRConnectionHelper.mlrReliableRunProtocol();
                break;
        }
    }
}
