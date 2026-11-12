package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements zzo {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzfm b;

    public a0(zzfm zzfmVar, String str) {
        this.b = zzfmVar;
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.b.b.get(this.a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
