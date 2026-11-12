package com.garmin.android.apps.connectmobile.connectiq;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.e f31810b;

    public /* synthetic */ a0(b0.e eVar, int i14) {
        this.f31809a = i14;
        this.f31810b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31809a) {
            case 0:
                this.f31810b.a();
                break;
            default:
                this.f31810b.b();
                break;
        }
    }
}
