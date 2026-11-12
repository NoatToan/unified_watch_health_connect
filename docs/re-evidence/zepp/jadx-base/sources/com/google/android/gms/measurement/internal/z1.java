package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class z1 implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf a;
    public final /* synthetic */ zzat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public z1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, zzat zzatVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = zzcfVar;
        this.b = zzatVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.zzt().zzB(this.a, this.b, this.c);
    }
}
