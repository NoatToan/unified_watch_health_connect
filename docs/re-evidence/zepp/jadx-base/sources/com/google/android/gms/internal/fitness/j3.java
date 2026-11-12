package com.google.android.gms.internal.fitness;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class j3 implements h3 {
    @Override // com.google.android.gms.internal.fitness.h3
    public final g3<?, ?> a(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.h3
    public final int b(int i, Object obj, Object obj2) {
        zzie zzieVar = (zzie) obj;
        if (zzieVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzieVar.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.h3
    public final Object c(Object obj, Object obj2) {
        zzie zzieVarZzcn = (zzie) obj;
        zzie zzieVar = (zzie) obj2;
        if (!zzieVar.isEmpty()) {
            if (!zzieVarZzcn.isMutable()) {
                zzieVarZzcn = zzieVarZzcn.zzcn();
            }
            zzieVarZzcn.zza(zzieVar);
        }
        return zzieVarZzcn;
    }

    @Override // com.google.android.gms.internal.fitness.h3
    public final Object d(Object obj) {
        ((zzie) obj).zzar();
        return obj;
    }

    @Override // com.google.android.gms.internal.fitness.h3
    public final Map<?, ?> e(Object obj) {
        return (zzie) obj;
    }
}
