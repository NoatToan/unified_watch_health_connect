package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/s0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<Runnable> f10956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f10957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10958d;

    public s0(Executor executor) {
        executor.getClass();
        this.f10955a = executor;
        this.f10956b = new ArrayDeque<>();
        this.f10958d = new Object();
    }

    public final void a() {
        synchronized (this.f10958d) {
            try {
                Runnable runnablePoll = this.f10956b.poll();
                Runnable runnable = runnablePoll;
                this.f10957c = runnable;
                if (runnablePoll != null) {
                    this.f10955a.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f10958d) {
            try {
                this.f10956b.offer(new ab.j(12, runnable, this));
                if (this.f10957c == null) {
                    a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
