package da0;

import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import i3.b6;
import i3.i7;
import i3.mh;
import i3.y5;
import java.util.ArrayList;
import java.util.List;
import l72.p2;
import lc.u0;
import o4.m1;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58841a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q f58844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f58846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f58847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1 f58848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f58849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f58850j;

    public /* synthetic */ q(h4.r rVar, c2.j.e eVar, e23.q qVar, Object obj, int i14, x0 x0Var, p1 p1Var, ArrayList arrayList, e23.l lVar) {
        this.f58842b = rVar;
        this.f58843c = eVar;
        this.f58844d = qVar;
        this.f58845e = obj;
        this.f58846f = i14;
        this.f58849i = x0Var;
        this.f58848h = p1Var;
        this.f58850j = arrayList;
        this.f58847g = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f58841a;
        Object obj4 = this.f58850j;
        Object obj5 = this.f58849i;
        Object obj6 = this.f58843c;
        Object obj7 = this.f58842b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj7;
                c2.j.e eVar = (c2.j.e) obj6;
                x0 x0Var = (x0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                b6 b6Var = (b6) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b6Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? mVar.B(b6Var) : mVar.r(b6Var) ? 4 : 2;
                }
                int i15 = iIntValue;
                if (mVar.n(i15 & 1, (i15 & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(eVar, h4.d.a.f81534l, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVar, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = u2Var.a(c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), 1.0f, false);
                    int i16 = this.f58846f;
                    Integer numValueOf = Integer.valueOf((i16 >> 9) & 8);
                    e23.q qVar = this.f58844d;
                    Object obj8 = this.f58845e;
                    String str = (String) qVar.invoke(obj8, mVar, numValueOf);
                    d6.h.f57752b.getClass();
                    g02.c.a(str, rVarA, 0L, d6.h.a(d6.h.f57755e), 0, false, Integer.MAX_VALUE, x0Var, 0.0d, mVar, 0, StatusLine.HTTP_PERM_REDIRECT);
                    y5.f90403b.getClass();
                    h4.r rVarE = b6Var.e(aVar2, y5.f90404c);
                    p1 p1Var = this.f58848h;
                    h4.r rVarG = l4.k.g(rVarE, ((Boolean) p1Var.getF182175a()).booleanValue() ? 180.0f : 0.0f);
                    b3.b.a aVar3 = b3.b.a.f15503a;
                    i7.b(d3.c.a(), null, rVarG, u0.f(mVar), mVar, 48, 0);
                    mVar.y();
                    h4.r rVarE2 = c2.l.E(u1.n.e(aVar2, d92.b.a(mVar).c().g(), m1.f128891a), q1.Max);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.k(p1Var, 21);
                        mVar.K(objQ);
                    }
                    b6Var.a(zBooleanValue, (e23.a) objQ, rVarE2, null, false, null, 0L, 0.0f, 0.0f, z3.f.c(844757558, new bv0.i(arrayList, this.f58847g, qVar, i16, p1Var, obj8, 1), mVar), mVar, 48, 6 | ((i15 << 3) & 112));
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                h4.r rVar2 = (h4.r) obj7;
                c2.j.e eVar2 = (c2.j.e) obj6;
                List list = (List) obj5;
                e23.l lVar = (e23.l) obj4;
                b6 b6Var2 = (b6) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b6Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? mVar2.B(b6Var2) : mVar2.r(b6Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    y5.f90403b.getClass();
                    h4.r rVarE3 = b6Var2.e(rVar2, y5.f90404c);
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = q2.a(eVar2, h4.d.a.f81534l, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarE3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u2 u2Var2 = u2.f22900a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = u2Var2.a(c2.l.C(aVar5, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), 1.0f, false);
                    int i17 = (this.f58846f >> 3) & 8;
                    Integer numValueOf2 = Integer.valueOf(i17);
                    e23.q qVar2 = this.f58844d;
                    Object obj9 = this.f58845e;
                    String str2 = (String) qVar2.invoke(obj9, mVar2, numValueOf2);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar2);
                    d6.h.f57752b.getClass();
                    mh.c(str2, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    uk0.m.d(b6Var2, list, this.f58847g, lVar, obj9, qVar2, this.f58848h, mVar2, (iIntValue2 & 14) | (i17 << 12));
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                String str3 = (String) obj7;
                String str4 = (String) obj6;
                List list2 = (List) obj5;
                e23.l lVar2 = (e23.l) obj4;
                b6 b6Var3 = (b6) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                b6Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? mVar3.B(b6Var3) : mVar3.r(b6Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    h4.r.a aVar6 = h4.r.S;
                    y5.f90403b.getClass();
                    p2Var.h(str3, str4, null, b6Var3.e(aVar6, y5.f90404c), null, false, false, null, z3.f.c(-1720425310, new uk0.k(b6Var3, list2, this.f58847g, lVar2, this.f58845e, this.f58844d, this.f58848h, this.f58846f, 1), mVar3), null, null, mVar3, 100663296, 0, 1780);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(h4.r rVar, c2.j.C0343j c0343j, e23.q qVar, Object obj, int i14, List list, e23.l lVar, e23.l lVar2, p1 p1Var) {
        this.f58842b = rVar;
        this.f58843c = c0343j;
        this.f58844d = qVar;
        this.f58845e = obj;
        this.f58846f = i14;
        this.f58849i = list;
        this.f58847g = lVar;
        this.f58850j = lVar2;
        this.f58848h = p1Var;
    }

    public /* synthetic */ q(String str, String str2, List list, e23.l lVar, e23.l lVar2, Object obj, e23.q qVar, p1 p1Var, int i14) {
        this.f58842b = str;
        this.f58843c = str2;
        this.f58849i = list;
        this.f58847g = lVar;
        this.f58850j = lVar2;
        this.f58845e = obj;
        this.f58844d = qVar;
        this.f58848h = p1Var;
        this.f58846f = i14;
    }
}
