package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj {
    public final Map<String, Callable<? extends zzai>> a = new HashMap();

    public final void zza(String str, Callable<? extends zzai> callable) {
        this.a.put(str, callable);
    }
}
