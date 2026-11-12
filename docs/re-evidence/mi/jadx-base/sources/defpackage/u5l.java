package defpackage;

import java.util.concurrent.ThreadFactory;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class u5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u5l f35431a = new u5l();

    public static ifl a() {
        return b(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static ifl b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new sd8(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static ifl c() {
        return d(new RxThreadFactory("RxIoScheduler-"));
    }

    public static ifl d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new m93(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static ifl e() {
        return f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static ifl f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new klg(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static u5l h() {
        return f35431a;
    }

    public ifl g() {
        return null;
    }

    public ifl i() {
        return null;
    }

    public ifl j() {
        return null;
    }

    @Deprecated
    public sc0 k(sc0 sc0Var) {
        return sc0Var;
    }
}
