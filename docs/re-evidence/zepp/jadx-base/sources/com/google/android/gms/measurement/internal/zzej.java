package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzej {
    private final int a;
    private final boolean b;
    private final boolean c;
    public final /* synthetic */ zzel d;

    public zzej(zzel zzelVar, int i, boolean z, boolean z2) {
        this.d = zzelVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void zza(String str) {
        this.d.zzt(this.a, this.b, this.c, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.d.zzt(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.d.zzt(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.d.zzt(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
