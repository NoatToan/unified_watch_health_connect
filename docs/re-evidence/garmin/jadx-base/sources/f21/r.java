package f21;

import b82.a1;
import c2.h2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import i3.mc;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.w1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p008y1.e1;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import u1.r1;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68609a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f68611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f68614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f68615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f68616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f68617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68618j;

    public /* synthetic */ r(gs1.t tVar, DateTime dateTime, boolean z14, tf0.i iVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, p1 p1Var) {
        this.f68616h = tVar;
        this.f68617i = dateTime;
        this.f68611c = z14;
        this.f68613e = iVar;
        this.f68612d = lVar;
        this.f68614f = lVar2;
        this.f68615g = lVar3;
        this.f68610b = lVar4;
        this.f68618j = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x031b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        yc.s sVarD;
        gs1.z userDailySummary;
        gs1.e allDayStressDTO;
        gs1.e.c payload;
        ArrayList arrayListG;
        int i14 = this.f68609a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        Object obj3 = this.f68618j;
        Object obj4 = this.f68615g;
        Object obj5 = this.f68610b;
        Object obj6 = this.f68613e;
        Object obj7 = this.f68614f;
        Object obj8 = this.f68612d;
        Object obj9 = this.f68617i;
        Object obj10 = this.f68616h;
        switch (i14) {
            case 0:
                v21.e eVar = (v21.e) obj10;
                g21.o oVar = (g21.o) obj9;
                e23.a aVar2 = (e23.a) obj6;
                h4.r rVar = (h4.r) obj5;
                e23.l lVar = (e23.l) obj8;
                e23.l lVar2 = (e23.l) obj7;
                e23.l lVar3 = (e23.l) obj4;
                gw1.d dVar = (gw1.d) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    t.a(eVar, oVar, aVar2, this.f68611c, mVar, 0);
                    i53.c<b11.i> cVar = oVar.f75470h;
                    v5.a(0.0f, 6, 2, q2.e(d92.b.f58623a, mVar), x2.f(aVar3, 1.0f), mVar);
                    if (cVar.isEmpty()) {
                        mVar.C(-1340902459);
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
                        String strQ = gl1.y.Q(mVar, R.string.no_logged_food);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(-1341467682);
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(rVar, j92.b.f97899b.f97918c), mVar);
                        mVar.C(-1013101270);
                        Iterator<b11.i> it = cVar.iterator();
                        while (it.hasNext()) {
                            e23.l lVar4 = lVar3;
                            gw1.d dVar2 = dVar;
                            p3.m mVar2 = mVar;
                            y01.f.a(eVar, it.next(), lVar, lVar2, lVar4, dVar2, mVar2, 0, 0);
                            lVar3 = lVar4;
                            dVar = dVar2;
                            mVar = mVar2;
                        }
                        p3.m mVar3 = mVar;
                        mVar3.f();
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(rVar, j92.b.f97899b.f97918c), mVar3);
                        mVar3.f();
                    }
                    mVar.y();
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                gt1.n.a((pt1.p) obj10, (h4.r) obj5, this.f68611c, (e23.l) obj8, (e23.a) obj6, (e23.l) obj7, (e23.p) obj9, (e23.a) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                h21.j.d((x01.f) obj9, (o82.a) obj6, (List) obj5, (List) obj7, this.f68611c, (g21.r) obj4, (g21.c) obj3, (v21.e) obj10, (e23.l) obj8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                l72.l.h((String) obj10, (String) obj9, (String) obj6, (String) obj8, (String) obj7, (String) obj4, (h4.r) obj5, (b92.a) obj3, this.f68611c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                l72.w wVar = l72.w.f111301a;
                ((l72.w) obj10).h((String) obj9, (e23.p) obj5, (e23.p) obj8, (e23.a) obj6, (mc) obj7, this.f68611c, (e23.p) obj4, (e23.q) obj3, (p3.m) obj, p0.t(805306375));
                return Unit.INSTANCE;
            case 5:
                pe0.f fVar = (pe0.f) obj10;
                zc.d dVar3 = (zc.d) obj9;
                e23.a aVar5 = (e23.a) obj6;
                l22.a aVar6 = (l22.a) obj5;
                e23.a aVar7 = (e23.a) obj7;
                e23.l lVar5 = (e23.l) obj8;
                p1 p1Var = (p1) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (fVar == null) {
                        mVar4.C(-114244106);
                        mVar4.f();
                    } else {
                        mVar4.C(-114244105);
                        boolean z15 = ((dVar3 == null || (sVarD = dVar3.d()) == null) ? null : sVarD.f196385a) instanceof z0.b;
                        m3.s sVarE = m3.l.e(mVar4);
                        boolean zB = mVar4.B(aVar5) | mVar4.r(dVar3);
                        Object objQ = mVar4.q();
                        if (zB) {
                            objQ = new fo.h(aVar5, dVar3, 6);
                            mVar4.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new fo.h(aVar5, dVar3, 6);
                                mVar4.K(objQ);
                            }
                        }
                        m3.l.b(z15, (e23.a) objQ, null, sVarE, null, z3.f.c(-401992895, new p003ji0.e(z15, sVarE, 15), mVar4), z3.f.c(-1312872638, new g82.d(aVar7, lVar5, aVar6, p1Var, p1Var2, fVar, dVar3, this.f68611c), mVar4), mVar4, 1769472, 20);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p1 p1Var3 = (p1) obj10;
                e23.a aVar8 = (e23.a) obj6;
                zt0.c cVar2 = (zt0.c) obj9;
                zc.d dVar4 = (zc.d) obj5;
                p1 p1Var4 = (p1) obj8;
                x3 x3Var = (x3) obj7;
                p1 p1Var5 = (p1) obj4;
                e2.i0 i0Var = (e2.i0) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.d.a(((Boolean) p1Var3.getF182175a()).booleanValue(), z3.f.c(1104676998, new s70.a0(aVar8, 26), mVar5), null, null, null, z3.f.c(754432394, new e11.n(cVar2, dVar4, p1Var3, p1Var4, x3Var, p1Var5, this.f68611c, i0Var, 20), mVar5), mVar5, 196656, 28);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                h4.r rVar2 = (h4.r) obj5;
                w02.r rVar3 = (w02.r) obj10;
                h2 h2Var = (h2) obj9;
                c2.j.l lVar6 = (c2.j.l) obj6;
                h4.d.b bVar2 = (h4.d.b) obj7;
                e1 e1Var = (e1) obj4;
                r1 r1Var = (r1) obj3;
                e23.l lVar7 = (e23.l) obj8;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    e2.i0 i0Var2 = rVar3.f181122a;
                    boolean zB2 = mVar6.B(lVar7);
                    Object objQ2 = mVar6.q();
                    if (zB2) {
                        objQ2 = new ta0.j(lVar7, 24);
                        mVar6.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ta0.j(lVar7, 24);
                            mVar6.K(objQ2);
                        }
                    }
                    e2.c.b(rVar2, i0Var2, h2Var, lVar6, bVar2, e1Var, this.f68611c, r1Var, (e23.l) objQ2, mVar6, 0, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                gs1.t tVar = (gs1.t) obj10;
                DateTime dateTime = (DateTime) obj9;
                tf0.i iVar = (tf0.i) obj6;
                e23.l lVar8 = (e23.l) obj8;
                e23.l lVar9 = (e23.l) obj7;
                e23.l lVar10 = (e23.l) obj4;
                e23.l lVar11 = (e23.l) obj5;
                p1 p1Var6 = (p1) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarD = x2.d(aVar9, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode2 = Long.hashCode(mVar7.getU());
                    i2 i2VarX2 = mVar7.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar10);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                        mVar7.C(-898106969);
                        gs1.l payload2 = (tVar == null || (userDailySummary = tVar.getUserDailySummary()) == null) ? null : userDailySummary.getPayload();
                        int i15 = gs1.l.W0;
                        wr1.g.d(payload2, mVar7, i15);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        wr1.g.a(c2.l.y(aVar9, j92.b.f97899b.f97920e), payload2, mVar7, i15 << 3);
                        wr1.g.g(payload2, mVar7, i15);
                        mVar7.f();
                    } else {
                        mVar7.C(-897701427);
                        mVar7.f();
                    }
                    wr1.g.f(dateTime, tVar, this.f68611c, iVar, lVar8, lVar9, lVar10, lVar11, mVar7, gs1.t.f78871l << 3);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            default:
                gs1.t tVar2 = (gs1.t) obj10;
                String str = (String) obj9;
                e23.l lVar12 = (e23.l) obj8;
                e23.l lVar13 = (e23.l) obj7;
                CustomBarChart customBarChart = (CustomBarChart) obj6;
                p1 p1Var7 = (p1) obj5;
                rz.a aVar11 = (rz.a) obj4;
                String str2 = (String) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    w1 w1Var = w1.TopEnd;
                    l72.x1 x1Var8 = l72.x1.EndMedium;
                    long j8 = (((long) (-248)) << 32) | (((long) 60) & 4294967295L);
                    g6.k.a aVar12 = g6.k.f76003b;
                    if (tVar2 != null && (allDayStressDTO = tVar2.getAllDayStressDTO()) != null && (payload = allDayStressDTO.getPayload()) != null && (arrayListG = payload.g()) != null && !arrayListG.isEmpty()) {
                        z14 = this.f68611c;
                    }
                    boolean z16 = z14;
                    boolean zB3 = mVar8.B(lVar12);
                    Object objQ3 = mVar8.q();
                    if (zB3) {
                        objQ3 = new ub0.h(lVar12, 18);
                        mVar8.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ub0.h(lVar12, 18);
                            mVar8.K(objQ3);
                        }
                    }
                    a1.a(str, w1Var, x1Var8, 220, j8, z16, (e23.a) objQ3, z3.f.c(-657864138, new ak0.h(lVar13, customBarChart, p1Var7, aVar11, tVar2, str2, 28), mVar8), mVar8, 100691328, 2);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(gs1.t tVar, boolean z14, String str, e23.l lVar, e23.l lVar2, CustomBarChart customBarChart, p1 p1Var, rz.a aVar, String str2) {
        this.f68616h = tVar;
        this.f68611c = z14;
        this.f68617i = str;
        this.f68612d = lVar;
        this.f68614f = lVar2;
        this.f68613e = customBarChart;
        this.f68610b = p1Var;
        this.f68615g = aVar;
        this.f68618j = str2;
    }

    public /* synthetic */ r(h4.r rVar, w02.r rVar2, h2 h2Var, c2.j.l lVar, h4.d.b bVar, e1 e1Var, boolean z14, r1 r1Var, e23.l lVar2) {
        this.f68610b = rVar;
        this.f68616h = rVar2;
        this.f68617i = h2Var;
        this.f68613e = lVar;
        this.f68614f = bVar;
        this.f68615g = e1Var;
        this.f68611c = z14;
        this.f68618j = r1Var;
        this.f68612d = lVar2;
    }

    public /* synthetic */ r(String str, String str2, String str3, String str4, String str5, String str6, h4.r rVar, b92.a aVar, boolean z14, int i14) {
        this.f68616h = str;
        this.f68617i = str2;
        this.f68613e = str3;
        this.f68612d = str4;
        this.f68614f = str5;
        this.f68615g = str6;
        this.f68610b = rVar;
        this.f68618j = aVar;
        this.f68611c = z14;
    }

    public /* synthetic */ r(l72.w wVar, String str, e23.p pVar, e23.p pVar2, e23.a aVar, mc mcVar, boolean z14, e23.p pVar3, e23.q qVar, int i14) {
        this.f68616h = wVar;
        this.f68617i = str;
        this.f68610b = pVar;
        this.f68612d = pVar2;
        this.f68613e = aVar;
        this.f68614f = mcVar;
        this.f68611c = z14;
        this.f68615g = pVar3;
        this.f68618j = qVar;
    }

    public /* synthetic */ r(p1 p1Var, e23.a aVar, zt0.c cVar, zc.d dVar, p1 p1Var2, p1 p1Var3, p1 p1Var4, boolean z14, e2.i0 i0Var) {
        this.f68616h = p1Var;
        this.f68613e = aVar;
        this.f68617i = cVar;
        this.f68610b = dVar;
        this.f68612d = p1Var2;
        this.f68614f = p1Var3;
        this.f68615g = p1Var4;
        this.f68611c = z14;
        this.f68618j = i0Var;
    }

    public /* synthetic */ r(pe0.f fVar, zc.d dVar, e23.a aVar, l22.a aVar2, e23.a aVar3, e23.l lVar, boolean z14, p1 p1Var, p1 p1Var2) {
        this.f68616h = fVar;
        this.f68617i = dVar;
        this.f68613e = aVar;
        this.f68610b = aVar2;
        this.f68614f = aVar3;
        this.f68612d = lVar;
        this.f68611c = z14;
        this.f68615g = p1Var;
        this.f68618j = p1Var2;
    }

    public /* synthetic */ r(pt1.p pVar, h4.r rVar, boolean z14, e23.l lVar, e23.a aVar, e23.l lVar2, e23.p pVar2, e23.a aVar2, e23.l lVar3, int i14) {
        this.f68616h = pVar;
        this.f68610b = rVar;
        this.f68611c = z14;
        this.f68612d = lVar;
        this.f68613e = aVar;
        this.f68614f = lVar2;
        this.f68617i = pVar2;
        this.f68618j = aVar2;
        this.f68615g = lVar3;
    }

    public /* synthetic */ r(v21.e eVar, g21.o oVar, e23.a aVar, boolean z14, h4.r rVar, e23.l lVar, e23.l lVar2, e23.l lVar3, gw1.d dVar) {
        this.f68616h = eVar;
        this.f68617i = oVar;
        this.f68613e = aVar;
        this.f68611c = z14;
        this.f68610b = rVar;
        this.f68612d = lVar;
        this.f68614f = lVar2;
        this.f68615g = lVar3;
        this.f68618j = dVar;
    }

    public /* synthetic */ r(x01.f fVar, o82.a aVar, List list, List list2, boolean z14, g21.r rVar, g21.c cVar, v21.e eVar, e23.l lVar, int i14) {
        this.f68617i = fVar;
        this.f68613e = aVar;
        this.f68610b = list;
        this.f68614f = list2;
        this.f68611c = z14;
        this.f68615g = rVar;
        this.f68618j = cVar;
        this.f68616h = eVar;
        this.f68612d = lVar;
    }
}
