package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class l extends q {
    public final /* synthetic */ ListenerHolder b;
    public final /* synthetic */ FusedLocationProviderClient c;

    public l(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.c = fusedLocationProviderClient;
        this.b = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        com.google.android.gms.internal.location.zzaz zzazVar2 = zzazVar;
        TaskCompletionSource<Boolean> taskCompletionSource2 = taskCompletionSource;
        if (a()) {
            m mVar = new m(this.c, taskCompletionSource2);
            try {
                ListenerHolder.ListenerKey<LocationCallback> listenerKey = this.b.getListenerKey();
                if (listenerKey != null) {
                    zzazVar2.zzH(listenerKey, mVar);
                }
            } catch (RuntimeException e) {
                taskCompletionSource2.trySetException(e);
            }
        }
    }
}
