package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class y0 extends x0 {
    private boolean a;

    public y0(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzs.d();
    }

    public final boolean a() {
        return this.a;
    }

    public void zzaA() {
    }

    public abstract boolean zzf();

    public final void zzu() {
        if (!a()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzv() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzs.b();
        this.a = true;
    }

    public final void zzw() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaA();
        this.zzs.b();
        this.a = true;
    }
}
