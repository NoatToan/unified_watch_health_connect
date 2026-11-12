package t42;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import s70.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f162345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f162346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f162347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162348e;

    public /* synthetic */ i(int i14, int i15, String str, String str2, String str3) {
        this.f162344a = i15;
        this.f162345b = str;
        this.f162346c = str2;
        this.f162347d = str3;
        this.f162348e = i14;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x0358  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f162344a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = this.f162348e;
        String str = this.f162346c;
        switch (i14) {
            case 0:
                c2.t tVar = (c2.t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar2, h4.d.a.f81529g);
                    h4.g.a aVar3 = h4.d.a.f81538p;
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97932i, mVar));
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(this.f162345b, c2.l.A(aVar2, eVar2.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, mVar, 0, 0, 131068);
                    float f14 = eVar2.f97917b;
                    float f15 = eVar2.f97920e;
                    h4.r rVarC3 = c2.l.C(aVar2, f15, f14, f15, 0.0f, 8);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar);
                    u2 u2Var = u2.f22900a;
                    x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new r0(str, 16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r0(str, 16);
                            mVar.K(objQ);
                        }
                    }
                    mh.c(this.f162347d, p5.v.c((e23.l) objQ, aVar2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                    g6.f.a aVar5 = g6.f.f75994b;
                    i7.a(n5.c.a(i15, mVar, 0), null, x2.q(aVar2, 14), sn.a.b(mVar), mVar, 432, 0);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar2) ? 4 : 2;
                }
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC5 = tVar2.c(aVar6, h4.d.a.f81529g);
                    h4.g.a aVar7 = h4.d.a.f81538p;
                    c2.j.f22691a.getClass();
                    z zVarA2 = y.a(c2.j.f22694d, aVar7, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, zVarA2, mVar2);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX3, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC6, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    String str2 = this.f162345b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarE2 = d92.c.e(d92.c.b(j92.f.f97932i, mVar2));
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    mh.c(str2, c2.l.A(aVar6, eVar4.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, mVar2, 0, 0, 131068);
                    float f16 = eVar4.f97917b;
                    float f17 = eVar4.f97920e;
                    h4.r rVarC7 = c2.l.C(aVar6, f17, f16, f17, 0.0f, 8);
                    s2 s2VarA2 = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar2, 48);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    h4.r rVarC8 = h4.k.c(rVarC7, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar3, s2VarA2, mVar2);
                    b4.c(c1623g2, i2VarX4, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                    }
                    b4.c(fVar2, rVarC8, mVar2);
                    u2 u2Var2 = u2.f22900a;
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar2);
                    boolean zB2 = mVar2.B(str);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new r0(str, 18);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new r0(str, 18);
                            mVar2.K(objQ2);
                        }
                    }
                    mh.c(this.f162347d, p5.v.c((e23.l) objQ2, aVar6, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 131068);
                    g6.f.a aVar9 = g6.f.f75994b;
                    i7.a(n5.c.a(i15, mVar2, 0), null, x2.q(aVar6, 14), sn.a.b(mVar2), mVar2, 432, 0);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
