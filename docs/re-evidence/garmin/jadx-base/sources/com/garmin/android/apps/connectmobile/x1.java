package com.garmin.android.apps.connectmobile;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f49757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f49758c;

    public /* synthetic */ x1(z1 z1Var, String str, int i14) {
        this.f49756a = i14;
        this.f49757b = z1Var;
        this.f49758c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49756a) {
            case 0:
                this.f49757b.lambda$showProgressOverlay$5(this.f49758c);
                break;
            default:
                this.f49757b.lambda$requestProgressOverlayFocus$6(this.f49758c);
                break;
        }
    }
}
