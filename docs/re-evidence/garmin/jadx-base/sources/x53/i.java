package x53;

import androidx.room.a0;
import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx53/i;", "Lx53/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(Ljava/lang/Runnable;JZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f189159c;

    public i(Runnable runnable, long j8, boolean z14) {
        super(j8, z14);
        this.f189159c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f189159c.run();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Task[");
        Runnable runnable = this.f189159c;
        sb3.append(runnable.getClass().getSimpleName());
        sb3.append('@');
        sb3.append(f0.u(runnable));
        sb3.append(", ");
        sb3.append(this.f189157a);
        sb3.append(", ");
        boolean z14 = this.f189158b;
        String str = j.f189160a;
        return a0.m(sb3, z14 ? "Blocking" : "Non-blocking", ']');
    }
}
