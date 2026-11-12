package com.garmin.android.apps.connectmobile.connectiq;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.f f31871b;

    public /* synthetic */ f0(b0.f fVar, int i14, String str) {
        this.f31870a = 1;
        this.f31871b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31870a) {
            case 0:
                this.f31871b.b();
                break;
            case 1:
                this.f31871b.a();
                break;
            default:
                this.f31871b.a();
                break;
        }
    }

    public /* synthetic */ f0(b0.f fVar, int i14, int i15) {
        this.f31870a = i15;
        this.f31871b = fVar;
    }
}
