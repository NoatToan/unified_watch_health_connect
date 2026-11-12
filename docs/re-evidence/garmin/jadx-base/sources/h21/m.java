package h21;

import android.content.Context;
import b5.s0;
import b82.g1;
import b82.k1;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import ew1.v1;
import f5.z0;
import i3.e5;
import i3.h7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ky0.d2;
import ky0.v0;
import l72.n2;
import l72.p2;
import l72.x0;
import lc.u0;
import o4.m1;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p006l2.r1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.e0;
import u1.a2;
import ug2.q0;
import v62.l9;
import vd0.b1;
import vd0.g2;
import wd2.z1;
import zo1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f81095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f81098e;

    public /* synthetic */ m(e23.a aVar, boolean z14, e23.a aVar2, p1 p1Var) {
        this.f81094a = 8;
        this.f81097d = aVar;
        this.f81095b = z14;
        this.f81098e = aVar2;
        this.f81096c = p1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        String str = (String) this.f81096c;
        String str2 = (String) this.f81097d;
        Integer num = (Integer) this.f81098e;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        p2 p2Var = p2.f111205a;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (this.f81095b) {
            i14 = -347765576;
            i15 = R.string.lbl_connected;
        } else {
            i14 = -347764165;
            i15 = R.string.lbl_disconnected;
        }
        p2Var.h(str3, sn.a.h(mVar, i14, i15, mVar), null, null, null, false, false, z3.f.c(-2080347132, new fv1.b(str2, 28), mVar), z3.f.c(66219333, new fx0.f(num, 1), mVar), null, null, mVar, 113246208, 0, 1660);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        String upperCase;
        vw1.e eVar = (vw1.e) this.f81096c;
        String str = (String) this.f81097d;
        com.garmin.android.apps.connectmobile.training.itp.a aVar = (com.garmin.android.apps.connectmobile.training.itp.a) this.f81098e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            m52.k kVar = eVar.f180590z;
            u4.d dVar = kVar.f116772h;
            m52.k.f116753m.getClass();
            long jA = m52.k.a.a(kVar, mVar);
            String str2 = eVar.f180579m;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = eVar.f180581o;
            String str4 = str3 != null ? str3 : "";
            String str5 = eVar.f180582p;
            if (eVar.f180577k) {
                mVar.C(187769375);
                upperCase = gl1.y.Q(mVar, R.string.missed_workout).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                mVar.f();
            } else {
                mVar.C(1525899977);
                mVar.f();
                upperCase = null;
            }
            boolean zR = mVar.r(eVar) | mVar.r(aVar);
            boolean z14 = this.f81095b;
            boolean zH = zR | mVar.h(z14);
            Object objQ = mVar.q();
            if (zH) {
                objQ = new c.e(eVar, aVar, z14, 8);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c.e(eVar, aVar, z14, 8);
                    mVar.K(objQ);
                }
            }
            hw1.i.b(rVarF, new hw1.f(dVar, jA, str2, str4, null, str, str5, null, upperCase, (e23.a) objQ, SyslogConstants.LOG_LOCAL2, null), mVar, 6, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        mm1.a aVar = (mm1.a) this.f81096c;
        b10.d dVar = (b10.d) this.f81097d;
        l22.a aVar2 = dVar.f14215a;
        b10.b bVar = (b10.b) this.f81098e;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Integer averageSleepSeconds = aVar.getAverageSleepSeconds();
            x0 x0Var = x0.f111346a;
            String strD = dVar.d(averageSleepSeconds);
            String string = aVar2.getString(R.string.lbl_avg_sleep_duration);
            b92.a aVarB = rn1.c.b(bVar.c(averageSleepSeconds));
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            int i16 = x0.f111348c;
            int i17 = i14 | (i16 << 24);
            x0Var.a(i17, 60, aVarB, t2Var, null, null, strD, string, null, null, mVar);
            if (this.f81095b) {
                mVar.C(-374132525);
                Integer averageSleepNeed = aVar.getAverageSleepNeed();
                int iIntValue2 = (averageSleepNeed != null ? averageSleepNeed.intValue() : 0) * 60;
                x0Var.a(i17, 60, rn1.c.b(bVar.d(Integer.valueOf(iIntValue2))), t2Var, null, null, dVar.d(Integer.valueOf(iIntValue2)), aVar2.getString(R.string.lbl_avg_sleep_need), null, null, mVar);
                mVar.f();
            } else {
                mVar.C(-373667153);
                x0Var.h(t2Var, mVar, i14 | (i16 << 3));
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        char c14;
        String strG;
        mm1.e eVar = (mm1.e) this.f81096c;
        b10.d dVar = (b10.d) this.f81097d;
        b10.b bVar = (b10.b) this.f81098e;
        l22.a aVar = bVar.f14208b;
        b10.d dVar2 = bVar.f14209c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Integer averageSleepSeconds = eVar.getAverageSleepSeconds();
            x0 x0Var = x0.f111346a;
            String strD = dVar.d(averageSleepSeconds);
            l22.a aVar2 = dVar.f14215a;
            String string = aVar2.getString(R.string.lbl_avg_weekly_sleep_duration);
            u00.a aVar3 = bVar.f14210d;
            String string2 = dVar2.f14215a.getString(R.string.lbl_sleep_duration);
            if (averageSleepSeconds == null || averageSleepSeconds.intValue() <= 0) {
                c14 = 24327;
                strG = e5.g(bVar.i(string2), StringUtils.SPACE, aVar.getString(R.string.txt_empty_page_no_data));
            } else {
                strG = e5.g(aVar3.e(averageSleepSeconds.intValue()), StringUtils.SPACE, bVar.i(string2));
                c14 = 24327;
            }
            b92.a aVarB = rn1.c.b(strG);
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            int i16 = x0.f111348c;
            int i17 = i14 | (i16 << 24);
            x0Var.a(i17, 60, aVarB, t2Var, null, null, strD, string, null, null, mVar);
            if (this.f81095b) {
                mVar.C(-1305563349);
                Integer averageSleepNeed = eVar.getAverageSleepNeed();
                int iIntValue2 = (averageSleepNeed != null ? averageSleepNeed.intValue() : 0) * 60;
                String strD2 = dVar.d(Integer.valueOf(iIntValue2));
                String string3 = aVar2.getString(R.string.lbl_avg_weekly_sleep_need);
                String string4 = dVar2.f14215a.getString(R.string.lbl_sleep_need);
                x0Var.a(i17, 60, rn1.c.b(iIntValue2 > 0 ? e5.g(aVar3.e(iIntValue2), StringUtils.SPACE, bVar.i(string4)) : e5.g(bVar.i(string4), StringUtils.SPACE, aVar.getString(R.string.txt_empty_page_no_data))), t2Var, null, null, strD2, string3, null, null, mVar);
                mVar.f();
            } else {
                mVar.C(-1304987462);
                x0Var.h(t2Var, mVar, i14 | (i16 << 3));
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f81096c;
        e23.a aVar = (e23.a) this.f81097d;
        p1 p1Var = (p1) this.f81098e;
        c2.a0 a0Var = (c2.a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar2, j92.b.f97899b.f97920e), mVar);
            h4.r rVarA = a0Var.a(x2.f(aVar2, 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            boolean zR = mVar.r(list);
            boolean z14 = this.f81095b;
            boolean zH = zR | mVar.h(z14) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zH) {
                dt1.d dVar = new dt1.d(list, z14, p1Var, aVar, 5);
                mVar.K(dVar);
                objQ = dVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    dt1.d dVar2 = new dt1.d(list, z14, p1Var, aVar, 5);
                    mVar.K(dVar2);
                    objQ = dVar2;
                }
            }
            e2.c.b(rVarA, null, null, kVar, aVar3, null, false, null, (e23.l) objQ, mVar, 221184, 462);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3) {
        x3 x3Var = (x3) this.f81096c;
        x3 x3Var2 = (x3) this.f81097d;
        p1 p1Var = (p1) this.f81098e;
        ag2.e eVar = (ag2.e) obj;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        eVar.getClass();
        mVar.C(1539126965);
        x1 x1Var = p3.n.f135158a;
        String strQ = gl1.y.Q(mVar, (!((Boolean) x3Var.getF182175a()).booleanValue() || q0.d(x3Var2) || (((Boolean) p1Var.getF182175a()).booleanValue() && !this.f81095b)) ? eVar.f3242b : ag2.e.REST.f3242b);
        mVar.f();
        return strQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3) {
        pe0.i iVar;
        pe0.f fVar = (pe0.f) this.f81096c;
        l22.a aVar = (l22.a) this.f81097d;
        p1 p1Var = (p1) this.f81098e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
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
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(aVar2, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            c22.x0.f23314a.getClass();
            String strV = gl1.d.V(c22.x0.A8, new Object[]{fVar.f137421b});
            d92.b.f58624b.getClass();
            mh.c(strV, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), mVar, 0, 0, 131070);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                w13.c cVar = g2.f177273e;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                Iterator<T> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new g1(((g2) it.next()).f177274a, null, null, null, 14, null));
                }
                objQ = i53.a.j(arrayList);
                mVar.K(objQ);
            }
            i53.f fVar3 = (i53.f) objQ;
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j2 = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA2 = q2.a(c0343j2, h4.d.a.f81533k, mVar, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(aVar4, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA2, mVar);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarX3, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
            }
            h5.g.a.f fVar4 = h5.g.a.f81807d;
            b4.c(fVar4, rVarC3, mVar);
            u2 u2Var2 = u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            h4.r rVarF2 = x2.f(c2.l.B(aVar4, f14, eVar3.f97921f, f14, f14), 1.0f);
            c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81537o, mVar, 48);
            int iHashCode4 = Long.hashCode(mVar.getU());
            i2 i2VarX4 = mVar.x();
            h4.r rVarC4 = h4.k.c(rVarF2, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar2, zVarA2, mVar);
            b4.c(c1623g2, i2VarX4, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                v.h.z(iHashCode4, mVar, iHashCode4, bVar2);
            }
            b4.c(fVar4, rVarC4, mVar);
            b0 b0Var2 = b0.f22601a;
            h4.r rVarF3 = x2.f(aVar4, 0.6f);
            int iOrdinal = ((g2) p1Var.getF182175a()).ordinal();
            Object objQ2 = mVar.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            int i14 = 2;
            if (objQ2 == c2565a) {
                objQ2 = new vd0.d(p1Var, i14);
                mVar.K(objQ2);
            }
            k1.a(fVar3, iOrdinal, rVarF3, null, 0.0f, (e23.l) objQ2, mVar, 196992, 24);
            mVar.y();
            mVar.y();
            boolean zK = mVar.k(((g2) p1Var.getF182175a()).ordinal());
            Object objQ3 = mVar.q();
            if (zK || objQ3 == c2565a) {
                int i15 = b1.a.f177175b[((g2) p1Var.getF182175a()).ordinal()];
                if (i15 == 1) {
                    iVar = fVar.f137428i;
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return null;
                    }
                    iVar = fVar.f137429j;
                }
                objQ3 = iVar;
                mVar.K(objQ3);
            }
            b1.b((pe0.i) objQ3, aVar, this.f81095b, mVar, 448);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        final w02.r rVar = (w02.r) this.f81096c;
        w02.a aVar = (w02.a) this.f81098e;
        h4.r rVar2 = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(1476443578, rVar2, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = p0.n(Boolean.FALSE);
            mVar.K(objQ);
        }
        final p1 p1Var = (p1) objQ;
        final int i14 = 1;
        boolean z14 = this.f81095b;
        Object obj4 = this.f81097d;
        final int i15 = 0;
        boolean z15 = z14 && (((Boolean) p0.f(new vv0.n(8, obj4, rVar)).getF182175a()).booleanValue() || !((Boolean) rVar.f181128g.getF182175a()).booleanValue());
        boolean zB = mVar.B(rVar);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == c2565a) {
            objQ2 = new w02.b(i15, rVar, p1Var);
            mVar.K(objQ2);
        }
        l0.a(rVar, (e23.l) objQ2, mVar);
        Object objQ3 = mVar.q();
        if (objQ3 == c2565a) {
            objQ3 = l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ3);
        }
        o53.b0 b0Var = (o53.b0) objQ3;
        boolean zR = mVar.r(b0Var) | mVar.B(rVar) | mVar.r(obj4);
        Object objQ4 = mVar.q();
        if (zR || objQ4 == c2565a) {
            t42.l lVar = new t42.l(b0Var, p1Var, rVar, obj4, 20);
            mVar.K(lVar);
            objQ4 = lVar;
        }
        e23.l lVar2 = (e23.l) objQ4;
        boolean zB2 = mVar.B(rVar);
        Object objQ5 = mVar.q();
        if (zB2 || objQ5 == c2565a) {
            objQ5 = new e23.a() { // from class: w02.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                rVar.i();
                            }
                            p1Var2.setValue(Boolean.FALSE);
                            break;
                        default:
                            p1 p1Var3 = p1Var;
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                rVar.i();
                            }
                            p1Var3.setValue(Boolean.FALSE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ5);
        }
        e23.a aVar2 = (e23.a) objQ5;
        boolean zB3 = mVar.B(rVar);
        Object objQ6 = mVar.q();
        if (zB3 || objQ6 == c2565a) {
            objQ6 = new e23.a() { // from class: w02.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                rVar.i();
                            }
                            p1Var2.setValue(Boolean.FALSE);
                            break;
                        default:
                            p1 p1Var3 = p1Var;
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                rVar.i();
                            }
                            p1Var3.setValue(Boolean.FALSE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ6);
        }
        e23.a aVar3 = (e23.a) objQ6;
        boolean zB4 = mVar.B(rVar);
        Object objQ7 = mVar.q();
        if (zB4 || objQ7 == c2565a) {
            objQ7 = new vy0.e(rVar, 2);
            mVar.K(objQ7);
        }
        Object objB = z15 ? s0.b(rVar2, Unit.INSTANCE, new w02.d(aVar, lVar2, aVar2, aVar3, (e23.p) objQ7)) : h4.r.S;
        mVar.f();
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) this.f81096c;
        e23.l lVar = (e23.l) this.f81097d;
        z1 z1Var = (z1) this.f81098e;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(rVar, h4.d.a.f81529g);
            boolean zB = mVar.B(lVar) | mVar.r(z1Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new xr.a(3, lVar, z1Var);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xr.a(3, lVar, z1Var);
                    mVar.K(objQ);
                }
            }
            xu0.a.f192228a.getClass();
            h7.a((e23.a) objQ, rVarC, this.f81095b, null, null, xu0.a.f192229b, mVar, 1572864, 56);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0324  */
    /* JADX WARN: Code duplicated, block: B:136:0x0388  */
    /* JADX WARN: Code duplicated, block: B:154:0x0423  */
    /* JADX WARN: Code duplicated, block: B:161:0x0463  */
    /* JADX WARN: Code duplicated, block: B:266:0x075c  */
    /* JADX WARN: Code duplicated, block: B:280:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:349:0x0984  */
    /* JADX WARN: Code duplicated, block: B:356:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:410:0x0c73  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objC;
        Object objC2;
        int i14;
        int i15;
        float f14;
        p3.m mVar;
        s5.x0 x0VarF;
        s5.x0 x0VarF2;
        boolean z14;
        int i16 = this.f81094a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f81098e;
        int i17 = 6;
        Object obj5 = this.f81096c;
        Object obj6 = this.f81097d;
        boolean z15 = this.f81095b;
        switch (i16) {
            case 0:
                i53.c<i21.w> cVar = (i53.c) obj5;
                e23.a aVar2 = (e23.a) obj6;
                e23.a aVar3 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.whats_new_in_nutrition);
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23330af);
                    mVar2.C(-755742590);
                    ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                    for (i21.w wVar : cVar) {
                        arrayList.add(new b82.s.b(gl1.d.T(wVar.f87371a, mVar2, 0), gl1.d.T(wVar.f87372b, mVar2, 0), wVar.f87373c, null, null, 24, null));
                    }
                    mVar2.f();
                    i53.f fVarJ = i53.a.j(arrayList);
                    z3.e eVarC = z3.f.c(-1248662173, new a51.a(aVar2, aVar3, z15), mVar2);
                    z3.e eVarC2 = z3.f.c(428361154, new a42.e(z15, aVar3, i17), mVar2);
                    int i18 = b82.s.b.f16761e;
                    f21.o.b(strQ, strW, fVarJ, eVarC, eVarC2, mVar2, 27648);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                zc.d dVar = (zc.d) obj5;
                p1 p1Var = (p1) obj6;
                mi0.a aVar4 = (mi0.a) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if ((((Boolean) p1Var.getF182175a()).booleanValue() || dVar.b() != 0) && z15) {
                        mVar3.C(-835968978);
                        h4.r.a aVar5 = h4.r.S;
                        h4.r rVarF = x2.f(aVar5, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarF, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar6);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        b0 b0Var = b0.f22601a;
                        h4.r rVarD = x2.d(aVar5, 1.0f);
                        boolean zR = mVar3.r(dVar) | mVar3.r(aVar4);
                        Object objQ = mVar3.q();
                        if (zR) {
                            objQ = new hy.h(15, dVar, aVar4);
                            mVar3.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new hy.h(15, dVar, aVar4);
                                mVar3.K(objQ);
                            }
                        }
                        e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ, mVar3, 6, 510);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(-836319185);
                        s62.a.f157643a.getClass();
                        b82.n.c(l9.a(t62.b.f162798a), gl1.y.Q(mVar3, R.string.msg_no_follower_requests_title), gl1.y.Q(mVar3, R.string.msg_no_follower_requests_description), null, null, mVar3, 0, 24);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                b10.c cVar2 = (b10.c) obj5;
                u00.a aVar7 = cVar2.f14213c;
                l22.b bVar2 = cVar2.f14211a;
                Context context = (Context) obj6;
                rl1.h hVar = (rl1.h) obj4;
                int i19 = hVar.f153417c;
                int i24 = hVar.f153418d;
                t2 t2Var = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (z15) {
                        mVar4.C(429576602);
                        x0 x0Var = x0.f111346a;
                        String strC = cVar2.c(i19, context);
                        String strQ2 = gl1.y.Q(mVar4, R.string.sleep_lbl_rem);
                        gl.c.f77766a.getClass();
                        x0.a aVar8 = new x0.a(gl.c.a(mVar4).p(), null);
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put("merge", bVar2.a(R.string.string_space_string_pattern, bVar2.getString(R.string.sleep_lbl_rem), aVar7.d(i19 * 60)));
                        b92.a aVarB = c0235a.b();
                        int i25 = iIntValue3 & 14;
                        int i26 = b92.a.f16960b;
                        int i27 = i25 | (x0.f111348c << 24);
                        x0Var.a(i27, 56, aVarB, t2Var, null, null, strC, strQ2, null, aVar8, mVar4);
                        String strC2 = cVar2.c(i24, context);
                        String strQ3 = gl1.y.Q(mVar4, R.string.sleep_lbl_awake);
                        x0.a aVar9 = new x0.a(gl.c.a(mVar4).q(), null);
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                        c0235a2.f16962a.put("merge", bVar2.a(R.string.string_space_string_pattern, bVar2.getString(R.string.sleep_lbl_awake), aVar7.d(i24 * 60)));
                        x0Var.a(i27, 56, c0235a2.b(), t2Var, null, null, strC2, strQ3, null, aVar9, mVar4);
                        mVar4.f();
                    } else {
                        mVar4.C(430658905);
                        x0 x0Var2 = x0.f111346a;
                        String strC3 = cVar2.c(i24, context);
                        String strQ4 = gl1.y.Q(mVar4, R.string.sleep_lbl_awake);
                        gl.c.f77766a.getClass();
                        x0.a aVar10 = new x0.a(gl.c.a(mVar4).q(), null);
                        b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                        c0235a3.f16962a.put("merge", bVar2.a(R.string.string_space_string_pattern, bVar2.getString(R.string.sleep_lbl_awake), aVar7.d(i24 * 60)));
                        b92.a aVarB2 = c0235a3.b();
                        int i28 = iIntValue3 & 14;
                        int i29 = b92.a.f16960b;
                        int i30 = x0.f111348c;
                        x0Var2.a(i28 | (i30 << 24), 56, aVarB2, t2Var, null, null, strC3, strQ4, null, aVar10, mVar4);
                        x0Var2.h(t2Var, mVar4, i28 | (i30 << 3));
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar11 = (e23.a) obj6;
                e23.l lVar = (e23.l) obj5;
                p1 p1Var2 = (p1) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    k11.a.f102163a.getClass();
                    z3.e eVar = k11.a.f102164b;
                    boolean zB = mVar5.B(aVar11);
                    Object objQ2 = mVar5.q();
                    if (zB) {
                        objQ2 = new a11.a0(aVar11, p1Var2, 21);
                        mVar5.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a11.a0(aVar11, p1Var2, 21);
                            mVar5.K(objQ2);
                        }
                    }
                    i3.u.b(eVar, (e23.a) objQ2, null, null, null, false, null, null, mVar5, 6, 508);
                    if (z15) {
                        mVar5.C(-342961088);
                        z3.e eVar2 = k11.a.f102165c;
                        boolean zB2 = mVar5.B(lVar);
                        Object objQ3 = mVar5.q();
                        if (zB2) {
                            objQ3 = new v1(lVar, p1Var2, 9);
                            mVar5.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new v1(lVar, p1Var2, 9);
                                mVar5.K(objQ3);
                            }
                        }
                        i3.u.b(eVar2, (e23.a) objQ3, null, null, null, false, null, null, mVar5, 6, 508);
                        mVar5.f();
                    } else {
                        mVar5.C(-342583415);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                cy0.i iVar = (cy0.i) obj5;
                l22.a aVar12 = (l22.a) obj6;
                sy0.c cVar3 = (sy0.c) obj4;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarB = a2.b(u1.n.e(x2.d(aVar13, 1.0f), tn.k.a(d92.b.f58623a, mVar6), m1.f128891a), a2.a(mVar6), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar14);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    b0 b0Var2 = b0.f22601a;
                    if (!z15 || iVar == null || (iVar.f56724d == null && iVar.f56723c == null && iVar.f56725e == null && iVar.f56722b == null && iVar.f56721a == null && !f0.D(iVar))) {
                        mVar6.C(-386752876);
                        mVar6.f();
                    } else {
                        mVar6.C(-386936427);
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar13, j92.b.f97899b.f97920e), mVar6);
                        v0.b(aVar12, iVar, mVar6, 8);
                        mVar6.f();
                    }
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar13, j92.b.f97899b.f97920e), mVar6);
                    v0.a(aVar12, cVar3, mVar6, 8);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 5:
                sy0.d dVar2 = (sy0.d) obj5;
                l22.a aVar15 = (l22.a) obj6;
                u00.a aVar16 = (u00.a) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar7.B(t2Var2) ? 4 : 2;
                }
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (dVar2 != null) {
                        i53.d<String, am.i2> dVar3 = dVar2.f161208b;
                        d2 d2Var = d2.f107276a;
                        ls.e eVar3 = ls.e.TOTAL_TIME;
                        d2Var.getClass();
                        am.i2 i2Var = dVar3.get(d2.a(eVar3));
                        if (i2Var != null) {
                            objC = d2.c(eVar3, i2Var);
                        } else {
                            objC = null;
                        }
                    } else {
                        objC = null;
                    }
                    String strB = objC != null ? aVar16.b((int) ((Double) objC).doubleValue()) : null;
                    if (strB == null) {
                        strB = sn.a.h(mVar7, 1184062521, R.string.no_value, mVar7);
                    } else {
                        mVar7.C(1184057995);
                        mVar7.f();
                    }
                    String str = strB;
                    x0 x0Var3 = x0.f111346a;
                    String strQ5 = gl1.y.Q(mVar7, R.string.lbl_time);
                    int i34 = (iIntValue6 & 14) | (x0.f111348c << 24);
                    x0Var3.a(i34, 124, null, t2Var2, null, null, str, strQ5, null, null, mVar7);
                    if (dVar2 != null) {
                        i53.d<String, am.i2> dVar4 = dVar2.f161208b;
                        d2 d2Var2 = d2.f107276a;
                        ls.e eVar4 = ls.e.TOTAL_ASCENT;
                        d2Var2.getClass();
                        am.i2 i2Var2 = dVar4.get(d2.a(eVar4));
                        if (i2Var2 != null) {
                            objC2 = d2.c(eVar4, i2Var2);
                        } else {
                            objC2 = null;
                        }
                    } else {
                        objC2 = null;
                    }
                    String strB2 = ss.k.b(ls.e.TOTAL_ASCENT, aVar15, objC2, 16);
                    if (strB2 == null) {
                        strB2 = sn.a.h(mVar7, 1184075481, R.string.no_value, mVar7);
                    } else {
                        mVar7.C(1184072505);
                        mVar7.f();
                    }
                    String str2 = strB2;
                    String strQ6 = gl1.y.Q(mVar7, R.string.lbl_total_ascent);
                    if (z15) {
                        i14 = 1184080818;
                        i15 = R.string.f28710m;
                    } else {
                        i14 = 1184081843;
                        i15 = R.string.ft;
                    }
                    x0Var3.a(i34, 116, null, t2Var2, null, null, str2, strQ6, sn.a.h(mVar7, i14, i15, mVar7), null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 6:
                m21.e eVar5 = (m21.e) obj5;
                e23.l lVar2 = (e23.l) obj6;
                e23.l lVar3 = (e23.l) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar17, 1.0f);
                    if (z15) {
                        f14 = 0;
                        g6.f.a aVar18 = g6.f.f75994b;
                    } else {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f14 = j92.b.f97899b.f97920e;
                    }
                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, f14, 7);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar4, mVar8, 48);
                    int iHashCode3 = Long.hashCode(mVar8.getU());
                    i2 i2VarX3 = mVar8.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar19);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar8);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar8);
                    u2 u2Var = u2.f22900a;
                    f01.j jVar = eVar5.f116087d;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l21.b.b(jVar, lVar2, c2.l.C(aVar17, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar8, 0);
                    if (eVar5.b()) {
                        mVar8.C(-1761606292);
                        List<b11.l> list = eVar5.f116100q;
                        b11.l lVar4 = eVar5.f116101r;
                        y01.l.a(null, list, lVar4 != null ? Long.valueOf(lVar4.f14331a) : null, lVar3, mVar8, 0, 1);
                        mVar = mVar8;
                        mVar.f();
                    } else {
                        mVar = mVar8;
                        mVar.C(-1761281474);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.q qVar = (e23.q) obj5;
                String str3 = (String) obj6;
                String str4 = (String) obj4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                x0 x0Var4 = x0.f111346a;
                t2Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar9.B(t2Var3) ? 4 : 2;
                }
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (z15) {
                        mVar9.C(1778536653);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.b(j92.f.f97930g, mVar9);
                    } else {
                        mVar9.C(1778537807);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.f(j92.f.f97930g, mVar9);
                    }
                    mVar9.f();
                    mVar9.C(1778540488);
                    s5.c.b bVar6 = new s5.c.b(0, 1, null);
                    if (z15) {
                        mVar9.C(166802618);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF2 = d92.c.b(j92.f.f97932i, mVar9);
                    } else {
                        mVar9.C(166803740);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF2 = d92.c.f(j92.f.f97932i, mVar9);
                    }
                    mVar9.f();
                    int iJ = bVar6.j(x0VarF.f157322a);
                    try {
                        bVar6.b(str4);
                        Unit unit = Unit.INSTANCE;
                        bVar6.f(iJ);
                        if (str3 != null) {
                            r1.a(bVar6);
                            int iJ2 = bVar6.j(x0VarF2.f157322a);
                            try {
                                bVar6.b(str3);
                                bVar6.f(iJ2);
                            } catch (Throwable th3) {
                                bVar6.f(iJ2);
                                throw th3;
                            }
                        }
                        s5.c cVarK = bVar6.k();
                        mVar9.f();
                        mh.d(cVarK, t2Var3.b(h4.r.S), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, x0.f111347b, null, x0VarF, mVar9, 0, 0, 196604);
                        if (qVar == null) {
                            mVar9.C(-699056778);
                        } else {
                            mVar9.C(1778565099);
                            qVar.invoke(t2Var3, mVar9, Integer.valueOf(iIntValue8 & 14));
                        }
                        mVar9.f();
                    } catch (Throwable th4) {
                        bVar6.f(iJ);
                        throw th4;
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 8:
                e23.a aVar20 = (e23.a) obj6;
                e23.a aVar21 = (e23.a) obj4;
                p1 p1Var3 = (p1) obj5;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    lm0.c.f113521a.getClass();
                    z3.e eVar6 = lm0.c.f113522b;
                    boolean zB3 = mVar10.B(aVar20);
                    Object objQ4 = mVar10.q();
                    if (zB3) {
                        objQ4 = new a11.a0(aVar20, p1Var3, 26);
                        mVar10.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a11.a0(aVar20, p1Var3, 26);
                            mVar10.K(objQ4);
                        }
                    }
                    i3.u.b(eVar6, (e23.a) objQ4, null, lm0.c.f113523c, null, false, null, null, mVar10, 3078, 500);
                    if (z15) {
                        mVar10.C(1716140722);
                        z3.e eVar7 = lm0.c.f113524d;
                        boolean zB4 = mVar10.B(aVar21);
                        Object objQ5 = mVar10.q();
                        if (zB4) {
                            objQ5 = new a11.a0(aVar21, p1Var3, 27);
                            mVar10.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new a11.a0(aVar21, p1Var3, 27);
                                mVar10.K(objQ5);
                            }
                        }
                        i3.u.b(eVar7, (e23.a) objQ5, null, lm0.c.f113525e, null, false, null, null, mVar10, 3078, 500);
                        mVar10.f();
                    } else {
                        mVar10.C(1716686570);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 9:
                String str5 = (String) obj5;
                String str6 = (String) obj6;
                gc1.a aVar22 = (gc1.a) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar11.B(tVar) ? 4 : 2;
                }
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar23 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC5 = tVar.c(aVar23, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarC5, j92.b.f97899b.f97920e, 0.0f, 2);
                    h4.g.a aVar24 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar24, mVar11, 48);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    h4.r rVarC6 = h4.k.c(rVarA, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar25);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar11);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar11);
                    b0 b0Var3 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97928e, mVar11);
                    h4.r rVarB2 = b0Var3.b(aVar23, aVar24);
                    boolean zB5 = mVar11.B(str5);
                    Object objQ6 = mVar11.q();
                    if (zB5) {
                        objQ6 = new n2(str5, 19);
                        mVar11.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new n2(str5, 19);
                            mVar11.K(objQ6);
                        }
                    }
                    mh.c(str6, p5.v.c((e23.l) objQ6, rVarB2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar11, 0, 0, 131068);
                    l22.a aVar26 = aVar22.f76926b;
                    String string = z15 ? aVar26.getString(R.string.pulse_ox_spo2_label) : aVar26.getString(R.string.lbl_pulse_ox_avg_spo2_short);
                    s5.x0 x0VarF3 = d92.c.f(j92.f.f97932i, mVar11);
                    boolean zR2 = mVar11.r(aVar22);
                    Object objQ7 = mVar11.q();
                    if (zR2) {
                        objQ7 = new kp2.a(aVar22, 25);
                        mVar11.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new kp2.a(aVar22, 25);
                            mVar11.K(objQ7);
                        }
                    }
                    h4.r rVarC7 = p5.v.c((e23.l) objQ7, aVar23, false);
                    d6.h.f57752b.getClass();
                    mh.c(string, rVarC7, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF3, mVar11, 0, 0, 130044);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2, obj3);
            case 11:
                return b(obj, obj2, obj3);
            case 12:
                return c(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            default:
                e23.a aVar27 = (e23.a) obj6;
                z3.e eVar8 = (z3.e) obj5;
                e23.p pVar = (e23.p) obj4;
                c2.a0 a0Var = (c2.a0) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar12.B(a0Var) ? 4 : 2;
                }
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar28 = h4.r.S;
                    h4.r rVarC8 = g02.s0.c(c2.l.s(a0Var.a(aVar28, 1.0f, false)), z15);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD = c2.q.d(gVar, false);
                    int iHashCode5 = Long.hashCode(mVar12.getU());
                    i2 i2VarX5 = mVar12.x();
                    h4.r rVarC9 = h4.k.c(rVarC8, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar29 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar29);
                    } else {
                        mVar12.c();
                    }
                    h5.g.a.e eVar9 = h5.g.a.f81810g;
                    b4.c(eVar9, z0VarD, mVar12);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX5, mVar12);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar12, iHashCode5, bVar8);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC9, mVar12);
                    c2.u uVar = c2.u.f22885a;
                    boolean zH = mVar12.h(z15);
                    Object objQ8 = mVar12.q();
                    if (zH) {
                        objQ8 = new a81.j(z15, 27);
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new a81.j(z15, 27);
                            mVar12.K(objQ8);
                        }
                    }
                    h4.r rVarF2 = l4.k.f(aVar28, (e23.l) objQ8);
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode6 = Long.hashCode(mVar12.getU());
                    i2 i2VarX6 = mVar12.x();
                    h4.r rVarC10 = h4.k.c(rVarF2, mVar12);
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar29);
                    } else {
                        mVar12.c();
                    }
                    b4.c(eVar9, z0VarD2, mVar12);
                    b4.c(c1623g, i2VarX6, mVar12);
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar12, iHashCode6, bVar8);
                    }
                    b4.c(fVar, rVarC10, mVar12);
                    eVar8.invoke(uVar, mVar12, 6);
                    mVar12.y();
                    if (z15) {
                        mVar12.C(-1154125591);
                        z14 = false;
                        g02.s0.b(uVar.c(aVar28, h4.d.a.f81528f), 0.0f, mVar12, 0, 2);
                        mVar12.f();
                    } else {
                        z14 = false;
                        mVar12.C(-1154044867);
                        mVar12.f();
                    }
                    h4.r rVarC11 = uVar.c(aVar28, h4.d.a.f81531i);
                    z0 z0VarD3 = c2.q.d(gVar, z14);
                    int iHashCode7 = Long.hashCode(mVar12.getU());
                    i2 i2VarX7 = mVar12.x();
                    h4.r rVarC12 = h4.k.c(rVarC11, mVar12);
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar29);
                    } else {
                        mVar12.c();
                    }
                    b4.c(eVar9, z0VarD3, mVar12);
                    b4.c(c1623g, i2VarX7, mVar12);
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar12, iHashCode7, bVar8);
                    }
                    b4.c(fVar, rVarC12, mVar12);
                    if (pVar == null) {
                        mVar12.C(1325510615);
                    } else {
                        mVar12.C(-927072918);
                        pVar.invoke(mVar12, 0);
                    }
                    mVar12.f();
                    mVar12.y();
                    mVar12.y();
                    boolean zB6 = mVar12.B(aVar27);
                    Object objQ9 = mVar12.q();
                    if (zB6) {
                        objQ9 = new y0(aVar27, 10);
                        mVar12.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new y0(aVar27, 10);
                            mVar12.K(objQ9);
                        }
                    }
                    c.w.a(0, 1, (e23.a) objQ9, mVar12, false);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(e23.a aVar, boolean z14, e23.l lVar, p1 p1Var) {
        this.f81094a = 3;
        this.f81097d = aVar;
        this.f81095b = z14;
        this.f81096c = lVar;
        this.f81098e = p1Var;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z14, int i14) {
        this.f81094a = i14;
        this.f81096c = obj;
        this.f81097d = obj2;
        this.f81098e = obj3;
        this.f81095b = z14;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z14, Object obj3, int i14) {
        this.f81094a = i14;
        this.f81096c = obj;
        this.f81097d = obj2;
        this.f81095b = z14;
        this.f81098e = obj3;
    }

    public /* synthetic */ m(Object obj, boolean z14, Object obj2, Object obj3, int i14) {
        this.f81094a = i14;
        this.f81096c = obj;
        this.f81095b = z14;
        this.f81097d = obj2;
        this.f81098e = obj3;
    }

    public /* synthetic */ m(boolean z14, e23.a aVar, z3.e eVar, e23.p pVar) {
        this.f81094a = 19;
        this.f81095b = z14;
        this.f81097d = aVar;
        this.f81096c = eVar;
        this.f81098e = pVar;
    }

    public /* synthetic */ m(boolean z14, Object obj, Object obj2, Object obj3, int i14) {
        this.f81094a = i14;
        this.f81095b = z14;
        this.f81096c = obj;
        this.f81097d = obj2;
        this.f81098e = obj3;
    }
}
