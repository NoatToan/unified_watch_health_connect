package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class j3 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzkd b;

    public j3(zzkd zzkdVar, long j) {
        this.b = zzkdVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkd.d(this.b, this.a);
    }
}
