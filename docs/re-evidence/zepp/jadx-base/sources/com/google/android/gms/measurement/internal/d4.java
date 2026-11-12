package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class d4 implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public d4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = zzcfVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.zzt().zzv(this.a, this.b, this.c);
    }
}
