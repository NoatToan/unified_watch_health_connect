package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzw extends zzx {
    private final TaskCompletionSource<Boolean> zzes;

    public zzw(TaskCompletionSource<Boolean> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i14, boolean z14, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i14), Boolean.valueOf(z14), this.zzes);
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(Status status, boolean z14, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z14), this.zzes);
    }
}
