package o53;

import java.util.concurrent.locks.LockSupport;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo53/f;", "T", "Lo53/a;", "Lt13/g;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lo53/y0;", "eventLoop", "<init>", "(Lt13/g;Ljava/lang/Thread;Lo53/y0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f129334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f129335e;

    public f(t13.g gVar, Thread thread, y0 y0Var) {
        super(gVar, true, true);
        this.f129334d = thread;
        this.f129335e = y0Var;
    }

    @Override // o53.p1
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f129334d;
        if (p005kotlin.jvm.internal.s.g(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
