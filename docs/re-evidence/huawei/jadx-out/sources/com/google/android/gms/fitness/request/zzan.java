package com.google.android.gms.fitness.request;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class zzan {
    private static final zzan zzhp = new zzan();
    private final Map<ListenerHolder.ListenerKey<OnDataPointListener>, zzal> zzhq = new HashMap();

    private zzan() {
    }

    public static zzan zzw() {
        return zzhp;
    }

    public final zzal zzc(ListenerHolder<OnDataPointListener> listenerHolder) {
        zzal zzalVar;
        synchronized (this.zzhq) {
            zzalVar = this.zzhq.get(listenerHolder.getListenerKey());
            if (zzalVar == null) {
                zzalVar = new zzal(listenerHolder, null);
                this.zzhq.put(listenerHolder.getListenerKey(), zzalVar);
            }
        }
        return zzalVar;
    }

    public final zzal zza(OnDataPointListener onDataPointListener, Looper looper) {
        return zzc(zzc(onDataPointListener, looper));
    }

    public final zzal zzd(ListenerHolder<OnDataPointListener> listenerHolder) {
        zzal zzalVarRemove;
        synchronized (this.zzhq) {
            zzalVarRemove = this.zzhq.remove(listenerHolder.getListenerKey());
            if (zzalVarRemove != null) {
                zzalVarRemove.release();
            }
        }
        return zzalVarRemove;
    }

    public final zzal zzb(OnDataPointListener onDataPointListener, Looper looper) {
        return zzd(zzc(onDataPointListener, looper));
    }

    private static ListenerHolder<OnDataPointListener> zzc(OnDataPointListener onDataPointListener, Looper looper) {
        return ListenerHolders.createListenerHolder(onDataPointListener, looper, "OnDataPointListener");
    }
}
