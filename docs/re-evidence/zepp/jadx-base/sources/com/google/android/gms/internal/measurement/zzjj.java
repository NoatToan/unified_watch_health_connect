package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjj {
    private static volatile boolean b = false;
    private static volatile zzjj c;
    private static volatile zzjj d;
    public static final zzjj e = new zzjj(true);
    private final Map<w2, zzjv<?, ?>> a;

    public zzjj() {
        this.a = new HashMap();
    }

    public static zzjj zza() {
        zzjj zzjjVar = c;
        if (zzjjVar == null) {
            synchronized (zzjj.class) {
                zzjjVar = c;
                if (zzjjVar == null) {
                    zzjjVar = e;
                    c = zzjjVar;
                }
            }
        }
        return zzjjVar;
    }

    public static zzjj zzb() {
        zzjj zzjjVar = d;
        if (zzjjVar != null) {
            return zzjjVar;
        }
        synchronized (zzjj.class) {
            zzjj zzjjVar2 = d;
            if (zzjjVar2 != null) {
                return zzjjVar2;
            }
            zzjj zzjjVarB = c3.b(zzjj.class);
            d = zzjjVarB;
            return zzjjVarB;
        }
    }

    public final <ContainingType extends zzlc> zzjv<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzjv) this.a.get(new w2(containingtype, i));
    }

    public zzjj(boolean z) {
        this.a = Collections.emptyMap();
    }
}
