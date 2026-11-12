package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableFutureKt;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkerUpdater;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import com.xiaomi.fitness.heartrate.finger.MiuiHeartRateCode;
import defpackage.enr;
import defpackage.jfl;
import defpackage.lhe;
import defpackage.mwl;
import defpackage.pmr;
import defpackage.qfl;
import defpackage.wb8;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u000f\u0010\u0015\u001a#\u0010\u0018\u001a\u00020\u0017*\u00020\u00112\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/a;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", "configuration", "", "Ljfl;", "schedulers", "Landroidx/work/impl/model/WorkSpec;", "newWorkSpec", "", "", "tags", "Landroidx/work/WorkManager$UpdateResult;", "updateWorkImpl", "(Landroidx/work/impl/a;Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Ljava/util/List;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)Landroidx/work/WorkManager$UpdateResult;", "Lenr;", "Landroidx/work/WorkRequest;", "workRequest", "Llhe;", "(Lenr;Landroidx/work/WorkRequest;)Llhe;", "name", "Landroidx/work/b;", "enqueueUniquelyNamedPeriodic", "(Lenr;Ljava/lang/String;Landroidx/work/WorkRequest;)Landroidx/work/b;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "WorkerUpdater")
@SourceDebugExtension({"SMAP\nWorkerUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n*L\n56#1:166,2\n*E\n"})
public final class WorkerUpdater {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final androidx.work.b enqueueUniquelyNamedPeriodic(@NotNull final enr enrVar, @NotNull final String name, @NotNull final WorkRequest workRequest) {
        Intrinsics.checkNotNullParameter(enrVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        Tracer tracer = enrVar.getConfiguration().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        mwl mwlVarD = enrVar.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, mwlVarD, new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final WorkRequest workRequest2 = workRequest;
                final enr enrVar2 = enrVar;
                final String str2 = name;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        wb8.b(new pmr(enrVar2, str2, ExistingWorkPolicy.KEEP, CollectionsKt__CollectionsJVMKt.listOf(workRequest2)));
                    }
                };
                WorkSpecDao workSpecDao = enrVar.j().workSpecDao();
                List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(name);
                if (workSpecIdAndStatesForName.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) CollectionsKt___CollectionsKt.firstOrNull((List) workSpecIdAndStatesForName);
                if (idAndState == null) {
                    function0.invoke();
                    return;
                }
                WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
                if (workSpec == null) {
                    throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + name + "\", wasn't found");
                }
                if (!workSpec.isPeriodic()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (idAndState.state == WorkInfo.State.CANCELLED) {
                    workSpecDao.delete(idAndState.id);
                    function0.invoke();
                    return;
                }
                WorkSpec workSpecCopy$default = WorkSpec.copy$default(workRequest.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, MiuiHeartRateCode.HEARTBEAT_RATE_REGISTER, null);
                a processor = enrVar.g();
                Intrinsics.checkNotNullExpressionValue(processor, "processor");
                WorkDatabase workDatabase = enrVar.j();
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
                Configuration configuration = enrVar.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                List<jfl> schedulers = enrVar.h();
                Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
                WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workSpecCopy$default, workRequest.getTags());
            }
        });
    }

    @NotNull
    public static final lhe<WorkManager.UpdateResult> updateWorkImpl(@NotNull final enr enrVar, @NotNull final WorkRequest workRequest) {
        Intrinsics.checkNotNullParameter(enrVar, "<this>");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        mwl mwlVarD = enrVar.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(mwlVarD, "updateWorkImpl", new Function0<WorkManager.UpdateResult>() { // from class: androidx.work.impl.WorkerUpdater.updateWorkImpl.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final WorkManager.UpdateResult invoke() {
                a processor = enrVar.g();
                Intrinsics.checkNotNullExpressionValue(processor, "processor");
                WorkDatabase workDatabase = enrVar.j();
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
                Configuration configuration = enrVar.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                List<jfl> schedulers = enrVar.h();
                Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
                return WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkSpec workSpecCopy$default = WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecCopy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            workSpecCopy$default.setNextScheduleTimeOverrideGeneration(workSpecCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, workSpecCopy$default));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkManager.UpdateResult updateWorkImpl(a aVar, final WorkDatabase workDatabase, Configuration configuration, final List<? extends jfl> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.id;
        final WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 != null) {
            if (workSpec2.state.isFinished()) {
                return WorkManager.UpdateResult.NOT_APPLIED;
            }
            if (!(workSpec2.isPeriodic() ^ workSpec.isPeriodic())) {
                final boolean zK = aVar.k(str);
                if (!zK) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((jfl) it.next()).cancel(str);
                    }
                }
                workDatabase.runInTransaction(new Runnable() { // from class: unr
                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkerUpdater.updateWorkImpl$lambda$2(workDatabase, workSpec2, workSpec, list, str, set, zK);
                    }
                });
                if (!zK) {
                    qfl.h(configuration, workDatabase, list);
                }
                return zK ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
            }
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new Function1<WorkSpec, String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String invoke2(WorkSpec spec) {
                    Intrinsics.checkNotNullParameter(spec, "spec");
                    return spec.isPeriodic() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke2(workSpec2) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke2(workSpec) + " Worker. Update operation must preserve worker's type.");
        }
        throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
    }
}
