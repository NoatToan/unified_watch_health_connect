package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w2 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26512a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f26513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f26514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1 f26516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f26517f;

    public /* synthetic */ w2(t1 t1Var, o1 o1Var, e23.a aVar, s1 s1Var, lc.m0 m0Var) {
        this.f26513b = t1Var;
        this.f26516e = o1Var;
        this.f26514c = aVar;
        this.f26517f = s1Var;
        this.f26515d = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26512a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                ab0.a aVarA = b4.a(vVar, this.f26516e, this.f26514c, this.f26517f, this.f26515d, mVar);
                Object objQ = mVar.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new a2(24);
                    mVar.K(objQ);
                }
                c.w.a(48, 1, (e23.a) objQ, mVar, false);
                p3.p1 p1VarC = s9.c.c(aVarA.f2516i, mVar);
                p3.p1 p1VarC2 = s9.c.c(aVarA.f2518k, mVar);
                if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                    mVar.C(115440047);
                    da0.p.d(null, true, null, null, null, null, null, mVar, 48, 253);
                    mVar.f();
                } else {
                    mVar.C(115523189);
                    Unit unit = Unit.INSTANCE;
                    t1 t1Var = this.f26513b;
                    boolean zB = mVar.B(t1Var) | mVar.B(p1VarC2);
                    Object objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new x3(t1Var, p1VarC2, null);
                        mVar.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, unit, mVar);
                    mVar.f();
                }
                break;
            default:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                o1 o1Var = this.f26516e;
                e23.a aVar2 = this.f26514c;
                s1 s1Var = this.f26517f;
                lc.m0 m0Var = this.f26515d;
                ab0.a aVarA2 = b4.a(vVar2, o1Var, aVar2, s1Var, m0Var, mVar2);
                p3.p1 p1VarC3 = s9.c.c(aVarA2.f2523p, mVar2);
                Boolean bool = (Boolean) p1VarC3.getF182175a();
                bool.booleanValue();
                boolean zB2 = mVar2.B(p1VarC3) | mVar2.r(aVarA2);
                t1 t1Var2 = this.f26513b;
                boolean zB3 = zB2 | mVar2.B(t1Var2) | mVar2.B(aVar2) | mVar2.r(m0Var);
                Object objQ3 = mVar2.q();
                if (zB3) {
                    y3 y3Var = new y3(aVarA2, t1Var2, aVar2, m0Var, p1VarC3, null);
                    mVar2.K(y3Var);
                    objQ3 = y3Var;
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        y3 y3Var2 = new y3(aVarA2, t1Var2, aVar2, m0Var, p1VarC3, null);
                        mVar2.K(y3Var2);
                        objQ3 = y3Var2;
                    }
                }
                p3.l0.e((e23.p) objQ3, bool, mVar2);
                da0.p.d(null, true, null, null, null, null, null, mVar2, 48, 253);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w2(t1 t1Var, e23.a aVar, lc.m0 m0Var, o1 o1Var, s1 s1Var) {
        this.f26513b = t1Var;
        this.f26514c = aVar;
        this.f26515d = m0Var;
        this.f26516e = o1Var;
        this.f26517f = s1Var;
    }
}
