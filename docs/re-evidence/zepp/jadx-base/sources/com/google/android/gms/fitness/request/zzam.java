package com.google.android.gms.fitness.request;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzu;

/* JADX INFO: loaded from: classes3.dex */
public final class zzam extends zzu {
    private final ListenerHolder<OnDataPointListener> b;

    private zzam(ListenerHolder<OnDataPointListener> listenerHolder) {
        this.b = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final void release() {
        this.b.clear();
    }

    @Override // com.google.android.gms.fitness.data.zzv
    public final void zzc(DataPoint dataPoint) {
        this.b.notifyListener(new b(this, dataPoint));
    }

    public /* synthetic */ zzam(ListenerHolder listenerHolder, b bVar) {
        this(listenerHolder);
    }
}
