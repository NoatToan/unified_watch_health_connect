package com.garmin.android.apps.connectmobile.connectiq;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.j f31883b;

    public /* synthetic */ j0(b0.j jVar, int i14) {
        this.f31882a = i14;
        this.f31883b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31882a) {
            case 0:
                this.f31883b.b();
                break;
            default:
                this.f31883b.a();
                break;
        }
    }
}
