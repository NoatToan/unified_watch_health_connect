package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zznt {
    private final Context zza;

    public zznt(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    public static final void zzi(Intent intent) {
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    public static final boolean zzj(Intent intent) {
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    private final void zzk(zzpg zzpgVar, Runnable runnable) {
        zzpgVar.zzaW().zzj(new zzno(this, zzpgVar, runnable));
    }

    public final void zza() {
        this.zza.getClass().getSimpleName().concat(" is starting up.");
    }

    public final void zzb() {
        this.zza.getClass().getSimpleName().concat(" is shutting down.");
    }

    public final int zzc(final Intent intent, int i14, final int i15) {
        if (intent == null) {
            return 2;
        }
        Context context = this.zza;
        zzic zzicVarZzy = zzic.zzy(context, null, null);
        final zzgu zzguVarZzaV = zzicVarZzy.zzaV();
        String action = intent.getAction();
        zzicVarZzy.zzaU();
        zzguVarZzaV.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i15), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(zzpg.zza(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzns
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(i15, zzguVarZzaV, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzd(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(zzpg.zza(this.zza), null);
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    @TargetApi(24)
    public final boolean zze(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) Preconditions.checkNotNull(string);
            zzpg zzpgVarZza = zzpg.zza(this.zza);
            final zzgu zzguVarZzaV = zzpgVarZza.zzaV();
            zzpgVarZza.zzaU();
            zzguVarZzaV.zzk().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zzpgVarZza, new Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzguVarZzaV, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzfb.zza(this.zza, null).zzw(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(int i14, zzgu zzguVar, Intent intent) {
        Context context = this.zza;
        zznp zznpVar = (zznp) context;
        if (zznpVar.zza(i14)) {
            zzguVar.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i14));
            zzic.zzy(context, null, null).zzaV().zzk().zza("Completed wakeful intent.");
            zznpVar.zzc(intent);
        }
    }

    public final /* synthetic */ void zzg(zzgu zzguVar, JobParameters jobParameters) {
        zzguVar.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((zznp) this.zza).zzb(jobParameters, false);
    }

    public final /* synthetic */ void zzh(JobParameters jobParameters) {
        ((zznp) this.zza).zzb(jobParameters, false);
    }
}
