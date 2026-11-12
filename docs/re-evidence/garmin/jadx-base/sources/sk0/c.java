package sk0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import i3.ef;
import i3.ff;
import i3.hf;
import i3.i7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import v62.e4;
import v62.s6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f159638b;

    public /* synthetic */ c(p3.p1 p1Var, int i14) {
        this.f159637a = i14;
        this.f159638b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u4.d dVarA;
        String strQ;
        int i14 = this.f159637a;
        i53.c<y22.x> cVar = null;
        p3.m.a aVar = p3.m.f135153a;
        p3.p1 p1Var = this.f159638b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((m0) p1Var.getF182175a()).f159753b) {
                        mVar.C(-1291642015);
                        uk0.o.a(mVar, 6);
                        mVar.f();
                    } else {
                        mVar.C(-1291560330);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (((m0) p1Var.getF182175a()).f159754c) {
                        mVar2.C(793374113);
                        g.d(mVar2, 0);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.u(aVar2, j92.b.f97899b.f97919d), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(793524029);
                        mVar2.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(x2.q(aVar2, j92.b.f97901d.f97904c), j92.b.f97899b.f97916a);
                    s62.a.f157643a.getClass();
                    i7.b(s6.a(t62.b.f162798a), null, rVarY, sn.a.b(mVar2), mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new se0.a(15);
                        mVar3.K(objQ);
                    }
                    hf.a(((n0) p1Var.getF182175a()).f159772k, null, p5.v.b(aVar4, (e23.l) objQ), false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 88);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                i53.c<y22.x> cVar2 = ((n0) p1Var.getF182175a()).f159774m;
                if (iIntValue4 >= 0 && iIntValue4 < cVar2.size() && iIntValue5 >= 0 && iIntValue5 < cVar2.size()) {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    ArrayList arrayList = new ArrayList(cVar);
                    arrayList.add(iIntValue5, (y22.x) arrayList.remove(iIntValue4));
                    p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, null, i53.a.e(arrayList), 4095));
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (((o0) p1Var.getF182175a()).f159791c) {
                        mVar4.C(1428873093);
                        uk0.o.a(mVar4, 6);
                        mVar4.f();
                    } else {
                        mVar4.C(1428954778);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                b5.a0 a0Var = (b5.a0) obj;
                a0Var.getClass();
                p1Var.setValue(n4.c.a(a0Var.f15750c));
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    hf.a(((pe0.c) p1Var.getF182175a()).f137414i, null, null, false, d92.c.a(ff.f88115a, mVar5), mVar5, 48, 92);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                String str = (String) obj;
                ((Boolean) obj2).getClass();
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 8:
                String str2 = (String) obj;
                ((Boolean) obj2).getClass();
                str2.getClass();
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 9:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i15 = MultipleImagesShareSampleActivity.f30169a;
                if (mVar6.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    hf.a(MultipleImagesShareSampleActivity.K9(p1Var), null, null, false, d92.c.a(ff.f88115a, mVar6), mVar6, 48, 92);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.o oVarB = u4.p.b(e4.a(t62.b.f162798a), mVar7);
                    String strQ2 = gl1.y.Q(mVar7, R.string.lbl_help);
                    long jB = ds.e0.b(d92.b.f58623a, mVar7);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar5, j92.b.f97901d.f97905d);
                    Object objQ2 = mVar7.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new vd0.c(p1Var, 20);
                        mVar7.K(objQ2);
                    }
                    i7.a(oVarB, strQ2, u1.w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), jB, mVar7, 8, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i16 = TestSearchActivity.f39390b;
                if (mVar8.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    ef efVarA = d92.c.a(ff.f88115a, mVar8);
                    Object objQ3 = mVar8.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new vd0.d(p1Var, 13);
                        mVar8.K(objQ3);
                    }
                    hf.a(zBooleanValue, (e23.l) objQ3, null, false, efVarA, mVar8, 48, 92);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i17 = TestSearchActivity.f39390b;
                if (mVar9.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    ef efVarA2 = d92.c.a(ff.f88115a, mVar9);
                    Object objQ4 = mVar9.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new vd0.d(p1Var, 14);
                        mVar9.K(objQ4);
                    }
                    hf.a(zBooleanValue2, (e23.l) objQ4, null, false, efVarA2, mVar9, 48, 92);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar10, R.string.lbl_edit);
                    Object objQ5 = mVar10.q();
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new w51.j0(p1Var, 12);
                        mVar10.K(objQ5);
                    }
                    z02.f.c(3072, 54, null, (e23.a) objQ5, null, strQ3, mVar10, null);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 14:
                b5.a0 a0Var2 = (b5.a0) obj;
                a0Var2.getClass();
                p1Var.setValue(n4.c.a(a0Var2.f15750c));
                return Unit.INSTANCE;
            case 15:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar6 = StrideLengthSettingsActivity.f44198b;
                if (mVar11.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar11), mVar11, 48, 92);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        s62.a.f157643a.getClass();
                        dVarA = v62.k1.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = v62.h1.a(t62.b.f162798a);
                    }
                    u4.d dVar = dVarA;
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar12);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.c cVar3 = j92.b.f97901d;
                    i7.b(dVar, null, x2.u(x2.h(aVar7, cVar3.f97904c), cVar3.f97904c), jB2, mVar12, 48, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (((z10.s1) p1Var.getF182175a()).f201239a || ((z10.s1) p1Var.getF182175a()).f201240b) {
                        return Unit.INSTANCE;
                    }
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarE = u1.n.e(c2.l.C(rVarD, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), d92.b.a(mVar13).c().b(), o4.m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar13, 0);
                    int iHashCode2 = Long.hashCode(mVar13.getU());
                    i2 i2VarX2 = mVar13.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar13);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar13.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar13.z();
                    if (mVar13.getT()) {
                        mVar13.M(aVar8);
                    } else {
                        mVar13.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar13);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar13);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar13, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar13);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar13.C(1320931995);
                    Map<com.garmin.android.apps.connectmobile.consent.d, e23.a<Unit>> map = ((z10.s1) p1Var.getF182175a()).f201243e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<com.garmin.android.apps.connectmobile.consent.d, e23.a<Unit>> entry : map.entrySet()) {
                        com.garmin.android.apps.connectmobile.consent.d key = entry.getKey();
                        if (key.f32278b != R.string.key_strava_beacon || ((z10.s1) p1Var.getF182175a()).f201241c) {
                            if (key.f32278b != R.string.active_intelligence || ((z10.s1) p1Var.getF182175a()).f201242d) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        com.garmin.android.apps.connectmobile.consent.d dVar2 = (com.garmin.android.apps.connectmobile.consent.d) entry2.getKey();
                        e23.a aVar9 = (e23.a) entry2.getValue();
                        q92.x xVar = dVar2.f32280d;
                        c3 c3Var = dVar2.f32279c;
                        if (c3Var != null) {
                            mVar13.C(87383083);
                            strQ = gl1.d.T(c3Var, mVar13, 0);
                            mVar13.f();
                        } else {
                            mVar13.C(87475091);
                            strQ = gl1.y.Q(mVar13, dVar2.f32278b);
                            mVar13.f();
                        }
                        String str3 = strQ;
                        if (((z10.s1) p1Var.getF182175a()).f201244f.contains(xVar)) {
                            mVar13.C(87638089);
                            p2 p2Var = p2.f111205a;
                            String strQ4 = gl1.y.Q(mVar13, R.string.lbl_review_permission);
                            z10.e0.f200969a.getClass();
                            z3.e eVar = z10.e0.f200970b;
                            boolean zB = mVar13.B(aVar9);
                            Object objQ6 = mVar13.q();
                            if (zB) {
                                objQ6 = new yy1.d(aVar9, 20);
                                mVar13.K(objQ6);
                            } else {
                                aVar.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new yy1.d(aVar9, 20);
                                    mVar13.K(objQ6);
                                }
                            }
                            p2Var.h(str3, strQ4, null, null, null, false, false, null, eVar, null, (e23.a) objQ6, mVar13, 100663296, 0, 764);
                            mVar13.f();
                        } else {
                            mVar13.C(88287012);
                            p2 p2Var2 = p2.f111205a;
                            boolean zB2 = mVar13.B(aVar9);
                            Object objQ7 = mVar13.q();
                            if (zB2) {
                                objQ7 = new yy1.d(aVar9, 21);
                                mVar13.K(objQ7);
                            } else {
                                aVar.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new yy1.d(aVar9, 21);
                                    mVar13.K(objQ7);
                                }
                            }
                            p2Var2.g(str3, null, null, null, null, false, false, (e23.a) objQ7, mVar13, 0, 254);
                            mVar13.f();
                        }
                    }
                    mVar13.f();
                    mVar13.y();
                    x1 x1Var14 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }
}
