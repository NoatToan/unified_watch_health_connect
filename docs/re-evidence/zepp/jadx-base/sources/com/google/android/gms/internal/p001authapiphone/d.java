package com.google.android.gms.internal.p001authapiphone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
abstract class d extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> d;

    private d() {
    }

    public /* synthetic */ d(b bVar) {
        this();
    }

    public abstract void a(zze zzeVar) throws RemoteException;

    public final void b(Status status) {
        TaskUtil.setResultOrApiException(status, this.d);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.d = taskCompletionSource;
        a((zze) ((zzi) anyClient).getService());
    }
}
