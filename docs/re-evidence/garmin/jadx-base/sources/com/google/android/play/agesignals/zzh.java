package com.google.android.play.agesignals;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzh extends IAgeSignalsAccessCallback.Stub {
    final com.google.android.gms.internal.playcore_age_signals.zzd zza;
    final TaskCompletionSource zzb;
    final Activity zzc;
    final /* synthetic */ zzj zzd;

    public zzh(zzj zzjVar, TaskCompletionSource taskCompletionSource, Activity activity) {
        Objects.requireNonNull(zzjVar);
        this.zzd = zzjVar;
        this.zza = new com.google.android.gms.internal.playcore_age_signals.zzd("OnAgeSignalsAccessCallback");
        this.zzb = taskCompletionSource;
        this.zzc = activity;
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback
    public final void onCompleteRequestAgeSignalsAccess(Bundle bundle) {
        PendingIntent pendingIntent;
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar = this.zza;
        zzdVar.zzc("onCompleteRequestAgeSignalsAccess", new Object[0]);
        zzj zzjVar = this.zzd;
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = zzjVar.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        if (bundle.containsKey("age.sharing.consent.intent")) {
            pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("age.sharing.consent.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("age.sharing.consent.intent");
        } else {
            pendingIntent = null;
        }
        if (pendingIntent != null) {
            zzdVar.zzc("In-app age sharing consent", new Object[0]);
            zzj.zzg(zzjVar, pendingIntent, this.zzc, taskCompletionSource);
        } else {
            AgeSignalsAccessResult.Builder builder = AgeSignalsAccessResult.builder();
            builder.setAgeSignalsStatus(bundle.containsKey("age.signals.status") ? Integer.valueOf(bundle.getInt("age.signals.status")) : null);
            taskCompletionSource.trySetResult(builder.build());
        }
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback
    public final void onError(Bundle bundle) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzd.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        int i14 = bundle.getInt("error.code");
        this.zza.zza("onError(%d)", Integer.valueOf(i14));
        taskCompletionSource.trySetException(new AgeSignalsException(i14));
    }
}
