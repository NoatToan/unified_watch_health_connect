package l72;

import i3.ve;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f110884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f110885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f110886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f110887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f110888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f110889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a f110890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f110891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.a f110892l;

    public /* synthetic */ a1(String str, String str2, String str3, String str4, String str5, e23.a aVar, String str6, boolean z14, e23.a aVar2, String str7, e23.a aVar3, int i14) {
        this.f110881a = i14;
        this.f110882b = str;
        this.f110883c = str2;
        this.f110884d = str3;
        this.f110885e = str4;
        this.f110886f = str5;
        this.f110887g = aVar;
        this.f110888h = str6;
        this.f110889i = z14;
        this.f110890j = aVar2;
        this.f110891k = str7;
        this.f110892l = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0138  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        switch (this.f110881a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c1 c1Var = c1.f110940a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    k2.h hVarA = k2.i.a(8);
                    long jZ = fb1.c.z(d92.b.f58623a, mVar);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA, jZ, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(-349721798, new a1(this.f110882b, this.f110883c, this.f110884d, this.f110885e, this.f110886f, this.f110887g, this.f110888h, this.f110889i, this.f110890j, this.f110891k, this.f110892l, 1), mVar), mVar, 12582912, 105);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c1 c1Var2 = c1.f110940a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = c2.x2.f(aVar2, 1.0f);
                    float f14 = 24;
                    g6.f.a aVar3 = g6.f.f75994b;
                    float f15 = 6;
                    h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, f15, 5);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar4, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar2);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    h4.r rVarA = c2.l.A(c2.b0.f22601a.a(u1.a2.b(aVar2, u1.a2.a(mVar2), true), 1.0f, false), f14, 0.0f, 2);
                    c2.z zVarA2 = c2.y.a(kVar, aVar4, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarA, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g2, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar2);
                    String str = this.f110883c;
                    boolean zB = mVar2.B(str);
                    Object objQ = mVar2.q();
                    p3.m.a aVar6 = p3.m.f135153a;
                    if (zB) {
                        objQ = new jl0.e(str, 22);
                        mVar2.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new jl0.e(str, 22);
                            mVar2.K(objQ);
                        }
                    }
                    z3.e eVarB = e1.b(this.f110882b, x0VarB, p5.v.c((e23.l) objQ, aVar2, false), mVar2);
                    if (eVarB == null) {
                        mVar2.C(-1969859573);
                        mVar2.f();
                    } else {
                        mVar2.C(-894827850);
                        eVarB.invoke(mVar2, 0);
                        mVar2.f();
                        Unit unit = Unit.INSTANCE;
                    }
                    String str2 = this.f110884d;
                    if (str2 != null) {
                        mVar2.C(-1969168148);
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                        bVar = bVar2;
                        c1623g = c1623g2;
                        h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 0.0f, 13);
                        String str3 = this.f110885e;
                        boolean zB2 = mVar2.B(str3);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new jl0.e(str3, 23);
                            mVar2.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new jl0.e(str3, 23);
                                mVar2.K(objQ2);
                            }
                        }
                        z3.e eVarB2 = e1.b(str2, x0VarB2, p5.v.c((e23.l) objQ2, rVarC4, false), mVar2);
                        if (eVarB2 == null) {
                            mVar2.C(-1969168149);
                            mVar2.f();
                        } else {
                            mVar2.C(-894805546);
                            eVarB2.invoke(mVar2, 0);
                            mVar2.f();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        mVar2.f();
                    } else {
                        c1623g = c1623g2;
                        bVar = bVar2;
                        mVar2.C(-1969076977);
                        mVar2.C(-1969076978);
                        mVar2.f();
                        mVar2.f();
                    }
                    mVar2.y();
                    c2.l.f(c2.x2.h(aVar2, 32), mVar2);
                    h4.g.a aVar7 = h4.d.a.f81538p;
                    h4.r rVarC5 = c2.l.C(c2.x2.f(aVar2, 1.0f), 0.0f, 0.0f, f15, 0.0f, 11);
                    c2.z zVarA3 = c2.y.a(kVar, aVar7, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX3 = mVar2.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA3, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC6, mVar2);
                    e1.a(this.f110886f, false, false, this.f110887g, mVar2, 0, 4);
                    e1.a(this.f110888h, this.f110889i, false, this.f110890j, mVar2, 0, 4);
                    e1.a(this.f110891k, false, false, this.f110892l, mVar2, 0, 4);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
