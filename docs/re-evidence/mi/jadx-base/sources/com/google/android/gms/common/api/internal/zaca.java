package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
final class zaca extends RegisterListenerMethod {
    private final /* synthetic */ RegistrationMethods.Builder zakg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaca(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        super(listenerHolder, featureArr, z);
        this.zakg = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zakg.zaka.accept(anyClient, taskCompletionSource);
    }
}
