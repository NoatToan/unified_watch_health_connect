package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class r2 extends f {
    public final /* synthetic */ zzjo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(zzjo zzjoVar, z0 z0Var) {
        super(z0Var);
        this.e = zzjoVar;
    }

    @Override // com.google.android.gms.measurement.internal.f
    public final void c() {
        zzjo zzjoVar = this.e;
        zzjoVar.zzg();
        if (zzjoVar.zzL()) {
            zzjoVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjoVar.zzs();
        }
    }
}
