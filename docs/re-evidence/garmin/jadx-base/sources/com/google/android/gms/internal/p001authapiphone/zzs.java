package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzs extends IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzs(zzl zzlVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        int statusCode = status.getStatusCode();
        TaskCompletionSource taskCompletionSource = this.zza;
        if (statusCode == 6) {
            taskCompletionSource.trySetException(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, taskCompletionSource);
        }
    }
}
