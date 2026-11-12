package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    @KeepForSdk
    public abstract V create(K k14);

    @KeepForSdk
    public V get(K k14) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k14)) {
                    return (V) this.zza.get(k14);
                }
                V vCreate = create(k14);
                this.zza.put(k14, vCreate);
                return vCreate;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
