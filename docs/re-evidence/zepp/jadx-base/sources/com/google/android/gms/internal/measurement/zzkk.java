package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class zzkk {
    private static final zzjj b = zzjj.zza();
    private volatile zzix a;
    public volatile zzlc zza;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkkVar = (zzkk) obj;
        zzlc zzlcVar = this.zza;
        zzlc zzlcVar2 = zzkkVar.zza;
        if (zzlcVar == null && zzlcVar2 == null) {
            return zzb().equals(zzkkVar.zzb());
        }
        if (zzlcVar != null && zzlcVar2 != null) {
            return zzlcVar.equals(zzlcVar2);
        }
        if (zzlcVar != null) {
            zzkkVar.zzc(zzlcVar.zzbL());
            return zzlcVar.equals(zzkkVar.zza);
        }
        zzc(zzlcVar2.zzbL());
        return this.zza.equals(zzlcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.a != null) {
            return ((o2) this.a).d.length;
        }
        if (this.zza != null) {
            return this.zza.zzbt();
        }
        return 0;
    }

    public final zzix zzb() {
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a != null) {
                return this.a;
            }
            if (this.zza == null) {
                this.a = zzix.zzb;
            } else {
                this.a = this.zza.zzbp();
            }
            return this.a;
        }
    }

    public final void zzc(zzlc zzlcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzlcVar;
                    this.a = zzix.zzb;
                } catch (zzkh unused) {
                    this.zza = zzlcVar;
                    this.a = zzix.zzb;
                }
            }
        }
    }
}
