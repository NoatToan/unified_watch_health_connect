package com.google.android.play.agesignals;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj {
    private static final com.google.android.gms.internal.playcore_age_signals.zzd zzb = new com.google.android.gms.internal.playcore_age_signals.zzd("AgeSignalsService");
    final com.google.android.gms.internal.playcore_age_signals.zzo zza;
    private final Handler zzc = new Handler(Looper.getMainLooper());
    private final Context zzd;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.play.agesignals.zzd] */
    public zzj(Context context) {
        this.zzd = context;
        if (com.google.android.gms.internal.playcore_age_signals.zzr.zza(context)) {
            this.zza = new com.google.android.gms.internal.playcore_age_signals.zzo(context, zzb, "AgeSignalsService", zza.zza, new Object() { // from class: com.google.android.play.agesignals.zzd
            }, null);
        } else {
            this.zza = null;
        }
    }

    public static /* bridge */ /* synthetic */ AgeSignalsAccessResult zze(int i14) {
        AgeSignalsAccessResult.Builder builder = AgeSignalsAccessResult.builder();
        builder.setAgeSignalsStatus(Integer.valueOf(i14));
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ void zzg(zzj zzjVar, PendingIntent pendingIntent, Activity activity, TaskCompletionSource taskCompletionSource) {
        Intent intent = new Intent(activity, (Class<?>) AgeSharingConsentWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.putExtra("result_receiver", new zzg(zzjVar, zzjVar.zzc, taskCompletionSource));
        activity.startActivity(intent);
    }

    private static Task zzh(int i14) {
        zzb.zza("onError(%d)", Integer.valueOf(i14));
        return Tasks.forException(new AgeSignalsException(i14));
    }

    private final boolean zzi() {
        try {
            return ((long) this.zzd.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode) >= 85222500;
        } catch (PackageManager.NameNotFoundException e4) {
            zzb.zzb(e4, "Phonesky not found.", new Object[0]);
            return false;
        }
    }

    public final Task zzc(AgeSignalsRequest ageSignalsRequest) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        if (zzoVar == null) {
            return zzh(-2);
        }
        if (!zzi()) {
            return zzh(-6);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzoVar.zzt(new zze(this, taskCompletionSource, taskCompletionSource, ageSignalsRequest), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzd(AgeSignalsAccessRequest ageSignalsAccessRequest) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        if (zzoVar == null) {
            return zzh(-2);
        }
        if (!zzi()) {
            return zzh(-6);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzoVar.zzt(new zzf(this, taskCompletionSource, taskCompletionSource, ageSignalsAccessRequest), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
