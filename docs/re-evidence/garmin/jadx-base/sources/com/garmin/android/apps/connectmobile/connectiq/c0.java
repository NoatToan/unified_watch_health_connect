package com.garmin.android.apps.connectmobile.connectiq;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.k f31848b;

    public /* synthetic */ c0(b0.k kVar, int i14) {
        this.f31847a = i14;
        this.f31848b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31847a) {
            case 0:
                this.f31848b.K3();
                break;
            default:
                this.f31848b.R7();
                break;
        }
    }
}
