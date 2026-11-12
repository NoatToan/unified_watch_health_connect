package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzdx<V> {
    private static final Object h = new Object();
    private final String a;
    private final k<V> b;
    private final V c;
    private final V d;
    private final Object e = new Object();

    @GuardedBy("overrideLock")
    private volatile V f = null;

    @GuardedBy("cachingLock")
    private volatile V g = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzdx(String str, Object obj, Object obj2, k kVar, zzdw zzdwVar) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = kVar;
    }

    public final V zza(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (l.a == null) {
            return this.c;
        }
        synchronized (h) {
            if (zzaa.zza()) {
                return this.g == null ? this.c : this.g;
            }
            try {
                for (zzdx zzdxVar : zzdy.a) {
                    if (zzaa.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vZza = null;
                    try {
                        k<V> kVar = zzdxVar.b;
                        if (kVar != null) {
                            vZza = kVar.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (h) {
                        zzdxVar.g = vZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            k<V> kVar2 = this.b;
            if (kVar2 == null) {
                return this.c;
            }
            try {
                return kVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }

    public final String zzb() {
        return this.a;
    }
}
