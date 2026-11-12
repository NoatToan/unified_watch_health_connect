package f4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf4/c;", "Lf4/f;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLf4/j;Le23/l;Lf4/f;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<Object, Unit> f68724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f68725g;

    public c(long j8, j jVar, e23.l<Object, Unit> lVar, f fVar) {
        super(j8, jVar, (p005kotlin.jvm.internal.j) null);
        this.f68724f = lVar;
        this.f68725g = fVar;
        fVar.k();
    }

    @Override // f4.f
    public final void c() {
        if (this.f68738c) {
            return;
        }
        long j8 = this.f68737b;
        f fVar = this.f68725g;
        if (j8 != fVar.getF68737b()) {
            a();
        }
        fVar.l();
        super.c();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e23.l getF68724f() {
        return this.f68724f;
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
        t.g();
        throw null;
    }

    @Override // f4.f
    public final void l() {
        t.g();
        throw null;
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
    public final f u(e23.l lVar) {
        return new c(this.f68737b, this.f68736a, l.j(lVar, true, this.f68724f), this.f68725g);
    }
}
