package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.mwl;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lm1p;", "executor", "", "", "ids", "Llhe;", "Landroidx/work/WorkInfo;", "forStringIds", "(Landroidx/work/impl/WorkDatabase;Lm1p;Ljava/util/List;)Llhe;", "Ljava/util/UUID;", "id", "forUUID", "(Landroidx/work/impl/WorkDatabase;Lm1p;Ljava/util/UUID;)Llhe;", "tag", "forTag", "(Landroidx/work/impl/WorkDatabase;Lm1p;Ljava/lang/String;)Llhe;", "name", "forUniqueWork", "Landroidx/work/WorkQuery;", "querySpec", "forWorkQuerySpec", "(Landroidx/work/impl/WorkDatabase;Lm1p;Landroidx/work/WorkQuery;)Llhe;", "T", "Lkotlin/Function1;", "block", "loadStatusFuture", "(Landroidx/work/impl/WorkDatabase;Lm1p;Lkotlin/jvm/functions/Function1;)Llhe;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "StatusRunnable")
public final class StatusRunnable {
    @NotNull
    public static final lhe<List<WorkInfo>> forStringIds(@NotNull WorkDatabase workDatabase, @NotNull m1p executor, @NotNull final List<String> ids) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forStringIds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<WorkInfo> invoke2(WorkDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForIds(ids));
                Intrinsics.checkNotNullExpressionValue(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
                return listApply;
            }
        });
    }

    @NotNull
    public static final lhe<List<WorkInfo>> forTag(@NotNull WorkDatabase workDatabase, @NotNull m1p executor, @NotNull final String tag) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forTag.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<WorkInfo> invoke2(WorkDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForTag(tag));
                Intrinsics.checkNotNullExpressionValue(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                return listApply;
            }
        });
    }

    @NotNull
    public static final lhe<WorkInfo> forUUID(@NotNull WorkDatabase workDatabase, @NotNull m1p executor, @NotNull final UUID id) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(id, "id");
        return loadStatusFuture(workDatabase, executor, new Function1<WorkDatabase, WorkInfo>() { // from class: androidx.work.impl.utils.StatusRunnable.forUUID.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final WorkInfo invoke2(WorkDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                WorkSpecDao workSpecDao = db.workSpecDao();
                String string = id.toString();
                Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        });
    }

    @NotNull
    public static final lhe<List<WorkInfo>> forUniqueWork(@NotNull WorkDatabase workDatabase, @NotNull m1p executor, @NotNull final String name) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(name, "name");
        return loadStatusFuture(workDatabase, executor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forUniqueWork.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<WorkInfo> invoke2(WorkDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForName(name));
                Intrinsics.checkNotNullExpressionValue(listApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return listApply;
            }
        });
    }

    @NotNull
    public static final lhe<List<WorkInfo>> forWorkQuerySpec(@NotNull WorkDatabase workDatabase, @NotNull m1p executor, @NotNull final WorkQuery querySpec) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new Function1<WorkDatabase, List<? extends WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<WorkInfo> invoke2(WorkDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(querySpec)));
                Intrinsics.checkNotNullExpressionValue(listApply, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
                return listApply;
            }
        });
    }

    private static final <T> lhe<T> loadStatusFuture(final WorkDatabase workDatabase, m1p m1pVar, final Function1<? super WorkDatabase, ? extends T> function1) {
        mwl mwlVarD = m1pVar.d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(mwlVarD, "loadStatusFuture", new Function0<T>() { // from class: androidx.work.impl.utils.StatusRunnable.loadStatusFuture.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return function1.invoke2(workDatabase);
            }
        });
    }
}
