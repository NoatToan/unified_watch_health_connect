package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class j implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzd b;

    public j(zzd zzdVar, long j) {
        this.b = zzdVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a);
    }
}
