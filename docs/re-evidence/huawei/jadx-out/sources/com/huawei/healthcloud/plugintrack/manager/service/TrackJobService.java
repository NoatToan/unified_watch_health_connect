package com.huawei.healthcloud.plugintrack.manager.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;
import defpackage.ivm;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        ivm ivmVarE = ivm.e();
        if (!ivmVarE.c()) {
            ivm.e(this);
            jobFinished(jobParameters, false);
            return true;
        }
        if (ivmVarE.b()) {
            ivmVarE.a();
            jobFinished(jobParameters, false);
            return false;
        }
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (Build.VERSION.SDK_INT >= 31) {
            ReleaseLogUtil.b("Track_TrackJobService", "Job stopped due to Reason code:", Integer.valueOf(jobParameters == null ? 0 : jobParameters.getStopReason()));
        }
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
