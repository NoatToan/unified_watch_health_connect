package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class m3 implements Runnable {
    public final /* synthetic */ f4 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public m3(AppMeasurementDynamiteService appMeasurementDynamiteService, f4 f4Var) {
        this.b = appMeasurementDynamiteService;
        this.a = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.zzq().zzU(this.a);
    }
}
