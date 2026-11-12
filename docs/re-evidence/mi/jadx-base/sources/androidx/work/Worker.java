package androidx.work;

import android.content.Context;
import defpackage.lhe;
import defpackage.q0a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/a;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Llhe;", "startWork", "()Llhe;", "Lq0a;", "getForegroundInfoAsync", "getForegroundInfo", "()Lq0a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class Worker extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @NotNull
    public abstract a.AbstractC0080a doWork();

    @NotNull
    public q0a getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.a
    @NotNull
    public lhe<q0a> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new Function0<q0a>() { // from class: androidx.work.Worker.getForegroundInfoAsync.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final q0a invoke() {
                return Worker.this.getForegroundInfo();
            }
        });
    }

    @Override // androidx.work.a
    @NotNull
    public final lhe<a.AbstractC0080a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new Function0<a.AbstractC0080a>() { // from class: androidx.work.Worker.startWork.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final a.AbstractC0080a invoke() {
                return Worker.this.doWork();
            }
        });
    }
}
