package sk0;

import android.content.Context;
import android.icu.text.DecimalFormatSymbols;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.proto.generated.GDIInReachMessaging;
import i3.ba;
import i3.mh;
import i3.na;
import i3.sg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.i3;
import l72.p2;
import o72.a3;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p006l2.l2;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.a2;
import u1.d2;
import v62.v7;
import z2.t2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f159713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f159714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f159715e;

    public /* synthetic */ k1(aa1.g gVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f159711a = 17;
        this.f159712b = gVar;
        this.f159713c = aVar;
        this.f159714d = aVar2;
        this.f159715e = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
    private final Object a(Object obj, Object obj2) {
        Object next;
        p3.p1 p1Var = (p3.p1) this.f159714d;
        e2.i0 i0Var = (e2.i0) this.f159713c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.u) this.f159712b;
        List list = (List) this.f159715e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97918c);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
            f82.d dVar = new f82.d();
            boolean zR = mVar.r(uVar) | mVar.r(list);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new tb0.h(p1Var, 7, uVar, list);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new tb0.h(p1Var, 7, uVar, list);
                    mVar.K(objQ);
                }
            }
            e82.a.b(cVarE, dVar, i0Var, null, null, (e23.p) objQ, mVar, 0, 24);
            Object objQ2 = mVar.q();
            aVar4.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = p3.l0.j(t13.h.f161748a, mVar);
                mVar.K(objQ2);
            }
            o53.b0 b0Var = (o53.b0) objQ2;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l72.j0) next).f111076e);
            int iIndexOf = list.indexOf(next);
            if (iIndexOf != -1) {
                mVar.C(1407819396);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                boolean zR2 = mVar.r(b0Var) | mVar.B(i0Var) | mVar.k(iIndexOf);
                Object objQ3 = mVar.q();
                if (zR2 || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ty1.j1(b0Var, i0Var, iIndexOf, null);
                    mVar.K(objQ3);
                }
                p3.l0.e((e23.p) objQ3, numValueOf, mVar);
                mVar.f();
            } else {
                mVar.C(1408158629);
                mVar.f();
            }
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:28:0x0101  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        p3.l1 l1Var = (p3.l1) this.f159713c;
        p3.p1 p1Var = (p3.p1) this.f159714d;
        p3.p1 p1Var2 = (p3.p1) this.f159715e;
        p3.n1 n1Var = (p3.n1) this.f159712b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
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
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            double doubleValue = l1Var.getDoubleValue();
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            String decimalSeparatorString = DecimalFormatSymbols.getInstance().getDecimalSeparatorString();
            decimalSeparatorString.getClass();
            boolean zB = mVar.B(l1Var) | mVar.B(p1Var) | mVar.B(p1Var2);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new tn2.s0(p1Var, 6, p1Var2, l1Var);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new tn2.s0(p1Var, 6, p1Var2, l1Var);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zB2 = mVar.B(n1Var);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new a3(n1Var, 12);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a3(n1Var, 12);
                    mVar.K(objQ2);
                }
            }
            r82.u.a(null, zBooleanValue, zBooleanValue2, null, null, null, decimalSeparatorString, doubleValue, 0.0d, 0.0d, 0, 0.0d, lVar, (e23.l) objQ2, null, true, false, mVar, 0, 196608, 85817);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0308  */
    /* JADX WARN: Code duplicated, block: B:103:0x030b  */
    /* JADX WARN: Code duplicated, block: B:105:0x030f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0319  */
    /* JADX WARN: Code duplicated, block: B:109:0x0328  */
    /* JADX WARN: Code duplicated, block: B:110:0x032b  */
    /* JADX WARN: Code duplicated, block: B:112:0x032f  */
    /* JADX WARN: Code duplicated, block: B:114:0x033c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0353  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124  */
    /* JADX WARN: Code duplicated, block: B:35:0x0127  */
    /* JADX WARN: Code duplicated, block: B:37:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0136  */
    /* JADX WARN: Code duplicated, block: B:40:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x014d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154  */
    /* JADX WARN: Code duplicated, block: B:47:0x0162  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x022c  */
    /* JADX WARN: Code duplicated, block: B:56:0x022f  */
    /* JADX WARN: Code duplicated, block: B:62:0x023d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:65:0x0247  */
    /* JADX WARN: Code duplicated, block: B:71:0x0257  */
    /* JADX WARN: Code duplicated, block: B:77:0x027b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0282  */
    /* JADX WARN: Code duplicated, block: B:81:0x0286  */
    /* JADX WARN: Code duplicated, block: B:84:0x028e  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x02da  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f6  */
    private final Object c(Object obj, Object obj2) {
        String str;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        dy1.f fVar2;
        String str2;
        String str3;
        float f14;
        boolean z14;
        String str4;
        Integer num;
        int iIntValue;
        int iIntValue2;
        String str5;
        boolean z15;
        String str6;
        dy1.m mVar;
        dy1.f fVar3;
        dy1.t tVar;
        int i14;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zR;
        Object objQ2;
        String strValueOf;
        Integer num2;
        dy1.r rVar = (dy1.r) this.f159713c;
        Map map = (Map) this.f159712b;
        String str7 = (String) this.f159715e;
        p3.p1 p1Var = (p3.p1) this.f159714d;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            long jA = tn.k.a(d92.b.f58623a, mVar2);
            o4.m1.a aVar2 = o4.m1.f128891a;
            h4.r rVarB = a2.b(u1.n.e(rVarD, jA, aVar2), a2.a(mVar2), true);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA2 = c2.y.a(kVar, aVar3, mVar2, 48);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            i2 i2VarX2 = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarB, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar4);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT()) {
                str = str7;
            } else {
                str = str7;
                if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar2);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), d92.b.a(mVar2).c().c(), aVar2);
                zVarA = c2.y.a(kVar, aVar3, mVar2, 48);
                iHashCode = Long.hashCode(mVar2.getU());
                i2VarX = mVar2.x();
                rVarC = h4.k.c(rVarE, mVar2);
                if (mVar2.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar4);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, zVarA, mVar2);
                b4.c(c1623g, i2VarX, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar2);
                if (rVar != null) {
                    fVar2 = rVar.f61625q;
                } else {
                    fVar2 = null;
                }
                if (fVar2 == null) {
                    mVar2.C(-1934426258);
                    mVar2.f();
                } else {
                    mVar2.C(-1934426257);
                    str2 = rVar.f61609a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ux1.j.a(fVar2, str2, mVar2, 0);
                    Unit unit = Unit.INSTANCE;
                    mVar2.f();
                }
                if (rVar != null) {
                    str3 = rVar.f61611c;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    mVar2.C(-1934232694);
                    mVar2.f();
                    z14 = true;
                    f14 = 1.0f;
                } else {
                    mVar2.C(-1934232693);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    h4.r rVarC3 = c2.l.C(rVarF, f15, f15, f15, 0.0f, 8);
                    d6.h.f57752b.getClass();
                    f14 = 1.0f;
                    String str8 = str3;
                    z14 = true;
                    mh.c(str8, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    Unit unit2 = Unit.INSTANCE;
                    mVar2.f();
                }
                if (rVar != null) {
                    mVar2 = mVar2;
                    str4 = rVar.f61612d;
                } else {
                    mVar2 = mVar2;
                    str4 = null;
                }
                if (str4 == null) {
                    mVar2.C(-1933697603);
                    mVar2.f();
                } else {
                    mVar2.C(-1933697602);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                    h4.r rVarF2 = x2.f(aVar, f14);
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(rVarF2, eVar2.f97920e, eVar2.f97918c);
                    d6.h.f57752b.getClass();
                    p3.m mVar3 = mVar2;
                    mh.c(str4, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 130044);
                    mVar2 = mVar3;
                    Unit unit3 = Unit.INSTANCE;
                    mVar2.f();
                }
                if (rVar != null) {
                    num = rVar.f61613e;
                } else {
                    num = null;
                }
                if (rVar != null || (num2 = rVar.f61614f) == null) {
                    iIntValue = 5;
                } else {
                    iIntValue = num2.intValue();
                }
                int i15 = iIntValue;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                    str5 = str;
                } else {
                    str5 = strValueOf;
                }
                String strP = gl1.y.P(R.string.lbl_week_number, new Object[]{str5}, mVar2);
                String strP2 = gl1.y.P(R.string.lbl_of_value, new Object[]{String.valueOf(i15)}, mVar2);
                if (rVar == null && rVar.f61619k == z14) {
                    z15 = z14;
                } else {
                    z15 = false;
                }
                ux1.j.h(i15, iIntValue2, strP, strP2, z15, mVar2, 0);
                if (rVar != null) {
                    str6 = rVar.f61615g;
                } else {
                    str6 = null;
                }
                if (g22.n.d(str6)) {
                    mVar2.C(-1932468886);
                    String str9 = rVar.f61616h;
                    String str10 = rVar.f61617i;
                    boolean z16 = rVar.f61618j;
                    boolean z17 = rVar.f61624p;
                    objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new tn.h(p1Var, 22);
                        mVar2.K(objQ);
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    zR = mVar2.r(rVar);
                    objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new ty1.f1(rVar, 18);
                        mVar2.K(objQ2);
                    }
                    p3.m mVar4 = mVar2;
                    ux1.j.g(str6, str9, str10, z16, z17, aVar5, (e23.a) objQ2, mVar4, 196608);
                    mVar2 = mVar4;
                    mVar2.f();
                } else {
                    mVar2.C(-1931773122);
                    mVar2.f();
                }
                if (rVar != null) {
                    mVar = rVar.f61626r;
                } else {
                    mVar = null;
                }
                if (mVar == null) {
                    mVar2.C(-1931735489);
                } else {
                    mVar2.C(-1931735488);
                    ux1.j.i(mVar, mVar2, 0);
                    Unit unit4 = Unit.INSTANCE;
                }
                mVar2.f();
                mVar2.y();
                if (rVar != null) {
                    fVar3 = rVar.f61625q;
                } else {
                    fVar3 = null;
                }
                if (fVar3 == null) {
                    mVar2.C(-2137159796);
                } else {
                    mVar2.C(-2137159795);
                    ux1.j.b(fVar3, mVar2, 0);
                    Unit unit5 = Unit.INSTANCE;
                }
                mVar2.f();
                if (rVar != null) {
                    tVar = rVar.f61627s;
                } else {
                    tVar = null;
                }
                if (tVar == null) {
                    mVar2.C(-2137060596);
                    mVar2.f();
                    i14 = 0;
                } else {
                    mVar2.C(-2137060595);
                    i14 = 0;
                    ux1.j.j(tVar, mVar2, 0);
                    Unit unit6 = Unit.INSTANCE;
                    mVar2.f();
                }
                ux1.j.c(map, mVar2, i14);
                mVar2.y();
            }
            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar2);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarE2 = u1.n.e(x2.d(aVar, 1.0f), d92.b.a(mVar2).c().c(), aVar2);
            zVarA = c2.y.a(kVar, aVar3, mVar2, 48);
            iHashCode = Long.hashCode(mVar2.getU());
            i2VarX = mVar2.x();
            rVarC = h4.k.c(rVarE2, mVar2);
            if (mVar2.F() != null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar4);
            } else {
                mVar2.c();
            }
            b4.c(eVar, zVarA, mVar2);
            b4.c(c1623g, i2VarX, mVar2);
            if (mVar2.getT()) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar2);
            if (rVar != null) {
                fVar2 = rVar.f61625q;
            } else {
                fVar2 = null;
            }
            if (fVar2 == null) {
                mVar2.C(-1934426258);
                mVar2.f();
            } else {
                mVar2.C(-1934426257);
                str2 = rVar.f61609a;
                if (str2 == null) {
                    str2 = "";
                }
                ux1.j.a(fVar2, str2, mVar2, 0);
                Unit unit7 = Unit.INSTANCE;
                mVar2.f();
            }
            if (rVar != null) {
                str3 = rVar.f61611c;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                mVar2.C(-1934232694);
                mVar2.f();
                z14 = true;
                f14 = 1.0f;
            } else {
                mVar2.C(-1934232693);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                h4.r rVarF3 = x2.f(aVar, 1.0f);
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97899b.f97920e;
                h4.r rVarC4 = c2.l.C(rVarF3, f16, f16, f16, 0.0f, 8);
                d6.h.f57752b.getClass();
                f14 = 1.0f;
                String str11 = str3;
                z14 = true;
                mh.c(str11, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 130044);
                Unit unit8 = Unit.INSTANCE;
                mVar2.f();
            }
            if (rVar != null) {
                mVar2 = mVar2;
                str4 = rVar.f61612d;
            } else {
                mVar2 = mVar2;
                str4 = null;
            }
            if (str4 == null) {
                mVar2.C(-1933697603);
                mVar2.f();
            } else {
                mVar2.C(-1933697602);
                d92.b.f58624b.getClass();
                s5.x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar2);
                h4.r rVarF4 = x2.f(aVar, f14);
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                h4.r rVarZ2 = c2.l.z(rVarF4, eVar3.f97920e, eVar3.f97918c);
                d6.h.f57752b.getClass();
                p3.m mVar5 = mVar2;
                mh.c(str4, rVarZ2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, mVar5, 0, 0, 130044);
                mVar2 = mVar5;
                Unit unit9 = Unit.INSTANCE;
                mVar2.f();
            }
            if (rVar != null) {
                num = rVar.f61613e;
            } else {
                num = null;
            }
            if (rVar != null) {
                iIntValue = 5;
            } else {
                iIntValue = 5;
            }
            int i16 = iIntValue;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (num != null) {
                str5 = str;
            } else {
                str5 = str;
            }
            String strP3 = gl1.y.P(R.string.lbl_week_number, new Object[]{str5}, mVar2);
            String strP4 = gl1.y.P(R.string.lbl_of_value, new Object[]{String.valueOf(i16)}, mVar2);
            if (rVar == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            ux1.j.h(i16, iIntValue2, strP3, strP4, z15, mVar2, 0);
            if (rVar != null) {
                str6 = rVar.f61615g;
            } else {
                str6 = null;
            }
            if (g22.n.d(str6)) {
                mVar2.C(-1932468886);
                String str12 = rVar.f61616h;
                String str13 = rVar.f61617i;
                boolean z18 = rVar.f61618j;
                boolean z19 = rVar.f61624p;
                objQ = mVar2.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new tn.h(p1Var, 22);
                    mVar2.K(objQ);
                }
                e23.a aVar6 = (e23.a) objQ;
                zR = mVar2.r(rVar);
                objQ2 = mVar2.q();
                if (zR) {
                    objQ2 = new ty1.f1(rVar, 18);
                    mVar2.K(objQ2);
                } else {
                    objQ2 = new ty1.f1(rVar, 18);
                    mVar2.K(objQ2);
                }
                p3.m mVar6 = mVar2;
                ux1.j.g(str6, str12, str13, z18, z19, aVar6, (e23.a) objQ2, mVar6, 196608);
                mVar2 = mVar6;
                mVar2.f();
            } else {
                mVar2.C(-1931773122);
                mVar2.f();
            }
            if (rVar != null) {
                mVar = rVar.f61626r;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                mVar2.C(-1931735489);
            } else {
                mVar2.C(-1931735488);
                ux1.j.i(mVar, mVar2, 0);
                Unit unit10 = Unit.INSTANCE;
            }
            mVar2.f();
            mVar2.y();
            if (rVar != null) {
                fVar3 = rVar.f61625q;
            } else {
                fVar3 = null;
            }
            if (fVar3 == null) {
                mVar2.C(-2137159796);
            } else {
                mVar2.C(-2137159795);
                ux1.j.b(fVar3, mVar2, 0);
                Unit unit11 = Unit.INSTANCE;
            }
            mVar2.f();
            if (rVar != null) {
                tVar = rVar.f61627s;
            } else {
                tVar = null;
            }
            if (tVar == null) {
                mVar2.C(-2137060596);
                mVar2.f();
                i14 = 0;
            } else {
                mVar2.C(-2137060595);
                i14 = 0;
                ux1.j.j(tVar, mVar2, 0);
                Unit unit12 = Unit.INSTANCE;
                mVar2.f();
            }
            ux1.j.c(map, mVar2, i14);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2) {
        k30.k kVar = (k30.k) this.f159713c;
        i53.c cVar = (i53.c) this.f159715e;
        e23.l lVar = (e23.l) this.f159712b;
        p3.p1 p1Var = (p3.p1) this.f159714d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new n(p1Var, 28);
                mVar.K(objQ);
            }
            v40.e.b(zBooleanValue, (e23.l) objQ, kVar, cVar, lVar, mVar, 48);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    private final Object e(Object obj, Object obj2) {
        p3.p1 p1Var = (p3.p1) this.f159714d;
        List list = (List) this.f159713c;
        i53.c cVar = (i53.c) this.f159712b;
        p3.p1 p1Var2 = (p3.p1) this.f159715e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = c2.l.D(h4.r.S);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
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
            boolean zB = mVar.B(p1Var) | mVar.r(list) | mVar.B(cVar);
            Object objQ = mVar.q();
            if (zB) {
                t42.l lVar = new t42.l(list, p1Var, cVar, p1Var2, 12);
                mVar.K(lVar);
                objQ = lVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    t42.l lVar2 = new t42.l(list, p1Var, cVar, p1Var2, 12);
                    mVar.K(lVar2);
                    objQ = lVar2;
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 511);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    private final Object f(Object obj, Object obj2) {
        List<ix1.g> list = (List) this.f159713c;
        h82.r rVar = (h82.r) this.f159712b;
        vx1.e eVar = (vx1.e) this.f159714d;
        Context context = (Context) this.f159715e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = vx1.e.f180659j;
        int i15 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            for (ix1.g gVar : list) {
                String string = context.getString(R.string.string_short_dash_line_string_pattern, vx1.e.j(gVar, context, eVar.f180662h), context.getString(gVar.f95742a));
                string.getClass();
                boolean zR = mVar.r(eVar) | mVar.k(gVar.ordinal());
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new vv0.n(i15, eVar, gVar);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new vv0.n(i15, eVar, gVar);
                        mVar.K(objQ);
                    }
                }
                rVar.C(string, null, false, (e23.a) objQ, mVar, 0, 6);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x017d  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c2  */
    private final Object g(Object obj, Object obj2) throws Throwable {
        Throwable th3;
        h5.g.a.f fVar;
        f5.z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zR;
        Object objQ2;
        DateTime dateTime = (DateTime) this.f159713c;
        DateTime dateTime2 = (DateTime) this.f159712b;
        Context context = (Context) this.f159714d;
        a71.e eVar = (a71.e) this.f159715e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                th3 = null;
            } else {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(aVar, mVar);
                if (mVar.F() != null) {
                    p3.p0.l();
                    throw th3;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, z0VarD, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                float f14 = 350;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarH = x2.h(rVarF, f14);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97920e;
                h4.r rVarB = c2.l.B(rVarH, f15, f15, f15, f15);
                String strQ = gl1.y.Q(mVar, R.string.lbl_4w_timeline);
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131068);
                h4.r rVarH2 = x2.h(x2.f(aVar, 1.0f), f14);
                objQ = mVar.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new vn2.b1(19);
                    mVar.K(objQ);
                }
                e23.l lVar = (e23.l) objQ;
                zR = mVar.r(dateTime) | mVar.r(dateTime2) | mVar.r(context) | mVar.r(eVar);
                objQ2 = mVar.q();
                if (zR || objQ2 == c2565a) {
                    t42.l lVar2 = new t42.l(dateTime, dateTime2, context, eVar, 18);
                    mVar.K(lVar2);
                    objQ2 = lVar2;
                }
                p002j6.c.b(lVar, rVarH2, (e23.l) objQ2, mVar, 54, 0);
                mVar.y();
                mVar.y();
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(aVar, mVar);
            if (mVar.F() != null) {
                p3.p0.l();
                throw th3;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(eVar2, z0VarD, mVar);
            b4.c(c1623g, i2VarX, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            float f16 = 350;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarH3 = x2.h(rVarF2, f16);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f17 = j92.b.f97899b.f97920e;
            h4.r rVarB2 = c2.l.B(rVarH3, f17, f17, f17, f17);
            String strQ2 = gl1.y.Q(mVar, R.string.lbl_4w_timeline);
            d92.b.f58624b.getClass();
            mh.c(strQ2, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131068);
            h4.r rVarH4 = x2.h(x2.f(aVar, 1.0f), f16);
            objQ = mVar.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new vn2.b1(19);
                mVar.K(objQ);
            }
            e23.l lVar3 = (e23.l) objQ;
            zR = mVar.r(dateTime) | mVar.r(dateTime2) | mVar.r(context) | mVar.r(eVar);
            objQ2 = mVar.q();
            if (zR) {
                t42.l lVar4 = new t42.l(dateTime, dateTime2, context, eVar, 18);
                mVar.K(lVar4);
                objQ2 = lVar4;
            } else {
                t42.l lVar5 = new t42.l(dateTime, dateTime2, context, eVar, 18);
                mVar.K(lVar5);
                objQ2 = lVar5;
            }
            p002j6.c.b(lVar3, rVarH4, (e23.l) objQ2, mVar, 54, 0);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0203  */
    /* JADX WARN: Code duplicated, block: B:62:0x0211  */
    /* JADX WARN: Code duplicated, block: B:63:0x0216  */
    /* JADX WARN: Code duplicated, block: B:67:0x0239  */
    /* JADX WARN: Code duplicated, block: B:70:0x0262  */
    /* JADX WARN: Code duplicated, block: B:72:0x026b  */
    /* JADX WARN: Code duplicated, block: B:73:0x026f  */
    /* JADX WARN: Code duplicated, block: B:78:0x028c  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x030e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0378  */
    /* JADX WARN: Code duplicated, block: B:89:0x0418  */
    /* JADX WARN: Code duplicated, block: B:91:0x041c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2) {
        o82.a aVar;
        p3.p1 p1VarC;
        u82.f fVar;
        sl1.h hVar;
        CustomCombinedChart customCombinedChart;
        h5.g.a.f fVar2;
        c2.b0 b0Var;
        o4.m1.a aVar2;
        j92.e eVar;
        float f14;
        u82.f fVar3;
        float f15;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        km1.c cVar;
        Integer numF0;
        boolean zR;
        Object objQ;
        c2.z zVarA2;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        DateTime dateTime = (DateTime) this.f159713c;
        sz1.t tVar = (sz1.t) this.f159712b;
        b10.b bVar = (b10.b) this.f159714d;
        b10.d dVar = (b10.d) this.f159715e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (dateTime != null) {
                b63.u uVarZ = g22.k.z(dateTime);
                aVar = new o82.a(uVarZ.b(), uVarZ.b());
            } else {
                aVar = null;
            }
            if (aVar == null) {
                mVar.C(-1786248335);
                mVar.f();
                fVar = null;
            } else {
                mVar.C(-1786248334);
                u82.a aVar3 = tVar != null ? tVar.f161582i : null;
                if (aVar3 == null) {
                    mVar.C(1432483210);
                    mVar.f();
                    p1VarC = null;
                } else {
                    mVar.C(-785074857);
                    p1VarC = aVar3.c(aVar, mVar);
                    mVar.f();
                }
                fVar = p1VarC != null ? (u82.f) p1VarC.getF182175a() : null;
                mVar.f();
            }
            if (fVar != null) {
                mVar.C(-1785812040);
                Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ5 = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ5 == c2565a) {
                    objQ5 = new CustomCombinedChart(context);
                    mVar.K(objQ5);
                }
                CustomCombinedChart customCombinedChart2 = (CustomCombinedChart) objQ5;
                Object objQ6 = mVar.q();
                if (objQ6 == c2565a) {
                    sl1.h hVar2 = new sl1.h(customCombinedChart2, rl1.j.STAGES, null, null, 12, null);
                    mVar.K(hVar2);
                    objQ6 = hVar2;
                }
                sl1.h hVar3 = (sl1.h) objQ6;
                tm1.a.C3110a c3110a = tm1.a.f165439a;
                km1.c cVar2 = (km1.c) fVar.a();
                if (cVar2 == null) {
                    cVar2 = new km1.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 33554431, null);
                }
                c3110a.getClass();
                rm1.j jVarA = tm1.a.C3110a.a(cVar2);
                h4.r.a aVar4 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar5 = h4.d.a.f81536n;
                c2.z zVarA3 = c2.y.a(kVar, aVar5, mVar, 0);
                int iHashCode3 = Long.hashCode(mVar.getU());
                i2 i2VarX3 = mVar.x();
                h4.r rVarC3 = h4.k.c(aVar4, mVar);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar6);
                } else {
                    mVar.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA3, mVar);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX3, mVar);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar.getT()) {
                    hVar = hVar3;
                    customCombinedChart = customCombinedChart2;
                } else {
                    customCombinedChart = customCombinedChart2;
                    hVar = hVar3;
                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar);
                    b0Var = c2.b0.f22601a;
                    long jE = vb.h.e(d92.b.f58623a, mVar);
                    aVar2 = o4.m1.f128891a;
                    h4.r rVarE = u1.n.e(aVar4, jE, aVar2);
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    f14 = eVar.f97918c;
                    fVar3 = fVar;
                    f15 = eVar.f97920e;
                    h4.r rVarA = c2.l.A(rVarE, f14, 0.0f, 2);
                    zVarA = c2.y.a(kVar, aVar5, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarA, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(fVar2, rVarC, mVar);
                    cVar = (km1.c) fVar3.a();
                    if (cVar != null) {
                        numF0 = cVar.f0();
                    } else {
                        numF0 = null;
                    }
                    h4.r rVarA2 = c2.l.A(x2.f(aVar4, 1.0f), 0.0f, eVar.f97921f, 1);
                    zR = mVar.r(bVar) | mVar.B(numF0);
                    objQ = mVar.q();
                    if (zR || objQ == c2565a) {
                        objQ = new kn1.l(bVar, numF0, 1);
                        mVar.K(objQ);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarA2, false);
                    zVarA2 = c2.y.a(kVar, aVar5, mVar, 0);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarC4, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA2, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    }
                    b4.c(fVar2, rVarC2, mVar);
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    h4.r rVarB = b0Var.b(aVar4, aVar7);
                    objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new vn2.b1(24);
                        mVar.K(objQ2);
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) objQ2, rVarB, false);
                    String strE = dVar.e(numF0);
                    d92.b.f58624b.getClass();
                    CustomCombinedChart customCombinedChart3 = customCombinedChart;
                    mh.c(strE, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar), mVar, 0, 0, 131068);
                    h4.r rVarB2 = b0Var.b(aVar4, aVar7);
                    objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new vn2.b1(25);
                        mVar.K(objQ3);
                    }
                    h4.r rVarC6 = p5.v.c((e23.l) objQ3, rVarB2, false);
                    s5.x0 x0Var = j92.f.f97932i;
                    mh.c("100", rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 6, 0, 131068);
                    h4.r rVarC7 = c2.l.C(b0Var.b(aVar4, aVar7), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    objQ4 = mVar.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new vn2.b1(26);
                        mVar.K(objQ4);
                    }
                    mh.c(gl1.y.Q(mVar, R.string.lbl_score), p5.v.c((e23.l) objQ4, rVarC7, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131068);
                    mVar.y();
                    l72.x0.f111346a.e(c2.l.B(aVar4, f14, f15, f14, f15), z3.f.c(1344173207, new vv0.e(6, dVar, fVar3), mVar), mVar, (l72.x0.f111348c << 6) | 48, 0);
                    mVar.y();
                    o4.d0.f128823b.getClass();
                    m92.o.a(u1.n.e(aVar4, o4.d0.f128831j, aVar2), null, null, null, z3.f.c(257399046, new vx1.b(jVarA, 5, customCombinedChart3, hVar), mVar), null, null, mVar, 24582, 110);
                    mVar.y();
                    mVar.f();
                }
                v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, mVar);
                b0Var = c2.b0.f22601a;
                long jE2 = vb.h.e(d92.b.f58623a, mVar);
                aVar2 = o4.m1.f128891a;
                h4.r rVarE2 = u1.n.e(aVar4, jE2, aVar2);
                d92.b.f58625c.getClass();
                eVar = j92.b.f97899b;
                f14 = eVar.f97918c;
                fVar3 = fVar;
                f15 = eVar.f97920e;
                h4.r rVarA3 = c2.l.A(rVarE2, f14, 0.0f, 2);
                zVarA = c2.y.a(kVar, aVar5, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarA3, mVar);
                if (mVar.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar6);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar2);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar2);
                }
                b4.c(fVar2, rVarC, mVar);
                cVar = (km1.c) fVar3.a();
                if (cVar != null) {
                    numF0 = cVar.f0();
                } else {
                    numF0 = null;
                }
                h4.r rVarA4 = c2.l.A(x2.f(aVar4, 1.0f), 0.0f, eVar.f97921f, 1);
                zR = mVar.r(bVar) | mVar.B(numF0);
                objQ = mVar.q();
                if (zR) {
                    objQ = new kn1.l(bVar, numF0, 1);
                    mVar.K(objQ);
                } else {
                    objQ = new kn1.l(bVar, numF0, 1);
                    mVar.K(objQ);
                }
                h4.r rVarC8 = p5.v.c((e23.l) objQ, rVarA4, false);
                zVarA2 = c2.y.a(kVar, aVar5, mVar, 0);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarC8, mVar);
                if (mVar.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar6);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, zVarA2, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                } else {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                }
                b4.c(fVar2, rVarC2, mVar);
                h4.g.a aVar8 = h4.d.a.f81537o;
                h4.r rVarB3 = b0Var.b(aVar4, aVar8);
                objQ2 = mVar.q();
                if (objQ2 == c2565a) {
                    objQ2 = new vn2.b1(24);
                    mVar.K(objQ2);
                }
                h4.r rVarC9 = p5.v.c((e23.l) objQ2, rVarB3, false);
                String strE2 = dVar.e(numF0);
                d92.b.f58624b.getClass();
                CustomCombinedChart customCombinedChart4 = customCombinedChart;
                mh.c(strE2, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar), mVar, 0, 0, 131068);
                h4.r rVarB4 = b0Var.b(aVar4, aVar8);
                objQ3 = mVar.q();
                if (objQ3 == c2565a) {
                    objQ3 = new vn2.b1(25);
                    mVar.K(objQ3);
                }
                h4.r rVarC10 = p5.v.c((e23.l) objQ3, rVarB4, false);
                s5.x0 x0Var2 = j92.f.f97932i;
                mh.c("100", rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar), mVar, 6, 0, 131068);
                h4.r rVarC11 = c2.l.C(b0Var.b(aVar4, aVar8), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                objQ4 = mVar.q();
                if (objQ4 == c2565a) {
                    objQ4 = new vn2.b1(26);
                    mVar.K(objQ4);
                }
                mh.c(gl1.y.Q(mVar, R.string.lbl_score), p5.v.c((e23.l) objQ4, rVarC11, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar), mVar, 0, 0, 131068);
                mVar.y();
                l72.x0.f111346a.e(c2.l.B(aVar4, f14, f15, f14, f15), z3.f.c(1344173207, new vv0.e(6, dVar, fVar3), mVar), mVar, (l72.x0.f111348c << 6) | 48, 0);
                mVar.y();
                o4.d0.f128823b.getClass();
                m92.o.a(u1.n.e(aVar4, o4.d0.f128831j, aVar2), null, null, null, z3.f.c(257399046, new vx1.b(jVarA, 5, customCombinedChart4, hVar), mVar), null, null, mVar, 24582, 110);
                mVar.y();
                mVar.f();
            } else {
                mVar.C(-1779981653);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0463  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0855  */
    /* JADX WARN: Code duplicated, block: B:220:0x08af  */
    /* JADX WARN: Code duplicated, block: B:251:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:262:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:297:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:323:0x0da7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i53.f fVar;
        z3.e eVar;
        String str;
        String strH;
        int i14;
        int i15;
        int i16;
        String strH2;
        i53.c cVarB;
        u4.d dVarA;
        int i17;
        int i18;
        int i19 = this.f159711a;
        p3.m.a aVar = p3.m.f135153a;
        Object[] objArr = 0;
        Object obj3 = this.f159714d;
        Object obj4 = this.f159715e;
        Object obj5 = this.f159712b;
        Object obj6 = this.f159713c;
        switch (i19) {
            case 0:
                e23.a aVar2 = (e23.a) obj6;
                e23.l lVar = (e23.l) obj5;
                p3.p1 p1Var = (p3.p1) obj3;
                p3.p1 p1Var2 = (p3.p1) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.edit_gear_title);
                    if (((m1) p1Var.getF182175a()).f159758d.isEmpty()) {
                        mVar.C(526380115);
                        mVar.f();
                        fVar = null;
                    } else {
                        mVar.C(526434241);
                        i53.f fVarA = i53.a.a(new i3("DONE", gl1.y.Q(mVar, R.string.lbl_done), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar.f();
                        fVar = fVarA;
                    }
                    boolean zB = mVar.B(lVar) | mVar.B(p1Var) | mVar.B(p1Var2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new p006l2.o(lVar, p1Var, p1Var2, 1);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p006l2.o(lVar, p1Var, p1Var2, 1);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.e(strQ, null, aVar2, fVar, (e23.l) objQ, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                l1.b((i1) obj3, (e23.l) obj5, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                sz1.m.b((Context) obj6, (h4.r) obj5, (String) obj3, (String) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                Context context = (Context) obj6;
                n82.f fVar2 = (n82.f) obj5;
                yd1.a aVar3 = (yd1.a) obj3;
                sz1.t tVar = (sz1.t) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar4, 1.0f), vb.h.e(d92.b.f58623a, mVar2), o4.m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar2);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarB = p02.a.b(aVar4, mVar2);
                    tn1.d dVar = tn1.d.TRAINING_READINESS;
                    ub1.l lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), c80.s0.TRAINING_READINESS, null, 6);
                    if (lVarU == null) {
                        mVar2.C(265815547);
                        mVar2.f();
                        eVar = null;
                    } else {
                        mVar2.C(265815548);
                        z3.e eVarC = z3.f.c(-493220253, new hx0.a(lVarU, 2), mVar2);
                        mVar2.f();
                        eVar = eVarC;
                    }
                    boolean zR = mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new s70.r(context, 18);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new s70.r(context, 18);
                            mVar2.K(objQ2);
                        }
                    }
                    p02.a.a(rVarB, dVar, eVar, (e23.a) objQ2, mVar2, 48, 0);
                    q82.a.a(x2.f(aVar4, 1.0f), new n82.n(fVar2, aVar3), null, mVar2, 6, 4);
                    n82.c.a(b0Var.a(aVar4, 1.0f, true), fVar2, 0, false, z3.f.c(628482893, new sz1.r(tVar, 0), mVar2), mVar2, 24576, 12);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                sz1.s.a((sz1.t) obj5, (b63.o) obj3, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                e23.l lVar2 = (e23.l) obj5;
                v21.e eVar2 = (v21.e) obj6;
                u21.e0 e0Var = (u21.e0) obj4;
                p3.p1 p1Var3 = (p3.p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    long jA = tn.k.a(d92.b.f58623a, mVar3);
                    o4.m1.a aVar7 = o4.m1.f128891a;
                    h4.r rVarE2 = u1.n.e(aVar6, jA, aVar7);
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97923h;
                    float f15 = eVar3.f97922g;
                    float f16 = eVar3.f97920e;
                    h4.r rVarD = x2.d(c2.l.A(c2.l.C(rVarE2, 0.0f, f14, 0.0f, 0.0f, 13), f16, 0.0f, 2), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar8 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar8, mVar3, 48);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    String strQ2 = gl1.y.Q(mVar3, R.string.set_calories_goal);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                    x5.l0 l0Var = (x5.l0) p1Var3.getF182175a();
                    h4.r rVarW = x2.w(x2.x(c2.l.z(aVar6, f15, f16), null, 3), f15, 0.0f, 2);
                    x5.v.f188954b.getClass();
                    p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, x5.v.f188957e, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
                    s5.x0 x0Var = j92.f.f97929f;
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarA = s5.x0.a(x0Var, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
                    ba baVar = ba.f87580a;
                    long jA2 = d92.b.a(mVar3).j().a();
                    long jB = sn.a.b(mVar3);
                    long jE = d92.b.a(mVar3).e().e();
                    t2 t2Var = new t2(d92.b.a(mVar3).j().a(), d92.b.a(mVar3).j().a(), null);
                    baVar.getClass();
                    sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jE, t2Var, jA2, jB, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mVar3, 2147476223);
                    boolean zB2 = mVar3.B(lVar2);
                    Object objQ3 = mVar3.q();
                    if (zB2) {
                        objQ3 = new oy0.c(lVar2, p1Var3, 3);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new oy0.c(lVar2, p1Var3, 3);
                            mVar3.K(objQ3);
                        }
                    }
                    na.b(l0Var, (e23.l) objQ3, rVarW, false, x0VarA, null, null, null, false, null, a2Var, null, true, 0, 0, aVar7, sgVarC, mVar3, 0, 12779520, 48, 1933272);
                    if (((x5.l0) p1Var3.getF182175a()).f188878a.f157138b.length() == 0) {
                        mVar3.C(-951726036);
                        mVar3.f();
                        strH = eVar2.l(R.string.invalid_range_input_error_message);
                    } else {
                        if (e0Var.f167940c) {
                            strH = sn.a.h(mVar3, -951721867, R.string.msg_set_calories_goal_warning, mVar3);
                        } else {
                            mVar3.C(561470014);
                            mVar3.f();
                            str = null;
                        }
                        if (str != null) {
                            mVar3.C(561528388);
                            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, mVar3), mVar3, 0, 0, 131070);
                            mVar3.f();
                        } else {
                            mVar3.C(561619683);
                            mVar3.f();
                        }
                        mVar3.y();
                    }
                    str = strH;
                    if (str != null) {
                        mVar3.C(561528388);
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, mVar3), mVar3, 0, 0, 131070);
                        mVar3.f();
                    } else {
                        mVar3.C(561619683);
                        mVar3.f();
                    }
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                Integer num = null;
                u21.o oVar = (u21.o) obj5;
                e23.a aVar10 = (e23.a) obj6;
                v21.e eVar4 = (v21.e) obj3;
                Object obj7 = (e23.p) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarE3 = u1.n.e(x2.c(c2.l.p(aVar11), 1.0f), tn.k.a(d92.b.f58623a, mVar4), o4.m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar12 = h4.d.a.f81536n;
                    c2.z zVarA3 = c2.y.a(kVar2, aVar12, mVar4, 0);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    h4.r rVarC3 = h4.k.c(rVarE3, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar5 = h5.g.a.f81810g;
                    b4.c(eVar5, zVarA3, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar3);
                    }
                    h5.g.a.f fVar3 = h5.g.a.f81807d;
                    b4.c(fVar3, rVarC3, mVar4);
                    h4.r rVarB2 = a2.b(c2.b0.f22601a.a(aVar11, 1.0f, true), a2.a(mVar4), true);
                    c2.z zVarA4 = c2.y.a(kVar2, aVar12, mVar4, 0);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    h4.r rVarC4 = h4.k.c(rVarB2, mVar4);
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar5, zVarA4, mVar4);
                    b4.c(c1623g, i2VarX4, mVar4);
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar3);
                    }
                    b4.c(fVar3, rVarC4, mVar4);
                    p2 p2Var = p2.f111205a;
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar11, 0.0f, eVar6.f97920e, 1);
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_daily_calories_goal);
                    Integer num2 = oVar.f168047a;
                    p2Var.h(strQ3, eVar4.p(num2 != null ? Double.valueOf(num2.intValue()) : null, Integer.valueOf(oVar.f168054h), gl1.y.Q(mVar4, R.string.lbl_calories)), null, rVarA, null, false, false, null, z3.f.c(-1712861177, new s5.a(oVar, 20), mVar4), null, null, mVar4, 100663296, 0, 1780);
                    if (oVar.f168055i) {
                        mVar4.C(733904494);
                        mVar4.f();
                    } else {
                        mVar4.C(733527224);
                        h4.r rVarC5 = c2.l.C(c2.l.A(aVar11, eVar6.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar6.f97920e, 7);
                        String strQ4 = gl1.y.Q(mVar4, R.string.msg_calories_percentage_error);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar4), mVar4, 0, 0, 131068);
                        mVar4.f();
                    }
                    mVar4.C(1686245085);
                    for (s21.j jVar : oVar.f168048b) {
                        h4.r.a aVar14 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC6 = c2.l.C(aVar14, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                        l22.a aVarS = w2.a0.s(mVar4);
                        jVar.getClass();
                        b11.c.a aVar15 = b11.c.f14245d;
                        String str2 = jVar.f156130b;
                        boolean z14 = jVar.f156131c;
                        aVar15.getClass();
                        String strB = b11.c.a.b(str2, aVarS, z14);
                        String strY = v21.e.y(eVar4, jVar.f156133e, jVar.f156134f, jVar.f156135g, jVar.f156136h, 32);
                        String strA = eVar4.f175325b.a(R.string.string_space_bullet_string_pattern, v21.e.k(eVar4, jVar.f156133e, num, true, 2), eVar4.x(jVar.f156134f, jVar.f156135g, jVar.f156136h, true));
                        float f17 = jVar.f156132d;
                        boolean zB3 = mVar4.B(obj7) | mVar4.B(jVar);
                        Object objQ4 = mVar4.q();
                        if (zB3) {
                            objQ4 = new sy.i(2, obj7, jVar);
                            mVar4.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new sy.i(2, obj7, jVar);
                                mVar4.K(objQ4);
                            }
                        }
                        p3.m mVar5 = mVar4;
                        t21.j0.b(rVarC6, strB, strY, f17, (e23.l) objQ4, strA, mVar5, 0);
                        mVar4 = mVar5;
                        num = null;
                    }
                    mVar4.f();
                    mVar4.y();
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ5 = gl1.y.Q(mVar4, R.string.lbl_reset);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                    boolean z15 = oVar.f168052f;
                    boolean zB4 = mVar4.B(aVar10);
                    Object objQ5 = mVar4.q();
                    if (zB4) {
                        objQ5 = new t21.a(aVar10, 10);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new t21.a(aVar10, 10);
                            mVar4.K(objQ5);
                        }
                    }
                    f0Var.i(strQ5, rVarY, z15, (e23.a) objQ5, mVar4, 0, 0);
                    mVar4.y();
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ta0.m.b((l90.b) obj3, (e23.l) obj5, (e23.a) obj6, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ca0.o1 o1Var = (ca0.o1) obj3;
                e23.a aVar16 = (e23.a) obj6;
                e23.a aVar17 = (e23.a) obj4;
                e23.l lVar3 = (e23.l) obj5;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar18, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    h4.r rVarY2 = c2.l.y(rVarD2, eVar7.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar19 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    c2.z zVarA5 = c2.y.a(kVar3, aVar19, mVar6, 48);
                    int iHashCode5 = Long.hashCode(mVar6.getU());
                    i2 i2VarX5 = mVar6.x();
                    h4.r rVarC7 = h4.k.c(rVarY2, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar20);
                    } else {
                        mVar6.c();
                    }
                    h5.g.a.e eVar8 = h5.g.a.f81810g;
                    b4.c(eVar8, zVarA5, mVar6);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX5, mVar6);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar6, iHashCode5, bVar4);
                    }
                    h5.g.a.f fVar4 = h5.g.a.f81807d;
                    b4.c(fVar4, rVarC7, mVar6);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    h4.r rVarC8 = x2.c(x2.f(aVar18, 1.0f), 0.5f);
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode6 = Long.hashCode(mVar6.getU());
                    i2 i2VarX6 = mVar6.x();
                    h4.r rVarC9 = h4.k.c(rVarC8, mVar6);
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar20);
                    } else {
                        mVar6.c();
                    }
                    b4.c(eVar8, z0VarD, mVar6);
                    b4.c(c1623g2, i2VarX6, mVar6);
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar6, iHashCode6, bVar4);
                    }
                    b4.c(fVar4, rVarC9, mVar6);
                    c2.u uVar = c2.u.f22885a;
                    boolean zB5 = mVar6.B(lVar3);
                    Object objQ6 = mVar6.q();
                    if (zB5) {
                        i14 = 2;
                        objQ6 = new ta0.j(lVar3, 2);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            i14 = 2;
                            objQ6 = new ta0.j(lVar3, 2);
                            mVar6.K(objQ6);
                        } else {
                            i14 = 2;
                        }
                    }
                    g02.s0.b(x80.c.a(aVar18, (e23.l) objQ6), 0.0f, mVar6, 0, i14);
                    mVar6.y();
                    h4.r rVarB3 = a2.b(b0Var3.a(x2.f(aVar18, 1.0f), 1.0f, true), a2.a(mVar6), true);
                    c2.z zVarA6 = c2.y.a(kVar3, aVar19, mVar6, 48);
                    int iHashCode7 = Long.hashCode(mVar6.getU());
                    i2 i2VarX7 = mVar6.x();
                    h4.r rVarC10 = h4.k.c(rVarB3, mVar6);
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar20);
                    } else {
                        mVar6.c();
                    }
                    b4.c(eVar8, zVarA6, mVar6);
                    b4.c(c1623g2, i2VarX7, mVar6);
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar6, iHashCode7, bVar4);
                    }
                    b4.c(fVar4, rVarC10, mVar6);
                    String strG = g22.n.g(gl1.y.Q(mVar6, R.string.lbl_looking_for_device));
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97927d, mVar6);
                    d6.h.f57752b.getClass();
                    int i24 = d6.h.f57755e;
                    l2.a aVar21 = l2.f108642a;
                    k92.a.f103644a.getClass();
                    mh.c(strG, null, 0L, l2.a.a(aVar21, k92.a.f103650g, k92.a.f103647d), 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 1, 0, null, x0VarB, mVar6, 0, 24576, 113654);
                    mh.c(gl1.y.Q(mVar6, R.string.startup_tutorial_device_on_and_in_pairing), c2.l.C(aVar18, 0.0f, eVar7.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 130044);
                    mVar6.y();
                    String strQ6 = gl1.y.Q(mVar6, R.string.lbl_cancel);
                    int i25 = ta0.w.a.f163451a[o1Var.ordinal()];
                    if (i25 != 1) {
                        if (i25 == 2) {
                            i15 = -1787072560;
                            i16 = R.string.lbl_skip_button;
                        } else {
                            if (i25 != 3) {
                                throw n23.j.m(mVar6, -1787077486);
                            }
                            mVar6.C(435410677);
                            mVar6.f();
                            strH2 = null;
                        }
                        da0.b.a(null, strH2, aVar16, false, strQ6, aVar17, false, null, null, false, mVar6, 0, 969);
                        mVar6.y();
                    } else {
                        i15 = -1787075310;
                        i16 = R.string.startup_no_device;
                    }
                    strH2 = sn.a.h(mVar6, i15, i16, mVar6);
                    da0.b.a(null, strH2, aVar16, false, strQ6, aVar17, false, null, null, false, mVar6, 0, 969);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ta0.g1.c((ta0.x) obj5, (l90.b) obj3, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                tg1.e.c((sg1.c) obj6, (e23.l) obj5, (e23.l) obj3, (o53.b0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                tg1.s.a((sg1.b) obj5, (pg1.a) obj3, (p004k6.u) obj4, (e23.a) obj6, (p3.m) obj, p3.p0.t(3457));
                return Unit.INSTANCE;
            case 12:
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj6;
                String str3 = (String) obj5;
                com.garmin.android.apps.connectmobile.activities.health.presentation.c cVar = (com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj4;
                p3.p1 p1Var4 = (p3.p1) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i26 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    sn.h hVar = (sn.h) r0Var.f105810a;
                    if (!((Boolean) p1Var4.getF182175a()).booleanValue() || hVar == null) {
                        mVar7.C(460678382);
                        mVar7.f();
                    } else {
                        mVar7.C(460232478);
                        boolean zR2 = mVar7.r(cVar) | mVar7.r(hVar);
                        Object objQ7 = mVar7.q();
                        if (zR2) {
                            objQ7 = new sg0.j(cVar, 23, hVar, p1Var4);
                            mVar7.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new sg0.j(cVar, 23, hVar, p1Var4);
                                mVar7.K(objQ7);
                            }
                        }
                        e23.a aVar22 = (e23.a) objQ7;
                        Object objQ8 = mVar7.q();
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new tn.h(p1Var4, objArr == true ? 1 : 0);
                            mVar7.K(objQ8);
                        }
                        dh.b.c(str3, null, aVar22, (e23.a) objQ8, mVar7, 3072);
                        mVar7.f();
                    }
                    tn.l.b((sn.h) r0Var.f105810a, cVar.f29047b, new sy.i(14, r0Var, cVar), mVar7, sn.h.f160385q);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 13:
                return a(obj, obj2);
            case 14:
                ((Integer) obj2).getClass();
                tz1.g.c((Float) obj6, (oz1.u) obj5, (oz1.s) obj3, (List) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                return b(obj, obj2);
            case 16:
                ((Integer) obj2).getClass();
                u82.e.c((v82.a) obj6, (h4.r) obj5, (d2) obj3, (z3.e) obj4, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                u91.l.a((aa1.g) obj5, (e23.a) obj6, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ub1.f.b((String) obj6, (String) obj5, (b92.a) obj3, (e23.p) obj4, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ux.c.a((List) obj6, (DateTime) obj3, (DateTime) obj4, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                return c(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                v30.d.a((x30.b) obj6, (x30.a) obj3, (x30.c) obj4, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                return d(obj, obj2);
            case 23:
                ((Integer) obj2).getClass();
                vc1.i.a((tc1.a) obj6, (Double) obj5, (LocalDate) obj3, (sc1.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                vd0.c1.c((u4.d) obj5, (String) obj3, (e23.a) obj6, (h4.r) obj4, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 25:
                return e(obj, obj2);
            case 26:
                return f(obj, obj2);
            case 27:
                return g(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                e23.a aVar23 = (e23.a) obj6;
                x11.b bVar5 = (x11.b) obj5;
                e23.a aVar24 = (e23.a) obj4;
                p3.p1 p1Var5 = (p3.p1) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    boolean zB6 = mVar8.B(aVar23);
                    Object objQ9 = mVar8.q();
                    if (zB6) {
                        objQ9 = new ux1.g(aVar23, 26);
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ux1.g(aVar23, 26);
                            mVar8.K(objQ9);
                        }
                    }
                    e23.a aVar25 = (e23.a) objQ9;
                    boolean z16 = bVar5.f188387g;
                    boolean z17 = bVar5.f188388h;
                    if (z16 && ((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar8.C(882105906);
                        String strQ7 = gl1.y.Q(mVar8, R.string.flashlight_title);
                        s62.a aVar26 = s62.a.f157643a;
                        if (z17) {
                            aVar26.getClass();
                            dVarA = v7.a(t62.b.f162798a);
                        } else {
                            aVar26.getClass();
                            dVarA = v62.v0.a(t62.b.f162798a);
                        }
                        u4.d dVar2 = dVarA;
                        if (z17) {
                            i17 = 882499017;
                            i18 = R.string.camera_flash_on;
                        } else {
                            i17 = 882613128;
                            i18 = R.string.camera_flash_off;
                        }
                        cVarB = i53.a.a(new i3("FLASH", strQ7, false, dVar2, sn.a.h(mVar8, i17, i18, mVar8), 4, (p005kotlin.jvm.internal.j) null));
                        mVar8.f();
                    } else {
                        mVar8.C(882794044);
                        mVar8.f();
                        cVarB = j53.l.b();
                    }
                    i53.c cVar2 = cVarB;
                    boolean zB7 = mVar8.B(aVar24);
                    Object objQ10 = mVar8.q();
                    if (zB7) {
                        objQ10 = new rx1.m(aVar24, 17);
                        mVar8.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new rx1.m(aVar24, 17);
                            mVar8.K(objQ10);
                        }
                    }
                    z02.f.d(null, null, null, aVar25, cVar2, null, (e23.l) objQ10, mVar8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 87);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k1(ca0.o1 o1Var, e23.a aVar, e23.a aVar2, e23.l lVar) {
        this.f159711a = 8;
        this.f159714d = o1Var;
        this.f159713c = aVar;
        this.f159715e = aVar2;
        this.f159712b = lVar;
    }

    public /* synthetic */ k1(e23.l lVar, v21.e eVar, u21.e0 e0Var, p3.p1 p1Var) {
        this.f159711a = 5;
        this.f159712b = lVar;
        this.f159713c = eVar;
        this.f159715e = e0Var;
        this.f159714d = p1Var;
    }

    public /* synthetic */ k1(Object obj, e23.l lVar, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f159711a = i15;
        this.f159714d = obj;
        this.f159712b = lVar;
        this.f159713c = aVar;
        this.f159715e = hVar;
    }

    public /* synthetic */ k1(Object obj, Object obj2, e23.a aVar, Object obj3, int i14, int i15) {
        this.f159711a = i15;
        this.f159712b = obj;
        this.f159714d = obj2;
        this.f159713c = aVar;
        this.f159715e = obj3;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, e23.l lVar, int i14, int i15) {
        this.f159711a = i15;
        this.f159713c = obj;
        this.f159714d = obj2;
        this.f159715e = obj3;
        this.f159712b = lVar;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f159711a = i14;
        this.f159713c = obj;
        this.f159712b = obj2;
        this.f159714d = obj3;
        this.f159715e = obj4;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f159711a = i15;
        this.f159713c = obj;
        this.f159712b = obj2;
        this.f159714d = obj3;
        this.f159715e = obj4;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, p3.p1 p1Var, int i14) {
        this.f159711a = i14;
        this.f159713c = obj;
        this.f159712b = obj2;
        this.f159715e = obj3;
        this.f159714d = p1Var;
    }

    public /* synthetic */ k1(k30.k kVar, i53.c cVar, e23.l lVar, p3.p1 p1Var) {
        this.f159711a = 22;
        this.f159713c = kVar;
        this.f159715e = cVar;
        this.f159712b = lVar;
        this.f159714d = p1Var;
    }

    public /* synthetic */ k1(p3.l1 l1Var, p3.p1 p1Var, p3.p1 p1Var2, p3.n1 n1Var) {
        this.f159711a = 15;
        this.f159713c = l1Var;
        this.f159714d = p1Var;
        this.f159715e = p1Var2;
        this.f159712b = n1Var;
    }

    public /* synthetic */ k1(p3.p1 p1Var, Object obj, Object obj2, Object obj3, int i14) {
        this.f159711a = i14;
        this.f159714d = p1Var;
        this.f159713c = obj;
        this.f159712b = obj2;
        this.f159715e = obj3;
    }

    public /* synthetic */ k1(sg1.b bVar, pg1.a aVar, p004k6.u uVar, e23.a aVar2, int i14) {
        this.f159711a = 11;
        this.f159712b = bVar;
        this.f159714d = aVar;
        this.f159715e = uVar;
        this.f159713c = aVar2;
    }

    public /* synthetic */ k1(u21.o oVar, e23.a aVar, v21.e eVar, e23.p pVar) {
        this.f159711a = 6;
        this.f159712b = oVar;
        this.f159713c = aVar;
        this.f159714d = eVar;
        this.f159715e = pVar;
    }
}
