package pp;

import bv0.i;
import c2.a0;
import c2.b0;
import c2.j;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import e23.l;
import e23.q;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.b6;
import i3.i7;
import i3.y5;
import java.util.List;
import lc.u0;
import o4.m1;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.k0;
import s5.x0;
import u1.w;
import vd0.f0;
import yg2.h0;
import yg2.o;
import yg2.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139496a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f139497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f139498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f139499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f139500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f139501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f139502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f139503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f139504i;

    public /* synthetic */ c(l lVar, int i14, hv.a aVar, n1 n1Var, p1 p1Var, p1 p1Var2, String str, n1 n1Var2) {
        this.f139497b = lVar;
        this.f139498c = i14;
        this.f139500e = aVar;
        this.f139501f = n1Var;
        this.f139499d = p1Var;
        this.f139502g = p1Var2;
        this.f139503h = str;
        this.f139504i = n1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x038a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0392  */
    /* JADX WARN: Code duplicated, block: B:84:0x0395  */
    /* JADX WARN: Code duplicated, block: B:87:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0416  */
    /* JADX WARN: Code duplicated, block: B:97:0x0447  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m.a aVar;
        h5.g.a.f fVar;
        int i14;
        boolean zR;
        Object objQ;
        int i15;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        int i16 = this.f139496a;
        m.a aVar2 = m.f135153a;
        Object obj4 = this.f139504i;
        Object obj5 = this.f139499d;
        Object obj6 = this.f139503h;
        Object obj7 = this.f139502g;
        Object obj8 = this.f139501f;
        Object obj9 = this.f139500e;
        switch (i16) {
            case 0:
                r rVar = (r) obj9;
                j.e eVar = (j.e) obj8;
                pa0.b bVar = (pa0.b) obj7;
                mp.b bVar2 = (mp.b) obj6;
                p1 p1Var = (p1) obj5;
                List list = (List) obj4;
                b6 b6Var = (b6) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b6Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? mVar.B(b6Var) : mVar.r(b6Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    y5.f90403b.getClass();
                    r rVarE = b6Var.e(rVar, y5.f90404c);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(eVar, h4.d.a.f81534l, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA = u2Var.a(c2.l.C(aVar4, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), 1.0f, false);
                    int i17 = this.f139498c;
                    String str = (String) bVar.invoke(bVar2, mVar, Integer.valueOf((i17 >> 9) & 8));
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar);
                    d6.h.f57752b.getClass();
                    g02.c.a(str, rVarA, 0L, d6.h.a(d6.h.f57755e), 0, false, Integer.MAX_VALUE, x0VarB, 0.0d, mVar, 0, StatusLine.HTTP_PERM_REDIRECT);
                    r rVarG = l4.k.g(aVar4, ((Boolean) p1Var.getF182175a()).booleanValue() ? 180.0f : 0.0f);
                    b3.b.a aVar5 = b3.b.a.f15503a;
                    i7.b(d3.c.a(), null, rVarG, u0.f(mVar), mVar, 48, 0);
                    mVar.y();
                    r rVarE2 = c2.l.E(u1.n.e(aVar4, d92.b.a(mVar).c().g(), m1.f128891a), q1.Max);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    Object objQ2 = mVar.q();
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k0(p1Var, 18);
                        mVar.K(objQ2);
                    }
                    b6Var.a(zBooleanValue, (e23.a) objQ2, rVarE2, null, false, null, 0L, 0.0f, 0.0f, z3.f.c(222386646, new i(list, this.f139497b, bVar, i17, p1Var, bVar2, 4), mVar), mVar, 48, 6 | ((iIntValue << 3) & 112));
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                hv.a aVar6 = (hv.a) obj9;
                n1 n1Var = (n1) obj8;
                p1 p1Var2 = (p1) obj5;
                p1 p1Var3 = (p1) obj7;
                String str2 = (String) obj6;
                n1 n1Var2 = (n1) obj4;
                a0 a0Var = (a0) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(a0Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar7 = r.S;
                    r rVarA2 = a0Var.a(x2.f(x80.c.a(aVar7, this.f139497b), 1.0f), 0.6f, true);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC3 = k.c(rVarA2, mVar2);
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        u uVar = u.f22885a;
                        i14 = this.f139498c;
                        mVar2.N(-1621826181, mVar2.G(Integer.valueOf(i14), Integer.valueOf(n1Var.getIntValue())));
                        tb0.c.a(x2.f(aVar7, 1.0f), aVar6, i14, n1Var.getIntValue(), ((Boolean) p1Var2.getF182175a()).booleanValue(), mVar2, 6);
                        mVar2.Q();
                        mVar2.N(-1621811739, Integer.valueOf(i14));
                        r rVarF = x2.f(aVar7, 1.0f);
                        zR = mVar2.r(aVar6) | mVar2.k(i14);
                        objQ = mVar2.q();
                        if (zR) {
                            i15 = i14;
                            objQ = new rb0.b(aVar6, i15, p1Var3, n1Var, p1Var2, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i15 = i14;
                                objQ = new rb0.b(aVar6, i15, p1Var3, n1Var, p1Var2, 1);
                                mVar2.K(objQ);
                            } else {
                                i15 = i14;
                            }
                        }
                        tb0.c.d(rVarF, aVar6, i15, (l) objQ, mVar2, 6);
                        mVar2.Q();
                        mVar2.y();
                        r rVarA3 = a0Var.a(x2.f(aVar7, 1.0f), 0.4f, true);
                        j.f22691a.getClass();
                        zVarA = y.a(j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = k.c(rVarA3, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar8);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        ub0.b.a(b0.f22601a, new ba0.a((String) p1Var3.getF182175a(), gl1.y.Q(mVar2, n1Var2.getIntValue())), gl1.y.Q(mVar2, R.string.common_learn_more), str2, mVar2, 6);
                        mVar2.y();
                    }
                    v.h.z(iHashCode3, mVar2, iHashCode3, bVar4);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar2);
                    u uVar2 = u.f22885a;
                    i14 = this.f139498c;
                    mVar2.N(-1621826181, mVar2.G(Integer.valueOf(i14), Integer.valueOf(n1Var.getIntValue())));
                    tb0.c.a(x2.f(aVar7, 1.0f), aVar6, i14, n1Var.getIntValue(), ((Boolean) p1Var2.getF182175a()).booleanValue(), mVar2, 6);
                    mVar2.Q();
                    mVar2.N(-1621811739, Integer.valueOf(i14));
                    r rVarF2 = x2.f(aVar7, 1.0f);
                    zR = mVar2.r(aVar6) | mVar2.k(i14);
                    objQ = mVar2.q();
                    if (zR) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            i15 = i14;
                            objQ = new rb0.b(aVar6, i15, p1Var3, n1Var, p1Var2, 1);
                            mVar2.K(objQ);
                        } else {
                            i15 = i14;
                        }
                    } else {
                        i15 = i14;
                        objQ = new rb0.b(aVar6, i15, p1Var3, n1Var, p1Var2, 1);
                        mVar2.K(objQ);
                    }
                    tb0.c.d(rVarF2, aVar6, i15, (l) objQ, mVar2, 6);
                    mVar2.Q();
                    mVar2.y();
                    r rVarA4 = a0Var.a(x2.f(aVar7, 1.0f), 0.4f, true);
                    j.f22691a.getClass();
                    zVarA = y.a(j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = k.c(rVarA4, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                    } else {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    ub0.b.a(b0.f22601a, new ba0.a((String) p1Var3.getF182175a(), gl1.y.Q(mVar2, n1Var2.getIntValue())), gl1.y.Q(mVar2, R.string.common_learn_more), str2, mVar2, 6);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                r rVar2 = (r) obj9;
                j.e eVar3 = (j.e) obj8;
                p1 p1Var4 = (p1) obj5;
                List list2 = (List) obj4;
                l lVar = (l) obj6;
                b6 b6Var2 = (b6) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                b6Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? mVar3.B(b6Var2) : mVar3.r(b6Var2) ? 4 : 2;
                }
                int i18 = iIntValue3;
                if (mVar3.n(i18 & 1, (i18 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ3 = mVar3.q();
                    aVar2.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new vd0.c(p1Var4, 15);
                        mVar3.K(objQ3);
                    }
                    r rVarD = w.d(rVar2, false, null, null, (e23.a) objQ3, 15);
                    y5.f90403b.getClass();
                    r rVarE3 = b6Var2.e(rVarD, y5.f90404c);
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = q2.a(eVar3, h4.d.a.f81534l, mVar3, 48);
                    int iHashCode4 = Long.hashCode(mVar3.getU());
                    i2 i2VarX4 = mVar3.x();
                    r rVarC4 = k.c(rVarE3, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar3);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar3, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                    u2 u2Var2 = u2.f22900a;
                    r.a aVar10 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA5 = u2Var2.a(c2.l.C(aVar10, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), 1.0f, false);
                    l lVar2 = this.f139497b;
                    String str3 = (String) lVar2.invoke(obj7);
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97932i, ds.e0.e(mVar3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    g02.c.a(str3, rVarA5, 0L, d6.h.a(d6.h.f57755e), 0, false, this.f139498c, x0VarA, 0.0d, mVar3, 0, StatusLine.HTTP_PERM_REDIRECT);
                    i7.a(n5.c.a(R.drawable.chevron_down, mVar3, 0), null, x2.q(aVar10, j92.b.f97901d.f97904c), androidx.room.a0.c(mVar3), mVar3, 48, 0);
                    mVar3.y();
                    r rVarE4 = c2.l.E(u1.n.e(aVar10, d92.b.a(mVar3).c().g(), m1.f128891a), q1.Max);
                    boolean zBooleanValue2 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new vd0.c(p1Var4, 16);
                        mVar3.K(objQ4);
                    }
                    b6Var2.a(zBooleanValue2, (e23.a) objQ4, rVarE4, null, false, null, 0L, 0.0f, 0.0f, z3.f.c(1113397369, new f0((Object) list2, (Object) lVar, (Object) lVar2, p1Var4, 1), mVar3), mVar3, 48, 6 | ((i18 << 3) & 112));
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                yg2.a aVar11 = (yg2.a) obj9;
                o oVar = (o) obj8;
                yg2.u0 u0Var = (yg2.u0) obj7;
                h0 h0Var = (h0) obj6;
                i0 i0Var = (i0) obj5;
                o53.b0 b0Var = (o53.b0) obj4;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    q0.a(aVar11, this.f139498c, oVar, u0Var, h0Var, i0Var, b0Var, false, this.f139497b, mVar4, 12582912);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(r rVar, j.e eVar, p1 p1Var, l lVar, Object obj, int i14, List list, l lVar2) {
        this.f139500e = rVar;
        this.f139501f = eVar;
        this.f139499d = p1Var;
        this.f139497b = lVar;
        this.f139502g = obj;
        this.f139498c = i14;
        this.f139504i = list;
        this.f139503h = lVar2;
    }

    public /* synthetic */ c(r rVar, j.e eVar, pa0.b bVar, mp.b bVar2, int i14, p1 p1Var, List list, l lVar) {
        this.f139500e = rVar;
        this.f139501f = eVar;
        this.f139502g = bVar;
        this.f139503h = bVar2;
        this.f139498c = i14;
        this.f139499d = p1Var;
        this.f139504i = list;
        this.f139497b = lVar;
    }

    public /* synthetic */ c(yg2.a aVar, int i14, o oVar, yg2.u0 u0Var, h0 h0Var, i0 i0Var, o53.b0 b0Var, l lVar) {
        this.f139500e = aVar;
        this.f139498c = i14;
        this.f139501f = oVar;
        this.f139502g = u0Var;
        this.f139503h = h0Var;
        this.f139499d = i0Var;
        this.f139504i = b0Var;
        this.f139497b = lVar;
    }
}
