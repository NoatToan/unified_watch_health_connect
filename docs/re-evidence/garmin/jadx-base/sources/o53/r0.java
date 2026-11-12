package o53;

import java.util.concurrent.Executor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/r0;", "Ljava/util/concurrent/Executor;", "Lo53/z;", "dispatcher", "<init>", "(Lo53/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f129404a;

    public r0(z zVar) {
        this.f129404a = zVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t13.h hVar = t13.h.f161748a;
        z zVar = this.f129404a;
        if (u53.g.c(zVar, hVar)) {
            u53.g.b(zVar, hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f129404a.getF168767c();
    }
}
