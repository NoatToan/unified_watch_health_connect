package b82;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import cq.i;
import e23.a;
import g6.f;
import h4.k;
import h4.r;
import i2.d;
import i3.mh;
import kotlin.k2;
import lc.u0;
import p005kotlin.Unit;
import p006l2.f3;
import p008y1.b2;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.x1;
import p3.x3;
import s5.w0;
import s5.x0;
import x5.l0;
import x5.q0;
import z2.h2;
import z2.u1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16616a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f16617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f16620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2.a f16621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l f16624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f16628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f16630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f16631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f16632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16633r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16634t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16635v;

    public /* synthetic */ j0(e23.q qVar, p006l2.b2 b2Var, s5.x0 x0Var, int i14, int i15, f3 f3Var, x5.l0 l0Var, x5.r0 r0Var, h4.r rVar, h4.r rVar2, h4.r rVar3, h4.r rVar4, i2.a aVar, h2 h2Var, boolean z14, boolean z15, e23.l lVar, x5.c0 c0Var, g6.c cVar) {
        this.f16617b = qVar;
        this.f16625j = b2Var;
        this.f16626k = x0Var;
        this.f16618c = i14;
        this.f16619d = i15;
        this.f16627l = f3Var;
        this.f16628m = l0Var;
        this.f16629n = r0Var;
        this.f16620e = rVar;
        this.f16630o = rVar2;
        this.f16631p = rVar3;
        this.f16632q = rVar4;
        this.f16621f = aVar;
        this.f16633r = h2Var;
        this.f16622g = z14;
        this.f16623h = z15;
        this.f16624i = lVar;
        this.f16634t = c0Var;
        this.f16635v = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x047d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0495  */
    /* JADX WARN: Code duplicated, block: B:105:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:106:0x04db  */
    /* JADX WARN: Code duplicated, block: B:112:0x050d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0556  */
    /* JADX WARN: Code duplicated, block: B:116:0x055c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0562  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0202  */
    /* JADX WARN: Code duplicated, block: B:48:0x020b  */
    /* JADX WARN: Code duplicated, block: B:49:0x020f  */
    /* JADX WARN: Code duplicated, block: B:54:0x022c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0247  */
    /* JADX WARN: Code duplicated, block: B:60:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x031f  */
    /* JADX WARN: Code duplicated, block: B:82:0x034e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0399  */
    /* JADX WARN: Code duplicated, block: B:89:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:97:0x041d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        e23.l lVar;
        h5.g.a.f fVar;
        u2 u2Var;
        f5.z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        h4.r.a aVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        s5.x0 x0Var;
        f5.z0 z0VarD2;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        i2.a aVar2;
        e23.l lVar2;
        boolean zB;
        Object objQ2;
        p3.p1 p1Var;
        boolean zR;
        Object objQ3;
        s5.x0 x0VarF;
        e23.l lVar3;
        boolean zB2;
        Object objQ4;
        p3.p1 p1Var2;
        long jB;
        boolean zBooleanValue;
        boolean z14;
        String str;
        int i14 = this.f16616a;
        Object obj3 = this.f16635v;
        Object obj4 = this.f16634t;
        Object obj5 = this.f16633r;
        Object obj6 = this.f16632q;
        Object obj7 = this.f16631p;
        Object obj8 = this.f16630o;
        Object obj9 = this.f16629n;
        Object obj10 = this.f16628m;
        Object obj11 = this.f16627l;
        Object obj12 = this.f16626k;
        Object obj13 = this.f16625j;
        e23.q qVar = this.f16617b;
        switch (i14) {
            case 0:
                x3 x3Var = (x3) obj13;
                String str2 = (String) obj12;
                String str3 = (String) obj11;
                m4.b0 b0Var = (m4.b0) obj10;
                o53.b0 b0Var2 = (o53.b0) obj7;
                p3.p1 p1Var3 = (p3.p1) obj6;
                m4.q qVar2 = (m4.q) obj4;
                Integer num = (Integer) obj3;
                e23.l lVar4 = (e23.l) obj9;
                e23.l lVar5 = (e23.l) obj8;
                p3.p1 p1Var4 = (p3.p1) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                t0 t0Var = t0.f16792a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVar = this.f16620e;
                    h4.r rVarF = x2.f(c2.l.y(rVar, 16), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22698h, bVar, mVar, 54);
                    int iHashCode4 = Long.hashCode(mVar.getU());
                    i2 i2VarX4 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarF, mVar);
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
                    b4.c(c1623g, i2VarX4, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        lVar = lVar5;
                    } else {
                        lVar = lVar5;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar);
                        u2Var = u2.f22900a;
                        h4.r rVarA = u2Var.a(r1.g0.a(rVar, null, 3), 1.0f, true);
                        z0VarD = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarA, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, z0VarD, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar);
                        c2.u uVar = c2.u.f22885a;
                        h4.r rVarB = h4.p.b(rVar, 0.0f);
                        zVarA = c2.y.a(c2.j.i(2), h4.d.a.f81536n, mVar, 54);
                        iHashCode2 = Long.hashCode(mVar.getU());
                        i2VarX2 = mVar.x();
                        rVarC2 = h4.k.c(rVarB, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, zVarA, mVar);
                        b4.c(c1623g, i2VarX2, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, mVar);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        aVar = h4.r.S;
                        h4.r rVarA2 = l4.k.a(aVar, 0.0f);
                        objQ = mVar.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new b71.o(7);
                            mVar.K(objQ);
                        }
                        h4.r rVarC5 = p5.v.c((e23.l) objQ, rVarA2, false);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var = j92.f.f97931h;
                        mh.c(str2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131068);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode3 = Long.hashCode(mVar.getU());
                        i2VarX3 = mVar.x();
                        rVarC3 = h4.k.c(aVar, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, z0VarD2, mVar);
                        b4.c(c1623g, i2VarX3, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC3, mVar);
                        if (this.f16623h) {
                            mVar.C(-1116846566);
                            if (str3 == null) {
                                str = "";
                            } else {
                                str = str3;
                            }
                            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                            mVar.f();
                        } else {
                            mVar.C(-1116576525);
                            mVar.f();
                        }
                        h4.r rVarA3 = m4.e.a(aVar, b0Var);
                        aVar2 = this.f16621f;
                        h4.r rVarA4 = i2.d.a(rVarA3, aVar2);
                        lVar2 = this.f16624i;
                        zB = mVar.B(lVar2) | mVar.r(b0Var2) | mVar.r(aVar2);
                        objQ2 = mVar.q();
                        if (!zB || objQ2 == c2565a) {
                            objQ2 = new a03.n0(lVar2, b0Var2, p1Var4, aVar2, 7);
                            p1Var = p1Var4;
                            mVar.K(objQ2);
                        } else {
                            p1Var = p1Var4;
                        }
                        h4.r rVarC6 = m4.e.c(rVarA4, (e23.l) objQ2);
                        x5.l0 l0Var = (x5.l0) p1Var3.getF182175a();
                        p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, this.f16618c, this.f16619d, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        zR = mVar.r(qVar2);
                        objQ3 = mVar.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new k0(qVar2, 0);
                            mVar.K(objQ3);
                        }
                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                        o4.t1 t1Var = new o4.t1(zl.a.a(mVar), null);
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            mVar.C(656817437);
                            x0VarF = d92.c.b(j92.f.f97933j, mVar);
                        } else {
                            mVar.C(656818623);
                            x0VarF = d92.c.f(j92.f.f97933j, mVar);
                        }
                        mVar.f();
                        lVar3 = lVar;
                        zB2 = mVar.B(num) | mVar.B(lVar4) | mVar.B(lVar3) | mVar.r(b0Var2) | mVar.r(aVar2);
                        objQ4 = mVar.q();
                        if (!zB2 || objQ4 == c2565a) {
                            p3.p1 p1Var5 = p1Var;
                            objQ4 = new l0(num, lVar4, lVar3, p1Var3, b0Var2, p1Var5, aVar2);
                            p1Var2 = p1Var5;
                            mVar.K(objQ4);
                        } else {
                            p1Var2 = p1Var;
                        }
                        p006l2.r.c(l0Var, (e23.l) objQ4, rVarC6, false, false, x0VarF, a2Var, z1Var, false, 0, 0, null, null, null, t1Var, null, mVar, 100663296, 0, 48664);
                        mVar.y();
                        mVar.y();
                        h4.r rVarB2 = h4.p.b(aVar, 1.0f);
                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            mVar.C(1317561948);
                            jB = d92.b.a(mVar).k().d();
                        } else {
                            mVar.C(1317562938);
                            jB = d92.b.a(mVar).k().b();
                        }
                        mVar.f();
                        mh.c(str2, rVarB2, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 48, 0, 131064);
                        mVar.y();
                        if (qVar == null) {
                            mVar.C(-576406653);
                            mVar.f();
                        } else {
                            mVar.C(1089784894);
                            Boolean bool = (Boolean) p1Var2.getF182175a();
                            bool.getClass();
                            qVar.invoke(bool, mVar, 0);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                        boolean z15 = this.f16622g;
                        if (!zBooleanValue || z15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r1.v1 v1VarD = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                        r1.w1.f149304a.getClass();
                        r1.c0.d(u2Var, z14, null, v1VarD, r1.w1.f149305b, null, z3.f.c(-995055899, new n0(p1Var2, lVar4, lVar3, z15, p1Var3), mVar), mVar, 1575942, 18);
                        mVar.y();
                    }
                    v.h.z(iHashCode4, mVar, iHashCode4, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar);
                    u2Var = u2.f22900a;
                    h4.r rVarA5 = u2Var.a(r1.g0.a(rVar, null, 3), 1.0f, true);
                    z0VarD = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarA5, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, z0VarD, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar);
                    c2.u uVar2 = c2.u.f22885a;
                    h4.r rVarB3 = h4.p.b(rVar, 0.0f);
                    zVarA = c2.y.a(c2.j.i(2), h4.d.a.f81536n, mVar, 54);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarB3, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    } else {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    aVar = h4.r.S;
                    h4.r rVarA6 = l4.k.a(aVar, 0.0f);
                    objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new b71.o(7);
                        mVar.K(objQ);
                    }
                    h4.r rVarC7 = p5.v.c((e23.l) objQ, rVarA6, false);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0Var = j92.f.f97931h;
                    mh.c(str2, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131068);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode3 = Long.hashCode(mVar.getU());
                    i2VarX3 = mVar.x();
                    rVarC3 = h4.k.c(aVar, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, z0VarD2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    } else {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    if (this.f16623h) {
                        mVar.C(-1116846566);
                        if (str3 == null) {
                            str = "";
                        } else {
                            str = str3;
                        }
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                        mVar.f();
                    } else {
                        mVar.C(-1116576525);
                        mVar.f();
                    }
                    h4.r rVarA7 = m4.e.a(aVar, b0Var);
                    aVar2 = this.f16621f;
                    h4.r rVarA8 = i2.d.a(rVarA7, aVar2);
                    lVar2 = this.f16624i;
                    zB = mVar.B(lVar2) | mVar.r(b0Var2) | mVar.r(aVar2);
                    objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new a03.n0(lVar2, b0Var2, p1Var4, aVar2, 7);
                        p1Var = p1Var4;
                        mVar.K(objQ2);
                    } else {
                        objQ2 = new a03.n0(lVar2, b0Var2, p1Var4, aVar2, 7);
                        p1Var = p1Var4;
                        mVar.K(objQ2);
                    }
                    h4.r rVarC8 = m4.e.c(rVarA8, (e23.l) objQ2);
                    x5.l0 l0Var2 = (x5.l0) p1Var3.getF182175a();
                    p006l2.a2 a2Var2 = new p006l2.a2(0, (Boolean) null, this.f16618c, this.f16619d, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    zR = mVar.r(qVar2);
                    objQ3 = mVar.q();
                    if (zR) {
                        objQ3 = new k0(qVar2, 0);
                        mVar.K(objQ3);
                    } else {
                        objQ3 = new k0(qVar2, 0);
                        mVar.K(objQ3);
                    }
                    p006l2.z1 z1Var2 = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                    o4.t1 t1Var2 = new o4.t1(zl.a.a(mVar), null);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(656817437);
                        x0VarF = d92.c.b(j92.f.f97933j, mVar);
                    } else {
                        mVar.C(656818623);
                        x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    }
                    mVar.f();
                    lVar3 = lVar;
                    zB2 = mVar.B(num) | mVar.B(lVar4) | mVar.B(lVar3) | mVar.r(b0Var2) | mVar.r(aVar2);
                    objQ4 = mVar.q();
                    if (zB2) {
                        p3.p1 p1Var6 = p1Var;
                        objQ4 = new l0(num, lVar4, lVar3, p1Var3, b0Var2, p1Var6, aVar2);
                        p1Var2 = p1Var6;
                        mVar.K(objQ4);
                    } else {
                        p3.p1 p1Var7 = p1Var;
                        objQ4 = new l0(num, lVar4, lVar3, p1Var3, b0Var2, p1Var7, aVar2);
                        p1Var2 = p1Var7;
                        mVar.K(objQ4);
                    }
                    p006l2.r.c(l0Var2, (e23.l) objQ4, rVarC8, false, false, x0VarF, a2Var2, z1Var2, false, 0, 0, null, null, null, t1Var2, null, mVar, 100663296, 0, 48664);
                    mVar.y();
                    mVar.y();
                    h4.r rVarB4 = h4.p.b(aVar, 1.0f);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar.C(1317561948);
                        jB = d92.b.a(mVar).k().d();
                    } else {
                        mVar.C(1317562938);
                        jB = d92.b.a(mVar).k().b();
                    }
                    mVar.f();
                    mh.c(str2, rVarB4, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 48, 0, 131064);
                    mVar.y();
                    if (qVar == null) {
                        mVar.C(-576406653);
                        mVar.f();
                    } else {
                        mVar.C(1089784894);
                        Boolean bool2 = (Boolean) p1Var2.getF182175a();
                        bool2.getClass();
                        qVar.invoke(bool2, mVar, 0);
                        mVar.f();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    boolean z16 = this.f16622g;
                    if (zBooleanValue) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    r1.v1 v1VarD2 = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                    r1.w1.f149304a.getClass();
                    r1.c0.d(u2Var, z14, null, v1VarD2, r1.w1.f149305b, null, z3.f.c(-995055899, new n0(p1Var2, lVar4, lVar3, z16, p1Var3), mVar), mVar, 1575942, 18);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                final p006l2.b2 b2Var = (p006l2.b2) obj13;
                final s5.x0 x0Var2 = (s5.x0) obj12;
                final f3 f3Var = (f3) obj11;
                final x5.l0 l0Var3 = (x5.l0) obj10;
                final x5.r0 r0Var = (x5.r0) obj9;
                final h4.r rVar2 = (h4.r) obj8;
                final h4.r rVar3 = (h4.r) obj7;
                final h4.r rVar4 = (h4.r) obj6;
                final h2 h2Var = (h2) obj5;
                final x5.c0 c0Var = (x5.c0) obj4;
                final g6.c cVar = (g6.c) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    final int i15 = this.f16618c;
                    final int i16 = this.f16619d;
                    final h4.r rVar5 = this.f16620e;
                    final i2.a aVar5 = this.f16621f;
                    final boolean z17 = this.f16622g;
                    final boolean z18 = this.f16623h;
                    final e23.l lVar6 = this.f16624i;
                    qVar.invoke(z3.f.c(-44346382, new e23.p() { // from class: l2.z0
                        /* JADX WARN: Code duplicated, block: B:12:0x0057  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.p
                        public final Object invoke(Object obj14, Object obj15) {
                            r v3Var;
                            m mVar3 = (m) obj14;
                            int iIntValue3 = ((Integer) obj15).intValue();
                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                r.a aVar6 = r.S;
                                b2 b2Var2 = b2Var;
                                r rVarJ = x2.j(aVar6, ((f) b2Var2.f108397g.getF182175a()).f75997a, 0.0f, 2);
                                k2.a aVar7 = k2.f91249a;
                                int i17 = i15;
                                int i18 = i16;
                                x0 x0Var3 = x0Var2;
                                r rVarA9 = k.a(rVarJ, aVar7, new n1(i17, i18, x0Var3));
                                boolean zR2 = mVar3.r(b2Var2);
                                Object objQ5 = mVar3.q();
                                if (zR2) {
                                    objQ5 = new v0(b2Var2, 1);
                                    mVar3.K(objQ5);
                                } else {
                                    m.f135153a.getClass();
                                    if (objQ5 == m.a.f135155b) {
                                        objQ5 = new v0(b2Var2, 1);
                                        mVar3.K(objQ5);
                                    }
                                }
                                a aVar8 = (a) objQ5;
                                f3 f3Var2 = f3Var;
                                b2 b2Var3 = (b2) f3Var2.f108485f.getF182175a();
                                l0 l0Var4 = l0Var3;
                                long j8 = l0Var4.f188879b;
                                w0.a aVar9 = w0.f157315b;
                                int iH = (int) (j8 >> 32);
                                long j14 = f3Var2.f108484e;
                                if (iH == ((int) (j14 >> 32)) && (iH = (int) (j8 & 4294967295L)) == ((int) (j14 & 4294967295L))) {
                                    iH = w0.h(j8);
                                }
                                f3Var2.f108484e = l0Var4.f188879b;
                                q0 q0VarA = u3.a(r0Var, l0Var4.f188878a);
                                int i19 = c3.a.f108431a[b2Var3.ordinal()];
                                if (i19 == 1) {
                                    v3Var = new v3(f3Var2, iH, q0VarA, aVar8);
                                } else {
                                    if (i19 != 2) {
                                        u0.r();
                                        return null;
                                    }
                                    v3Var = new p1(f3Var2, iH, q0VarA, aVar8);
                                }
                                u1.a(d.a(k.a(l4.k.c(rVarA9).then(v3Var).then(rVar5).then(rVar2), aVar7, new kh0.d(x0Var3, 17)).then(rVar3).then(rVar4), aVar5), z3.f.c(1412697320, new i(h2Var, b2Var2, z17, z18, lVar6, l0Var4, c0Var, cVar, i18), mVar3), mVar3, 48);
                            } else {
                                mVar3.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j0(h4.r rVar, e23.q qVar, boolean z14, x3 x3Var, String str, boolean z15, String str2, m4.b0 b0Var, i2.a aVar, e23.l lVar, o53.b0 b0Var2, p3.p1 p1Var, int i14, int i15, m4.q qVar2, Integer num, e23.l lVar2, e23.l lVar3, p3.p1 p1Var2) {
        this.f16620e = rVar;
        this.f16617b = qVar;
        this.f16622g = z14;
        this.f16625j = x3Var;
        this.f16626k = str;
        this.f16623h = z15;
        this.f16627l = str2;
        this.f16628m = b0Var;
        this.f16621f = aVar;
        this.f16624i = lVar;
        this.f16631p = b0Var2;
        this.f16632q = p1Var;
        this.f16618c = i14;
        this.f16619d = i15;
        this.f16634t = qVar2;
        this.f16635v = num;
        this.f16629n = lVar2;
        this.f16630o = lVar3;
        this.f16633r = p1Var2;
    }
}
