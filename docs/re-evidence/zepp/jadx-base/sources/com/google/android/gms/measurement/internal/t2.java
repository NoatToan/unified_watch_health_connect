package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class t2 implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ AppMeasurementDynamiteService e;

    public t2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = zzcfVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.zzt().zzy(this.a, this.b, this.c, this.d);
    }
}
