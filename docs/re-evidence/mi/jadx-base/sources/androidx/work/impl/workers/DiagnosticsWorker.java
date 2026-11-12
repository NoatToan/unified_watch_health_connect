package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import defpackage.enr;
import defpackage.ppe;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public a.AbstractC0080a doWork() {
        enr enrVarE = enr.e(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(enrVarE, "getInstance(applicationContext)");
        WorkDatabase workDatabaseJ = enrVarE.j();
        Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManager.workDatabase");
        WorkSpecDao workSpecDao = workDatabaseJ.workSpecDao();
        WorkNameDao workNameDao = workDatabaseJ.workNameDao();
        WorkTagDao workTagDao = workDatabaseJ.workTagDao();
        SystemIdInfoDao systemIdInfoDao = workDatabaseJ.systemIdInfoDao();
        List<WorkSpec> recentlyCompletedWork = workSpecDao.getRecentlyCompletedWork(enrVarE.getConfiguration().getClock().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<WorkSpec> runningWork = workSpecDao.getRunningWork();
        List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            ppe.e().f(DiagnosticsWorkerKt.TAG, "Recently completed work:\n\n");
            ppe.e().f(DiagnosticsWorkerKt.TAG, DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, recentlyCompletedWork));
        }
        if (!runningWork.isEmpty()) {
            ppe.e().f(DiagnosticsWorkerKt.TAG, "Running work:\n\n");
            ppe.e().f(DiagnosticsWorkerKt.TAG, DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, runningWork));
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            ppe.e().f(DiagnosticsWorkerKt.TAG, "Enqueued work:\n\n");
            ppe.e().f(DiagnosticsWorkerKt.TAG, DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, allEligibleWorkSpecsForScheduling));
        }
        a.AbstractC0080a abstractC0080aC = a.AbstractC0080a.c();
        Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success()");
        return abstractC0080aC;
    }
}
