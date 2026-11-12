package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class y2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzab c;
    public final /* synthetic */ zzab d;
    public final /* synthetic */ zzjo e;

    public y2(zzjo zzjoVar, boolean z, zzp zzpVar, boolean z2, zzab zzabVar, zzab zzabVar2) {
        this.e = zzjoVar;
        this.a = zzpVar;
        this.b = z2;
        this.c = zzabVar;
        this.d = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.e.c;
        if (zzebVar == null) {
            this.e.zzs.zzay().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.e.b(zzebVar, this.b ? null : this.c, this.a);
        this.e.g();
    }
}
