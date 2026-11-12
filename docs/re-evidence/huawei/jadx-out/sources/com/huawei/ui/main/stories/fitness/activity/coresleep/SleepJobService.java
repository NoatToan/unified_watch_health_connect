package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.lsl;
import defpackage.tza;
import defpackage.uag;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class SleepJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        if (VersionControlUtil.isSupportSleepManagement()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepJobService.3
                @Override // java.lang.Runnable
                public void run() {
                    long jP;
                    long jB;
                    boolean z;
                    LogUtil.a("SleepJobService", "run job once");
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (lsl.a(lsl.p(jCurrentTimeMillis), jCurrentTimeMillis) < 15) {
                            jP = lsl.x(jCurrentTimeMillis);
                            jB = lsl.i(jCurrentTimeMillis);
                            z = false;
                        } else {
                            jP = lsl.p(jCurrentTimeMillis);
                            jB = lsl.b(jCurrentTimeMillis);
                            z = true;
                        }
                        uag.b(new c(SleepJobService.this, jobParameters, z), jP, jB);
                    } catch (Exception unused) {
                        ReleaseLogUtil.b("R_SleepJobService", "TryRequestMonthResult exception");
                        SleepJobService.this.jobFinished(jobParameters, true);
                    }
                }
            });
            return true;
        }
        tza.b().e();
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (Build.VERSION.SDK_INT >= 31) {
            ReleaseLogUtil.b("R_SleepJobService", "Job stopped due to Reason code:", Integer.valueOf(jobParameters == null ? 0 : jobParameters.getStopReason()));
        }
        return false;
    }

    public static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SleepJobService> f26801a;
        private JobParameters d;
        private boolean e;

        public c(SleepJobService sleepJobService, JobParameters jobParameters, boolean z) {
            this.f26801a = new WeakReference<>(sleepJobService);
            this.d = jobParameters;
            this.e = z;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            long jB;
            SleepJobService sleepJobService = this.f26801a.get();
            if (sleepJobService == null) {
                return;
            }
            if (VersionControlUtil.isSupportSleepManagement()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.e) {
                    jB = (lsl.j(jCurrentTimeMillis) - tza.a()) - jCurrentTimeMillis;
                    LogUtil.a("SleepJobService", "schedule run at next month, interval: ", Long.valueOf(jB));
                } else {
                    jB = (lsl.b(jCurrentTimeMillis) - tza.a()) - jCurrentTimeMillis;
                    LogUtil.a("SleepJobService", "schedule run at current month, interval: ", Long.valueOf(jB));
                }
                tza.b().a(jB);
            }
            sleepJobService.jobFinished(this.d, false);
        }
    }
}
