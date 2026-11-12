package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgk extends zzmb implements zznn {
    public /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzu);
    }

    public final int zza() {
        return ((zzgl) this.zza).zzf();
    }

    public final zzgj zzb(int i14) {
        return ((zzgl) this.zza).zzg(i14);
    }

    public final zzgk zzc(int i14, zzgi zzgiVar) {
        zzaX();
        ((zzgl) this.zza).zzt(i14, (zzgj) zzgiVar.zzbc());
        return this;
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzh());
    }

    public final zzgk zze() {
        zzaX();
        ((zzgl) this.zza).zzu();
        return this;
    }

    public final zzgk zzf() {
        zzaX();
        ((zzgl) this.zza).zzv();
        return this;
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzk());
    }

    public final String zzh() {
        return ((zzgl) this.zza).zzm();
    }

    private zzgk() {
        throw null;
    }
}
