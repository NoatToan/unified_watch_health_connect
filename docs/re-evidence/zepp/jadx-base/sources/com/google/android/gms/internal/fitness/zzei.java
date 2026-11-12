package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zzei extends zzcm {
    private final BaseImplementation.ResultHolder<Status> b;

    public zzei(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.b = resultHolder;
    }

    public static zzei zza(TaskCompletionSource<Void> taskCompletionSource) {
        return new zzei(new l1(taskCompletionSource));
    }

    public static zzei zzb(TaskCompletionSource<Boolean> taskCompletionSource) {
        return new zzei(new k1(taskCompletionSource));
    }

    @Override // com.google.android.gms.internal.fitness.zzcn
    public final void onResult(Status status) {
        this.b.setResult(status);
    }
}
