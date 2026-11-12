package ca0;

import b21.d7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26305a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f26307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f26308d;

    public /* synthetic */ k0(t1 t1Var, lc.m0 m0Var, e23.l lVar) {
        this.f26307c = t1Var;
        this.f26306b = m0Var;
        this.f26308d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26305a;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f26306b;
        r1.l lVar = (r1.l) obj;
        lc.v vVar = (lc.v) obj2;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).intValue();
                lVar.getClass();
                vVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                l90.k kVar = ((b1.f) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(b1.f.class))).f26096a;
                ta0.x xVarA = y0.a(vVar, m0Var, mVar);
                boolean zR = mVar.r(m0Var);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new u0(m0Var, 2);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u0(m0Var, 2);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zR2 = mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new d7(m0Var, 7);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d7(m0Var, 7);
                        mVar.K(objQ2);
                    }
                }
                e23.l lVar2 = (e23.l) objQ2;
                boolean zR3 = mVar.r(m0Var) | mVar.r(kVar);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new bp.h(19, m0Var, kVar);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new bp.h(19, m0Var, kVar);
                        mVar.K(objQ3);
                    }
                }
                ta0.q.a(xVarA, kVar, this.f26307c, aVar2, lVar2, (e23.l) objQ3, this.f26308d, mVar, 0);
                break;
            default:
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                lVar.getClass();
                vVar.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                b1.j jVar = (b1.j) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(b1.j.class));
                ta0.x xVarA2 = y0.a(vVar, m0Var, mVar2);
                boolean zR4 = mVar2.r(xVarA2) | mVar2.r(m0Var);
                Object objQ4 = mVar2.q();
                if (zR4) {
                    objQ4 = new m0(xVarA2, m0Var, 1);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new m0(xVarA2, m0Var, 1);
                        mVar2.K(objQ4);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ4, mVar2, false);
                String str = jVar.f26104b;
                l90.k kVar2 = jVar.f26103a;
                boolean zR5 = mVar2.r(m0Var);
                Object objQ5 = mVar2.q();
                if (zR5) {
                    objQ5 = new u0(m0Var, 1);
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new u0(m0Var, 1);
                        mVar2.K(objQ5);
                    }
                }
                ta0.h0.a(xVarA2, str, kVar2, this.f26307c, (e23.a) objQ5, this.f26308d, mVar2, 0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k0(lc.m0 m0Var, t1 t1Var, e23.l lVar) {
        this.f26306b = m0Var;
        this.f26307c = t1Var;
        this.f26308d = lVar;
    }
}
