package com.google.android.play.agesignals;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzg extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zzj zzjVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzjVar);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i14, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (i14 == 1) {
            taskCompletionSource.trySetResult(zzj.zze(1));
        } else {
            taskCompletionSource.trySetResult(zzj.zze(2));
        }
    }
}
