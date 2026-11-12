package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Runnable {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ f b;

    public e(f fVar, z0 z0Var) {
        this.b = fVar;
        this.a = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.zzaw();
        if (zzaa.zza()) {
            this.a.zzaz().zzp(this);
            return;
        }
        boolean zE = this.b.e();
        this.b.c = 0L;
        if (zE) {
            this.b.c();
        }
    }
}
