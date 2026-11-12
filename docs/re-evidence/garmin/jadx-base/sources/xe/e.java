package xe;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.view.j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import cf.m;
import cf.t;
import df.i;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import ue.b0;
import ue.f;
import ue.h0;
import ue.u;
import ue.v;
import ve.r;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class e implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f190407f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f190408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f190409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f190410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f190411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.a f190412e;

    static {
        u.b("SystemJobScheduler");
    }

    public e(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.b(context), new d(context, aVar.f11438d, aVar.f11447m));
    }

    public static void b(JobScheduler jobScheduler, int i14) {
        try {
            jobScheduler.cancel(i14);
        } catch (Throwable unused) {
            u uVarA = u.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i14));
            uVarA.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = c.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static m f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // ve.r
    public final boolean a() {
        return true;
    }

    @Override // ve.r
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.f190408a;
        JobScheduler jobScheduler = this.f190409b;
        ArrayList<JobInfo> arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListD) {
                m mVarF = f(jobInfo);
                if (mVarF != null && str.equals(mVarF.f26929a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f190411d.g().e(str);
    }

    @Override // ve.r
    public final void e(t... tVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.f190411d;
        final i iVar = new i(workDatabase);
        for (t tVar : tVarArr) {
            workDatabase.beginTransaction();
            try {
                t tVarI = workDatabase.j().i(tVar.f26941a);
                if (tVarI != null && tVarI.f26942b == h0.c.ENQUEUED) {
                    m mVarW = jg.b.w(tVar);
                    cf.i iVarB = workDatabase.g().b(mVarW);
                    if (iVarB != null) {
                        iIntValue = iVarB.f26922c;
                    } else {
                        androidx.work.a aVar = this.f190412e;
                        aVar.getClass();
                        final int i14 = aVar.f11444j;
                        Object objRunInTransaction = iVar.f59403a.runInTransaction((Callable<Object>) new Callable() { // from class: df.h
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = iVar.f59403a;
                                Long lA = workDatabase2.f().a("next_job_scheduler_id");
                                int i15 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase2.f().b(new cf.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i14) {
                                    workDatabase2.f().b(new cf.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i15 = iLongValue;
                                }
                                return Integer.valueOf(i15);
                            }
                        });
                        objRunInTransaction.getClass();
                        iIntValue = ((Number) objRunInTransaction).intValue();
                    }
                    if (iVarB == null) {
                        workDatabase.g().d(new cf.i(mVarW.f26929a, mVarW.f26930b, iIntValue));
                    }
                    g(tVar, iIntValue);
                    workDatabase.setTransactionSuccessful();
                } else {
                    u.a().getClass();
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(t tVar, int i14) {
        int i15;
        String str;
        d dVar = this.f190410c;
        dVar.getClass();
        f fVar = tVar.f26950j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", tVar.f26941a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", tVar.f26960t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", tVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i14, dVar.f190403a);
        boolean z14 = fVar.f170045c;
        Set<f.c> set = fVar.f170051i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z14);
        boolean z15 = fVar.f170046d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z15).setExtras(persistableBundle);
        NetworkRequest networkRequestA = fVar.a();
        if (networkRequestA != null) {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        } else {
            v vVar = fVar.f170043a;
            if (Build.VERSION.SDK_INT < 30 || vVar != v.TEMPORARILY_UNMETERED) {
                int i16 = d.a.f190406a[vVar.ordinal()];
                if (i16 != 1) {
                    i15 = 2;
                    if (i16 == 2) {
                        i15 = 1;
                    } else if (i16 != 3) {
                        i15 = 4;
                        if (i16 == 4) {
                            i15 = 3;
                        } else if (i16 != 5) {
                            u uVarA = u.a();
                            int i17 = d.f190402d;
                            vVar.toString();
                            uVarA.getClass();
                            i15 = 1;
                        }
                    }
                } else {
                    i15 = 0;
                }
                extras.setRequiredNetworkType(i15);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z15) {
            extras.setBackoffCriteria(tVar.f26953m, tVar.f26952l == ue.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(tVar.a() - dVar.f190404b.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!tVar.f26957q && dVar.f190405c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (f.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f170061a, cVar.f170062b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(fVar.f170049g);
            extras.setTriggerContentMaxDelay(fVar.f170050h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(fVar.f170047e);
        extras.setRequiresStorageNotLow(fVar.f170048f);
        Object[] objArr = tVar.f26951k > 0;
        boolean z16 = jMax > 0;
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 31 && tVar.f26957q && objArr == false && !z16) {
            extras.setExpedited(true);
        }
        if (i18 >= 35 && (str = tVar.f26964x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        u.a().getClass();
        try {
            if (this.f190409b.schedule(jobInfoBuild) == 0) {
                u.a().getClass();
                if (tVar.f26957q && tVar.f26958r == b0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    tVar.f26957q = false;
                    u.a().getClass();
                    g(tVar, i14);
                }
            }
        } catch (IllegalStateException e4) {
            int i19 = c.f190401a;
            Context context = this.f190408a;
            context.getClass();
            WorkDatabase workDatabase = this.f190411d;
            workDatabase.getClass();
            androidx.work.a aVar = this.f190412e;
            aVar.getClass();
            int i24 = Build.VERSION.SDK_INT;
            int i25 = i24 >= 31 ? 150 : 100;
            int size = workDatabase.j().x().size();
            String strK0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i24 >= 34) {
                JobScheduler jobSchedulerB = c.b(context);
                List<JobInfo> listA = c.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListD = d(context, jobSchedulerB);
                    int size2 = arrayListD != null ? listA.size() - arrayListD.size() : 0;
                    String strF = size2 == 0 ? null : j.f(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListD2 = d(context, (JobScheduler) systemService);
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strK0 = p13.h0.k0(p13.u.C(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strF, size3 != 0 ? j.f(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, c.b(context));
                if (arrayListD3 != null) {
                    strK0 = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbR = g.r(i25, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strK0, ".\nThere are ");
            sbR.append(size);
            sbR.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strJ = e0.j(sbR, aVar.f11446l, '.');
            u.a().getClass();
            com.airbnb.lottie.animation.keyframe.a.x(strJ, e4);
        } catch (Throwable unused) {
            u uVarA2 = u.a();
            tVar.toString();
            uVarA2.getClass();
        }
    }

    public e(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f190408a = context;
        this.f190409b = jobScheduler;
        this.f190410c = dVar;
        this.f190411d = workDatabase;
        this.f190412e = aVar;
    }
}
