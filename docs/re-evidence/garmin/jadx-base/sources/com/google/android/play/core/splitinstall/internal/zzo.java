package com.google.android.play.core.splitinstall.internal;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzo extends zzp {
    private final int zza;
    private final long zzb;

    public zzo(int i14, long j8) {
        this.zza = i14;
        this.zzb = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.zza == zzpVar.zza() && this.zzb == zzpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.zza ^ 1000003;
        long j8 = this.zzb;
        return (i14 * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.zza + ", eventTimestamp=" + this.zzb + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.zzb;
    }
}
