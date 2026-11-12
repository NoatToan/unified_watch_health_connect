package com.huawei.hwservicesmgr;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ndb;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class PhoneJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            LogUtil.j("PhoneJobService", "onStartJob params == null");
            return false;
        }
        int jobId = jobParameters.getJobId();
        LogUtil.a("PhoneJobService", "onStartJob jobId ", Integer.valueOf(jobId));
        try {
            if (jobId == 10009) {
                ndb.b().c();
                jobFinished(jobParameters, false);
                return true;
            }
            jobFinished(jobParameters, false);
            return false;
        } catch (Exception unused) {
            ReleaseLogUtil.b("R_PhoneJobService", "onStartJob exception");
            jobFinished(jobParameters, true);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            LogUtil.j("PhoneJobService", "onStopJob params == null");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ReleaseLogUtil.b("R_PhoneJobService", "Job stopped due to Reason code:", Integer.valueOf(jobParameters.getStopReason()));
        }
        int jobId = jobParameters.getJobId();
        LogUtil.a("PhoneJobService", "onStopJob jobId ", Integer.valueOf(jobId));
        return jobId == 10009;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("PhoneJobService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("PhoneJobService", "onDestroy");
    }
}
