package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
abstract class v extends m {
    private boolean a;

    public v(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzs.d();
    }

    public final boolean a() {
        return this.a;
    }

    public final void zza() {
        if (!a()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzs.b();
        this.a = true;
    }

    public final void zzc() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzs.b();
        this.a = true;
    }

    @WorkerThread
    public void zzd() {
    }

    public abstract boolean zzf();
}
