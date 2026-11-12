package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class e4 implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public e4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.zzv().zzO(this.a, this.b.a.zzI());
    }
}
