package com.google.android.gms.fitness.request;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zze {
    private static final zze b = new zze();
    private final Map<ListenerHolder.ListenerKey<BleScanCallback>, zza> a = new HashMap();

    private zze() {
    }

    private static ListenerHolder<BleScanCallback> a(BleScanCallback bleScanCallback, Looper looper) {
        return ListenerHolders.createListenerHolder(bleScanCallback, looper, BleScanCallback.class.getSimpleName());
    }

    public static zze zzu() {
        return b;
    }

    public final zza zza(BleScanCallback bleScanCallback, Looper looper) {
        return zza(a(bleScanCallback, looper));
    }

    @Nullable
    public final zza zzb(BleScanCallback bleScanCallback, Looper looper) {
        return zzb(a(bleScanCallback, looper));
    }

    public final zza zza(ListenerHolder<BleScanCallback> listenerHolder) {
        zza zzaVar;
        synchronized (this.a) {
            ListenerHolder.ListenerKey<BleScanCallback> listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(listenerHolder.getListenerKey(), "Key must not be null");
            zzaVar = this.a.get(listenerKey);
            if (zzaVar == null) {
                zzaVar = new zza(listenerHolder, null);
                this.a.put(listenerKey, zzaVar);
            }
        }
        return zzaVar;
    }

    @Nullable
    public final zza zzb(ListenerHolder<BleScanCallback> listenerHolder) {
        synchronized (this.a) {
            ListenerHolder.ListenerKey<BleScanCallback> listenerKey = listenerHolder.getListenerKey();
            if (listenerKey == null) {
                return null;
            }
            zza zzaVar = this.a.get(listenerKey);
            if (zzaVar != null) {
                zzaVar.release();
            }
            return zzaVar;
        }
    }
}
