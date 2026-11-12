package com.google.android.gms.internal.p002authapiphone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzm extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> zzf;

    private zzm() {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zzf = taskCompletionSource;
        zza((zze) ((zzi) anyClient).getService());
    }

    public abstract void zza(zze zzeVar) throws RemoteException;

    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzf);
    }

    public /* synthetic */ zzm(zzk zzkVar) {
        this();
    }
}
