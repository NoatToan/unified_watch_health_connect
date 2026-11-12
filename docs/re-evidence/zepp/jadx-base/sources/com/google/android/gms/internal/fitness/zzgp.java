package com.google.android.gms.internal.fitness;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzgp {
    private static volatile boolean b = false;
    private static boolean c = true;
    private static volatile zzgp d;
    private static final zzgp e = new zzgp(true);
    private final Map<Object, Object> a;

    public zzgp() {
        this.a = new HashMap();
    }

    public static zzgp zzbf() {
        zzgp zzgpVar = d;
        if (zzgpVar == null) {
            synchronized (zzgp.class) {
                zzgpVar = d;
                if (zzgpVar == null) {
                    zzgpVar = e;
                    d = zzgpVar;
                }
            }
        }
        return zzgpVar;
    }

    private zzgp(boolean z) {
        this.a = Collections.emptyMap();
    }
}
