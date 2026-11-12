package xe;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f190401a = 0;

    static {
        u.b("SystemJobScheduler");
    }

    public static final List<JobInfo> a(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            a.f190399a.getClass();
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable unused) {
            u.a().getClass();
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        b.f190400a.getClass();
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
