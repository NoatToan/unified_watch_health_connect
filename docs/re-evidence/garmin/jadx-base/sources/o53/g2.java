package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo53/g2;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f129341a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<y0> f129342b;

    static {
        new u53.x("ThreadLocalEventLoop");
        f129342b = new ThreadLocal<>();
    }

    private g2() {
    }

    public static y0 a() {
        ThreadLocal<y0> threadLocal = f129342b;
        y0 y0Var = threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
