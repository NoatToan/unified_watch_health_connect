package x91;

import android.content.Context;
import c2.a0;
import c2.b0;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.w1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import gl1.y;
import h5.e0;
import i3.fe;
import i3.h1;
import i3.i7;
import i3.mh;
import i3.v5;
import java.util.List;
import l72.p2;
import l72.x0;
import o4.d0;
import o4.m1;
import o72.a3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.q2;
import r53.d2;
import zo1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f189625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f189626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f189627f;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f189622a = i14;
        this.f189623b = obj;
        this.f189624c = obj2;
        this.f189625d = obj3;
        this.f189626e = obj4;
        this.f189627f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:216:0x0829  */
    /* JADX WARN: Code duplicated, block: B:237:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:245:0x094b  */
    /* JADX WARN: Code duplicated, block: B:258:0x09db  */
    /* JADX WARN: Code duplicated, block: B:291:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b14;
        p3.m mVar;
        String strH;
        int i14 = this.f189622a;
        int i15 = 11;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 18;
        final int i17 = 2;
        Object obj4 = this.f189627f;
        Object obj5 = this.f189626e;
        Object obj6 = this.f189625d;
        Object obj7 = this.f189624c;
        Object obj8 = this.f189623b;
        final int i18 = 1;
        switch (i14) {
            case 0:
                aa1.e eVar = (aa1.e) obj8;
                e23.p pVar = (e23.p) obj7;
                l1 l1Var = (l1) obj6;
                e23.a aVar2 = (e23.a) obj5;
                e23.a aVar3 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    aa1.d dVar = eVar.f2268j;
                    q91.d dVar2 = eVar.f2262d;
                    boolean zB = mVar2.B(l1Var) | mVar2.r(eVar) | mVar2.B(aVar2);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new x72.k(l1Var, i18, eVar, aVar2);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new x72.k(l1Var, i18, eVar, aVar2);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        b14 = 0;
                        objQ2 = new wt0.i((byte) 0, 20);
                        mVar2.K(objQ2);
                    } else {
                        b14 = 0;
                    }
                    e23.p pVar2 = (e23.p) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new wt0.i(b14, 21);
                        mVar2.K(objQ3);
                    }
                    u91.h.b(rVarC, dVar, dVar2, true, false, false, false, false, pVar, aVar4, aVar3, pVar2, (e23.p) objQ3, mVar2, 3072, 432, PsExtractor.VIDEO_STREAM_MASK);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj8;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                b92.a aVar5 = (b92.a) obj5;
                p1 p1Var = (p1) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strQ = y.Q(mVar3, R.string.lbl_average_daily);
                    b92.a aVarC = ((pq1.d) p1Var.getF182175a()).c(str);
                    int i19 = iIntValue2 & 14;
                    int i24 = b92.a.f16960b;
                    int i25 = i19 | (x0.f111348c << 24);
                    x0Var.a(i25, 60, aVarC, t2Var, null, null, str, strQ, null, null, mVar3);
                    x0Var.a(i25, 60, aVar5, t2Var, null, null, str2, str3, null, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                final e23.l lVar = (e23.l) obj8;
                final b11.i iVar = (b11.i) obj7;
                final e23.l lVar2 = (e23.l) obj6;
                final e23.l lVar3 = (e23.l) obj5;
                final p1 p1Var2 = (p1) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (lVar != null) {
                        mVar4.C(1001199749);
                        y01.c.f192987a.getClass();
                        z3.e eVar2 = y01.c.f192988b;
                        boolean zB2 = mVar4.B(lVar) | mVar4.B(iVar);
                        Object objQ4 = mVar4.q();
                        if (zB2) {
                            final int i26 = 0;
                            objQ4 = new e23.a() { // from class: y01.e
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar.invoke(iVar);
                                            break;
                                        case 1:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar.invoke(iVar);
                                            break;
                                        default:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar.invoke(iVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                final int i27 = 0;
                                objQ4 = new e23.a() { // from class: y01.e
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar.invoke(iVar);
                                                break;
                                            case 1:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar.invoke(iVar);
                                                break;
                                            default:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar.invoke(iVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ4);
                            }
                        }
                        i3.u.b(eVar2, (e23.a) objQ4, null, null, null, false, null, null, mVar4, 6, 508);
                        mVar = mVar4;
                        mVar.f();
                    } else {
                        mVar = mVar4;
                        mVar.C(1001695625);
                        mVar.f();
                    }
                    if (lVar2 != null) {
                        mVar.C(1001753409);
                        y01.c.f192987a.getClass();
                        z3.e eVar3 = y01.c.f192989c;
                        boolean zB3 = mVar.B(lVar2) | mVar.B(iVar);
                        Object objQ5 = mVar.q();
                        if (zB3) {
                            objQ5 = new e23.a() { // from class: y01.e
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar2.invoke(iVar);
                                            break;
                                        case 1:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar2.invoke(iVar);
                                            break;
                                        default:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar2.invoke(iVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new e23.a() { // from class: y01.e
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar2.invoke(iVar);
                                                break;
                                            case 1:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar2.invoke(iVar);
                                                break;
                                            default:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar2.invoke(iVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ5);
                            }
                        }
                        i3.u.b(eVar3, (e23.a) objQ5, null, null, null, false, null, null, mVar, 6, 508);
                        mVar.f();
                    } else {
                        mVar.C(1002253129);
                        mVar.f();
                    }
                    if ((lVar == null && lVar2 == null) || lVar3 == null) {
                        mVar.C(1002568585);
                        mVar.f();
                    } else {
                        mVar.C(1002349477);
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        v5.a(0.0f, 0, 2, q2.f(mVar), c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97918c, 1), mVar);
                        mVar.f();
                    }
                    if (lVar3 != null) {
                        mVar.C(1002628353);
                        y01.c.f192987a.getClass();
                        z3.e eVar4 = y01.c.f192990d;
                        boolean zB4 = mVar.B(lVar3) | mVar.B(iVar);
                        Object objQ6 = mVar.q();
                        if (zB4) {
                            objQ6 = new e23.a() { // from class: y01.e
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar3.invoke(iVar);
                                            break;
                                        case 1:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar3.invoke(iVar);
                                            break;
                                        default:
                                            p1Var2.setValue(Boolean.FALSE);
                                            lVar3.invoke(iVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new e23.a() { // from class: y01.e
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar3.invoke(iVar);
                                                break;
                                            case 1:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar3.invoke(iVar);
                                                break;
                                            default:
                                                p1Var2.setValue(Boolean.FALSE);
                                                lVar3.invoke(iVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ6);
                            }
                        }
                        i3.u.b(eVar4, (e23.a) objQ6, null, null, null, false, null, null, mVar, 6, 508);
                        mVar.f();
                    } else {
                        mVar.C(1003128073);
                        mVar.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                List<b11.l> list = (List) obj8;
                e23.l lVar4 = (e23.l) obj7;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    for (b11.l lVar5 : list) {
                        z3.e eVarC = z3.f.c(518688491, new vd0.b(lVar5.a(w2.a0.s(mVar5)), i16), mVar5);
                        boolean zB5 = mVar5.B(lVar4) | mVar5.r(lVar5);
                        Object objQ7 = mVar5.q();
                        if (zB5) {
                            objQ7 = new y01.j(lVar4, lVar5, p1Var3, 1);
                            mVar5.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new y01.j(lVar4, lVar5, p1Var3, 1);
                                mVar5.K(objQ7);
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ7, null, z3.f.c(1623103726, new xm0.h(i15, lVar5, p1Var4), mVar5), null, false, null, null, mVar5, 3078, 500);
                        if (lVar5.equals((b11.l) p1Var5.getF182175a())) {
                            mVar5.C(-1458827801);
                            mVar5.f();
                        } else {
                            mVar5.C(-1459141087);
                            g6.f.a aVar7 = g6.f.f75994b;
                            v5.a(0.0f, 6, 2, q2.e(d92.b.f58623a, mVar5), x2.f(x2.h(h4.r.S, 1), 1.0f), mVar5);
                            mVar5.f();
                        }
                    }
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                int i28 = 1;
                List<b11.o> list2 = (List) obj8;
                i53.c cVar = (i53.c) obj7;
                List list3 = (List) obj6;
                l22.a aVar8 = (l22.a) obj5;
                v21.e eVar5 = (v21.e) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(t2Var2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    for (b11.o oVar : list2) {
                        long j8 = ((d0) list3.get(cVar.indexOf(oVar))).f128833a;
                        b11.n.a aVar9 = b11.n.f14341e;
                        s21.n nVar = oVar.f14356a;
                        String str4 = nVar.f156152b;
                        String str5 = nVar.f156153c;
                        aVar9.getClass();
                        String strB = b11.n.a.b(str4, str5, aVar8);
                        String str6 = oVar.f14356a.f156155e;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String strE = v21.e.e(eVar5, oVar.f14357b, null, false, false, 30);
                        v21.e eVar6 = eVar5;
                        String strG = eVar6.G(strB, strE, str6);
                        x0 x0Var2 = x0.f111346a;
                        String str7 = str6.length() == 0 ? null : str6;
                        x0.a aVar10 = new x0.a(j8, null);
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, i28, null);
                        c0235a.f16962a.put("merge", strG);
                        b92.a aVarB = c0235a.b();
                        int i29 = b92.a.f16960b;
                        x0Var2.a((iIntValue5 & 14) | (x0.f111348c << 24), 48, aVarB, t2Var2, null, null, strE, strB, str7, aVar10, mVar6);
                        eVar5 = eVar6;
                        i28 = 1;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 5:
                a50.g gVar = (a50.g) obj8;
                d2 d2Var = (d2) obj7;
                e23.l lVar6 = (e23.l) obj6;
                n1 n1Var = (n1) obj5;
                n1 n1Var2 = (n1) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    w20.a aVar11 = gVar.f1393d;
                    if (aVar11 != null) {
                        mVar7.C(1304392885);
                        h4.r.a aVar12 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                        int iHashCode = Long.hashCode(mVar7.getU());
                        i2 i2VarX = mVar7.x();
                        h4.r rVarC2 = h4.k.c(aVar12, mVar7);
                        h5.g.V.getClass();
                        e0.a aVar13 = h5.g.a.f81805b;
                        if (mVar7.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar13);
                        } else {
                            mVar7.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar7);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar7, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                        b0 b0Var = b0.f22601a;
                        com.garmin.android.apps.connectmobile.courses.model.e eVar7 = aVar11.f181476a;
                        eVar7.getClass();
                        n50.e eVar8 = new n50.e(Double.valueOf(eVar7.q()), Double.valueOf(eVar7.r()), Double.valueOf(eVar7.s()));
                        Object objQ8 = mVar7.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ8 == c2565a2) {
                            objQ8 = new a3(n1Var, 18);
                            mVar7.K(objQ8);
                        }
                        w2.a0.a(eVar8, (e23.l) objQ8, mVar7, 48);
                        a50.d dVar3 = new a50.d(gVar.f1407r, gVar.f1406q);
                        n50.g gVarN = jg.b.n(aVar11, gVar.f1400k);
                        n50.d dVarM = jg.b.m(aVar11, gVar.f1405p);
                        Object objQ9 = mVar7.q();
                        if (objQ9 == c2565a2) {
                            objQ9 = new a3(n1Var2, 19);
                            mVar7.K(objQ9);
                        }
                        y40.m.a(dVar3, gVarN, dVarM, d2Var, lVar6, (e23.l) objQ9, mVar7, 196608);
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(1305321211);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 6:
                sr.r rVar = (sr.r) obj8;
                Context context = (Context) obj7;
                PrivacyType privacyType = (PrivacyType) obj6;
                p1 p1Var6 = (p1) obj5;
                p1 p1Var7 = (p1) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar8.n(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.f(aVar14, 1.0f), p6.b.a(d92.b.f58623a, mVar8), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar15);
                    } else {
                        mVar8.c();
                    }
                    h5.g.a.e eVar9 = h5.g.a.f81810g;
                    b4.c(eVar9, zVarA2, mVar8);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar8);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar8);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58625c.getClass();
                    j92.e eVar10 = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar14, eVar10.f97920e);
                    s2 s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar8, 0);
                    int iHashCode3 = Long.hashCode(mVar8.getU());
                    i2 i2VarX3 = mVar8.x();
                    h4.r rVarC4 = h4.k.c(rVarY, mVar8);
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar15);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar9, s2VarA, mVar8);
                    b4.c(c1623g, i2VarX3, mVar8);
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar8);
                    u2 u2Var = u2.f22900a;
                    i7.a(n5.c.a(privacyType.getDrawableResourceID(), mVar8, 0), null, null, sn.a.b(mVar8), mVar8, 48, 4);
                    String strQ2 = y.Q(mVar8, privacyType.getF28798b());
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var3 = j92.f.f97931h;
                    mh.c(strQ2, c2.l.C(aVar14, eVar10.f97918c, 0.0f, 0.0f, 0.0f, 14), com.nimbusds.jose.shaded.gson.internal.a.x(mVar8), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar8, 0, 0, 131064);
                    mVar8.y();
                    Integer num = (Integer) p1Var6.getF182175a();
                    Object objQ10 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ10 == c2565a3) {
                        objQ10 = new xq1.c(p1Var6, 23);
                        mVar8.K(objQ10);
                    }
                    dr.a.a(num, (e23.l) objQ10, mVar8, 48);
                    String strQ3 = y.Q(mVar8, R.string.lbl_perceived_effort);
                    long jA = zl.a.a(mVar8);
                    float f14 = eVar10.f97920e;
                    mh.c(strQ3, c2.l.C(aVar14, f14, f14, f14, 0.0f, 8), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar8, 0, 0, 131064);
                    Object objQ11 = mVar8.q();
                    if (objQ11 == c2565a3) {
                        Integer num2 = (Integer) p1Var7.getF182175a();
                        objQ11 = p0.n(rVar.a(Integer.valueOf(num2 != null ? num2.intValue() : 0)));
                        mVar8.K(objQ11);
                    }
                    p1 p1Var8 = (p1) objQ11;
                    String str8 = (String) p1Var8.getF182175a();
                    long jA2 = zl.a.a(mVar8);
                    h4.r rVarF2 = x2.f(aVar14, 1.0f);
                    d6.h.f57752b.getClass();
                    mh.c(str8, rVarF2, jA2, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var3, mVar8, 48, 0, 130040);
                    h4.r rVarF3 = x2.f(aVar14, 1.0f);
                    boolean zR = mVar8.r(rVar);
                    Object objQ12 = mVar8.q();
                    if (zR || objQ12 == c2565a3) {
                        objQ12 = new zr.j(rVar, p1Var7, p1Var8);
                        mVar8.K(objQ12);
                    }
                    p002j6.c.b((e23.l) objQ12, rVarF3, null, mVar8, 48, 4);
                    boolean zR2 = mVar8.r(context);
                    Object objQ13 = mVar8.q();
                    if (zR2 || objQ13 == c2565a3) {
                        objQ13 = new tz1.h(context, 29);
                        mVar8.K(objQ13);
                    }
                    zr.a.f206700a.getClass();
                    h1.c((e23.a) objQ13, null, false, null, null, null, null, null, zr.a.f206703d, mVar8, C.ENCODING_PCM_32BIT, 510);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 7:
                String str9 = (String) obj8;
                String str10 = (String) obj7;
                String str11 = (String) obj6;
                String str12 = (String) obj5;
                String str13 = (String) obj4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar9.B(t2Var3) ? 4 : 2;
                }
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    int i30 = iIntValue8;
                    x0 x0Var4 = x0.f111346a;
                    String strQ4 = y.Q(mVar9, R.string.devices_lbl_bpm);
                    b92.a aVarA = wz1.a.a(str10);
                    int i34 = b92.a.f16960b;
                    int i35 = (i30 & 14) | (x0.f111348c << 24);
                    x0Var4.a(i35, 60, aVarA, t2Var3, null, null, str9, strQ4, null, null, mVar9);
                    if (str12 != null) {
                        mVar9.C(-1789612842);
                        strH = y.P(R.string.string_space_string_bracket_pattern, new Object[]{y.Q(mVar9, R.string.lbl_pace), str12}, mVar9);
                        mVar9.f();
                    } else {
                        strH = sn.a.h(mVar9, -1789322558, R.string.lbl_pace, mVar9);
                    }
                    x0Var4.a(i35, 60, wz1.a.a(str13), t2Var3, null, null, str11, strH, null, null, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 8:
                p1 p1Var9 = (p1) obj8;
                hl.a.b bVar3 = (hl.a.b) obj7;
                yu0.d dVar4 = (yu0.d) obj6;
                e23.a aVar16 = (e23.a) obj5;
                n1 n1Var3 = (n1) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    int i36 = zu0.a.b.f207071a[((g3) p1Var9.getF182175a()).f35300a.ordinal()];
                    if (i36 == 1) {
                        mVar10.C(622885039);
                        h4.r.a aVar17 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, mVar10, 0);
                        int iHashCode4 = Long.hashCode(mVar10.getU());
                        i2 i2VarX4 = mVar10.x();
                        h4.r rVarC5 = h4.k.c(aVar17, mVar10);
                        h5.g.V.getClass();
                        e0.a aVar18 = h5.g.a.f81805b;
                        if (mVar10.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar10.z();
                        if (mVar10.getT()) {
                            mVar10.M(aVar18);
                        } else {
                            mVar10.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar10);
                        b4.c(h5.g.a.f81809f, i2VarX4, mVar10);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar10, iHashCode4, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar10);
                        b0 b0Var3 = b0.f22601a;
                        String str14 = bVar3.f84253c;
                        if (str14 == null) {
                            mVar10.C(1852752705);
                            mVar10.f();
                        } else {
                            mVar10.C(1852752706);
                            w1.a(bVar3.f84252b, str14, bVar3.f84254d, false, null, mVar10, 0, 24);
                            mVar10.f();
                        }
                        int intValue = n1Var3.getIntValue();
                        String strC = dVar4.f199699b.c(R.plurals.lbl_recipient_count, intValue, Integer.valueOf(intValue));
                        p2 p2Var = p2.f111205a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar11 = j92.b.f97899b;
                        h4.r rVarC6 = c2.l.C(aVar17, 0.0f, eVar11.f97920e, 0.0f, 0.0f, 13);
                        String strQ5 = y.Q(mVar10, R.string.lbl_recipients);
                        boolean zB6 = mVar10.B(aVar16);
                        Object objQ14 = mVar10.q();
                        if (zB6) {
                            objQ14 = new y0(aVar16, 11);
                            mVar10.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == p3.m.a.f135155b) {
                                objQ14 = new y0(aVar16, 11);
                                mVar10.K(objQ14);
                            }
                        }
                        p2Var.h(strQ5, strC, null, rVarC6, null, false, false, null, null, null, (e23.a) objQ14, mVar10, 0, 0, 1012);
                        h4.r rVarZ = c2.l.z(aVar17, eVar11.f97920e, eVar11.f97917b);
                        String strQ6 = y.Q(mVar10, R.string.msg_livetrack_recipients);
                        d92.b.f58624b.getClass();
                        mh.c(strQ6, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar10), mVar10, 0, 0, 131068);
                        mVar10.y();
                        mVar10.f();
                    } else {
                        if (i36 != 2 && i36 != 3) {
                            throw n23.j.m(mVar10, 1405564463);
                        }
                        mVar10.C(1405606365);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            default:
                Integer num3 = (Integer) obj8;
                Integer num4 = (Integer) obj7;
                e23.l lVar7 = (e23.l) obj6;
                e23.l lVar8 = (e23.l) obj5;
                String str15 = (String) obj4;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                rVar2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar11.B(rVar2) ? 4 : 2;
                }
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    zz1.c.a(rVar2, num3 != null ? Double.valueOf(num3.intValue()) : null, num4 != null ? Double.valueOf(num4.intValue()) : null, lVar7, lVar8, str15, mVar11, (iIntValue10 & 14) | 27648);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }
}
