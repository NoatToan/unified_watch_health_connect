package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkg extends t3 {
    private final AlarmManager b;
    private f c;
    private Integer d;

    public zzkg(zzks zzksVar) {
        super(zzksVar);
        this.b = (AlarmManager) this.zzs.zzau().getSystemService("alarm");
    }

    private final int b() {
        if (this.d == null) {
            String strValueOf = String.valueOf(this.zzs.zzau().getPackageName());
            this.d = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.d.intValue();
    }

    private final PendingIntent c() {
        Context contextZzau = this.zzs.zzau();
        return com.google.android.gms.internal.measurement.zzbs.zza(contextZzau, 0, new Intent().setClassName(contextZzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final f d() {
        if (this.c == null) {
            this.c = new r3(this, this.zzf.O());
        }
        return this.c;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(b());
        }
    }

    public final void zza() {
        zzY();
        this.zzs.zzay().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.b;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        d().b();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // com.google.android.gms.measurement.internal.t3
    public final boolean zzb() {
        AlarmManager alarmManager = this.b;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzj();
        return false;
    }

    public final void zzd(long j) {
        zzY();
        this.zzs.zzaw();
        Context contextZzau = this.zzs.zzau();
        if (!zzkz.z(contextZzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzkz.A(contextZzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime() + j;
        this.zzs.zzf();
        if (j < Math.max(0L, zzdy.zzw.zza(null).longValue()) && !d().e()) {
            d().d(j);
        }
        this.zzs.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.b;
            if (alarmManager != null) {
                this.zzs.zzf();
                alarmManager.setInexactRepeating(2, jElapsedRealtime, Math.max(zzdy.zzr.zza(null).longValue(), j), c());
                return;
            }
            return;
        }
        Context contextZzau2 = this.zzs.zzau();
        ComponentName componentName = new ComponentName(contextZzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iB = b();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(contextZzau2, new JobInfo.Builder(iB, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
