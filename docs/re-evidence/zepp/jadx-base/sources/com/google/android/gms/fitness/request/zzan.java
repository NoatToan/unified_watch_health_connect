package com.google.android.gms.fitness.request;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzan {
    private static final zzan b = new zzan();
    private final Map<ListenerHolder.ListenerKey<OnDataPointListener>, zzam> a = new HashMap();

    private zzan() {
    }

    private static ListenerHolder<OnDataPointListener> a(OnDataPointListener onDataPointListener, Looper looper) {
        return ListenerHolders.createListenerHolder(onDataPointListener, looper, OnDataPointListener.class.getSimpleName());
    }

    public static zzan zzx() {
        return b;
    }

    public final zzam zza(OnDataPointListener onDataPointListener, Looper looper) {
        return zzc(a(onDataPointListener, looper));
    }

    @Nullable
    public final zzam zzb(OnDataPointListener onDataPointListener, Looper looper) {
        return zzd(a(onDataPointListener, looper));
    }

    public final zzam zzc(ListenerHolder<OnDataPointListener> listenerHolder) {
        zzam zzamVar;
        synchronized (this.a) {
            ListenerHolder.ListenerKey<OnDataPointListener> listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(listenerHolder.getListenerKey(), "Key must not be null");
            zzamVar = this.a.get(listenerKey);
            if (zzamVar == null) {
                zzamVar = new zzam(listenerHolder, null);
                this.a.put(listenerKey, zzamVar);
            }
        }
        return zzamVar;
    }

    @Nullable
    public final zzam zzd(ListenerHolder<OnDataPointListener> listenerHolder) {
        synchronized (this.a) {
            ListenerHolder.ListenerKey<OnDataPointListener> listenerKey = listenerHolder.getListenerKey();
            if (listenerKey == null) {
                return null;
            }
            zzam zzamVarRemove = this.a.remove(listenerKey);
            if (zzamVarRemove != null) {
                zzamVarRemove.release();
            }
            return zzamVarRemove;
        }
    }
}
