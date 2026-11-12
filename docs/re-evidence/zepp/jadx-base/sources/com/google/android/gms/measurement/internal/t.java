package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class t implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ u b;

    public t(u uVar, boolean z) {
        this.b = uVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.i(this.a);
    }
}
