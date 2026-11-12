package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class h0 implements Runnable {
    public final /* synthetic */ zzab a;
    public final /* synthetic */ zzgn b;

    public h0(zzgn zzgnVar, zzab zzabVar) {
        this.b = zzgnVar;
        this.a = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a();
        if (this.a.zzc.zza() == null) {
            this.b.a.m(this.a);
        } else {
            this.b.a.q(this.a);
        }
    }
}
