package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzay extends zzbb {
    public zzay(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzg(int i14, Bundle bundle) {
        super.zzg(i14, bundle);
        this.zza.trySetResult(SplitInstallSessionState.zzd(bundle));
    }
}
