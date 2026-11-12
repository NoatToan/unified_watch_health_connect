package a42;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import c2.k3;
import c2.q3;
import c2.x2;
import i3.c5;
import i3.fe;
import i3.kb;
import java.util.List;
import kotlin.t1;
import lc.m0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import ug2.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1031i;

    public /* synthetic */ g0(Activity activity, m0 m0Var, x3 x3Var, mg2.g gVar, p1 p1Var, r0 r0Var, p1 p1Var2, x3 x3Var2) {
        this.f1023a = 4;
        this.f1027e = activity;
        this.f1028f = m0Var;
        this.f1025c = x3Var;
        this.f1029g = gVar;
        this.f1030h = p1Var;
        this.f1024b = r0Var;
        this.f1031i = p1Var2;
        this.f1026d = x3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x029f  */
    /* JADX WARN: Code duplicated, block: B:52:0x032e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0361  */
    /* JADX WARN: Code duplicated, block: B:62:0x0396  */
    /* JADX WARN: Code duplicated, block: B:67:0x03c1  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15;
        e23.a aVar;
        Context context;
        lw1.f fVar;
        p3.m mVar;
        int i16 = this.f1023a;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj5 = this.f1026d;
        Object obj6 = this.f1025c;
        Object obj7 = this.f1031i;
        Object obj8 = this.f1024b;
        Object obj9 = this.f1030h;
        Object obj10 = this.f1029g;
        Object obj11 = this.f1028f;
        Object obj12 = this.f1027e;
        switch (i16) {
            case 0:
                u82.a aVar3 = (u82.a) obj12;
                u82.a aVar4 = (u82.a) obj11;
                u82.a aVar5 = (u82.a) obj10;
                e23.a aVar6 = (e23.a) obj9;
                e23.l lVar = (e23.l) obj8;
                ky0.w wVar = (ky0.w) obj7;
                x3 x3Var = (x3) obj6;
                x3 x3Var2 = (x3) obj5;
                o82.g gVar = (o82.g) obj;
                o82.a aVar7 = (o82.a) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar7);
                if ((iD & 6) == 0) {
                    i14 = (mVar2.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar2.B(aVar7) ? 32 : 16;
                }
                int i17 = i14;
                if (mVar2.n(i17 & 1, (i17 & 147) != 146)) {
                    x1 x1Var = p3.n.f135158a;
                    if (h0.a.f1032a[gVar.ordinal()] == 1) {
                        mVar2.C(958668964);
                        u82.e.b(aVar7, aVar3, null, false, z3.f.c(788363716, new c0(aVar6, lVar, wVar, x3Var, x3Var2, 0), mVar2), mVar2, ((i17 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    } else {
                        mVar2.C(959784778);
                        u82.e.b(aVar7, gVar == o82.g.f130853f ? aVar4 : aVar5, null, false, z3.f.c(880733211, new d0(aVar3, aVar6, lVar, x3Var, 0), mVar2), mVar2, ((i17 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                jy0.l lVar2 = (jy0.l) obj12;
                e23.l lVar3 = (e23.l) obj8;
                x3 x3Var3 = (x3) obj6;
                x3 x3Var4 = (x3) obj5;
                x3 x3Var5 = (x3) obj11;
                x3 x3Var6 = (x3) obj10;
                x3 x3Var7 = (x3) obj9;
                p1 p1Var = (p1) obj7;
                jy0.v vVar = (jy0.v) obj;
                c12.h hVar = (c12.h) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                vVar.getClass();
                hVar.getClass();
                if ((iIntValue & 6) == 0) {
                    i15 = (mVar3.B(vVar) ? 4 : 2) | iIntValue;
                } else {
                    i15 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i15 |= (iIntValue & 64) == 0 ? mVar3.B(hVar) : mVar3.r(hVar) ? 32 : 16;
                }
                if (mVar3.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var2 = p3.n.f135158a;
                    sy0.j jVar = (sy0.j) x3Var3.getF182175a();
                    sy0.g gVar2 = (sy0.g) x3Var4.getF182175a();
                    sy0.b bVar = (sy0.b) x3Var5.getF182175a();
                    k30.n nVar = (k30.n) x3Var6.getF182175a();
                    i53.f fVar2 = (i53.f) x3Var7.getF182175a();
                    Object objQ = mVar3.q();
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new jt1.h(p1Var, 10);
                        mVar3.K(objQ);
                    }
                    jy0.u.b(lVar2, hVar, vVar, jVar, gVar2, bVar, lVar3, nVar, fVar2, (e23.a) objQ, mVar3, (c12.h.f22556c << 3) | 806879232 | (i15 & 112) | ((i15 << 6) & 896));
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.p pVar = (e23.p) obj12;
                e23.a aVar8 = (e23.a) obj9;
                Context context2 = (Context) obj11;
                lw1.f fVar3 = (lw1.f) obj10;
                m0 m0Var = (m0) obj8;
                fe feVar = (fe) obj7;
                x3 x3Var8 = (x3) obj6;
                e23.a aVar9 = (e23.a) obj5;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var3 = p3.n.f135158a;
                g.h hVar2 = new g.h();
                boolean zB = mVar4.B(pVar) | mVar4.B(aVar8) | mVar4.r(context2) | mVar4.r(fVar3) | mVar4.r(m0Var);
                Object objQ2 = mVar4.q();
                if (zB) {
                    aVar = aVar8;
                    context = context2;
                    fVar = fVar3;
                    objQ2 = new jv0.c(pVar, aVar, context, fVar, m0Var, 10);
                    mVar4.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        aVar = aVar8;
                        context = context2;
                        fVar = fVar3;
                        objQ2 = new jv0.c(pVar, aVar, context, fVar, m0Var, 10);
                        mVar4.K(objQ2);
                    } else {
                        context = context2;
                        aVar = aVar8;
                        fVar = fVar3;
                    }
                }
                c.q qVarC = c.w.c(hVar2, (e23.l) objQ2, mVar4, 0);
                g.h hVar3 = new g.h();
                boolean zR = mVar4.r(context) | mVar4.B(aVar) | mVar4.r(m0Var);
                Object objQ3 = mVar4.q();
                if (zR) {
                    objQ3 = new ls0.h(context, 17, aVar, m0Var);
                    mVar4.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ls0.h(context, 17, aVar, m0Var);
                        mVar4.K(objQ3);
                    }
                }
                c.q qVarC2 = c.w.c(hVar3, (e23.l) objQ3, mVar4, 0);
                boolean zR2 = mVar4.r(fVar) | mVar4.B(x3Var8) | mVar4.r(context) | mVar4.r(qVarC2) | mVar4.r(qVarC);
                Object objQ4 = mVar4.q();
                if (zR2) {
                    objQ4 = new v4(fVar, context, qVarC2, qVarC, x3Var8, 22);
                    mVar4.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new v4(fVar, context, qVarC2, qVarC, x3Var8, 22);
                        mVar4.K(objQ4);
                    }
                }
                e23.a aVar10 = (e23.a) objQ4;
                boolean zR3 = mVar4.r(m0Var);
                Object objQ5 = mVar4.q();
                if (zR3) {
                    objQ5 = new nk0.l(m0Var, 1);
                    mVar4.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new nk0.l(m0Var, 1);
                        mVar4.K(objQ5);
                    }
                }
                lw1.l.a(feVar, aVar10, (e23.a) objQ5, aVar9, mVar4, 6);
                return Unit.INSTANCE;
            case 3:
                s11.d dVar = (s11.d) obj12;
                v21.e eVar = (v21.e) obj11;
                e23.l lVar4 = (e23.l) obj8;
                p1 p1Var2 = (p1) obj10;
                c5 c5Var = (c5) obj9;
                e23.l lVar5 = (e23.l) obj7;
                e23.l lVar6 = (e23.l) obj6;
                e23.l lVar7 = (e23.l) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                x1 x1Var4 = p3.n.f135158a;
                long jZ = fb1.c.z(d92.b.f58623a, mVar5);
                d92.b.f58625c.getClass();
                k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                int iHashCode = Long.hashCode(mVar5.getU());
                i2 i2VarX = mVar5.x();
                h4.r rVarC = h4.k.c(rVarF, mVar5);
                h5.g.V.getClass();
                h5.e0.a aVar11 = h5.g.a.f81805b;
                if (mVar5.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar5.z();
                if (mVar5.getT()) {
                    mVar5.M(aVar11);
                } else {
                    mVar5.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar5);
                b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar5);
                c2.b0 b0Var = c2.b0.f22601a;
                if (iIntValue2 == 1) {
                    mVar5.C(-1248133001);
                    float f94881a = ((g6.c) mVar5.A(t1.f91490h)).getF75991a();
                    float f14 = ((((Configuration) mVar5.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp * f94881a) - ((j92.b.f97899b.f97920e * f94881a) * 2)) / 360.0f;
                    lg.d.a(1.0f, f14 > f94881a ? f94881a : f14, z3.f.c(-1056045403, new r11.g(jZ, hVarA, dVar, c5Var, lVar5, lVar6), mVar5), mVar5, 390, 0);
                    mVar = mVar5;
                    mVar.f();
                } else {
                    mVar = mVar5;
                    mVar.C(-1245054515);
                    float f94881a2 = ((g6.c) mVar.A(t1.f91490h)).getF75991a();
                    float f15 = ((((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp * f94881a2) - ((j92.b.f97899b.f97920e * f94881a2) * 2)) / 360.0f;
                    lg.d.a(1.0f, f15 > f94881a2 ? f94881a2 : f15, z3.f.c(1078106108, new da0.d(hVarA, dVar, jZ, lVar7, 7), mVar), mVar, 390, 0);
                    boolean z14 = dVar.f155879a;
                    b63.v vVar2 = dVar.f155886h;
                    List<b11.l> list = dVar.f155884f;
                    Long l14 = dVar.f155885g;
                    boolean zB2 = mVar.B(p1Var2);
                    Object objQ6 = mVar.q();
                    if (zB2) {
                        objQ6 = new qk0.m(p1Var2, 15);
                        mVar.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new qk0.m(p1Var2, 15);
                            mVar.K(objQ6);
                        }
                    }
                    r11.j.b(z14, eVar, vVar2, list, l14, lVar4, (e23.a) objQ6, dVar.f155895q, mVar, 0);
                    mVar.f();
                }
                mVar.y();
                return Unit.INSTANCE;
            case 4:
                m0 m0Var2 = (m0) obj11;
                p3.m mVar6 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var5 = p3.n.f135158a;
                z3.e eVarC = z3.f.c(805462713, new ug2.n((Activity) obj12, m0Var2, (x3) obj6, 1), mVar6);
                z3.e eVarC2 = z3.f.c(-1683072905, new ug2.o((mg2.g) obj10, 2), mVar6);
                int i18 = k3.f22728a;
                kb.a(null, eVarC, null, eVarC2, null, 0, 0L, 0L, q3.b(mVar6), z3.f.c(-464237170, new ku1.l((p1) obj9, (r0) obj8, m0Var2, (p1) obj7, (x3) obj5, 20), mVar6), mVar6, 805309488, 245);
                return Unit.INSTANCE;
            default:
                v21.e eVar2 = (v21.e) obj12;
                g21.u uVar = (g21.u) obj11;
                g21.f0 f0Var = (g21.f0) obj10;
                g21.f0 f0Var2 = (g21.f0) obj9;
                i53.c cVar = (i53.c) obj8;
                String str = (String) obj7;
                g21.u uVar2 = (g21.u) obj6;
                g21.f0 f0Var3 = (g21.f0) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.m mVar7 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                x1 x1Var6 = p3.n.f135158a;
                if (iIntValue3 == 0) {
                    mVar7.C(-852390524);
                    z01.c.a(null, eVar2, null, uVar, f0Var, f0Var2, cVar, false, mVar7, 0, 133);
                    mVar7.f();
                } else if (iIntValue3 != 1) {
                    mVar7.C(-851257691);
                    z01.c.a(null, eVar2, null, uVar, f0Var, f0Var2, cVar, false, mVar7, 0, 133);
                    mVar7.f();
                } else {
                    mVar7.C(-851848365);
                    z01.c.a(null, eVar2, str, uVar2, f0Var3, f0Var2, j53.l.b(), false, mVar7, 1572864, 129);
                    mVar7.f();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(e23.p pVar, e23.a aVar, Context context, lw1.f fVar, m0 m0Var, fe feVar, x3 x3Var, e23.a aVar2) {
        this.f1023a = 2;
        this.f1027e = pVar;
        this.f1030h = aVar;
        this.f1028f = context;
        this.f1029g = fVar;
        this.f1024b = m0Var;
        this.f1031i = feVar;
        this.f1025c = x3Var;
        this.f1026d = aVar2;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i14) {
        this.f1023a = i14;
        this.f1027e = obj;
        this.f1028f = obj2;
        this.f1029g = obj3;
        this.f1030h = obj4;
        this.f1024b = obj5;
        this.f1031i = obj6;
        this.f1025c = obj7;
        this.f1026d = obj8;
    }

    public /* synthetic */ g0(jy0.l lVar, e23.l lVar2, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, p1 p1Var5, p1 p1Var6) {
        this.f1023a = 1;
        this.f1027e = lVar;
        this.f1024b = lVar2;
        this.f1025c = p1Var;
        this.f1026d = p1Var2;
        this.f1028f = p1Var3;
        this.f1029g = p1Var4;
        this.f1030h = p1Var5;
        this.f1031i = p1Var6;
    }

    public /* synthetic */ g0(s11.d dVar, v21.e eVar, e23.l lVar, p1 p1Var, c5 c5Var, e23.l lVar2, e23.l lVar3, e23.l lVar4) {
        this.f1023a = 3;
        this.f1027e = dVar;
        this.f1028f = eVar;
        this.f1024b = lVar;
        this.f1029g = p1Var;
        this.f1030h = c5Var;
        this.f1031i = lVar2;
        this.f1025c = lVar3;
        this.f1026d = lVar4;
    }
}
