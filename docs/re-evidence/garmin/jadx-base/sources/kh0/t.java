package kh0;

import c2.a0;
import c2.b0;
import c2.c1;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f104765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f104766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f104767d;

    public /* synthetic */ t(e23.a aVar, String str, String str2) {
        this.f104764a = 0;
        this.f104767d = aVar;
        this.f104765b = str;
        this.f104766c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ee  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jB;
        int i14 = this.f104764a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f104767d;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar3, 16);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    if (aVar2 != null) {
                        mVar.C(321061385);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar).k().a();
                    } else {
                        mVar.C(321062282);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar).k().b();
                    }
                    mVar.f();
                    long j8 = jB;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f104765b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(d92.c.e(j92.f.f97932i), j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131070);
                    mh.c(this.f104766c, c2.l.C(aVar3, 0.0f, 4, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 48, 0, 131068);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(aVar6, j92.b.f97899b.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarY2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    wv0.p.a(this.f104765b, this.f104766c, this.f104767d, mVar2, 0, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarE = wz1.i.e(aVar8, this.f104765b == null, new w52.s(19), mVar3, 6);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f104766c, rVarE, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), mVar3), mVar3, 0, 0, 131068);
                    if (aVar2 != null) {
                        mVar3.C(-1298706830);
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(c2.l.C(aVar8, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97903b);
                        boolean zB = mVar3.B(aVar2);
                        Object objQ = mVar3.q();
                        if (zB) {
                            objQ = new w51.j(aVar2, 28);
                            mVar3.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new w51.j(aVar2, 28);
                                mVar3.K(objQ);
                            }
                        }
                        i7.a(n5.c.a(R.drawable.about, mVar3, 0), gl1.y.Q(mVar3, R.string.lbl_about), u1.w.d(rVarQ, false, null, null, (e23.a) objQ, 15), sn.a.b(mVar3), mVar3, 0, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-1298272985);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String str = this.f104765b;
                    if (str == null) {
                        mVar4.C(-86365069);
                        mVar4.f();
                    } else {
                        mVar4.C(-86365068);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC3 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar4);
                        d6.h.f57752b.getClass();
                        mh.c(str, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130044);
                        mVar4.f();
                    }
                    String str2 = this.f104766c;
                    if (str2 == null) {
                        mVar4.C(-86033431);
                        mVar4.f();
                    } else {
                        mVar4.C(-86033430);
                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                        p5.l.f136032b.getClass();
                        p5.l lVarA = p5.l.a(0);
                        boolean zB2 = mVar4.B(aVar2);
                        Object objQ2 = mVar4.q();
                        if (zB2) {
                            objQ2 = new ya0.l(aVar2, 0);
                            mVar4.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ya0.l(aVar2, 0);
                                mVar4.K(objQ2);
                            }
                        }
                        h4.r rVarD = u1.w.d(rVarC4, false, null, lVarA, (e23.a) objQ2, 11);
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar4);
                        long jE = ds.e0.e(mVar4);
                        d6.h.f57752b.getClass();
                        mh.c(str2, rVarD, jE, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130040);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t(String str, int i14, String str2, e23.a aVar) {
        this.f104764a = i14;
        this.f104765b = str;
        this.f104766c = str2;
        this.f104767d = aVar;
    }
}
