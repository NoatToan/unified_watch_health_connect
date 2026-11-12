package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
final class zacb extends UnregisterListenerMethod {
    private final /* synthetic */ RegistrationMethods.Builder zakg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacb(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zakg = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zakg.zakb.accept(anyClient, taskCompletionSource);
    }
}
