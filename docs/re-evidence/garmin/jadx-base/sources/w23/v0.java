package w23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import t23.c1;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends x implements t0 {
    public final o43.n I;
    public final c1 P;
    public t23.d T;
    public static final /* synthetic */ k23.l<Object>[] Y = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(v0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final a X = new a(null);

    private v0(o43.n nVar, c1 c1Var, t23.d dVar, t0 t0Var, u23.h hVar, t23.b.a aVar, t23.y0 y0Var) {
        super(c1Var, t0Var, hVar, x33.h.f188614f, aVar, y0Var);
        this.I = nVar;
        this.P = c1Var;
        this.f181737t = c1Var.q0();
        nVar.a(new u0(this, dVar));
        this.T = dVar;
    }

    public static v0 N0(v0 v0Var, t23.d dVar) {
        o43.n nVar = v0Var.I;
        c1 c1Var = v0Var.P;
        u23.h annotations = dVar.getAnnotations();
        t23.b.a kind = dVar.getKind();
        kind.getClass();
        c1 c1Var2 = v0Var.P;
        t23.y0 source = c1Var2.getSource();
        source.getClass();
        v0 v0Var2 = new v0(nVar, c1Var, dVar, v0Var, annotations, kind, source);
        X.getClass();
        a2 a2VarD = c1Var2.z() == null ? null : a2.d(c1Var2.E());
        if (a2VarD == null) {
            return null;
        }
        t23.u0 u0VarH = dVar.H();
        d dVarB = u0VarH != null ? u0VarH.b(a2VarD) : null;
        List<t23.u0> listS = dVar.S();
        listS.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(listS, 10));
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((t23.u0) it.next()).b(a2VarD));
        }
        List<d1> listQ = c1Var2.q();
        List<j1> listF = v0Var.f();
        p43.n0 n0Var = v0Var.f181725g;
        n0Var.getClass();
        v0Var2.H0(null, dVarB, arrayList, listQ, listF, n0Var, t23.a0.FINAL, c1Var2.getVisibility());
        return v0Var2;
    }

    @Override // w23.x
    public final x E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
        lVar.getClass();
        aVar.getClass();
        hVar.getClass();
        t23.b.a aVar2 = t23.b.a.DECLARATION;
        if (aVar != aVar2) {
            t23.b.a aVar3 = t23.b.a.SYNTHESIZED;
        }
        return new v0(this.I, this.P, this.T, this, hVar, aVar2, y0Var);
    }

    @Override // t23.k
    public final boolean L() {
        return this.T.L();
    }

    @Override // w23.x, t23.b
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final t0 f0(t23.l lVar, t23.a0 a0Var, t23.r rVar, t23.b.a aVar) {
        lVar.getClass();
        rVar.getClass();
        aVar.getClass();
        x.a aVarI0 = I0(a2.f135794b);
        aVarI0.f181744b = lVar;
        aVarI0.f181745c = a0Var;
        aVarI0.f181746d = rVar;
        aVarI0.f181748f = aVar;
        aVarI0.f181755m = false;
        u23.a aVarF0 = aVarI0.f181766x.F0(aVarI0);
        aVarF0.getClass();
        return (t0) aVarF0;
    }

    @Override // w23.x, t23.v, t23.a1
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final v0 b(a2 a2Var) {
        a2Var.getClass();
        t23.v vVarB = super.b(a2Var);
        vVarB.getClass();
        v0 v0Var = (v0) vVarB;
        p43.n0 n0Var = v0Var.f181725g;
        n0Var.getClass();
        t23.d dVarB = this.T.a().b(a2.d(n0Var));
        if (dVarB == null) {
            return null;
        }
        v0Var.T = dVarB;
        return v0Var;
    }

    @Override // w23.x, w23.p
    /* JADX INFO: renamed from: T */
    public final t23.m a() {
        t23.v vVarA = super.a();
        vVarA.getClass();
        return (t0) vVarA;
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    public final t23.a a() {
        t23.v vVarA = super.a();
        vVarA.getClass();
        return (t0) vVarA;
    }

    @Override // w23.t0
    public final t23.d a0() {
        return this.T;
    }

    @Override // w23.x, t23.v, t23.a1
    public final /* bridge */ /* synthetic */ t23.k b(a2 a2Var) {
        throw null;
    }

    @Override // w23.p, t23.l
    public final t23.i d() {
        return this.P;
    }

    @Override // t23.k
    public final t23.e e0() {
        t23.e eVarE0 = this.T.e0();
        eVarE0.getClass();
        return eVarE0;
    }

    @Override // w23.x, t23.a
    public final p43.n0 getReturnType() {
        p43.n0 n0Var = this.f181725g;
        n0Var.getClass();
        return n0Var;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // w23.p, t23.l
    public final t23.l d() {
        return this.P;
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    public final t23.b a() {
        t23.v vVarA = super.a();
        vVarA.getClass();
        return (t0) vVarA;
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    public final t23.l a() {
        t23.v vVarA = super.a();
        vVarA.getClass();
        return (t0) vVarA;
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    public final t23.v a() {
        t23.v vVarA = super.a();
        vVarA.getClass();
        return (t0) vVarA;
    }

    public /* synthetic */ v0(o43.n nVar, c1 c1Var, t23.d dVar, t0 t0Var, u23.h hVar, t23.b.a aVar, t23.y0 y0Var, p005kotlin.jvm.internal.j jVar) {
        this(nVar, c1Var, dVar, t0Var, hVar, aVar, y0Var);
    }
}
