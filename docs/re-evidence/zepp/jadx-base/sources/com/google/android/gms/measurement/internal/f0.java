package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class f0 implements Runnable {
    public final /* synthetic */ zzgy a;
    public final /* synthetic */ zzfv b;

    public f0(zzfv zzfvVar, zzgy zzgyVar) {
        this.b = zzfvVar;
        this.a = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv.a(this.b, this.a);
        this.b.zzH(this.a.g);
    }
}
