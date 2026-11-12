package com.google.android.gms.fitness.request;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.fitness.data.DataPoint;

/* JADX INFO: loaded from: classes3.dex */
final class b implements ListenerHolder.Notifier<OnDataPointListener> {
    private final /* synthetic */ DataPoint a;

    public b(zzam zzamVar, DataPoint dataPoint) {
        this.a = dataPoint;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(OnDataPointListener onDataPointListener) {
        onDataPointListener.onDataPoint(this.a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
