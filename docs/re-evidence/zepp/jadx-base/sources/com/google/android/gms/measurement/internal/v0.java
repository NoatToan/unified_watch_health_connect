package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class v0 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzgn b;

    public v0(zzgn zzgnVar, zzp zzpVar) {
        this.b = zzgnVar;
        this.a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a();
        this.b.a.k(this.a);
    }
}
