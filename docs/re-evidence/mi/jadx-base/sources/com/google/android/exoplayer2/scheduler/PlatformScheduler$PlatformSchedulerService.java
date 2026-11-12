package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iC = new Requirements(extras.getInt("requirements")).c(this);
        if (iC == 0) {
            String str = (String) rk1.e(extras.getString("service_action"));
            wlq.P0(this, new Intent(str).setPackage((String) rk1.e(extras.getString("service_package"))));
            return false;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Requirements not met: ");
        sb.append(iC);
        toe.h("PlatformScheduler", sb.toString());
        jobFinished(jobParameters, true);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
