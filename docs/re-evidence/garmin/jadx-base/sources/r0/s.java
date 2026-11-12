package r0;

import b0.c1;
import b0.d1;
import b0.g1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class s implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f148779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f148780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.b<Throwable> f148781c;

    public s(b0.l lVar) {
        d1 d1Var = lVar.f14012e;
        Objects.requireNonNull(d1Var);
        this.f148779a = d1Var;
        this.f148780b = lVar.f14011d;
        this.f148781c = lVar.f14014g;
    }

    @Override // b0.d1
    public final void a(g1 g1Var) {
        try {
            this.f148780b.execute(new h(2, this, g1Var));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // b0.d1
    public final void b(c1 c1Var) {
        try {
            this.f148780b.execute(new h(3, this, c1Var));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // r0.q
    public final ListenableFuture<Void> c(int i14, int i15) {
        Exception exc = new Exception("Snapshot not supported by external SurfaceProcessor");
        l0.j.a aVar = l0.j.f107810a;
        return new l0.m.a(exc);
    }

    @Override // r0.q
    public final void release() {
    }

    public final String toString() {
        return "SurfaceProcessorWithExecutor(" + this.f148779a + ")";
    }
}
