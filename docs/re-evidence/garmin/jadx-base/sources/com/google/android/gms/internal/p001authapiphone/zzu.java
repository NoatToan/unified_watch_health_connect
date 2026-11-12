package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzu extends zzi {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzl zzlVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzf
    public final void zza(Status status, boolean z14) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z14), this.zza);
    }
}
