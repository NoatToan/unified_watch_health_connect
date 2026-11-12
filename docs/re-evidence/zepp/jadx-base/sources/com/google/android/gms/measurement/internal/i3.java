package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class i3 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzkd b;

    public i3(zzkd zzkdVar, long j) {
        this.b = zzkdVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkd.e(this.b, this.a);
    }
}
