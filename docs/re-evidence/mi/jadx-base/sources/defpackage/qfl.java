package defpackage;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class qfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31481a = ppe.i("Schedulers");

    public static jfl c(Context context, WorkDatabase workDatabase, Configuration configuration) {
        ewo ewoVar = new ewo(context, workDatabase, configuration);
        ehh.c(context, SystemJobService.class, true);
        ppe.e().a(f31481a, "Created SystemJobScheduler and enabled SystemJobService");
        return ewoVar;
    }

    public static /* synthetic */ void d(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((jfl) it.next()).cancel(workGenerationalId.getWorkSpecId());
        }
        h(configuration, workDatabase, list);
    }

    public static /* synthetic */ void e(Executor executor, final List list, final Configuration configuration, final WorkDatabase workDatabase, final WorkGenerationalId workGenerationalId, boolean z) {
        executor.execute(new Runnable() { // from class: nfl
            @Override // java.lang.Runnable
            public final void run() {
                qfl.d(list, workGenerationalId, configuration, workDatabase);
            }
        });
    }

    public static void f(WorkSpecDao workSpecDao, h14 h14Var, List<WorkSpec> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = h14Var.currentTimeMillis();
            Iterator<WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    public static void g(final List<jfl> list, a aVar, final Executor executor, final WorkDatabase workDatabase, final Configuration configuration) {
        aVar.e(new tf8() { // from class: mfl
            @Override // defpackage.tf8
            public final void c(WorkGenerationalId workGenerationalId, boolean z) {
                qfl.e(executor, list, configuration, workDatabase, workGenerationalId, z);
            }
        });
    }

    public static void h(Configuration configuration, WorkDatabase workDatabase, List<jfl> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> eligibleWorkForSchedulingWithContentUris = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
            f(workSpecDao, configuration.getClock(), eligibleWorkForSchedulingWithContentUris);
            List<WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            f(workSpecDao, configuration.getClock(), eligibleWorkForScheduling);
            if (eligibleWorkForSchedulingWithContentUris != null) {
                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            }
            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                for (jfl jflVar : list) {
                    if (jflVar.a()) {
                        jflVar.b(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
                for (jfl jflVar2 : list) {
                    if (!jflVar2.a()) {
                        jflVar2.b(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
