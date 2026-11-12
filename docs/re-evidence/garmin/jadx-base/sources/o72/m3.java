package o72;

import i3.fb;
import i3.gb;
import i3.i7;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.b4;
import v62.c6;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m3 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130483a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f130484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130485c;

    public /* synthetic */ m3(i53.f fVar, p3.p1 p1Var) {
        this.f130484b = fVar;
        this.f130485c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f130483a;
        p3.m.a aVar = p3.m.f135153a;
        p3.p1 p1Var = this.f130485c;
        i53.f fVar = this.f130484b;
        switch (i14) {
            case 0:
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(1 & iIntValue, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = t2Var.c(aVar2, h4.d.a.f81534l);
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = c6.a(t62.b.f162798a);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    h4.r rVarU = c2.x2.u(aVar2, cVar.f97904c);
                    p5.l.f136032b.getClass();
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = tn.k.c(mVar);
                    }
                    a2.j jVar = (a2.j) objQ;
                    float f14 = cVar.f97904c / 1.5f;
                    g6.f.a aVar4 = g6.f.f75994b;
                    gb gbVarA = fb.a(f14, 4, 0L, false);
                    p5.l lVarA = p5.l.a(0);
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new j2(p1Var, 23);
                        mVar.K(objQ2);
                    }
                    i7.b(dVarA, "More options", u1.w.b(rVarU, jVar, gbVarA, false, null, lVarA, (e23.a) objQ2, 12), sn.a.b(mVar), mVar, 48, 0);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    long jG = d92.b.a(mVar).c().g();
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new j2(p1Var, 24);
                        mVar.K(objQ3);
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(-417724656, new m3(fVar, p1Var), mVar), mVar, 48, 48, 1916);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Iterator<E> it = fVar.iterator();
                    while (it.hasNext()) {
                        z3.e eVarC = z3.f.c(1598852496, new h3((String) it.next(), 2), mVar2);
                        Object objQ4 = mVar2.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new j2(p1Var, 25);
                            mVar2.K(objQ4);
                        }
                        p3.m mVar3 = mVar2;
                        i3.u.b(eVarC, (e23.a) objQ4, null, null, null, true, null, null, mVar3, 196662, 476);
                        mVar2 = mVar3;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m3(p3.p1 p1Var, i53.f fVar) {
        this.f130485c = p1Var;
        this.f130484b = fVar;
    }
}
