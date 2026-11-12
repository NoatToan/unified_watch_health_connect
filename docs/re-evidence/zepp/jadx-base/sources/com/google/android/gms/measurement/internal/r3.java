package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class r3 extends f {
    public final /* synthetic */ zzkg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(zzkg zzkgVar, z0 z0Var) {
        super(z0Var);
        this.e = zzkgVar;
    }

    @Override // com.google.android.gms.measurement.internal.f
    public final void c() {
        this.e.zza();
        this.e.zzs.zzay().zzj().zza("Starting upload from DelayedRunnable");
        this.e.zzf.u();
    }
}
