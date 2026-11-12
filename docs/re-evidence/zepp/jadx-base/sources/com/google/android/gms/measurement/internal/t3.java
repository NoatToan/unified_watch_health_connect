package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class t3 extends s3 {
    private boolean a;

    public t3(zzks zzksVar) {
        super(zzksVar);
        this.zzf.l();
    }

    public final boolean a() {
        return this.a;
    }

    public final void zzY() {
        if (!a()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzZ() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.g();
        this.a = true;
    }

    public abstract boolean zzb();
}
