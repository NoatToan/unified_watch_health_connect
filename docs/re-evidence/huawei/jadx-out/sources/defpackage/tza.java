package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepJobService;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class tza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile tza f49818c;

    private tza() {
    }

    public static tza b() {
        if (f49818c == null) {
            synchronized (tza.class) {
                if (f49818c == null) {
                    f49818c = new tza();
                }
            }
        }
        return f49818c;
    }

    public void c() {
        long jP;
        long jB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jV = (lsl.v(jCurrentTimeMillis) - jCurrentTimeMillis) - a();
        if (jV > 10000) {
            LogUtil.a("SleepJobServiceUtil", "schedule job at interval: ", Long.valueOf(jV));
            a(jV);
            return;
        }
        if (lsl.a(lsl.p(jCurrentTimeMillis), jCurrentTimeMillis) < 15) {
            jP = lsl.x(jCurrentTimeMillis);
            jB = lsl.i(jCurrentTimeMillis);
        } else {
            jP = lsl.p(jCurrentTimeMillis);
            jB = lsl.b(jCurrentTimeMillis);
        }
        uag.b((SleepJobService.c) null, jP, jB);
        long j = (lsl.j(jCurrentTimeMillis) - a()) - jCurrentTimeMillis;
        LogUtil.a("SleepJobServiceUtil", "requestMonthProcessResult now, and schedule job at interval: ", Long.valueOf(j));
        a(j);
    }

    public static long a() {
        return ((long) (qrf.d(120) + 240)) * 60000;
    }

    public void a(long j) {
        try {
            JobScheduler jobSchedulerI = i();
            if (jobSchedulerI != null) {
                jobSchedulerI.schedule(new JobInfo.Builder(20221110, new ComponentName(BaseApplication.b().getPackageName(), SleepJobService.class.getName())).setRequiredNetworkType(1).setRequiresDeviceIdle(false).setPersisted(true).setOverrideDeadline(1000 + j).setMinimumLatency(j).build());
                LogUtil.a("SleepJobServiceUtil", "start job success");
            }
        } catch (IllegalArgumentException e) {
            LogUtil.a("SleepJobServiceUtil", "startJobService ", e.getMessage());
        }
    }

    private JobScheduler i() {
        Object systemService = BaseApplication.b().getSystemService("jobscheduler");
        if (systemService instanceof JobScheduler) {
            return (JobScheduler) systemService;
        }
        return null;
    }

    public void e() {
        try {
            JobScheduler jobSchedulerI = i();
            if (jobSchedulerI != null) {
                jobSchedulerI.cancel(20221110);
                LogUtil.a("SleepJobServiceUtil", "stop job success");
            }
        } catch (IllegalArgumentException e) {
            LogUtil.a("SleepJobServiceUtil", "stopJobService ", e.getMessage());
        }
        f49818c = null;
    }

    public boolean d() {
        JobScheduler jobSchedulerI = i();
        if (jobSchedulerI == null) {
            return false;
        }
        List<JobInfo> allPendingJobs = jobSchedulerI.getAllPendingJobs();
        if (njy.e(allPendingJobs)) {
            return false;
        }
        for (JobInfo jobInfo : allPendingJobs) {
            if (jobInfo.getId() == 20221110) {
                LogUtil.a("SleepJobServiceUtil", "sleep jobservice is running, min latency: ", Long.valueOf(jobInfo.getMinLatencyMillis()), ", max delay: ", Long.valueOf(jobInfo.getMaxExecutionDelayMillis()));
                return true;
            }
        }
        return false;
    }
}
