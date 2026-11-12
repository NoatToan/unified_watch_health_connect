package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzju<T extends Context & zzjt> {
    private final T a;

    public zzju(T t) {
        Preconditions.checkNotNull(t);
        this.a = t;
    }

    private final zzel c() {
        return zzfv.zzp(this.a, null, null).zzay();
    }

    public final /* synthetic */ void a(int i, zzel zzelVar, Intent intent) {
        if (this.a.zzc(i)) {
            zzelVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().zzj().zza("Completed wakeful intent.");
            this.a.zza(intent);
        }
    }

    public final /* synthetic */ void b(zzel zzelVar, JobParameters jobParameters) {
        zzelVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        this.a.zzb(jobParameters, false);
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        zzfv zzfvVarZzp = zzfv.zzp(this.a, null, null);
        final zzel zzelVarZzay = zzfvVarZzp.zzay();
        if (intent == null) {
            zzelVarZzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfvVarZzp.zzaw();
        zzelVarZzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(i2, zzelVarZzay, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            c().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgn(zzks.zzt(this.a), null);
        }
        c().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final void zze() {
        zzfv zzfvVarZzp = zzfv.zzp(this.a, null, null);
        zzel zzelVarZzay = zzfvVarZzp.zzay();
        zzfvVarZzp.zzaw();
        zzelVarZzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfv zzfvVarZzp = zzfv.zzp(this.a, null, null);
        zzel zzelVarZzay = zzfvVarZzp.zzay();
        zzfvVarZzp.zzaw();
        zzelVarZzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            c().zzd().zza("onRebind called with null intent");
        } else {
            c().zzj().zzb("onRebind called. action", intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzks zzksVarZzt = zzks.zzt(this.a);
        zzksVarZzt.zzaz().zzp(new h3(this, zzksVarZzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzfv zzfvVarZzp = zzfv.zzp(this.a, null, null);
        final zzel zzelVarZzay = zzfvVarZzp.zzay();
        String string = jobParameters.getExtras().getString("action");
        zzfvVarZzp.zzaw();
        zzelVarZzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(zzelVarZzay, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            c().zzd().zza("onUnbind called with null intent");
            return true;
        }
        c().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
