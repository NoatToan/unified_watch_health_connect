package com.xiaomi.fitness.keep_alive;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import defpackage.izd;

/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public class KeepAliveJobSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f12359a = false;

    public static void a(Context context) {
        izd.b("KeepAliveJobSchedulerService.cancel");
        izd.b("KeepAliveJobSchedulerService.cancel  cancel job");
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(1001);
    }

    public static void b(Context context) {
        izd.b("KeepAliveJobSchedulerService.schedule");
        izd.b("KeepAliveJobSchedulerService.schedule  schedule job");
        try {
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(1001, new ComponentName(context, (Class<?>) KeepAliveJobSchedulerService.class)).setPeriodic(600000L).setPersisted(true).build());
        } catch (Exception e) {
            izd.b("KeepAliveJobSchedulerService.schedule  exception:" + e.getMessage());
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        f12359a = true;
        try {
            izd.b("KeepAliveJobSchedulerService.onStartJob");
            KeepAliveHelper.Companion companion = KeepAliveHelper.INSTANCE;
            companion.getInstance().startConnect();
            companion.getInstance().startService();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        izd.b("KeepAliveJobSchedulerService.onStopJob");
        return true;
    }
}
