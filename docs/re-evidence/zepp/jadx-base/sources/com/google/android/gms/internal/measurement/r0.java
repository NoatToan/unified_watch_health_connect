package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
abstract class r0 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ zzee d;

    public r0(zzee zzeeVar, boolean z) {
        this.d = zzeeVar;
        this.a = zzeeVar.zza.currentTimeMillis();
        this.b = zzeeVar.zza.elapsedRealtime();
        this.c = z;
    }

    public abstract void a() throws RemoteException;

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.d.c(e, false, this.c);
            b();
        }
    }
}
