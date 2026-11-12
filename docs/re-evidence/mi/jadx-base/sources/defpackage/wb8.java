package defpackage;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.EnqueueUtilsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class wb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37804a = ppe.i("EnqueueRunnable");

    @VisibleForTesting
    public static boolean a(pmr pmrVar) {
        enr enrVarH = pmrVar.h();
        WorkDatabase workDatabaseJ = enrVarH.j();
        workDatabaseJ.beginTransaction();
        try {
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabaseJ, enrVarH.getConfiguration(), pmrVar);
            boolean zE = e(pmrVar);
            workDatabaseJ.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseJ.endTransaction();
        }
    }

    public static void b(pmr pmrVar) {
        if (!pmrVar.i()) {
            if (a(pmrVar)) {
                f(pmrVar);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + pmrVar + ")");
        }
    }

    public static boolean c(pmr pmrVar) {
        boolean zD = d(pmrVar.h(), pmrVar.g(), (String[]) pmr.n(pmrVar).toArray(new String[0]), pmrVar.e(), pmrVar.c());
        pmrVar.m();
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0152  */
    public static boolean d(enr enrVar, List<? extends WorkRequest> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = enrVar.getConfiguration().getClock().currentTimeMillis();
        WorkDatabase workDatabaseJ = enrVar.j();
        boolean z4 = true;
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = true;
            z2 = false;
            z3 = false;
            for (String str2 : strArr2) {
                WorkSpec workSpec = workDatabaseJ.workSpecDao().getWorkSpec(str2);
                if (workSpec == null) {
                    ppe.e().c(f37804a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z3 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z6 = !TextUtils.isEmpty(str);
        if (!z6 || z5) {
            z4 = false;
        } else {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabaseJ.workSpecDao().getWorkSpecIdAndStatesForName(str);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    DependencyDao dependencyDao = workDatabaseJ.dependencyDao();
                    List arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (!dependencyDao.hasDependents(idAndState.id)) {
                            WorkInfo.State state2 = idAndState.state;
                            boolean z7 = (state2 == WorkInfo.State.SUCCEEDED) & z;
                            if (state2 == WorkInfo.State.FAILED) {
                                z3 = true;
                            } else if (state2 == WorkInfo.State.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(idAndState.id);
                            z = z7;
                        }
                        dependencyDao = dependencyDao;
                    }
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        WorkSpecDao workSpecDao = workDatabaseJ.workSpecDao();
                        Iterator<WorkSpec.IdAndState> it = workSpecDao.getWorkSpecIdAndStatesForName(str).iterator();
                        while (it.hasNext()) {
                            workSpecDao.delete(it.next().id);
                        }
                        arrayList = Collections.emptyList();
                        z2 = false;
                        z3 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z5 = strArr2.length > 0;
                } else {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator<WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state3 = it2.next().state;
                            if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    CancelWorkRunnable.forNameInline(str, enrVar);
                    WorkSpecDao workSpecDao2 = workDatabaseJ.workSpecDao();
                    Iterator<WorkSpec.IdAndState> it3 = workSpecIdAndStatesForName.iterator();
                    while (it3.hasNext()) {
                        workSpecDao2.delete(it3.next().id);
                    }
                }
            }
            z4 = false;
        }
        Iterator<? extends WorkRequest> it4 = list.iterator();
        while (it4.hasNext()) {
            WorkRequest next = it4.next();
            WorkSpec workSpec2 = next.getWorkSpec();
            if (!z5 || z) {
                workSpec2.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z3) {
                workSpec2.state = WorkInfo.State.FAILED;
            } else if (z2) {
                workSpec2.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec2.state = WorkInfo.State.BLOCKED;
            }
            Iterator<? extends WorkRequest> it5 = it4;
            if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                z4 = true;
            }
            workDatabaseJ.workSpecDao().insertWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(enrVar.h(), workSpec2));
            if (z5) {
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    workDatabaseJ.dependencyDao().insertDependency(new Dependency(next.getStringId(), strArr2[i]));
                    i++;
                    length = length;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            workDatabaseJ.workTagDao().insertTags(next.getStringId(), next.getTags());
            if (z6) {
                workDatabaseJ.workNameDao().insert(new WorkName(str, next.getStringId()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z4;
    }

    public static boolean e(pmr pmrVar) {
        List<pmr> listF = pmrVar.f();
        boolean zE = false;
        if (listF != null) {
            for (pmr pmrVar2 : listF) {
                if (pmrVar2.k()) {
                    ppe.e().k(f37804a, "Already enqueued work ids (" + TextUtils.join(", ", pmrVar2.d()) + ")");
                } else {
                    zE |= e(pmrVar2);
                }
            }
        }
        return c(pmrVar) | zE;
    }

    @VisibleForTesting
    public static void f(pmr pmrVar) {
        enr enrVarH = pmrVar.h();
        qfl.h(enrVarH.getConfiguration(), enrVarH.j(), enrVarH.h());
    }
}
