package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzr extends zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzr(zzl zzlVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zza(Status status, int i14) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i14), this.zza);
    }
}
