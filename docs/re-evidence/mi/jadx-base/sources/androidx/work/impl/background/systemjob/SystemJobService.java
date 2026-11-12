package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.model.WorkGenerationalId;
import defpackage.enr;
import defpackage.ppe;
import defpackage.tf8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements tf8 {
    public static final String e = ppe.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public enr f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<WorkGenerationalId, JobParameters> f3219b = new HashMap();
    public final StartStopTokens c = StartStopTokens.create(false);
    public WorkLauncher d;

    @RequiresApi(24)
    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @RequiresApi(28)
    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @RequiresApi(31)
    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public static int b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return WorkInfo.STOP_REASON_UNKNOWN;
        }
    }

    public static WorkGenerationalId d(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.tf8
    public void c(WorkGenerationalId workGenerationalId, boolean z) {
        a("onExecuted");
        ppe.e().a(e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f3219b.remove(workGenerationalId);
        this.c.remove(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            enr enrVarE = enr.e(getApplicationContext());
            this.f3218a = enrVarE;
            androidx.work.impl.a aVarG = enrVarE.g();
            this.d = new WorkLauncherImpl(aVarG, this.f3218a.l());
            aVarG.e(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            ppe.e().k(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        enr enrVar = this.f3218a;
        if (enrVar != null) {
            enrVar.g().p(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f3218a == null) {
            ppe.e().a(e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdD = d(jobParameters);
        if (workGenerationalIdD == null) {
            ppe.e().c(e, "WorkSpec id not found!");
            return false;
        }
        if (this.f3219b.containsKey(workGenerationalIdD)) {
            ppe.e().a(e, "Job is already being executed by SystemJobService: " + workGenerationalIdD);
            return false;
        }
        ppe.e().a(e, "onStartJob for " + workGenerationalIdD);
        this.f3219b.put(workGenerationalIdD, jobParameters);
        int i = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f3183b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f3182a = Arrays.asList(a.a(jobParameters));
        }
        if (i >= 28) {
            aVar.c = b.a(jobParameters);
        }
        this.d.startWork(this.c.tokenFor(workGenerationalIdD), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f3218a == null) {
            ppe.e().a(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdD = d(jobParameters);
        if (workGenerationalIdD == null) {
            ppe.e().c(e, "WorkSpec id not found!");
            return false;
        }
        ppe.e().a(e, "onStopJob for " + workGenerationalIdD);
        this.f3219b.remove(workGenerationalIdD);
        StartStopToken startStopTokenRemove = this.c.remove(workGenerationalIdD);
        if (startStopTokenRemove != null) {
            this.d.stopWorkWithReason(startStopTokenRemove, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : WorkInfo.STOP_REASON_UNKNOWN);
        }
        return !this.f3218a.g().j(workGenerationalIdD.getWorkSpecId());
    }
}
