package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey<L> zajk;

    @KeepForSdk
    public UnregisterListenerMethod(ListenerHolder.ListenerKey<L> listenerKey) {
        this.zajk = listenerKey;
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajk;
    }

    @KeepForSdk
    public abstract void unregisterListener(A a2, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
