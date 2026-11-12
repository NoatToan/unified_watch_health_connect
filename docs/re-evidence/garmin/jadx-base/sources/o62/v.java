package o62;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import cw1.z0;
import i3.i7;
import i3.mh;
import i3.ve;
import o4.t1;
import p005kotlin.Unit;
import p006l2.a2;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import s5.x0;
import v62.n1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f129779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f129780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f129781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f129782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f129783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f129784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f129785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f129786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.l f129787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1 f129788k;

    public /* synthetic */ v(h4.r rVar, String str, e23.l lVar, String str2, m4.b0 b0Var, int i14, int i15, String str3, e23.l lVar2, p1 p1Var, int i16) {
        this.f129778a = i16;
        this.f129779b = rVar;
        this.f129780c = str;
        this.f129781d = lVar;
        this.f129782e = str2;
        this.f129783f = b0Var;
        this.f129784g = i14;
        this.f129785h = i15;
        this.f129786i = str3;
        this.f129787j = lVar2;
        this.f129788k = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0219  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        x5.r0 uVar;
        int i14 = 2;
        p3.m mVar = (p3.m) obj;
        switch (this.f129778a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                x xVar = x.f129810a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar = h4.d.a.f81536n;
                    h4.r.a aVar2 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar2, mVar);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVar = this.f129779b;
                    ve.a(x2.f(rVar, 1.0f), null, p6.b.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(-1877485882, new v(rVar, this.f129780c, this.f129781d, this.f129782e, this.f129783f, this.f129784g, this.f129785h, this.f129786i, this.f129787j, this.f129788k, 1), mVar), mVar, 12582912, 122);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                x xVar2 = x.f129810a;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF = x2.f(c2.l.y(this.f129779b, j92.b.f97899b.f97920e), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22698h, bVar2, mVar, 54);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    c2.j.i iVarI = c2.j.i(2);
                    h4.g.a aVar6 = h4.d.a.f81536n;
                    h4.r.a aVar7 = h4.r.S;
                    c2.z zVarA2 = c2.y.a(iVarI, aVar6, mVar, 54);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(aVar7, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarB = h4.p.b(aVar7, 1.0f);
                    d92.b.f58624b.getClass();
                    mh.c(this.f129782e, rVarB, com.nimbusds.jose.shaded.gson.internal.a.x(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar, 48, 0, 131064);
                    m4.b0 b0Var3 = this.f129783f;
                    h4.r rVarA = m4.e.a(aVar7, b0Var3);
                    boolean zB = mVar.B(b0Var3);
                    Object objQ = mVar.q();
                    p3.m.a aVar8 = p3.m.f135153a;
                    if (zB) {
                        objQ = new nw0.f(b0Var3, 5);
                        mVar.K(objQ);
                    } else {
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new nw0.f(b0Var3, 5);
                            mVar.K(objQ);
                        }
                    }
                    h4.r rVarF2 = f5.g0.f(rVarA, (e23.l) objQ);
                    p1 p1Var = this.f129788k;
                    x5.l0 l0Var = (x5.l0) p1Var.getF182175a();
                    a2 a2Var = new a2(0, (Boolean) null, this.f129784g, this.f129785h, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    t1 t1Var = new t1(zl.a.a(mVar), null);
                    x0 x0VarB = d92.c.b(j92.f.f97933j, mVar);
                    String str = this.f129786i;
                    if (str != null) {
                        uVar = new u(str);
                    } else {
                        x5.r0.f188941a.getClass();
                        uVar = x5.r0.a.f188943b;
                    }
                    x5.r0 r0Var = uVar;
                    e23.l lVar = this.f129787j;
                    boolean zB2 = mVar.B(lVar);
                    e23.l lVar2 = this.f129781d;
                    boolean zB3 = zB2 | mVar.B(lVar2);
                    Object objQ2 = mVar.q();
                    if (zB3) {
                        objQ2 = new z0(lVar, lVar2, p1Var, i14);
                        mVar.K(objQ2);
                    } else {
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new z0(lVar, lVar2, p1Var, i14);
                            mVar.K(objQ2);
                        }
                    }
                    p006l2.r.c(l0Var, (e23.l) objQ2, rVarF2, false, false, x0VarB, a2Var, null, false, 0, 0, r0Var, null, null, t1Var, null, mVar, 100663296, 0, 46744);
                    mVar.y();
                    s62.a.f157643a.getClass();
                    u4.d dVarA = n1.a(t62.b.f162798a);
                    h4.r rVarM = x2.m(aVar7, j92.b.f97901d.f97904c);
                    String str2 = this.f129780c;
                    boolean zB4 = mVar.B(str2) | mVar.B(lVar2);
                    Object objQ3 = mVar.q();
                    if (zB4) {
                        objQ3 = new cr.e(lVar2, str2, p1Var);
                        mVar.K(objQ3);
                    } else {
                        aVar8.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cr.e(lVar2, str2, p1Var);
                            mVar.K(objQ3);
                        }
                    }
                    i7.b(dVarA, null, u1.w.d(rVarM, false, null, null, (e23.a) objQ3, 15), sn.a.b(mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
