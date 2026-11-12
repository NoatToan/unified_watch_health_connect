package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.JobSchedulerExtKt;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ewo implements jfl {
    public static final String f = ppe.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f17136b;
    public final dwo c;
    public final WorkDatabase d;
    public final Configuration e;

    public ewo(Context context, WorkDatabase workDatabase, Configuration configuration) {
        this(context, workDatabase, configuration, JobSchedulerExtKt.getWmJobScheduler(context), new dwo(context, configuration.getClock(), configuration.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            JobSchedulerExtKt.getWmJobScheduler(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listF = f(context, jobScheduler);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listF.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    public static void d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ppe.e().d(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static List<Integer> e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listF = f(context, jobScheduler);
        if (listF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listF) {
            WorkGenerationalId workGenerationalIdG = g(jobInfo);
            if (workGenerationalIdG != null && str.equals(workGenerationalIdG.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> safePendingJobs = JobSchedulerExtKt.getSafePendingJobs(jobScheduler);
        if (safePendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(safePendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : safePendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static WorkGenerationalId g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean h(Context context, WorkDatabase workDatabase) {
        JobScheduler wmJobScheduler = JobSchedulerExtKt.getWmJobScheduler(context);
        List<JobInfo> listF = f(context, wmJobScheduler);
        List<String> workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        HashSet hashSet = new HashSet(listF != null ? listF.size() : 0);
        if (listF != null && !listF.isEmpty()) {
            for (JobInfo jobInfo : listF) {
                WorkGenerationalId workGenerationalIdG = g(jobInfo);
                if (workGenerationalIdG != null) {
                    hashSet.add(workGenerationalIdG.getWorkSpecId());
                } else {
                    d(wmJobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                ppe.e().a(f, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        return z;
    }

    @Override // defpackage.jfl
    public boolean a() {
        return true;
    }

    @Override // defpackage.jfl
    public void b(WorkSpec... workSpecArr) {
        IdGenerator idGenerator = new IdGenerator(this.d);
        for (WorkSpec workSpec : workSpecArr) {
            this.d.beginTransaction();
            try {
                WorkSpec workSpec2 = this.d.workSpecDao().getWorkSpec(workSpec.id);
                if (workSpec2 == null) {
                    ppe.e().k(f, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB");
                    this.d.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    ppe.e().k(f, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued");
                    this.d.setTransactionSuccessful();
                } else {
                    WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
                    SystemIdInfo systemIdInfo = this.d.systemIdInfoDao().getSystemIdInfo(workGenerationalIdGenerationalId);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(this.e.getMinJobSchedulerId(), this.e.getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.d.systemIdInfoDao().insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalIdGenerationalId, iNextJobSchedulerIdWithRange));
                    }
                    i(workSpec, iNextJobSchedulerIdWithRange);
                    this.d.setTransactionSuccessful();
                }
                this.d.endTransaction();
            } catch (Throwable th) {
                this.d.endTransaction();
                throw th;
            }
        }
    }

    @Override // defpackage.jfl
    public void cancel(String str) {
        List<Integer> listE = e(this.f17135a, this.f17136b, str);
        if (listE == null || listE.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listE.iterator();
        while (it.hasNext()) {
            d(this.f17136b, it.next().intValue());
        }
        this.d.systemIdInfoDao().removeSystemIdInfo(str);
    }

    @VisibleForTesting
    public void i(WorkSpec workSpec, int i) {
        JobInfo jobInfoA = this.c.a(workSpec, i);
        ppe ppeVarE = ppe.e();
        String str = f;
        ppeVarE.a(str, "Scheduling work ID " + workSpec.id + "Job ID " + i);
        try {
            if (this.f17136b.schedule(jobInfoA) == 0) {
                ppe.e().k(str, "Unable to schedule work ID " + workSpec.id);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    ppe.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.id));
                    i(workSpec, i);
                }
            }
        } catch (IllegalStateException e) {
            String strCreateErrorMessage = JobSchedulerExtKt.createErrorMessage(this.f17135a, this.d, this.e);
            ppe.e().c(f, strCreateErrorMessage);
            IllegalStateException illegalStateException = new IllegalStateException(strCreateErrorMessage, e);
            Consumer<Throwable> schedulingExceptionHandler = this.e.getSchedulingExceptionHandler();
            if (schedulingExceptionHandler == null) {
                throw illegalStateException;
            }
            schedulingExceptionHandler.accept(illegalStateException);
        } catch (Throwable th) {
            ppe.e().d(f, "Unable to schedule " + workSpec, th);
        }
    }

    @VisibleForTesting
    public ewo(Context context, WorkDatabase workDatabase, Configuration configuration, JobScheduler jobScheduler, dwo dwoVar) {
        this.f17135a = context;
        this.f17136b = jobScheduler;
        this.c = dwoVar;
        this.d = workDatabase;
        this.e = configuration;
    }
}
