package com.garmin.android.apps.connectmobile;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f49766b;

    public /* synthetic */ y1(z1 z1Var, int i14) {
        this.f49765a = i14;
        this.f49766b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49765a) {
            case 0:
                this.f49766b.lambda$hideProgressOverlay$7();
                break;
            default:
                this.f49766b.lambda$showProgressOverlay$4();
                break;
        }
    }
}
