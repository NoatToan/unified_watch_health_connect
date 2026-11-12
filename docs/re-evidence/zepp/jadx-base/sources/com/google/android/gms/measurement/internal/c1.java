package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class c1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zzia b;

    public c1(zzia zziaVar, boolean z) {
        this.b = zziaVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.b.zzs.zzJ();
        boolean zZzI = this.b.zzs.zzI();
        this.b.zzs.e(this.a);
        if (zZzI == this.a) {
            this.b.zzs.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.zzs.zzJ() == zZzJ || this.b.zzs.zzJ() != this.b.zzs.zzI()) {
            this.b.zzs.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(zZzJ));
        }
        this.b.m();
    }
}
