package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq {
    private final String zza;
    private final zzo zzb;
    private zzo zzc;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        zzo zzoVar = new zzo();
        this.zzb = zzoVar;
        this.zzc = zzoVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(32);
        sb3.append(this.zza);
        sb3.append(CoreConstants.CURLY_LEFT);
        zzo zzoVar = this.zzb.zzc;
        String str = "";
        while (zzoVar != null) {
            Object obj = zzoVar.zzb;
            sb3.append(str);
            String str2 = zzoVar.zza;
            if (str2 != null) {
                sb3.append(str2);
                sb3.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb3.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb3.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzoVar = zzoVar.zzc;
            str = ", ";
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public final zzq zza(String str, Object obj) {
        zzo zzoVar = new zzo();
        this.zzc.zzc = zzoVar;
        this.zzc = zzoVar;
        zzoVar.zzb = obj;
        zzoVar.zza = str;
        return this;
    }

    public final zzq zzb(String str, boolean z14) {
        String strValueOf = String.valueOf(z14);
        zzn zznVar = new zzn(null);
        this.zzc.zzc = zznVar;
        this.zzc = zznVar;
        zznVar.zzb = strValueOf;
        zznVar.zza = "isManifestFile";
        return this;
    }
}
