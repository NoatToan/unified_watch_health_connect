package k11;

import c2.b0;
import c2.x2;
import ew1.v1;
import h5.e0;
import mt0.s1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f102218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f102219c;

    public /* synthetic */ k(e23.l lVar, p1 p1Var, int i14) {
        this.f102217a = i14;
        this.f102218b = lVar;
        this.f102219c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0224  */
    /* JADX WARN: Code duplicated, block: B:81:0x0288  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f102217a;
        int i15 = 15;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f102219c;
        e23.l lVar = this.f102218b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    a.f102163a.getClass();
                    z3.e eVar = a.f102168f;
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new v1(lVar, p1Var, 8);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v1(lVar, p1Var, 8);
                            mVar.K(objQ);
                        }
                    }
                    i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    w13.c cVar = n11.a.f122210f;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        n11.a aVar2 = (n11.a) bVarN.next();
                        z3.e eVarC = z3.f.c(-908036094, new kk1.h(aVar2, 28), mVar2);
                        boolean zB2 = mVar2.B(lVar) | mVar2.k(aVar2.ordinal());
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new kk1.a(lVar, 15, aVar2, p1Var);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new kk1.a(lVar, 15, aVar2, p1Var);
                                mVar2.K(objQ2);
                            }
                        }
                        p3.m mVar3 = mVar2;
                        i3.u.b(eVarC, (e23.a) objQ2, null, null, null, false, null, null, mVar3, 6, 508);
                        mVar2 = mVar3;
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF = x2.f(l4.k.b(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), k2.i.a(da0.u.f58858a)), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar4);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    b0 b0Var = b0.f22601a;
                    mVar4.C(-1809153190);
                    j90.o.f97845c.getClass();
                    for (j90.o oVar : p13.x.k(j90.o.LEFT, j90.o.RIGHT)) {
                        String strQ = gl1.y.Q(mVar4, oVar.f97855b);
                        boolean zBooleanValue = ((Boolean) lVar.invoke(oVar)).booleanValue();
                        boolean zK = mVar4.k(oVar.ordinal());
                        Object objQ3 = mVar4.q();
                        if (zK) {
                            objQ3 = new s1(28, oVar, p1Var);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new s1(28, oVar, p1Var);
                                mVar4.K(objQ3);
                            }
                        }
                        da0.u.a(null, zBooleanValue, strQ, null, null, (e23.a) objQ3, mVar4, 0, 25);
                    }
                    mVar4.f();
                    mVar4.y();
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    for (oy0.i iVar : oy0.i.f134416f) {
                        z3.e eVarC2 = z3.f.c(-436403162, new ov1.q(iVar, 2), mVar5);
                        boolean zB3 = mVar5.B(lVar) | mVar5.k(iVar.ordinal());
                        Object objQ4 = mVar5.q();
                        if (zB3) {
                            objQ4 = new nw0.p(lVar, i15, iVar, p1Var);
                            mVar5.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new nw0.p(lVar, i15, iVar, p1Var);
                                mVar5.K(objQ4);
                            }
                        }
                        i3.u.b(eVarC2, (e23.a) objQ4, null, null, null, false, null, null, mVar5, 6, 508);
                    }
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }
}
