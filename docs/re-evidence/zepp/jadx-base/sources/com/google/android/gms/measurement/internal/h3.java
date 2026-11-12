package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class h3 implements Runnable {
    public final /* synthetic */ zzks a;
    public final /* synthetic */ Runnable b;

    public h3(zzju zzjuVar, zzks zzksVar, Runnable runnable) {
        this.a = zzksVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        this.a.S(this.b);
        this.a.u();
    }
}
