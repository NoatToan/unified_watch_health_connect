package x53;

import java.util.concurrent.Executor;
import o53.c1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx53/f;", "Lo53/c1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f189156a;

    public /* synthetic */ f(int i14, int i15, long j8, String str, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? j.f189162c : i14, (i16 & 2) != 0 ? j.f189163d : i15, (i16 & 4) != 0 ? j.f189164e : j8, (i16 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    @Override // o53.c1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f189156a.close();
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        a.e(this.f189156a, runnable, 6);
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        a.e(this.f189156a, runnable, 2);
    }

    @Override // o53.c1
    public final Executor getExecutor() {
        return this.f189156a;
    }

    public f() {
        this(0, 0, 0L, null, 15, null);
    }

    public f(int i14, int i15, long j8, String str) {
        this.f189156a = new a(i14, i15, j8, str);
    }
}
