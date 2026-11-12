package f4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf4/e;", "Lf4/f;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(JLf4/j;Le23/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<Object, Unit> f68733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68734g;

    public e(long j8, j jVar, e23.l<Object, Unit> lVar) {
        super(j8, jVar, (p005kotlin.jvm.internal.j) null);
        this.f68733f = lVar;
        this.f68734g = 1;
    }

    @Override // f4.f
    public final void c() {
        if (this.f68738c) {
            return;
        }
        l();
        super.c();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e23.l getF68733f() {
        return this.f68733f;
    }

    @Override // f4.f
    public final boolean f() {
        return true;
    }

    @Override // f4.f
    public final e23.l<Object, Unit> i() {
        return null;
    }

    @Override // f4.f
    public final void k() {
        this.f68734g++;
    }

    @Override // f4.f
    public final void l() {
        int i14 = this.f68734g - 1;
        this.f68734g = i14;
        if (i14 == 0) {
            a();
        }
    }

    @Override // f4.f
    public final void m() {
    }

    @Override // f4.f
    public final void n(g0 g0Var) {
        f21.g0 g0Var2 = l.f68773a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // f4.f
    public final f u(e23.l<Object, Unit> lVar) {
        l.b(this);
        return new c(this.f68737b, this.f68736a, l.j(lVar, true, this.f68733f), this);
    }
}
