package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.impl.WorkDatabase;
import defpackage.m1p;
import defpackage.mwl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/work/Configuration;", "configuration", "Lm1p;", "executor", "Landroidx/work/b;", "pruneWork", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Lm1p;)Landroidx/work/b;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class PruneWorkRunnableKt {
    @NotNull
    public static final androidx.work.b pruneWork(@NotNull final WorkDatabase workDatabase, @NotNull Configuration configuration, @NotNull m1p executor) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Tracer tracer = configuration.getTracer();
        mwl mwlVarD = executor.d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "executor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "PruneWork", mwlVarD, new Function0<Unit>() { // from class: androidx.work.impl.utils.PruneWorkRunnableKt.pruneWork.1
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
                workDatabase.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            }
        });
    }
}
