package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements Runnable {
    public final /* synthetic */ zzab a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ zzgn c;

    public g0(zzgn zzgnVar, zzab zzabVar, zzp zzpVar) {
        this.c = zzgnVar;
        this.a = zzabVar;
        this.b = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a();
        if (this.a.zzc.zza() == null) {
            this.c.a.n(this.a, this.b);
        } else {
            this.c.a.r(this.a, this.b);
        }
    }
}
