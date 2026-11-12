package i43;

import java.util.Collection;
import java.util.List;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f91064f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.e f91065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j f91067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j f91068e;

    static {
        i0 i0Var = new i0(r.class, "functions", "getFunctions()Ljava/util/List;", 0);
        t0 t0Var = s0.f105811a;
        f91064f = new k23.l[]{t0Var.h(i0Var), n23.j.l(r.class, "properties", "getProperties()Ljava/util/List;", 0, t0Var)};
    }

    public r(o43.n nVar, t23.e eVar, boolean z14) {
        nVar.getClass();
        eVar.getClass();
        this.f91065b = eVar;
        this.f91066c = z14;
        eVar.getKind();
        t23.f fVar = t23.f.CLASS;
        this.f91067d = nVar.g(new p(this));
        this.f91068e = nVar.g(new q(this));
    }

    @Override // i43.m, i43.l
    public final Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        List list = (List) gl1.d.B(this.f91068e, f91064f[1]);
        z43.i iVar = new z43.i();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((r0) obj).getName(), fVar)) {
                iVar.add(obj);
            }
        }
        return iVar;
    }

    @Override // i43.m, i43.l
    public final Collection c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        List list = (List) gl1.d.B(this.f91067d, f91064f[0]);
        z43.i iVar = new z43.i();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((x0) obj).getName(), fVar)) {
                iVar.add(obj);
            }
        }
        return iVar;
    }

    @Override // i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return null;
    }

    @Override // i43.m, i43.o
    public final Collection g(d dVar, e23.l lVar) {
        dVar.getClass();
        lVar.getClass();
        k23.l<Object>[] lVarArr = f91064f;
        return h0.C0((List) gl1.d.B(this.f91067d, lVarArr[0]), (List) gl1.d.B(this.f91068e, lVarArr[1]));
    }
}
