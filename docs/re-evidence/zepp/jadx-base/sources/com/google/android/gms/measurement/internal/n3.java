package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
final class n3 extends f {
    public final /* synthetic */ o3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(o3 o3Var, z0 z0Var) {
        super(z0Var);
        this.e = o3Var;
    }

    @Override // com.google.android.gms.measurement.internal.f
    @WorkerThread
    public final void c() {
        o3 o3Var = this.e;
        o3Var.d.zzg();
        o3Var.d(false, false, o3Var.d.zzs.zzav().elapsedRealtime());
        o3Var.d.zzs.zzd().zzf(o3Var.d.zzs.zzav().elapsedRealtime());
    }
}
