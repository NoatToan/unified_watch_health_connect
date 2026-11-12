package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.utils.StopWorkRunnable;
import defpackage.m1p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/work/impl/WorkLauncherImpl;", "Landroidx/work/impl/WorkLauncher;", "Landroidx/work/impl/StartStopToken;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "", "startWork", "(Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$a;)V", "", "reason", "stopWork", "(Landroidx/work/impl/StartStopToken;I)V", "Landroidx/work/impl/a;", "processor", "Landroidx/work/impl/a;", "getProcessor", "()Landroidx/work/impl/a;", "Lm1p;", "workTaskExecutor", "Lm1p;", "getWorkTaskExecutor", "()Lm1p;", "<init>", "(Landroidx/work/impl/a;Lm1p;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class WorkLauncherImpl implements WorkLauncher {

    @NotNull
    private final a processor;

    @NotNull
    private final m1p workTaskExecutor;

    public WorkLauncherImpl(@NotNull a processor, @NotNull m1p workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.a aVar) {
        workLauncherImpl.processor.s(startStopToken, aVar);
    }

    @NotNull
    public final a getProcessor() {
        return this.processor;
    }

    @NotNull
    public final m1p getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(@NotNull final StartStopToken workSpecId, @Nullable final WorkerParameters.a runtimeExtras) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workTaskExecutor.b(new Runnable() { // from class: bnr
            @Override // java.lang.Runnable
            public final void run() {
                WorkLauncherImpl.startWork$lambda$0(this.f4409a, workSpecId, runtimeExtras);
            }
        });
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(@NotNull StartStopToken workSpecId, int reason) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workTaskExecutor.b(new StopWorkRunnable(this.processor, workSpecId, false, reason));
    }
}
