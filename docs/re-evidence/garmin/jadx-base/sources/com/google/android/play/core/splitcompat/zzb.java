package com.google.android.play.core.splitcompat;

import j20.x;
import java.io.File;
import org.apache.commons.text.StringSubstitutor;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzb extends zzt {
    private final File zza;
    private final String zzb;

    public zzb(File file, String str) {
        if (file == null) {
            x.l("Null splitFile");
            throw null;
        }
        this.zza = file;
        if (str != null) {
            this.zzb = str;
        } else {
            x.l("Null splitId");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zztVar = (zzt) obj;
            if (this.zza.equals(zztVar.zza()) && this.zzb.equals(zztVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return e0.g("SplitFileInfo{splitFile=", this.zza.toString(), ", splitId=", this.zzb, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.play.core.splitcompat.zzt
    public final File zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitcompat.zzt
    public final String zzb() {
        return this.zzb;
    }
}
