package androidx.work.impl.background.systemjob;

import am.j;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import cf.m;
import java.util.Arrays;
import java.util.HashMap;
import ue.u;
import vb.h;
import ve.e;
import ve.p;
import ve.r0;
import ve.t0;
import ve.v;
import ve.w;

/* JADX INFO: loaded from: classes7.dex */
public class SystemJobService extends JobService implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11484e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f11485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11486b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f11487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f11488d;

    public static class a {
        private a() {
        }

        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            int i14 = SystemJobService.f11484e;
            switch (stopReason) {
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
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    static {
        u.b("SystemJobService");
    }

    public SystemJobService() {
        v.f177616a.getClass();
        this.f11487c = new w();
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        h.z(j.m("Cannot invoke ", str, " on a background thread"));
    }

    public static m c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // ve.e
    public final void b(m mVar, boolean z14) {
        a("onExecuted");
        u uVarA = u.a();
        String str = mVar.f26929a;
        uVarA.getClass();
        JobParameters jobParameters = (JobParameters) this.f11486b.remove(mVar);
        this.f11487c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z14);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            t0 t0VarG = t0.g(getApplicationContext());
            this.f11485a = t0VarG;
            p pVar = t0VarG.f177609g;
            this.f11488d = new r0(pVar, t0VarG.f177607e);
            pVar.a(this);
        } catch (IllegalStateException e4) {
            if (Application.class.equals(getApplication().getClass())) {
                u.a().getClass();
            } else {
                com.airbnb.lottie.animation.keyframe.a.x("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        t0 t0Var = this.f11485a;
        if (t0Var != null) {
            p pVar = t0Var.f177609g;
            synchronized (pVar.f177591k) {
                pVar.f177590j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f11485a == null) {
            u.a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        m mVarC = c(jobParameters);
        if (mVarC == null) {
            u.a().getClass();
            return false;
        }
        HashMap map = this.f11486b;
        if (map.containsKey(mVarC)) {
            u uVarA = u.a();
            mVarC.toString();
            uVarA.getClass();
            return false;
        }
        u uVarA2 = u.a();
        mVarC.toString();
        uVarA2.getClass();
        map.put(mVarC, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.f11434b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.f11433a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.f11488d.b(this.f11487c.c(mVarC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f11485a == null) {
            u.a().getClass();
            return true;
        }
        m mVarC = c(jobParameters);
        if (mVarC == null) {
            u.a().getClass();
            return false;
        }
        u uVarA = u.a();
        mVarC.toString();
        uVarA.getClass();
        this.f11486b.remove(mVarC);
        ve.u uVarB = this.f11487c.b(mVarC);
        if (uVarB != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? a.a(jobParameters) : -512;
            r0 r0Var = this.f11488d;
            r0Var.getClass();
            r0Var.c(uVarB, iA);
        }
        p pVar = this.f11485a.f177609g;
        String str = mVarC.f26929a;
        synchronized (pVar.f177591k) {
            zContains = pVar.f177589i.contains(str);
        }
        return !zContains;
    }
}
