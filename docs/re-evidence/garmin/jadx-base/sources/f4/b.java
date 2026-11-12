package f4;

import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf4/b;", "Lf4/a;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLf4/j;Le23/l;Le23/l;Lf4/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f68719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f68720q;

    public b(long j8, j jVar, e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2, a aVar) {
        super(j8, jVar, lVar, lVar2);
        this.f68719p = aVar;
        aVar.k();
    }

    @Override // f4.a, f4.f
    public final void c() {
        if (this.f68738c) {
            return;
        }
        super.c();
        if (this.f68720q) {
            return;
        }
        this.f68720q = true;
        this.f68719p.l();
    }

    @Override // f4.a
    public final g w() throws Throwable {
        b bVar;
        a aVar = this.f68719p;
        if (aVar.f68715n || aVar.f68738c) {
            return new g.a(this);
        }
        u0<g0> u0Var = this.f68710i;
        long j8 = this.f68737b;
        HashMap mapA = u0Var != null ? l.a(aVar.getF68737b(), this, this.f68719p.getF68736a()) : null;
        Object obj = l.f68775c;
        synchronized (obj) {
            try {
                l.b(this);
                try {
                    if (u0Var == null || u0Var.f134735d == 0) {
                        bVar = this;
                        a();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        bVar = this;
                        g gVarZ = bVar.z(this.f68719p.getF68737b(), u0Var, mapA, this.f68719p.getF68736a());
                        if (!p005kotlin.jvm.internal.s.g(gVarZ, g.b.f68741a)) {
                            return gVarZ;
                        }
                        u0<g0> u0VarX = bVar.f68719p.x();
                        if (u0VarX != null) {
                            u0VarX.k(u0Var);
                        } else {
                            bVar.f68719p.B(u0Var);
                            bVar.f68710i = null;
                        }
                    }
                    if (p005kotlin.jvm.internal.s.i(bVar.f68719p.getF68737b(), j8) < 0) {
                        bVar.f68719p.v();
                    }
                    a aVar2 = bVar.f68719p;
                    aVar2.r(aVar2.getF68736a().b(j8).a(bVar.f68712k));
                    bVar.f68719p.A(j8);
                    a aVar3 = bVar.f68719p;
                    int i14 = bVar.f68739d;
                    bVar.f68739d = -1;
                    if (i14 >= 0) {
                        aVar3.f68713l = p13.s.r(i14, aVar3.f68713l);
                    } else {
                        aVar3.getClass();
                    }
                    a aVar4 = bVar.f68719p;
                    j jVar = bVar.f68712k;
                    aVar4.getClass();
                    synchronized (obj) {
                        aVar4.f68712k = aVar4.f68712k.d(jVar);
                        Unit unit2 = Unit.INSTANCE;
                        a aVar5 = bVar.f68719p;
                        int[] iArrS = bVar.f68713l;
                        aVar5.getClass();
                        if (iArrS.length != 0) {
                            int[] iArr = aVar5.f68713l;
                            if (iArr.length != 0) {
                                iArrS = p13.s.s(iArr, iArrS);
                            }
                            aVar5.f68713l = iArrS;
                        }
                    }
                    bVar.f68715n = true;
                    if (!bVar.f68720q) {
                        bVar.f68720q = true;
                        bVar.f68719p.l();
                    }
                    return g.b.f68741a;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
