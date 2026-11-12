package wy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.j;
import c2.l;
import c2.t;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import e23.r;
import h5.e0;
import h5.g;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import n82.f;
import ny.e;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import sy.k;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sy.a f188015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f188016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f188017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f188018e;

    public /* synthetic */ a(f fVar, o82.a aVar, k kVar, sy.a aVar2) {
        this.f188014a = 0;
        this.f188017d = fVar;
        this.f188016c = aVar;
        this.f188018e = kVar;
        this.f188015b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x0421  */
    /* JADX WARN: Code duplicated, block: B:153:0x048c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f9  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ny.b bVar;
        f fVar;
        ny.b.C2462b aggregations;
        Double totalCaloriesAverage;
        ny.b.C2462b aggregations2;
        Double restingCaloriesAverage;
        ny.b.C2462b aggregations3;
        Double activeCaloriesAverage;
        List<ny.c> listD;
        ny.d dVar;
        f fVar2;
        List<e> list;
        int i14 = this.f188014a;
        String str = "";
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                u82.f fVar3 = (u82.f) obj2;
                m mVar = (m) obj3;
                ((Integer) obj4).intValue();
                ((t) obj).getClass();
                fVar3.getClass();
                x1 x1Var = n.f135158a;
                ny.c cVar = (ny.c) fVar3.a();
                final ny.c.b values = cVar != null ? cVar.getValues() : null;
                f fVar4 = this.f188017d;
                boolean zB = mVar.B(fVar4);
                o82.a aVar2 = this.f188016c;
                boolean zB2 = zB | mVar.B(aVar2);
                k kVar = this.f188018e;
                boolean zR = zB2 | mVar.r(kVar) | mVar.r(fVar3);
                Object objQ = mVar.q();
                if (zR) {
                    d.a aVar3 = new d.a(fVar4, aVar2, kVar, fVar3, null);
                    mVar.K(aVar3);
                    objQ = aVar3;
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        d.a aVar4 = new d.a(fVar4, aVar2, kVar, fVar3, null);
                        mVar.K(aVar4);
                        objQ = aVar4;
                    }
                }
                l0.e((p) objQ, fVar3, mVar);
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarD = x2.d(aVar5, 1.0f);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(rVarD, mVar);
                g.V.getClass();
                e0.a aVar6 = g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar6);
                } else {
                    mVar.c();
                }
                b4.c(g.a.f81810g, zVarA, mVar);
                b4.c(g.a.f81809f, i2VarX, mVar);
                g.a.b bVar2 = g.a.f81813j;
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    h.z(iHashCode, mVar, iHashCode, bVar2);
                }
                b4.c(g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                g6.f.a aVar7 = g6.f.f75994b;
                final sy.a aVar8 = this.f188015b;
                final int i15 = 0;
                z72.k.c(b0Var.b(x2.q(aVar5, 175), h4.d.a.f81537o), ty.b.a(values, mVar), null, null, 10, 0.0f, z3.f.c(1043868535, new q() { // from class: wy.c
                    @Override // e23.q
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i16 = i15;
                        ny.c.b bVar3 = values;
                        sy.a aVar9 = aVar8;
                        switch (i16) {
                            case 0:
                                t tVar = (t) obj5;
                                m mVar2 = (m) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                tVar.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var2 = n.f135158a;
                                    h4.r.a aVar10 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h4.r rVarC2 = tVar.c(aVar10, h4.d.a.f81528f);
                                    j.f22691a.getClass();
                                    z zVarA2 = y.a(j.f22696f, h4.d.a.f81536n, mVar2, 6);
                                    int iHashCode2 = Long.hashCode(mVar2.getU());
                                    i2 i2VarX2 = mVar2.x();
                                    h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                                    g.V.getClass();
                                    e0.a aVar11 = g.a.f81805b;
                                    if (mVar2.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar11);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(g.a.f81810g, zVarA2, mVar2);
                                    b4.c(g.a.f81809f, i2VarX2, mVar2);
                                    g.a.b bVar4 = g.a.f81813j;
                                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                        h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                                    }
                                    b4.c(g.a.f81807d, rVarC3, mVar2);
                                    b0 b0Var2 = b0.f22601a;
                                    String strA = aVar9.a(bVar3 != null ? bVar3.getTotalCalories() : null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0 x0VarB = d92.c.b(j92.f.f97928e, mVar2);
                                    h4.g.a aVar12 = h4.d.a.f81537o;
                                    mh.c(strA, b0Var2.b(aVar10, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                                    mh.c(gl1.y.Q(mVar2, R.string.lbl_total), b0Var2.b(aVar10, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                                    mVar2.y();
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            default:
                                t2 t2Var = (t2) obj5;
                                m mVar3 = (m) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                t2Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var3 = n.f135158a;
                                    int i17 = iIntValue2;
                                    l72.x0 x0Var = l72.x0.f111346a;
                                    String strA2 = aVar9.a(bVar3 != null ? bVar3.getActiveCalories() : null);
                                    ny.a.C2460a c2460a = ny.a.f128281b;
                                    ny.a aVar13 = ny.a.ACTIVE_CALORIES;
                                    c2460a.getClass();
                                    l72.x0.a aVar14 = new l72.x0.a(ny.a.C2460a.a(aVar13, mVar3), null);
                                    String strQ = gl1.y.Q(mVar3, R.string.lbl_active);
                                    int i18 = (i17 & 14) | (l72.x0.f111348c << 24);
                                    x0Var.a(i18, 120, null, t2Var, null, null, strA2, strQ, null, aVar14, mVar3);
                                    x0Var.a(i18, 120, null, t2Var, null, null, aVar9.a(bVar3 != null ? bVar3.getRestingCalories() : null), gl1.y.Q(mVar3, R.string.lbl_resting_calorie), null, new l72.x0.a(ny.a.C2460a.a(ny.a.RESTING_CALORIES, mVar3), null), mVar3);
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar), mVar, 12779520, 92);
                String strQ = gl1.y.Q(mVar, R.string.lbl_calories_equation);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57755e;
                h4.r rVarF = x2.f(aVar5, 1.0f);
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                mh.c(strQ, l.y(rVarF, eVar.f97920e), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
                final int i17 = 1;
                l72.x0.f111346a.e(l.y(aVar5, eVar.f97920e), z3.f.c(419782382, new q() { // from class: wy.c
                    @Override // e23.q
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i18 = i17;
                        ny.c.b bVar3 = values;
                        sy.a aVar9 = aVar8;
                        switch (i18) {
                            case 0:
                                t tVar = (t) obj5;
                                m mVar2 = (m) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                tVar.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var2 = n.f135158a;
                                    h4.r.a aVar10 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h4.r rVarC2 = tVar.c(aVar10, h4.d.a.f81528f);
                                    j.f22691a.getClass();
                                    z zVarA2 = y.a(j.f22696f, h4.d.a.f81536n, mVar2, 6);
                                    int iHashCode2 = Long.hashCode(mVar2.getU());
                                    i2 i2VarX2 = mVar2.x();
                                    h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                                    g.V.getClass();
                                    e0.a aVar11 = g.a.f81805b;
                                    if (mVar2.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar11);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(g.a.f81810g, zVarA2, mVar2);
                                    b4.c(g.a.f81809f, i2VarX2, mVar2);
                                    g.a.b bVar4 = g.a.f81813j;
                                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                        h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                                    }
                                    b4.c(g.a.f81807d, rVarC3, mVar2);
                                    b0 b0Var2 = b0.f22601a;
                                    String strA = aVar9.a(bVar3 != null ? bVar3.getTotalCalories() : null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0 x0VarB2 = d92.c.b(j92.f.f97928e, mVar2);
                                    h4.g.a aVar12 = h4.d.a.f81537o;
                                    mh.c(strA, b0Var2.b(aVar10, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 131068);
                                    mh.c(gl1.y.Q(mVar2, R.string.lbl_total), b0Var2.b(aVar10, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                                    mVar2.y();
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            default:
                                t2 t2Var = (t2) obj5;
                                m mVar3 = (m) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                t2Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var3 = n.f135158a;
                                    int i19 = iIntValue2;
                                    l72.x0 x0Var = l72.x0.f111346a;
                                    String strA2 = aVar9.a(bVar3 != null ? bVar3.getActiveCalories() : null);
                                    ny.a.C2460a c2460a = ny.a.f128281b;
                                    ny.a aVar13 = ny.a.ACTIVE_CALORIES;
                                    c2460a.getClass();
                                    l72.x0.a aVar14 = new l72.x0.a(ny.a.C2460a.a(aVar13, mVar3), null);
                                    String strQ2 = gl1.y.Q(mVar3, R.string.lbl_active);
                                    int i110 = (i19 & 14) | (l72.x0.f111348c << 24);
                                    x0Var.a(i110, 120, null, t2Var, null, null, strA2, strQ2, null, aVar14, mVar3);
                                    x0Var.a(i110, 120, null, t2Var, null, null, aVar9.a(bVar3 != null ? bVar3.getRestingCalories() : null), gl1.y.Q(mVar3, R.string.lbl_resting_calorie), null, new l72.x0.a(ny.a.C2460a.a(ny.a.RESTING_CALORIES, mVar3), null), mVar3);
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar), mVar, (l72.x0.f111348c << 6) | 48, 0);
                mVar.y();
                return Unit.INSTANCE;
            case 1:
                u82.f fVar5 = (u82.f) obj2;
                m mVar2 = (m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar5.getClass();
                x1 x1Var2 = n.f135158a;
                ny.b bVar3 = (ny.b) fVar5.a();
                sy.a aVar9 = this.f188015b;
                aVar9.getClass();
                o82.a aVar10 = this.f188016c;
                aVar10.getClass();
                o oVar = aVar10.f130844b;
                o oVar2 = aVar10.f130843a;
                TreeMap treeMap = new TreeMap(new a61.c(new sv0.b(17), 24));
                if (bVar3 != null && (listD = bVar3.d()) != null) {
                    for (ny.c cVar2 : listD) {
                        String calendarDateString = cVar2.getCalendarDateString();
                        if (calendarDateString != null) {
                            treeMap.put(calendarDateString, cVar2);
                        }
                    }
                }
                ArrayList<String> arrayList = new ArrayList();
                LocalDate localDateH = g22.l.h(oVar2);
                LocalDate localDateH2 = g22.l.h(oVar);
                while (localDateH.compareTo((ReadablePartial) localDateH2) <= 0) {
                    String strB = j0.b(localDateH.toDateTimeAtStartOfDay(), "yyyy-MM-dd", null);
                    if (strB == null) {
                        strB = "";
                    }
                    arrayList.add(strB);
                    localDateH = localDateH.plus(Days.ONE);
                    localDateH.getClass();
                }
                if (treeMap.size() < arrayList.size()) {
                    for (String str2 : arrayList) {
                        if (!treeMap.containsKey(str2)) {
                            treeMap.put(str2, new ny.c(str2, null, 2, null));
                        }
                    }
                }
                f fVar6 = this.f188017d;
                boolean zB3 = mVar2.B(fVar6) | mVar2.B(aVar10) | mVar2.r(bVar3);
                k kVar3 = this.f188018e;
                boolean zR2 = zB3 | mVar2.r(kVar3);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    bVar = bVar3;
                    objQ2 = new xy.j.a(fVar6, aVar10, bVar, kVar3, null);
                    fVar = fVar6;
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        bVar = bVar3;
                        objQ2 = new xy.j.a(fVar6, aVar10, bVar, kVar3, null);
                        fVar = fVar6;
                        mVar2.K(objQ2);
                    } else {
                        bVar = bVar3;
                        fVar = fVar6;
                    }
                }
                l0.e((p) objQ2, fVar5, mVar2);
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                j.f22691a.getClass();
                j.k kVar4 = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = y.a(kVar4, h4.d.a.f81536n, mVar2, 0);
                x1 x1Var3 = n.f135158a;
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
                g.V.getClass();
                e0.a aVar11 = g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar11);
                } else {
                    mVar2.c();
                }
                b4.c(g.a.f81810g, zVarA2, mVar2);
                b4.c(g.a.f81809f, i2VarX2, mVar2);
                g.a.b bVar4 = g.a.f81813j;
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                }
                b4.c(g.a.f81807d, rVarC2, mVar2);
                b0 b0Var2 = b0.f22601a;
                DateTime dateTimeAtStartOfDay = g22.l.h(oVar2).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(oVar).toDateTimeAtStartOfDay();
                List listB1 = h0.b1(h0.G0(treeMap.values()));
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                xy.h.a(listB1, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, aVar9, mVar2, 0);
                ty.a.a(aVar9.a((bVar == null || (aggregations3 = bVar.getAggregations()) == null || (activeCaloriesAverage = aggregations3.getActiveCaloriesAverage()) == null) ? null : Integer.valueOf((int) activeCaloriesAverage.doubleValue())), aVar9.a((bVar == null || (aggregations2 = bVar.getAggregations()) == null || (restingCaloriesAverage = aggregations2.getRestingCaloriesAverage()) == null) ? null : Integer.valueOf((int) restingCaloriesAverage.doubleValue())), aVar9.a((bVar == null || (aggregations = bVar.getAggregations()) == null || (totalCaloriesAverage = aggregations.getTotalCaloriesAverage()) == null) ? null : Integer.valueOf((int) totalCaloriesAverage.doubleValue())), mVar2, 0);
                boolean zB4 = mVar2.B(fVar);
                Object objQ3 = mVar2.q();
                if (zB4) {
                    objQ3 = new d52.k(fVar, 28);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new d52.k(fVar, 28);
                        mVar2.K(objQ3);
                    }
                }
                xy.j.a(treeMap, (e23.l) objQ3, mVar2, 0);
                mVar2.y();
                return Unit.INSTANCE;
            default:
                u82.f fVar7 = (u82.f) obj2;
                m mVar3 = (m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar7.getClass();
                x1 x1Var4 = n.f135158a;
                ny.d dVar2 = (ny.d) fVar7.a();
                pi0.e eVar2 = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                sy.a aVar12 = this.f188015b;
                aVar12.getClass();
                o82.a aVar13 = this.f188016c;
                aVar13.getClass();
                o oVar3 = aVar13.f130844b;
                o oVar4 = aVar13.f130843a;
                TreeMap treeMap2 = new TreeMap(new a61.c(new sv0.b(18), 25));
                if (dVar2 != null && (list = dVar2.f128299a) != null) {
                    for (e eVar3 : list) {
                        String calendarDateString2 = eVar3.getCalendarDateString();
                        if (calendarDateString2 != null) {
                            treeMap2.put(calendarDateString2, eVar3);
                        }
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList();
                LocalDate localDateH3 = g22.l.h(oVar4);
                LocalDate localDateH4 = g22.l.h(oVar3);
                while (localDateH3.compareTo((ReadablePartial) localDateH4) <= 0) {
                    String str3 = str;
                    LocalDate localDate = localDateH4;
                    String strB2 = j0.b(localDateH3.toDateTimeAtStartOfDay(), "yyyy-MM-dd", null);
                    if (strB2 == null) {
                        strB2 = str3;
                    }
                    arrayList2.add(strB2);
                    localDateH3 = localDateH3.plus(Days.SEVEN);
                    localDateH3.getClass();
                    localDateH4 = localDate;
                    str = str3;
                }
                if (treeMap2.size() < arrayList2.size()) {
                    for (String str4 : arrayList2) {
                        if (!treeMap2.containsKey(str4)) {
                            treeMap2.put(str4, new e(str4, null, 2, null));
                        }
                    }
                }
                f fVar8 = this.f188017d;
                boolean zB5 = mVar3.B(fVar8) | mVar3.B(aVar13);
                k kVar5 = this.f188018e;
                boolean zR3 = zB5 | mVar3.r(kVar5) | mVar3.r(dVar2);
                Object objQ4 = mVar3.q();
                if (zR3) {
                    dVar = dVar2;
                    objQ4 = new xy.l.a(fVar8, aVar13, kVar5, dVar, null);
                    fVar2 = fVar8;
                    mVar3.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        dVar = dVar2;
                        objQ4 = new xy.l.a(fVar8, aVar13, kVar5, dVar, null);
                        fVar2 = fVar8;
                        mVar3.K(objQ4);
                    } else {
                        dVar = dVar2;
                        fVar2 = fVar8;
                    }
                }
                l0.e((p) objQ4, fVar7, mVar3);
                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                j.f22691a.getClass();
                j.k kVar6 = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA3 = y.a(kVar6, h4.d.a.f81536n, mVar3, 0);
                x1 x1Var5 = n.f135158a;
                int iHashCode3 = Long.hashCode(mVar3.getU());
                i2 i2VarX3 = mVar3.x();
                h4.r rVarC3 = h4.k.c(rVarF3, mVar3);
                g.V.getClass();
                e0.a aVar14 = g.a.f81805b;
                if (mVar3.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar14);
                } else {
                    mVar3.c();
                }
                b4.c(g.a.f81810g, zVarA3, mVar3);
                b4.c(g.a.f81809f, i2VarX3, mVar3);
                g.a.b bVar5 = g.a.f81813j;
                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                    h.z(iHashCode3, mVar3, iHashCode3, bVar5);
                }
                b4.c(g.a.f81807d, rVarC3, mVar3);
                b0 b0Var3 = b0.f22601a;
                DateTime dateTimeAtStartOfDay3 = g22.l.h(oVar4).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay4 = g22.l.h(oVar3).toDateTimeAtStartOfDay();
                List listB2 = h0.b1(h0.G0(treeMap2.values()));
                dateTimeAtStartOfDay3.getClass();
                dateTimeAtStartOfDay4.getClass();
                xy.k.a(listB2, dateTimeAtStartOfDay3, dateTimeAtStartOfDay4, aVar12, eVar2, mVar3, 32768);
                ty.a.a(aVar12.a(dVar != null ? dVar.a() : null), aVar12.a(dVar != null ? dVar.b() : null), aVar12.a(dVar != null ? dVar.c() : null), mVar3, 0);
                boolean zB6 = mVar3.B(fVar2);
                Object objQ5 = mVar3.q();
                if (zB6) {
                    objQ5 = new d52.k(fVar2, 29);
                    mVar3.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new d52.k(fVar2, 29);
                        mVar3.K(objQ5);
                    }
                }
                xy.l.a(treeMap2, (e23.l) objQ5, mVar3, 0);
                mVar3.y();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(sy.a aVar, o82.a aVar2, f fVar, k kVar, int i14) {
        this.f188014a = i14;
        this.f188015b = aVar;
        this.f188016c = aVar2;
        this.f188017d = fVar;
        this.f188018e = kVar;
    }
}
