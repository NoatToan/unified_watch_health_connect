package com.google.android.gms.fitness.request;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.fitness.data.BleDevice;

/* JADX INFO: loaded from: classes3.dex */
final class h implements ListenerHolder.Notifier<BleScanCallback> {
    private final /* synthetic */ BleDevice a;

    public h(zza zzaVar, BleDevice bleDevice) {
        this.a = bleDevice;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(BleScanCallback bleScanCallback) {
        bleScanCallback.onDeviceFound(this.a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
