package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p1.k1;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjt {
    private final k1 zza;

    public zzjt(k1 k1Var) {
        this.zza = k1Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        k1 k1Var = uri != null ? (k1) this.zza.get(uri.toString()) : null;
        if (k1Var == null) {
            return null;
        }
        return (String) k1Var.get("".concat(str3));
    }
}
