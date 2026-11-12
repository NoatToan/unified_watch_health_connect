package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaw {
    public final List<zzbl> a = new ArrayList();

    public final zzap a(String str) {
        if (!this.a.contains(zzh.zze(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        String strValueOf = String.valueOf(str);
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Command not implemented: ".concat(strValueOf) : new String("Command not implemented: "));
    }

    public abstract zzap zza(String str, zzg zzgVar, List<zzap> list);
}
