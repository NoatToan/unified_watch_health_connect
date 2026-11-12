package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class x2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzat c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzjo e;

    public x2(zzjo zzjoVar, boolean z, zzp zzpVar, boolean z2, zzat zzatVar, String str) {
        this.e = zzjoVar;
        this.a = zzpVar;
        this.b = z2;
        this.c = zzatVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.e.c;
        if (zzebVar == null) {
            this.e.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.a);
        this.e.b(zzebVar, this.b ? null : this.c, this.a);
        this.e.g();
    }
}
