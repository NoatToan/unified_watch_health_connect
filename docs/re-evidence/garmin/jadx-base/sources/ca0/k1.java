package ca0;

import b21.d7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k1 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26309a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f26311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f26313e;

    public /* synthetic */ k1(o0 o0Var, s1 s1Var, lc.m0 m0Var, e23.l lVar) {
        this.f26311c = o0Var;
        this.f26310b = s1Var;
        this.f26312d = m0Var;
        this.f26313e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26309a;
        o0 o0Var = this.f26311c;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f26312d;
        s1 s1Var = this.f26310b;
        r1.l lVar = (r1.l) obj;
        lc.v vVar = (lc.v) obj2;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, lVar, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                l90.b bVar = ((n1.e) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.e.class))).f26362a;
                ya0.c cVarA = m1.a(vVar, s1Var, m0Var, mVar);
                if (cVarA != null) {
                    boolean zR = mVar.r(m0Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new u0(m0Var, 7);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new u0(m0Var, 7);
                            mVar.K(objQ);
                        }
                    }
                    ya0.d0.a(cVarA, bVar, (e23.a) objQ, this.f26313e, mVar, 0);
                } else {
                    o0Var.invoke();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                lVar.getClass();
                vVar.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                Object objInvoke = s1Var.invoke();
                q90.d.b bVar2 = objInvoke instanceof q90.d.b ? (q90.d.b) objInvoke : null;
                o0 o0Var2 = this.f26311c;
                if (bVar2 != null) {
                    boolean zR2 = mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new d7(m0Var, 9);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new d7(m0Var, 9);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    boolean zR3 = mVar2.r(m0Var);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new d7(m0Var, 10);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new d7(m0Var, 10);
                            mVar2.K(objQ3);
                        }
                    }
                    ya0.c0.b(bVar2, null, lVar2, (e23.l) objQ3, o0Var2, this.f26313e, mVar2, 0);
                } else {
                    o0Var2.invoke();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                lVar.getClass();
                vVar.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                l90.b bVar3 = ((n1.h) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.h.class))).f26367a;
                boolean zB = mVar3.B(o0Var);
                Object objQ4 = mVar3.q();
                if (zB) {
                    objQ4 = new i1(o0Var, 0);
                    mVar3.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new i1(o0Var, 0);
                        mVar3.K(objQ4);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ4, mVar3, false);
                boolean zB2 = mVar3.B(s1Var) | mVar3.r(m0Var) | mVar3.B(o0Var);
                Object objQ5 = mVar3.q();
                if (zB2) {
                    objQ5 = new h1(s1Var, m0Var, o0Var, 1);
                    mVar3.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new h1(s1Var, m0Var, o0Var, 1);
                        mVar3.K(objQ5);
                    }
                }
                ya0.p.b(bVar3, (e23.a) objQ5, this.f26313e, mVar3, 0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k1(o0 o0Var, lc.m0 m0Var, e23.l lVar, s1 s1Var) {
        this.f26311c = o0Var;
        this.f26312d = m0Var;
        this.f26313e = lVar;
        this.f26310b = s1Var;
    }

    public /* synthetic */ k1(s1 s1Var, o0 o0Var, lc.m0 m0Var, e23.l lVar) {
        this.f26310b = s1Var;
        this.f26311c = o0Var;
        this.f26312d = m0Var;
        this.f26313e = lVar;
    }
}
