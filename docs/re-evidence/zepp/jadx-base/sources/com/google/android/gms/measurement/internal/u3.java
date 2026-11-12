package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class u3 implements Runnable {
    public final /* synthetic */ zzkt a;
    public final /* synthetic */ zzks b;

    public u3(zzks zzksVar, zzkt zzktVar) {
        this.b = zzksVar;
        this.a = zzktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks.R(this.b, this.a);
        this.b.zzQ();
    }
}
