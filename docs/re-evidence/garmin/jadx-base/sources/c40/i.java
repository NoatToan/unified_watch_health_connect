package c40;

import b82.d2;
import c2.a0;
import c2.b0;
import c2.c1;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t0;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.Locale;
import l72.g3;
import l72.h3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.r1;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r22.m0;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24325c;

    public /* synthetic */ i(String str, String str2, int i14) {
        this.f24323a = i14;
        this.f24324b = str;
        this.f24325c = str2;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f24323a;
        int i15 = 3;
        String strH = this.f24324b;
        String strH2 = this.f24325c;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    mVar.C(888803439);
                    s5.c.b bVar = new s5.c.b(0, 1, null);
                    r1.a(bVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97929f;
                    int iJ = bVar.j(d92.c.b(x0Var, mVar).f157322a);
                    try {
                        bVar.b("(");
                        bVar.b(strH);
                        Unit unit = Unit.INSTANCE;
                        bVar.f(iJ);
                        r1.a(bVar);
                        int iJ2 = bVar.j(d92.c.b(j92.f.f97932i, mVar).f157322a);
                        try {
                            bVar.b(strH2);
                            bVar.f(iJ2);
                            int iJ3 = bVar.j(d92.c.b(x0Var, mVar).f157322a);
                            try {
                                bVar.b(")");
                                bVar.f(iJ3);
                                s5.c cVarK = bVar.k();
                                mVar.f();
                                mh.d(cVarK, t2Var.b(r.S), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, k.f24332a, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 196604);
                            } catch (Throwable th3) {
                                bVar.f(iJ3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            bVar.f(iJ2);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        bVar.f(iJ);
                        throw th5;
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                t2 t2Var2 = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    if (strH == null) {
                        strH = sn.a.h(mVar2, 1738303826, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(1738303485);
                        mVar2.f();
                    }
                    String str = strH;
                    String strQ = y.Q(mVar2, R.string.lbl_climbed);
                    int i16 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i16, 124, null, t2Var2, null, null, str, strQ, null, null, mVar2);
                    if (strH2 == null) {
                        strH2 = sn.a.h(mVar2, 1738308242, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(1738307839);
                        mVar2.f();
                    }
                    x0Var2.a(i16, 124, null, t2Var2, null, null, strH2, y.Q(mVar2, R.string.lbl_descended), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                t2 t2Var3 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    t0.a(rVarF, c2.j.f22698h, null, null, 0, 0, z3.f.c(121209125, new i(strH, strH2, i15), mVar3), mVar3, 1572918, 60);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                c1 c1Var = (c1) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(c1Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97931h;
                    mh.c(this.f24324b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var3, mVar4), mVar4, 0, 0, 131070);
                    l.f(c1Var.a(r.S, 1.0f, true), mVar4);
                    mh.c(this.f24325c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var3, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                t2 t2Var4 = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var4) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    d2 d2Var = d2.f16532a;
                    int i17 = iIntValue5 & 14;
                    String str2 = this.f24324b;
                    d2Var.f(t2Var4, str2, null, null, 0, 0, mVar5, i17, 30);
                    d2Var.f(t2Var4, str2, null, null, 0, 0, mVar5, i17, 30);
                    d2Var.f(t2Var4, this.f24325c, null, null, 0, 0, mVar5, i17, 30);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                t2 t2Var5 = (t2) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var5) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97929f, mVar6);
                    r.a aVar = r.S;
                    mh.c(this.f24324b, t2Var5.b(aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar6, 0, 0, 131068);
                    String str3 = this.f24325c;
                    if (str3 != null) {
                        mVar6.C(1941696273);
                        x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar6);
                        r rVarB = t2Var5.b(aVar);
                        d92.b.f58625c.getClass();
                        mh.c(str3, l.C(rVarB, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar6, 0, 0, 131068);
                        mVar6.f();
                    } else {
                        mVar6.C(1941965787);
                        mVar6.f();
                    }
                    mVar6.C(1941995918);
                    mVar6.f();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    h3.g(strH, strH2, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                t tVar = (t) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(tVar) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    r.a aVar2 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(aVar2, h4.d.a.f81529g);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    r rVarC2 = l.C(rVarC, 0.0f, f14, f14, f14, 1);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar8, 0);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    r rVarC3 = h4.k.c(rVarC2, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar3);
                    } else {
                        mVar8.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar8);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar8);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar8);
                    u2 u2Var = u2.f22900a;
                    h4.g.a aVar4 = h4.d.a.f81538p;
                    c2.j.k kVar = c2.j.f22694d;
                    z zVarA = c2.y.a(kVar, aVar4, mVar8, 48);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    r rVarC4 = h4.k.c(aVar2, mVar8);
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar3);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar2, zVarA, mVar8);
                    b4.c(c1623g, i2VarX2, mVar8);
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar8);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58624b.getClass();
                    x0 x0Var4 = j92.f.f97932i;
                    mh.c(this.f24324b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var4, mVar8), mVar8, 0, 0, 131070);
                    String strQ2 = y.Q(mVar8, R.string.lbl_distance);
                    x0 x0Var5 = j92.f.f97933j;
                    mh.c(strQ2, l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var5, mVar8), mVar8, 0, 0, 131068);
                    mVar8.y();
                    l.f(x2.u(aVar2, eVar.f97920e), mVar8);
                    z zVarA2 = c2.y.a(kVar, aVar4, mVar8, 48);
                    int iHashCode3 = Long.hashCode(mVar8.getU());
                    i2 i2VarX3 = mVar8.x();
                    r rVarC5 = h4.k.c(aVar2, mVar8);
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar3);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar2, zVarA2, mVar8);
                    b4.c(c1623g, i2VarX3, mVar8);
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC5, mVar8);
                    mh.c(this.f24325c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var4, mVar8), mVar8, 0, 0, 131070);
                    mh.c(y.Q(mVar8, R.string.lbl_total_ascent), l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var5, mVar8), mVar8, 0, 0, 131068);
                    mVar8.y();
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                c1 c1Var2 = (c1) obj;
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                m0.a aVar5 = m0.f149759e;
                c1Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(c1Var2) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    d6.h.f57752b.getClass();
                    int i18 = d6.h.f57755e;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(d92.c.e(j92.f.f97930g), mVar9);
                    r.a aVar6 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    mh.c(this.f24324b, c1Var2.c(aVar6, bVar3), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB3, mVar9, 0, 0, 130044);
                    if (strH2 == null) {
                        mVar9.C(1686503106);
                        mVar9.f();
                    } else {
                        mVar9.C(1686503107);
                        g3.a(0, 0, c1Var2.c(aVar6, bVar3), strH2, mVar9);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                t2 t2Var6 = (t2) obj;
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(t2Var6) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = n.f135158a;
                    int i19 = iIntValue10;
                    l72.x0 x0Var6 = l72.x0.f111346a;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    String str4 = this.f24325c;
                    String str5 = this.f24324b;
                    c0235a.f16962a.put("merge", e5.g(str4, ",", str5));
                    b92.a aVarB = c0235a.b();
                    int i24 = i19 & 14;
                    int i25 = b92.a.f16960b;
                    int i26 = l72.x0.f111348c;
                    x0Var6.a((i26 << 24) | i24, 60, aVarB, t2Var6, null, null, str5, str4, null, null, mVar10);
                    x0Var6.h(t2Var6, mVar10, i24 | (i26 << 3));
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar11 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    rv1.i.f(strH, strH2, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                t2 t2Var7 = (t2) obj;
                m mVar12 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t2Var7.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(t2Var7) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    l72.x0 x0Var7 = l72.x0.f111346a;
                    ny.a.C2460a c2460a = ny.a.f128281b;
                    ny.a aVar7 = ny.a.ACTIVE_CALORIES;
                    c2460a.getClass();
                    l72.x0.a aVar8 = new l72.x0.a(ny.a.C2460a.a(aVar7, mVar12), null);
                    String strQ3 = y.Q(mVar12, R.string.calories_average_active);
                    String strQ4 = y.Q(mVar12, R.string.calories_active);
                    String str6 = this.f24324b;
                    b92.a aVarB2 = ty.a.b(strQ4, str6, mVar12);
                    int i27 = b92.a.f16960b;
                    int i28 = (iIntValue12 & 14) | (l72.x0.f111348c << 24);
                    x0Var7.a(i28, 56, aVarB2, t2Var7, null, null, str6, strQ3, null, aVar8, mVar12);
                    l72.x0.a aVar9 = new l72.x0.a(ny.a.C2460a.a(ny.a.RESTING_CALORIES, mVar12), null);
                    String strQ5 = y.Q(mVar12, R.string.calories_average_resting);
                    String strQ6 = y.Q(mVar12, R.string.lbl_resting_calorie);
                    String str7 = this.f24325c;
                    x0Var7.a(i28, 56, ty.a.b(strQ6, str7, mVar12), t2Var7, null, null, str7, strQ5, null, aVar9, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                c1 c1Var3 = (c1) obj;
                m mVar13 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                c1Var3.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(c1Var3) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB4 = d92.c.b(d92.c.e(j92.f.f97931h), mVar13);
                    d6.h.f57752b.getClass();
                    int i29 = d6.h.f57755e;
                    r.a aVar10 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    mh.c(this.f24324b, c1Var3.c(aVar10, bVar4), 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, x0VarB4, mVar13, 0, 0, 130044);
                    if (strH2 == null) {
                        mVar13.C(-1844007851);
                        mVar13.f();
                    } else {
                        mVar13.C(-1844007850);
                        g3.a(0, 0, c1Var3.c(aVar10, bVar4), strH2, mVar13);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                c1 c1Var4 = (c1) obj;
                m mVar14 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                c1Var4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(c1Var4) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    String upperCase = strH.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97934k, mVar14);
                    r.a aVar11 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    mh.c(upperCase, c1Var4.c(aVar11, bVar5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar14, 0, 0, 131068);
                    if (strH2 == null) {
                        mVar14.C(775729145);
                        mVar14.f();
                    } else {
                        mVar14.C(775729146);
                        g3.a(0, 0, c1Var4.c(aVar11, bVar5), strH2, mVar14);
                        mVar14.f();
                    }
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                t tVar2 = (t) obj;
                m mVar15 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar15.B(tVar2) ? 4 : 2;
                }
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var15 = n.f135158a;
                    r.a aVar12 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC6 = tVar2.c(aVar12, h4.d.a.f81528f);
                    h4.g.a aVar13 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, aVar13, mVar15, 48);
                    int iHashCode4 = Long.hashCode(mVar15.getU());
                    i2 i2VarX4 = mVar15.x();
                    r rVarC7 = h4.k.c(rVarC6, mVar15);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar14);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar15);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar15, iHashCode4, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar15);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB5 = d92.c.b(j92.f.f97929f, mVar15);
                    d6.h.f57752b.getClass();
                    int i30 = d6.h.f57755e;
                    d92.b.f58625c.getClass();
                    mh.c(this.f24324b, l.C(aVar12, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97917b, 7), 0L, null, 0L, null, 0L, d6.h.a(i30), 0L, 0, false, 0, 0, null, x0VarB5, mVar15, 0, 0, 130044);
                    mh.c(this.f24325c, null, 0L, null, 0L, null, 0L, d6.h.a(i30), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar15), mVar15, 0, 0, 130046);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar16 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var16 = n.f135158a;
                    r.a aVar15 = r.S;
                    r rVarF2 = x2.f(aVar15, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarC8 = l.C(rVarF2, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0Var8 = j92.f.f97931h;
                    x0 x0VarB6 = d92.c.b(x0Var8, mVar16);
                    d6.h.f57752b.getClass();
                    int i34 = d6.h.f57755e;
                    mh.c(this.f24324b, rVarC8, 0L, null, 0L, null, 0L, d6.h.a(i34), 0L, 0, false, 0, 0, null, x0VarB6, mVar16, 0, 0, 130044);
                    mh.c(this.f24325c, l.C(x2.f(aVar15, 1.0f), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i34), 0L, 0, false, 0, 0, null, d92.c.b(x0Var8, mVar16), mVar16, 0, 0, 130044);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }
}
