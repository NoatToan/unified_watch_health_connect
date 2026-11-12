package vd0;

import android.content.Context;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.v5;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f177252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f177253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f177254e;

    public /* synthetic */ f0(String str, e23.l lVar, p3.p1 p1Var, e23.a aVar) {
        this.f177250a = 4;
        this.f177253d = aVar;
        this.f177254e = str;
        this.f177251b = lVar;
        this.f177252c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:244:0x0704  */
    /* JADX WARN: Code duplicated, block: B:249:0x0721  */
    /* JADX WARN: Code duplicated, block: B:278:0x0807  */
    /* JADX WARN: Code duplicated, block: B:300:0x0884  */
    /* JADX WARN: Code duplicated, block: B:352:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:376:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0228  */
    /* JADX WARN: Code duplicated, block: B:83:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        t2 t2Var;
        p3.m mVar;
        p3.m mVar2;
        Integer weeklyAvg;
        z3.e eVar;
        boolean z14;
        int i15 = this.f177250a;
        int i16 = 21;
        int i17 = 24;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f177254e;
        int i18 = 3;
        Object obj5 = this.f177251b;
        Object obj6 = this.f177252c;
        Object obj7 = this.f177253d;
        switch (i15) {
            case 0:
                i53.c<pe0.g> cVar = (i53.c) obj7;
                p3.p1 p1Var = (p3.p1) obj6;
                e23.l lVar = (e23.l) obj5;
                pe0.g gVar = (pe0.g) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    for (pe0.g gVar2 : cVar) {
                        mVar3.N(1570923979, gVar2.name());
                        z3.e eVarC = z3.f.c(298686605, new x(gVar2, 0), mVar3);
                        boolean zB = mVar3.B(p1Var) | mVar3.B(lVar) | mVar3.k(gVar2.ordinal());
                        Object objQ = mVar3.q();
                        if (zB) {
                            i14 = i18;
                            objQ = new ug2.b0(lVar, gVar2, p1Var, i14);
                            mVar3.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                i14 = i18;
                                objQ = new ug2.b0(lVar, gVar2, p1Var, i14);
                                mVar3.K(objQ);
                            } else {
                                i14 = i18;
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ, null, null, z3.f.c(-1371303535, new u91.i(23, gVar, gVar2), mVar3), false, null, null, mVar3, 24582, 492);
                        mVar3.Q();
                        i18 = i14;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj7;
                e23.l lVar2 = (e23.l) obj5;
                e23.l lVar3 = (e23.l) obj4;
                p3.p1 p1Var2 = (p3.p1) obj6;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i19 = 0;
                    for (Object obj8 : list) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        z3.e eVarC2 = z3.f.c(499933014, new vq0.a(0, lVar3, obj8), mVar4);
                        boolean zB2 = mVar4.B(lVar2) | mVar4.k(i19);
                        Object objQ2 = mVar4.q();
                        if (zB2) {
                            objQ2 = new da0.r(i19, 2, lVar2, p1Var2);
                            mVar4.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new da0.r(i19, 2, lVar2, p1Var2);
                                mVar4.K(objQ2);
                            }
                        }
                        i3.u.b(eVarC2, (e23.a) objQ2, null, null, null, false, null, null, mVar4, 6, 508);
                        i19 = i24;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 2:
                zm1.q qVar = (zm1.q) obj7;
                String str = (String) obj6;
                zm1.q qVar2 = (zm1.q) obj5;
                String str2 = (String) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(t2Var2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (qVar != null) {
                        mVar5.C(-2003948599);
                        t2Var = t2Var2;
                        l72.x0.f111346a.a((iIntValue3 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var, null, null, String.valueOf(qVar.f205330b), j20.x.d(gl1.y.Q(mVar5, R.string.lbl_score), StringUtils.SPACE, gl1.y.Q(mVar5, R.string.symbol_dash), StringUtils.SPACE, str), null, null, mVar5);
                        mVar = mVar5;
                        mVar.f();
                    } else {
                        t2Var = t2Var2;
                        mVar = mVar5;
                        mVar.C(-2003724686);
                        mVar.f();
                    }
                    if (qVar2 != null) {
                        mVar.C(-2003659431);
                        p3.m mVar6 = mVar;
                        l72.x0.f111346a.a((iIntValue3 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var, null, null, String.valueOf(qVar2.f205330b), j20.x.d(gl1.y.Q(mVar, R.string.lbl_score), StringUtils.SPACE, gl1.y.Q(mVar, R.string.symbol_dash), StringUtils.SPACE, str2), null, null, mVar6);
                        mVar2 = mVar6;
                        mVar2.f();
                    } else {
                        mVar2 = mVar;
                        mVar2.C(-2003450894);
                        mVar2.f();
                    }
                    if (qVar == null) {
                        mVar2.C(-2003378664);
                        l72.x0.f111346a.h(t2Var, mVar2, (iIntValue3 & 14) | (l72.x0.f111348c << 3));
                        mVar2.f();
                    } else {
                        mVar2.C(-2003199918);
                        mVar2.f();
                    }
                    if (qVar2 == null) {
                        mVar2.C(-2003138662);
                        l72.x0.f111346a.h(t2Var, mVar2, (iIntValue3 & 14) | (l72.x0.f111348c << 3));
                        mVar2.f();
                    } else {
                        mVar2.C(-2003054094);
                        mVar2.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar2 = (e23.a) obj7;
                e23.l lVar4 = (e23.l) obj5;
                p3.n1 n1Var = (p3.n1) obj4;
                p3.p1 p1Var3 = (p3.p1) obj6;
                t2 t2Var3 = (t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar7.B(t2Var3) ? 4 : 2;
                }
                if (mVar7.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    boolean zB3 = mVar7.B(lVar4) | mVar7.B(n1Var);
                    Object objQ3 = mVar7.q();
                    if (zB3) {
                        objQ3 = new a11.f0(lVar4, n1Var, 8);
                        mVar7.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a11.f0(lVar4, n1Var, 8);
                            mVar7.K(objQ3);
                        }
                    }
                    wv0.s.e(t2Var3, zBooleanValue, aVar2, (e23.a) objQ3, mVar7, iIntValue4 & 14);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a<Unit> aVar3 = (e23.a) obj7;
                String str3 = (String) obj4;
                e23.l lVar5 = (e23.l) obj5;
                p3.p1 p1Var4 = (p3.p1) obj6;
                t2 t2Var4 = (t2) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar8.B(t2Var4) ? 4 : 2;
                }
                if (mVar8.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    f0Var.k(gl1.y.Q(mVar8, R.string.lbl_cancel), null, false, aVar3, mVar8, 0, 6);
                    h4.r rVarA = t2Var4.a(h4.r.S, 1.0f, true);
                    String strQ = gl1.y.Q(mVar8, R.string.lbl_edit_name);
                    d6.h.f57752b.getClass();
                    int i25 = d6.h.f57755e;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    g02.c.a(strQ, rVarA, 0L, d6.h.a(i25), 0, false, 0, d92.c.b(d92.c.e(j92.f.f97931h), mVar8), 0.0d, mVar8, 0, 372);
                    String strQ2 = gl1.y.Q(mVar8, R.string.lbl_save);
                    boolean z15 = ((x5.l0) p1Var4.getF182175a()).f188878a.f157138b.length() > 0 && !p005kotlin.jvm.internal.s.g(((x5.l0) p1Var4.getF182175a()).f188878a.f157138b, str3);
                    boolean zB4 = mVar8.B(lVar5);
                    Object objQ4 = mVar8.q();
                    if (zB4) {
                        objQ4 = new ew1.v1(lVar5, p1Var4, 26);
                        mVar8.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ew1.v1(lVar5, p1Var4, 26);
                            mVar8.K(objQ4);
                        }
                    }
                    f0Var.k(strQ2, null, z15, (e23.a) objQ4, mVar8, 0, 2);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 5:
                aa1.c cVar2 = (aa1.c) obj7;
                e23.l lVar6 = (e23.l) obj5;
                p3.p1 p1Var5 = (p3.p1) obj6;
                p3.p1 p1Var6 = (p3.p1) obj4;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    boolean zBooleanValue2 = ((Boolean) p1Var5.getF182175a()).booleanValue();
                    boolean zB5 = mVar9.B(p1Var5);
                    Object objQ5 = mVar9.q();
                    if (zB5) {
                        objQ5 = new d(p1Var5, 27);
                        mVar9.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new d(p1Var5, 27);
                            mVar9.K(objQ5);
                        }
                    }
                    e23.l lVar7 = (e23.l) objQ5;
                    boolean zB6 = mVar9.B(p1Var6);
                    Object objQ6 = mVar9.q();
                    if (zB6) {
                        objQ6 = new w51.j0(p1Var6, 28);
                        mVar9.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w51.j0(p1Var6, 28);
                            mVar9.K(objQ6);
                        }
                    }
                    x91.c.b(cVar2, zBooleanValue2, lVar6, lVar7, (e23.a) objQ6, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 6:
                String str4 = (String) obj7;
                String str5 = (String) obj5;
                Integer num = (Integer) obj4;
                p3.p1 p1Var7 = (p3.p1) obj6;
                t2 t2Var5 = (t2) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar10.B(t2Var5) ? 4 : 2;
                }
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String strQ3 = gl1.y.Q(mVar10, R.string.lbl_total_steps);
                    b92.a aVarH = ((pq1.d) p1Var7.getF182175a()).h(str4, gl1.y.Q(mVar10, R.string.lbl_total_steps));
                    int i26 = b92.a.f16960b;
                    int i27 = (iIntValue7 & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i27, 60, aVarH, t2Var5, null, null, str4, strQ3, null, null, mVar10);
                    x0Var.a(i27, 52, ((pq1.d) p1Var7.getF182175a()).h(str5, gl1.y.Q(mVar10, R.string.lbl_total_distance_steps)), t2Var5, null, null, str5, gl1.y.Q(mVar10, R.string.lbl_total_distance_steps), ((pq1.d) p1Var7.getF182175a()).d(num), null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 7:
                List<b11.l> list2 = (List) obj7;
                e23.l lVar8 = (e23.l) obj5;
                p3.p1 p1Var8 = (p3.p1) obj6;
                b11.l lVar9 = (b11.l) obj4;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    for (b11.l lVar10 : list2) {
                        z3.e eVarC3 = z3.f.c(377283275, new b(lVar10.a(w2.a0.s(mVar11)), 17), mVar11);
                        boolean zB7 = mVar11.B(lVar8) | mVar11.r(lVar10);
                        Object objQ7 = mVar11.q();
                        if (zB7) {
                            objQ7 = new y01.j(lVar8, lVar10, p1Var8, 0);
                            mVar11.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new y01.j(lVar8, lVar10, p1Var8, 0);
                                mVar11.K(objQ7);
                            }
                        }
                        i3.u.b(eVarC3, (e23.a) objQ7, null, z3.f.c(961676430, new xm0.h(10, lVar10, lVar9), mVar11), null, false, null, null, mVar11, 3078, 500);
                        if (lVar10.equals(p13.h0.m0(list2))) {
                            mVar11.C(927850759);
                            mVar11.f();
                        } else {
                            mVar11.C(927686428);
                            v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar11), null, mVar11);
                            mVar11.f();
                        }
                    }
                    p3.x1 x1Var11 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 8:
                v21.e eVar2 = (v21.e) obj7;
                g21.f0 f0Var2 = (g21.f0) obj6;
                g21.u uVar = (g21.u) obj5;
                s5.x0 x0Var2 = (s5.x0) obj4;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.r.a aVar4 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81533k;
                    s2 s2VarA = c2.q2.a(iVarI, bVar, mVar12, 0);
                    int iHashCode = Long.hashCode(mVar12.getU());
                    i2 i2VarX = mVar12.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar5);
                    } else {
                        mVar12.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, s2VarA, mVar12);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar12);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar12, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar12);
                    u2 u2Var = u2.f22900a;
                    Integer num2 = f0Var2.f75417a;
                    Double d14 = f0Var2.f75418b;
                    Double d15 = f0Var2.f75419c;
                    Double d16 = f0Var2.f75420d;
                    String strK = v21.e.k(eVar2, num2, uVar != null ? Integer.valueOf(uVar.f75500b) : null, false, 4);
                    String strJ = eVar2.j(f0Var2.f75417a, uVar != null ? Integer.valueOf(uVar.f75500b) : null, true);
                    f02.u.f67749a.getClass();
                    y01.m.b(null, strK, f02.u.b(mVar12), x0Var2, strJ, mVar12, 0);
                    y01.m.b(null, eVar2.I(d16, uVar != null ? uVar.f75506h : null, false), f02.u.g(mVar12), x0Var2, eVar2.I(d16, uVar != null ? uVar.f75506h : null, true), mVar12, 0);
                    mVar12.y();
                    s2 s2VarA2 = c2.q2.a(c2.j.i(eVar3.f97920e), bVar, mVar12, 0);
                    int iHashCode2 = Long.hashCode(mVar12.getU());
                    i2 i2VarX2 = mVar12.x();
                    h4.r rVarC2 = h4.k.c(aVar4, mVar12);
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar5);
                    } else {
                        mVar12.c();
                    }
                    b4.c(eVar4, s2VarA2, mVar12);
                    b4.c(c1623g, i2VarX2, mVar12);
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar12, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar12);
                    y01.m.b(null, eVar2.n(d15, uVar != null ? uVar.f75505g : null, false), f02.u.f(mVar12), x0Var2, eVar2.n(d15, uVar != null ? uVar.f75505g : null, true), mVar12, 0);
                    y01.m.b(null, eVar2.m(d14, uVar != null ? uVar.f75504f : null, false), f02.u.e(mVar12), x0Var2, eVar2.m(d14, uVar != null ? uVar.f75504f : null, true), mVar12, 0);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 9:
                in0.j jVar2 = (in0.j) obj7;
                un0.a aVar6 = (un0.a) obj6;
                Context context = (Context) obj5;
                i41.f fVar2 = (i41.f) obj4;
                t2 t2Var6 = (t2) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar13.B(t2Var6) ? 4 : 2;
                }
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    double d17 = jVar2.f94473c.f94450a;
                    String strQ4 = gl1.y.Q(mVar13, R.string.lbl_overnight_avg);
                    String strC = un0.a.c(aVar6, Double.valueOf(d17), false, 4);
                    String strD = aVar6.d(Double.valueOf(d17), strQ4);
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    String strQ5 = aVar6.q();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    Object objQ8 = mVar13.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ8 == c2565a) {
                        objQ8 = new ya1.h(24);
                        mVar13.K(objQ8);
                    }
                    c0235a.f16962a.put("merge", oi0.c.A(context, (e23.l) objQ8, strD));
                    b92.a aVarB = c0235a.b();
                    int i28 = iIntValue10 & 14;
                    int i29 = b92.a.f16960b;
                    int i30 = i28 | (l72.x0.f111348c << 24);
                    x0Var3.a(i30, 52, aVarB, t2Var6, null, null, strC, strQ4, strQ5, null, mVar13);
                    Double dValueOf = (fVar2 == null || (weeklyAvg = fVar2.getWeeklyAvg()) == null) ? null : Double.valueOf(weeklyAvg.intValue());
                    String strQ6 = gl1.y.Q(mVar13, R.string.ohrv_status);
                    String strC2 = un0.a.c(aVar6, dValueOf, false, 4);
                    String strD2 = aVar6.d(dValueOf, strQ6);
                    String strQ7 = aVar6.q();
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    Object objQ9 = mVar13.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new ya1.h(25);
                        mVar13.K(objQ9);
                    }
                    c0235a2.f16962a.put("merge", oi0.c.A(context, (e23.l) objQ9, strD2));
                    x0Var3.a(i30, 52, c0235a2.b(), t2Var6, null, null, strC2, strQ6, strQ7, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 10:
                Context context2 = (Context) obj7;
                List list3 = (List) obj6;
                List list4 = (List) obj5;
                nr.g.n nVar = (nr.g.n) obj4;
                h4.r rVar = (h4.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar14.B(rVar) ? 4 : 2;
                }
                if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarThen = x2.h(x2.f(h4.r.S, 1.0f), 300).then(rVar);
                    boolean zR = mVar14.r(context2);
                    Object objQ10 = mVar14.q();
                    if (zR) {
                        objQ10 = new ot.c(context2, 25);
                        mVar14.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ot.c(context2, 25);
                            mVar14.K(objQ10);
                        }
                    }
                    e23.l lVar11 = (e23.l) objQ10;
                    boolean zR2 = mVar14.r(list3) | mVar14.r(list4) | mVar14.r(nVar);
                    Object objQ11 = mVar14.q();
                    if (zR2) {
                        objQ11 = new wn2.f(list3, i16, list4, nVar);
                        mVar14.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new wn2.f(list3, i16, list4, nVar);
                            mVar14.K(objQ11);
                        }
                    }
                    p002j6.c.b(lVar11, rVarThen, (e23.l) objQ11, mVar14, 0, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 11:
                ArrayList arrayList = (ArrayList) obj7;
                e23.l lVar12 = (e23.l) obj5;
                p3.n1 n1Var2 = (p3.n1) obj4;
                p3.p1 p1Var9 = (p3.p1) obj6;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar15.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    int i34 = 0;
                    for (Object obj9 : arrayList) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        o13.p pVar = (o13.p) obj9;
                        if (n1Var2.getIntValue() == i34) {
                            z21.b.f201986a.getClass();
                            eVar = z21.b.f201994i;
                        } else {
                            z21.b.f201986a.getClass();
                            eVar = z21.b.f201995j;
                        }
                        z3.e eVar5 = eVar;
                        String strP = gl1.y.P(R.string.string_string_bracket_pattern, new Object[]{pVar.f128594a, pVar.f128595b}, mVar15);
                        h4.r.a aVar8 = h4.r.S;
                        Object objQ12 = mVar15.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ12 == c2565a2) {
                            objQ12 = new yq.d(21);
                            mVar15.K(objQ12);
                        }
                        h4.r rVarC3 = p5.v.c((e23.l) objQ12, aVar8, true);
                        z3.e eVarC4 = z3.f.c(1530957183, new xm0.h(27, pVar, strP), mVar15);
                        boolean zK = mVar15.k(i34) | mVar15.B(lVar12);
                        Object objQ13 = mVar15.q();
                        if (zK || objQ13 == c2565a2) {
                            objQ13 = new n40.c(i34, lVar12, n1Var2, p1Var9);
                            mVar15.K(objQ13);
                        }
                        i3.u.b(eVarC4, (e23.a) objQ13, rVarC3, null, eVar5, false, null, null, mVar15, 6, 488);
                        i34 = i35;
                    }
                    p3.x1 x1Var16 = p3.n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            default:
                List<w20.b> list5 = (List) obj7;
                w20.b bVar3 = (w20.b) obj6;
                e23.l lVar13 = (e23.l) obj5;
                e23.l lVar14 = (e23.l) obj4;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar16.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    for (w20.b bVar4 : list5) {
                        boolean z16 = bVar4 == bVar3;
                        h4.r.a aVar9 = h4.r.S;
                        Object objQ14 = mVar16.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                        if (objQ14 == c2565a3) {
                            objQ14 = new yq.d(24);
                            mVar16.K(objQ14);
                        }
                        h4.r rVarC4 = p5.v.c((e23.l) objQ14, aVar9, true);
                        z3.e eVarC5 = z3.f.c(1969963367, new yr.d(bVar4, 22), mVar16);
                        boolean zK2 = mVar16.k(bVar4.ordinal()) | mVar16.B(lVar13) | mVar16.h(z16) | mVar16.B(lVar14);
                        Object objQ15 = mVar16.q();
                        if (zK2 || objQ15 == c2565a3) {
                            boolean z17 = z16;
                            objQ15 = new an0.d(lVar13, z17, lVar14, bVar4, 6);
                            z14 = z17;
                            mVar16.K(objQ15);
                        } else {
                            z14 = z16;
                        }
                        i3.u.b(eVarC5, (e23.a) objQ15, rVarC4, null, z3.f.c(-2072700821, new rw0.g(z14, i17), mVar16), false, null, null, mVar16, 24582, 488);
                    }
                    p3.x1 x1Var18 = p3.n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f177250a = i14;
        this.f177253d = obj;
        this.f177252c = obj2;
        this.f177251b = obj3;
        this.f177254e = obj4;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, p3.p1 p1Var, int i14) {
        this.f177250a = i14;
        this.f177253d = obj;
        this.f177251b = obj2;
        this.f177254e = obj3;
        this.f177252c = p1Var;
    }

    public /* synthetic */ f0(Object obj, e23.l lVar, p3.p1 p1Var, Object obj2, int i14) {
        this.f177250a = i14;
        this.f177253d = obj;
        this.f177251b = lVar;
        this.f177252c = p1Var;
        this.f177254e = obj2;
    }
}
