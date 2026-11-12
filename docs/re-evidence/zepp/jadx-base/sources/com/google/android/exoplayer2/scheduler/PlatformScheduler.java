package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class PlatformScheduler implements Scheduler {
    private static final String d = "PlatformScheduler";
    private static final String e = "service_action";
    private static final String f = "service_package";
    private static final String g = "requirements";
    private static final int h;
    private final int a;
    private final ComponentName b;
    private final JobScheduler c;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters params) {
            PersistableBundle extras = params.getExtras();
            int notMetRequirements = new Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
            if (notMetRequirements == 0) {
                String str = (String) Assertions.checkNotNull(extras.getString(PlatformScheduler.e));
                Util.startForegroundService(this, new Intent(str).setPackage((String) Assertions.checkNotNull(extras.getString(PlatformScheduler.f))));
                return false;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Requirements not met: ");
            sb.append(notMetRequirements);
            Log.w(PlatformScheduler.d, sb.toString());
            jobFinished(params, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters params) {
            return false;
        }
    }

    static {
        h = (Util.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int jobId) {
        Context applicationContext = context.getApplicationContext();
        this.a = jobId;
        this.b = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        this.c = (JobScheduler) Assertions.checkNotNull((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    private static JobInfo a(int jobId, ComponentName jobServiceComponentName, Requirements requirements, String serviceAction, String servicePackage) {
        Requirements requirementsFilterRequirements = requirements.filterRequirements(h);
        if (!requirementsFilterRequirements.equals(requirements)) {
            int requirements2 = requirementsFilterRequirements.getRequirements() ^ requirements.getRequirements();
            StringBuilder sb = new StringBuilder(46);
            sb.append("Ignoring unsupported requirements: ");
            sb.append(requirements2);
            Log.w(d, sb.toString());
        }
        JobInfo.Builder builder = new JobInfo.Builder(jobId, jobServiceComponentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        if (Util.SDK_INT >= 26 && requirements.isStorageNotLowRequired()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(e, serviceAction);
        persistableBundle.putString(f, servicePackage);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
        this.c.cancel(this.a);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public Requirements getSupportedRequirements(Requirements requirements) {
        return requirements.filterRequirements(h);
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean schedule(Requirements requirements, String servicePackage, String serviceAction) {
        return this.c.schedule(a(this.a, this.b, requirements, serviceAction, servicePackage)) == 1;
    }
}
