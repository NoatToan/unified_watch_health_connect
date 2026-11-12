package x53;

import java.util.concurrent.Executor;
import o53.c1;
import o53.z;
import p005kotlin.Metadata;
import u53.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx53/b;", "Lo53/c1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends c1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f189152a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f189153b;

    static {
        k kVar = k.f189166a;
        int i14 = y.f168775a;
        if (64 >= i14) {
            i14 = 64;
        }
        f189153b = z.limitedParallelism$default(kVar, og2.k.K(i14, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    private b() {
    }

    @Override // o53.c1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        f189153b.dispatch(gVar, runnable);
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        f189153b.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(t13.h.f161748a, runnable);
    }

    @Override // o53.c1
    public final Executor getExecutor() {
        return this;
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        return k.f189166a.limitedParallelism(i14, str);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "Dispatchers.IO";
    }
}
