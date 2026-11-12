package as;

import au0.m0;
import b82.d2;
import c2.a0;
import c2.b0;
import c2.t2;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Locale;
import kotlin.o3;
import lc.u0;
import o53.f0;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p006l2.l2;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import v62.e1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12676b;

    public /* synthetic */ s(String str, int i14) {
        this.f12675a = i14;
        this.f12676b = str;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(this.f12676b, b0Var.b(aVar, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(-687703122, rVar, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        String str = this.f12676b;
        boolean zB = mVar.B(str);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new i11.g(str, 24);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i11.g(str, 24);
                mVar.K(objQ);
            }
        }
        h4.r rVarC = v.c((e23.l) objQ, rVar, false);
        mVar.f();
        return rVarC;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0483  */
    /* JADX WARN: Code duplicated, block: B:115:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:205:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:212:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:219:0x0923  */
    /* JADX WARN: Code duplicated, block: B:226:0x095a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f12675a;
        int i15 = 14;
        int i16 = 4;
        p3.m.a aVar = p3.m.f135153a;
        String strH = this.f12676b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ = gl1.y.Q(mVar, R.string.strength_training_set);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97918c;
                    float f16 = 10;
                    g6.f.a aVar3 = g6.f.f75994b;
                    float f17 = 7;
                    int i17 = iIntValue & 14;
                    d2Var.c(t2Var, strQ, null, t2Var.a(c2.l.B(aVar2, f14, f16, f15, f17), 1.8f, true), null, 0, 0, mVar, i17, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_name), null, t2Var.a(k.d(aVar2), 3.0f, true), null, 0, 0, mVar, i17, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_time), null, t2Var.a(k.d(aVar2), 2.0f, true), null, 0, 0, mVar, i17, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.strength_training_reps), null, t2Var.a(k.d(aVar2), 2.0f, true), null, 0, 0, mVar, i17, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_weight), this.f12676b, t2Var.a(c2.l.B(aVar2, f15, f16, eVar.f97920e, f17), 2.2f, true), null, 0, 0, mVar, i17, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m0.b bVar = m0.f12967d;
                ((t2) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d6.p.f57793b.getClass();
                    int i18 = d6.p.f57795d;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar4, j92.b.f97899b.f97917b);
                    String upperCase = strH.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(upperCase, rVarY, 0L, null, 0L, null, 0L, null, 0L, i18, false, 1, 0, null, d92.c.e(j92.f.f97933j), mVar2, 0, 28032, 102396);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h4.r rVar = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(667505432, rVar, (Integer) obj3, mVar3);
                x1 x1Var3 = p3.n.f135158a;
                boolean zB = mVar3.B(strH);
                Object objQ = mVar3.q();
                if (zB) {
                    objQ = new defpackage.b(strH, i15);
                    mVar3.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new defpackage.b(strH, i15);
                        mVar3.K(objQ);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ, rVar, true);
                mVar3.f();
                return rVarC;
            case 3:
                c2.t tVar = (c2.t) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(tVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (strH == null) {
                        strH = sn.a.h(mVar4, -766930013, R.string.no_value, mVar4);
                    } else {
                        mVar4.C(-766930292);
                        mVar4.f();
                    }
                    String str = strH;
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC2 = tVar.c(aVar5, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar4), mVar4, 0, 0, 131068);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var5 = p3.n.f135158a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(c2.l.C(rVarF, 0.0f, eVar2.f97917b, 0.0f, eVar2.f97918c, 5), eVar2.f97920e, 0.0f, 2);
                String strN = fb1.c.n(Marker.ANY_MARKER, strH);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strN, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar5), mVar5, 0, 0, 130044);
                return Unit.INSTANCE;
            case 5:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar6.B(tVar2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String str2 = this.f12676b;
                    if (str2 == null) {
                        mVar6.C(1406657646);
                        mVar6.f();
                    } else {
                        mVar6.C(1406657647);
                        h4.r rVarY2 = c2.l.y(h4.r.S, yz1.k.d(mVar6));
                        h4.d.f81522a.getClass();
                        h4.r rVarC3 = tVar2.c(rVarY2, h4.d.a.f81528f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97930g;
                        p006l2.y.b(str2, rVarC3, d92.c.b(x0Var, mVar6), null, 0, false, 1, 0, null, l2.a.a(l2.f108642a, f0.B(4), x0Var.f157322a.fontSize), mVar6, 1572864, 440);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                v.h.y(595076501, rVar2, (Integer) obj3, mVar7);
                x1 x1Var7 = p3.n.f135158a;
                boolean zB2 = mVar7.B(strH);
                Object objQ2 = mVar7.q();
                if (zB2) {
                    objQ2 = new c82.b(strH, 29);
                    mVar7.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new c82.b(strH, 29);
                        mVar7.K(objQ2);
                    }
                }
                h4.r rVarB = v.b(rVar2, (e23.l) objQ2);
                mVar7.f();
                return rVarB;
            case 7:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                v.h.y(949863254, rVar3, (Integer) obj3, mVar8);
                x1 x1Var8 = p3.n.f135158a;
                boolean zB3 = mVar8.B(strH);
                Object objQ3 = mVar8.q();
                if (zB3) {
                    objQ3 = new cq.t(strH, i16);
                    mVar8.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new cq.t(strH, i16);
                        mVar8.K(objQ3);
                    }
                }
                h4.r rVarC4 = v.c((e23.l) objQ3, rVar3, false);
                mVar8.f();
                return rVarC4;
            case 8:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                v.h.y(1140457788, rVar4, (Integer) obj3, mVar9);
                x1 x1Var9 = p3.n.f135158a;
                boolean zB4 = mVar9.B(strH);
                Object objQ4 = mVar9.q();
                if (zB4) {
                    objQ4 = new cq.t(strH, 3);
                    mVar9.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new cq.t(strH, 3);
                        mVar9.K(objQ4);
                    }
                }
                h4.r rVarC5 = v.c((e23.l) objQ4, rVar4, false);
                mVar9.f();
                return rVarC5;
            case 9:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                v.h.y(-159617286, rVar5, (Integer) obj3, mVar10);
                x1 x1Var10 = p3.n.f135158a;
                boolean zB5 = mVar10.B(strH);
                Object objQ5 = mVar10.q();
                if (zB5) {
                    objQ5 = new cq.t(strH, 6);
                    mVar10.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new cq.t(strH, 6);
                        mVar10.K(objQ5);
                    }
                }
                h4.r rVarC6 = v.c((e23.l) objQ5, rVar5, false);
                mVar10.f();
                return rVarC6;
            case 10:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                v.h.y(1665156435, rVar6, (Integer) obj3, mVar11);
                x1 x1Var11 = p3.n.f135158a;
                Object objQ6 = mVar11.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ6 == c2565a) {
                    objQ6 = new d81.t(4);
                    mVar11.K(objQ6);
                }
                v.c((e23.l) objQ6, rVar6, true);
                boolean zB6 = mVar11.B(strH);
                Object objQ7 = mVar11.q();
                if (zB6 || objQ7 == c2565a) {
                    objQ7 = new cq.t(strH, 13);
                    mVar11.K(objQ7);
                }
                h4.r rVarB2 = v.b(rVar6, (e23.l) objQ7);
                mVar11.f();
                return rVarB2;
            case 11:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                v.h.y(-1734788979, rVar7, (Integer) obj3, mVar12);
                x1 x1Var12 = p3.n.f135158a;
                h4.r rVarC7 = o3.c(rVar7, strH);
                mVar12.f();
                return rVarC7;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar13.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar6, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarC8 = c2.l.C(rVarF2, 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar13);
                    d6.h.f57752b.getClass();
                    mh.c(this.f12676b, rVarC8, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar13, 0, 0, 130044);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, x2.q(c2.l.C(aVar6, 0.0f, eVar3.f97923h, 0.0f, 0.0f, 13), j92.b.f97901d.f97907f), u0.f(mVar13), mVar13, 48, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                t2 t2Var2 = (t2) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar14.B(t2Var2) ? 4 : 2;
                }
                if (mVar14.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    d2 d2Var2 = d2.f16532a;
                    String strQ2 = gl1.y.Q(mVar14, R.string.power_curve_list_peak_item_label);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81536n;
                    d2Var2.getClass();
                    int i24 = (iIntValue6 & 14) | 24960;
                    d2Var2.c(t2Var2, strQ2, "", t2Var2.a(d2.h(), 0.1f, true), aVar7, 0, 0, mVar14, i24, 48);
                    d2Var2.c(t2Var2, this.f12676b, "", t2Var2.a(d2.h(), 0.1f, true), aVar7, 0, 0, mVar14, i24, 48);
                    d2Var2.c(t2Var2, gl1.y.Q(mVar14, R.string.power_curve_list_date_item_label), "", t2Var2.a(d2.h(), 0.1f, true), aVar7, 0, 0, mVar14, i24, 48);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                eu.c cVar = eu.c.f66055a;
                ((f2.r) obj).getClass();
                if (mVar15.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    float fQ = gl.b.q(mVar15, R.dimen.select_image_title_horizontal_margin);
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC9 = c2.l.C(rVarF3, fQ, 0.0f, fQ, j92.b.f97899b.f97920e, 2);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57755e);
                    d92.b.f58624b.getClass();
                    mh.c(this.f12676b, rVarC9, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar15), mVar15, 0, 0, 130044);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var16 = p3.n.f135158a;
                h4.r.a aVar8 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar4 = j92.b.f97899b;
                h4.r rVarA2 = c2.l.A(c2.l.A(aVar8, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97917b, 1);
                d92.b.f58624b.getClass();
                mh.c(androidx.core.view.j.f(strH.length(), "/128"), rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar16), mVar16, 0, 0, 131068);
                return Unit.INSTANCE;
            case 16:
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar17.B(tVar3) ? 4 : 2;
                }
                if (mVar17.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var17 = p3.n.f135158a;
                    float fG = yz1.y.g(mVar17) * 2;
                    g6.f.a aVar9 = g6.f.f75994b;
                    h4.r.a aVar10 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarY3 = c2.l.y(tVar3.c(aVar10, h4.d.a.f81528f), fG);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar17.getU());
                    i2 i2VarX = mVar17.x();
                    h4.r rVarC10 = h4.k.c(rVarY3, mVar17);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar17.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar17.z();
                    if (mVar17.getT()) {
                        mVar17.M(aVar11);
                    } else {
                        mVar17.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar17);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar17);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar17.getT() || !p005kotlin.jvm.internal.s.g(mVar17.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar17, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar17);
                    u uVar = u.f22885a;
                    h4.r rVarA3 = c2.l.A(aVar10, fG, 0.0f, 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97930g, mVar17);
                    d6.h.f57752b.getClass();
                    g02.c.a(this.f12676b, rVarA3, 0L, d6.h.a(d6.h.f57755e), 0, false, 0, x0VarB2, 0.0d, mVar17, 0, 372);
                    mVar17.y();
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                h4.r rVar8 = (h4.r) obj;
                p3.m mVar18 = (p3.m) obj2;
                v.h.y(1569433004, rVar8, (Integer) obj3, mVar18);
                x1 x1Var18 = p3.n.f135158a;
                boolean zB7 = mVar18.B(strH);
                Object objQ8 = mVar18.q();
                if (zB7) {
                    objQ8 = new fp0.c(strH, 21);
                    mVar18.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new fp0.c(strH, 21);
                        mVar18.K(objQ8);
                    }
                }
                h4.r rVarC11 = v.c((e23.l) objQ8, rVar8, false);
                mVar18.f();
                return rVarC11;
            case 18:
                h4.r rVar9 = (h4.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                v.h.y(1002277784, rVar9, (Integer) obj3, mVar19);
                x1 x1Var19 = p3.n.f135158a;
                boolean zB8 = mVar19.B(strH);
                Object objQ9 = mVar19.q();
                if (zB8) {
                    objQ9 = new fp0.c(strH, 22);
                    mVar19.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new fp0.c(strH, 22);
                        mVar19.K(objQ9);
                    }
                }
                h4.r rVarC12 = v.c((e23.l) objQ9, rVar9, false);
                mVar19.f();
                return rVarC12;
            case 19:
                h4.r rVar10 = (h4.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                v.h.y(1829083506, rVar10, (Integer) obj3, mVar20);
                x1 x1Var20 = p3.n.f135158a;
                boolean zB9 = mVar20.B(strH);
                Object objQ10 = mVar20.q();
                if (zB9) {
                    objQ10 = new fp0.c(strH, 23);
                    mVar20.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new fp0.c(strH, 23);
                        mVar20.K(objQ10);
                    }
                }
                h4.r rVarC13 = v.c((e23.l) objQ10, rVar10, false);
                mVar20.f();
                return rVarC13;
            case 20:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar21.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f12676b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(d92.c.e(j92.f.f97933j), ds.e0.e(mVar21), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar21, 0, 0, 131070);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar22.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var22 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97932i, d92.b.a(mVar22).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(this.f12676b, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar22, 0, 0, 130046);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar23.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var23 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar23, R.string.select_contact_method);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(j92.f.f97930g, mVar23);
                    d6.h.f57752b.getClass();
                    int i25 = d6.h.f57755e;
                    h4.r.a aVar12 = h4.r.S;
                    h4.r rVarF4 = x2.f(aVar12, 1.0f);
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f18 = eVar5.f97921f;
                    float f19 = eVar5.f97920e;
                    mh.c(strQ3, c2.l.C(rVarF4, f19, f18, f19, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i25), 0L, 0, false, 0, 0, null, x0VarB3, mVar23, 0, 0, 130044);
                    mh.c(this.f12676b, c2.l.B(x2.f(aVar12, 1.0f), f19, eVar5.f97918c, f19, eVar5.f97921f), 0L, null, 0L, null, 0L, d6.h.a(i25), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar23), mVar23, 0, 0, 130044);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                t2 t2Var3 = (t2) obj;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar24.B(t2Var3) ? 4 : 2;
                }
                if (mVar24.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h4.r rVarA4 = t2Var3.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f12676b, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97930g, mVar24)), mVar24, 0, 0, 131068);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                t2 t2Var4 = (t2) obj;
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar25.B(t2Var4) ? 4 : 2;
                }
                if (mVar25.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var25 = p3.n.f135158a;
                    h4.r rVarA5 = t2Var4.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f12676b, rVarA5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97930g, mVar25)), mVar25, 0, 0, 131068);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar26.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var26 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f12676b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar26), mVar26, 0, 0, 131070);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar27.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var27 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarF5 = x2.f(aVar13, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    h4.r rVarY4 = c2.l.y(rVarF5, eVar6.f97922g);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar14 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    float f22 = eVar6.f97921f;
                    jVar.getClass();
                    z zVarA = y.a(c2.j.i(f22), aVar14, mVar27, 48);
                    int iHashCode2 = Long.hashCode(mVar27.getU());
                    i2 i2VarX2 = mVar27.x();
                    h4.r rVarC14 = h4.k.c(rVarY4, mVar27);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar27.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar27.z();
                    if (mVar27.getT()) {
                        mVar27.M(aVar15);
                    } else {
                        mVar27.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar27);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar27);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar27.getT() || !p005kotlin.jvm.internal.s.g(mVar27.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar27, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC14, mVar27);
                    b0 b0Var = b0.f22601a;
                    i7.a(n5.c.a(2131232591, mVar27, 0), null, x2.q(aVar13, j92.b.f97901d.f97907f), androidx.room.a0.c(mVar27), mVar27, 48, 0);
                    d92.b.f58624b.getClass();
                    x0 x0VarB4 = d92.c.b(j92.f.f97931h, mVar27);
                    d6.h.f57752b.getClass();
                    mh.c(this.f12676b, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB4, mVar27, 0, 0, 130046);
                    mVar27.y();
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2, obj3);
            case 28:
                return b(obj, obj2, obj3);
            default:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar28 = (p3.m) obj2;
                v.h.y(1874777795, rVar11, (Integer) obj3, mVar28);
                x1 x1Var28 = p3.n.f135158a;
                boolean zB10 = mVar28.B(strH);
                Object objQ11 = mVar28.q();
                if (zB10) {
                    objQ11 = new i11.g(strH, 28);
                    mVar28.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new i11.g(strH, 28);
                        mVar28.K(objQ11);
                    }
                }
                h4.r rVarC15 = v.c((e23.l) objQ11, rVar11, false);
                mVar28.f();
                return rVarC15;
        }
    }
}
