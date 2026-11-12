package com.google.android.gms.common;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzv {
    private String zza = null;
    private Boolean zzb = null;
    private Boolean zzc = null;

    private zzv() {
    }

    public final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzv zzb(boolean z14) {
        this.zzb = Boolean.valueOf(z14);
        return this;
    }

    public final zzv zzc(boolean z14) {
        this.zzc = Boolean.valueOf(z14);
        return this;
    }

    public final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            h.z("allowTestKeys must be set");
            return null;
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        h.z("isGoogleOrPlatformOnly must be set");
        return null;
    }

    public /* synthetic */ zzv(byte[] bArr) {
    }
}
