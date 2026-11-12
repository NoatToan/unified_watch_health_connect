package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class t0 implements Runnable {
    public final /* synthetic */ zzkv a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ zzgn c;

    public t0(zzgn zzgnVar, zzkv zzkvVar, zzp zzpVar) {
        this.c = zzgnVar;
        this.a = zzkvVar;
        this.b = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a();
        if (this.a.zza() == null) {
            this.c.a.o(this.a, this.b);
        } else {
            this.c.a.t(this.a, this.b);
        }
    }
}
