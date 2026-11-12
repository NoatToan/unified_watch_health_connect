package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpe;

/* JADX INFO: loaded from: classes3.dex */
final class q0 implements Runnable {
    public final /* synthetic */ zzat a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ zzgn c;

    public q0(zzgn zzgnVar, zzat zzatVar, zzp zzpVar) {
        this.c = zzgnVar;
        this.a = zzatVar;
        this.b = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzat zzatVarC = this.c.c(this.a, this.b);
        zzpe.zzc();
        if (this.c.a.zzg().zzs(null, zzdy.zzat)) {
            this.c.f(zzatVarC, this.b);
        } else {
            this.c.b(zzatVarC, this.b);
        }
    }
}
