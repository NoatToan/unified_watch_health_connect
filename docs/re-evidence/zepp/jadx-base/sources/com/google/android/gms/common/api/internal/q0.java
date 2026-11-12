package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Add missing generic type declarations: [A, ResultT] */
/* JADX INFO: loaded from: classes3.dex */
final class q0<A, ResultT> extends TaskApiCall<A, ResultT> {
    private final /* synthetic */ TaskApiCall.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = builder;
    }

    /* JADX WARN: Incorrect types in method signature: (TA;Lcom/google/android/gms/tasks/TaskCompletionSource<TResultT;>;)V */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.d.a.accept(anyClient, taskCompletionSource);
    }
}
