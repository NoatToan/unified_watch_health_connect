package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
final class zack extends TaskApiCall {
    private final /* synthetic */ TaskApiCall.Builder zakm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zack(TaskApiCall.Builder builder, Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zakm = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zakm.zakl.accept(anyClient, taskCompletionSource);
    }
}
