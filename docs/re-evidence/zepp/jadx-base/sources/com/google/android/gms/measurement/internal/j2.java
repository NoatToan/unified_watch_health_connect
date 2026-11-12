package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class j2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzkv c;
    public final /* synthetic */ zzjo d;

    public j2(zzjo zzjoVar, zzp zzpVar, boolean z, zzkv zzkvVar) {
        this.d = zzjoVar;
        this.a = zzpVar;
        this.b = z;
        this.c = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.d.c;
        if (zzebVar == null) {
            this.d.zzs.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.d.b(zzebVar, this.b ? null : this.c, this.a);
        this.d.g();
    }
}
