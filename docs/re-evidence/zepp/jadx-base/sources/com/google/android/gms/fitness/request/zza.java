package com.google.android.gms.fitness.request;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.BleDevice;

/* JADX INFO: loaded from: classes3.dex */
public final class zza extends zzag {
    private final ListenerHolder<BleScanCallback> b;

    private zza(ListenerHolder<BleScanCallback> listenerHolder) {
        this.b = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.fitness.request.zzad
    public final void onDeviceFound(BleDevice bleDevice) {
        this.b.notifyListener(new h(this, bleDevice));
    }

    @Override // com.google.android.gms.fitness.request.zzad
    public final void onScanStopped() {
        this.b.notifyListener(new f(this));
    }

    public final void release() {
        this.b.clear();
    }

    public /* synthetic */ zza(ListenerHolder listenerHolder, h hVar) {
        this(listenerHolder);
    }
}
