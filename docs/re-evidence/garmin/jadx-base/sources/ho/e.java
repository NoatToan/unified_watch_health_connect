package ho;

import am.x0;
import android.content.Context;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import f5.z0;
import i3.h7;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.r0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84606a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f84607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f84608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f84609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f84611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f84612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f84613h;

    public /* synthetic */ e(x0 x0Var, boolean z14, long j8, z3.e eVar, String str, Context context, String str2) {
        this.f84609d = x0Var;
        this.f84607b = z14;
        this.f84608c = j8;
        this.f84610e = eVar;
        this.f84611f = str;
        this.f84613h = context;
        this.f84612g = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h4.r rVarG;
        int i14 = this.f84606a;
        boolean z14 = this.f84607b;
        long j8 = this.f84608c;
        Object obj4 = this.f84613h;
        Object obj5 = this.f84612g;
        Object obj6 = this.f84610e;
        Object obj7 = this.f84609d;
        Object obj8 = this.f84611f;
        switch (i14) {
            case 0:
                x0 x0Var = (x0) obj7;
                z3.e eVar = (z3.e) obj6;
                String strB = (String) obj8;
                Context context = (Context) obj4;
                String str = (String) obj5;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    u4.d dVarS = x0Var.s(z14);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    i7.b(dVarS, null, x2.q(c2.l.C(aVar, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11), j92.b.f97901d.f97905d), this.f84608c, mVar, 48, 0);
                    h4.r rVarA = t2Var.a(aVar, 1.0f, true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
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
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (strB == null) {
                        strB = new l22.a(context).b(x0Var.f4360c);
                    }
                    d92.b.f58624b.getClass();
                    mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                    if (g22.n.d(str)) {
                        mVar.C(-1454230648);
                        h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar2.f97916a, 0.0f, 0.0f, 13);
                        d6.p.f57793b.getClass();
                        mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 24960, 110588);
                        mVar.f();
                    } else {
                        mVar.C(-1453864786);
                        mVar.f();
                    }
                    mVar.y();
                    mVar.C(1275190706);
                    eVar.invoke(mVar, 0);
                    mVar.f();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.p pVar = (e23.p) obj7;
                k2.h hVar = (k2.h) obj6;
                e23.q qVar = (e23.q) obj8;
                e23.q qVar2 = (e23.q) obj5;
                e23.p pVar2 = (e23.p) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l72.w wVar = l72.w.f111301a;
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14) {
                        mVar2.C(-812346309);
                        h4.r rVarE = u1.n.e(h4.r.S, j8, m1.f128891a);
                        k3 k3Var = (k3) pVar.invoke(mVar2, 0);
                        p3.f22815b.getClass();
                        rVarG = c2.l.G(rVarE, n3.d(k3Var, p3.f22823j));
                        mVar2.f();
                    } else {
                        mVar2.C(-812156031);
                        h4.r rVarB = l4.k.b(u1.n.e(h4.r.S, j8, hVar), hVar);
                        k3 k3Var2 = (k3) pVar.invoke(mVar2, 0);
                        p3.f22815b.getClass();
                        rVarG = c2.l.G(rVarB, n3.d(k3Var2, p3.f22823j));
                        mVar2.f();
                    }
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarG, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    h4.r rVarC4 = h4.k.c(aVar4, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar3, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.g gVar = c2.j.f22698h;
                    h4.r rVarE2 = u1.n.e(x2.f(aVar4, 1.0f), p6.b.a(d92.b.f58623a, mVar2), m1.f128891a);
                    s2 s2VarA = q2.a(gVar, bVar3, mVar2, 54);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    h4.r rVarC5 = h4.k.c(rVarE2, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar3, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX4, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                    }
                    b4.c(fVar, rVarC5, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (qVar2 == null) {
                        mVar2.C(-1716517722);
                        mVar2.f();
                    } else {
                        mVar2.C(-1717939525);
                        qVar2.invoke(u2Var, mVar2, 6);
                        mVar2.f();
                        Unit unit = Unit.INSTANCE;
                    }
                    if (pVar2 == null) {
                        mVar2.C(-1716464278);
                        mVar2.f();
                    } else {
                        v.h.D(mVar2, -1717937801, pVar2, mVar2, 0);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    mVar2.y();
                    qVar.invoke(b0Var2, mVar2, 6);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                String str2 = (String) obj8;
                m4.b0 b0Var3 = (m4.b0) obj7;
                p1 p1Var = (p1) obj6;
                List list = (List) obj5;
                e23.l lVar = (e23.l) obj4;
                c2.w wVar2 = (c2.w) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(wVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF = x2.f(aVar5, 1.0f);
                    float f14 = 4;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarB2 = l4.k.b(rVarF, k2.i.a(f14));
                    d92.b.f58623a.getClass();
                    h4.r rVarE3 = u1.n.e(rVarB2, d92.b.a(mVar3).g().a().a(), m1.f128891a);
                    boolean z15 = this.f84607b;
                    h4.r rVarB3 = u1.q.b(1, j8, l4.k.a(rVarE3, z15 ? 1.0f : 0.5f), k2.i.a(f14));
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = q2.a(c0343j, h4.d.a.f81533k, mVar3, 0);
                    int iHashCode5 = Long.hashCode(mVar3.getU());
                    i2 i2VarX5 = mVar3.x();
                    h4.r rVarC6 = h4.k.c(rVarB3, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar3, iHashCode5, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar3);
                    u2 u2Var2 = u2.f22900a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar3);
                    d92.b.f58625c.getClass();
                    mh.c(str2, u2Var2.a(c2.l.z(aVar5, j92.b.f97899b.f97920e, 12), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new cr.f(b0Var3, p1Var, 1);
                        mVar3.K(objQ);
                    }
                    r0.f111217a.getClass();
                    h7.a((e23.a) objQ, null, z15, null, null, r0.f111218b, mVar3, 1572870, 58);
                    mVar3.y();
                    h4.r rVarI = x2.i(x2.u(aVar5, wVar2.j()), 0, 250);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar3);
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new l51.c(p1Var, 1);
                        mVar3.K(objQ2);
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ2, rVarI, 0L, null, null, null, jC, 0.0f, 0.0f, z3.f.c(321390304, new cr.d(list, str2, lVar, p1Var, 1), mVar3), mVar3, 48, 48, 1912);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(boolean z14, long j8, e23.p pVar, k2.h hVar, e23.q qVar, e23.q qVar2, e23.p pVar2) {
        this.f84607b = z14;
        this.f84608c = j8;
        this.f84609d = pVar;
        this.f84610e = hVar;
        this.f84611f = qVar;
        this.f84612g = qVar2;
        this.f84613h = pVar2;
    }

    public /* synthetic */ e(boolean z14, long j8, String str, m4.b0 b0Var, p1 p1Var, List list, e23.l lVar) {
        this.f84607b = z14;
        this.f84608c = j8;
        this.f84611f = str;
        this.f84609d = b0Var;
        this.f84610e = p1Var;
        this.f84612g = list;
        this.f84613h = lVar;
    }
}
