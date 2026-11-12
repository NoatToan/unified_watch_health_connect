package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.StartStopToken;
import defpackage.ppe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/utils/StopWorkRunnable;", "Ljava/lang/Runnable;", "", "run", "()V", "Landroidx/work/impl/a;", "processor", "Landroidx/work/impl/a;", "Landroidx/work/impl/StartStopToken;", "token", "Landroidx/work/impl/StartStopToken;", "", "stopInForeground", "Z", "", "reason", "I", "<init>", "(Landroidx/work/impl/a;Landroidx/work/impl/StartStopToken;ZI)V", "(Landroidx/work/impl/a;Landroidx/work/impl/StartStopToken;Z)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StopWorkRunnable implements Runnable {

    @NotNull
    private final androidx.work.impl.a processor;
    private final int reason;
    private final boolean stopInForeground;

    @NotNull
    private final StartStopToken token;

    public StopWorkRunnable(@NotNull androidx.work.impl.a processor, @NotNull StartStopToken token, boolean z, int i) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z;
        this.reason = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zV = this.stopInForeground ? this.processor.v(this.token, this.reason) : this.processor.w(this.token, this.reason);
        ppe.e().a(ppe.i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zV);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(@NotNull androidx.work.impl.a processor, @NotNull StartStopToken token, boolean z) {
        this(processor, token, z, WorkInfo.STOP_REASON_UNKNOWN);
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
    }
}
