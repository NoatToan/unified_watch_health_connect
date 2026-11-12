package com.google.android.play.agesignals;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzi extends IAgeSignalsServiceCallback.Stub {
    final com.google.android.gms.internal.playcore_age_signals.zzd zza;
    final TaskCompletionSource zzb;
    final /* synthetic */ zzj zzc;

    public zzi(zzj zzjVar, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(zzjVar);
        this.zzc = zzjVar;
        this.zza = new com.google.android.gms.internal.playcore_age_signals.zzd("OnCheckAgeSignalsCallback");
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
    public final void onCompleteCheckAgeSignals(Bundle bundle) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzc.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        this.zza.zzc("onCompleteCheckAgeSignals", new Object[0]);
        taskCompletionSource.trySetResult(AgeSignalsResult.zza(bundle));
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
    public final void onError(Bundle bundle) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzc.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        int i14 = bundle.getInt("error.code");
        this.zza.zza("onError(%d)", Integer.valueOf(i14));
        taskCompletionSource.trySetException(new AgeSignalsException(i14));
    }
}
