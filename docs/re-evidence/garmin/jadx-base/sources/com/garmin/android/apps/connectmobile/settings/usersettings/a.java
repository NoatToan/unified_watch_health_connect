package com.garmin.android.apps.connectmobile.settings.usersettings;

import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d92.b;
import d92.c;
import f12.l;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v5;
import j92.e;
import j92.f;
import java.util.Calendar;
import l72.f0;
import lm0.o;
import o4.m1;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.k0;
import s5.x0;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/a$a", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker$a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0825a implements GCMDatePicker.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<LocalDate> f44026a;

        public C0825a(p1<LocalDate> p1Var) {
            this.f44026a = p1Var;
        }

        @Override // com.garmin.android.apps.connectmobile.settings.usersettings.GCMDatePicker.a
        public final void a(Calendar calendar) {
            this.f44026a.setValue(LocalDate.fromCalendarFields(calendar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01ce  */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        String strJ;
        o0 o0VarE = mVar.E(-150677084);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l.f68084a.getClass();
            LocalDate localDateL1 = l.a.a().l1();
            if (localDateL1 != null) {
                o0VarE.C(-579961054);
                o0VarE.g0(false);
                strJ = DateTimeFormat.mediumDate().print(localDateL1);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -579895923, R.string.no_value, o0VarE, false);
            }
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.d(aVar2, 1.0f), h.f(b.f58623a, o0VarE), m1.f128891a);
            d.f81522a.getClass();
            g.a aVar3 = d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            String str = strJ;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            str.getClass();
            f fVar = b.f58624b;
            fVar.getClass();
            x0 x0VarB = c.b(c.e(f.f97931h), o0VarE);
            g6.f.a aVar5 = g6.f.f75994b;
            mh.c(str, c2.l.C(aVar2, 0.0f, 42, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 131068);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_update_birthdate_garmin_account_profile);
            fVar.getClass();
            x0 x0VarF = c.f(f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.b bVar2 = b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            r rVarC2 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar2.getClass();
            mh.c(strQ, c2.l.A(rVarC2, eVar.f97922g, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            f0 f0Var = f0.f110999a;
            String strH = g22.n.h(gl1.y.Q(o0VarE, R.string.lbl_manage_garmin_account));
            r rVarZ = x2.z(aVar2, null, 3);
            bVar2.getClass();
            r rVarC3 = c2.l.C(rVarZ, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new pf0.j(aVar, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new pf0.j(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(0, 9, (e23.a) objQ, rVarC3, strH, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.r(aVar, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(LocalDate localDate, e23.l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        Object obj;
        byte b14;
        String strJ;
        e0.a aVar;
        h5.g.a.b bVar;
        p1 p1Var;
        p1 p1Var2;
        o0 o0VarE = mVar.E(1396694626);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(localDate) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            long jF = h.f(b.f58623a, o0VarE);
            m1.a aVar3 = m1.f128891a;
            r rVarE = u1.n.e(rVarD, jF, aVar3);
            d.f81522a.getClass();
            g.a aVar4 = d.a.f81537o;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA = y.a(kVar, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(localDate);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            l72.p2 p2Var = l72.p2.f111205a;
            b.f58625c.getClass();
            r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_birthdate);
            if (localDate != null) {
                o0VarE.C(-1744348060);
                b14 = 0;
                o0VarE.g0(false);
                strJ = DateTimeFormat.mediumDate().print(localDate);
            } else {
                b14 = 0;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1744261291, R.string.no_value, o0VarE, false);
            }
            strJ.getClass();
            z3.e eVarC = z3.f.c(-1855721761, new b71.n(lVar, 15, b14), o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new k0(p1Var4, 12);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ, strJ, null, rVarC2, null, false, false, null, eVarC, null, (e23.a) objQ3, o0VarE, 100663296, 6, 756);
            o0VarE = o0VarE;
            c2.l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-1743452718);
                r rVarE2 = u1.n.e(aVar2, b.a(o0VarE).c().e(), aVar3);
                z zVarA2 = y.a(kVar, d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = k.c(rVarE2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar = aVar5;
                    o0VarE.M(aVar);
                } else {
                    aVar = aVar5;
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    bVar = bVar2;
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    bVar = bVar2;
                }
                b4.c(fVar, rVarC3, o0VarE);
                r rVarF = x2.f(aVar2, 1.0f);
                s2 s2VarA = q2.a(j.f22698h, d.a.f81533k, o0VarE, 6);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC4 = k.c(rVarF, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                u2 u2Var = u2.f22900a;
                f0 f0Var = f0.f110999a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    p1Var = p1Var4;
                    objQ4 = new k0(p1Var, 13);
                    o0VarE.K(objQ4);
                } else {
                    p1Var = p1Var4;
                }
                f0Var.k(strQ2, null, false, (e23.a) objQ4, o0VarE, 3072, 6);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_done);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    p1Var2 = p1Var3;
                    objQ5 = new o(lVar, p1Var2, p1Var, 2);
                    o0VarE.K(objQ5);
                } else {
                    p1Var2 = p1Var3;
                }
                p1 p1Var5 = p1Var2;
                f0Var.k(strQ3, null, false, (e23.a) objQ5, o0VarE, 0, 6);
                o0VarE.g0(true);
                g6.f.a aVar6 = g6.f.f75994b;
                v5.a((float) 0.5d, 48, 1, sn.a.c(o0VarE), null, o0VarE);
                r rVarF2 = x2.f(aVar2, 1.0f);
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new p40.h(13);
                    o0VarE.K(objQ6);
                }
                e23.l lVar2 = (e23.l) objQ6;
                obj = localDate;
                boolean zR = o0VarE.r(obj);
                Object objQ7 = o0VarE.q();
                if (zR || objQ7 == c2565a) {
                    objQ7 = new ph1.d(1, obj, p1Var5);
                    o0VarE.K(objQ7);
                }
                p002j6.c.b(lVar2, rVarF2, (e23.l) objQ7, o0VarE, 54, 0);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                obj = localDate;
                o0VarE.C(-1741726762);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            lVar = lVar;
            obj = localDate;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(obj, lVar, i14, 18);
        }
    }
}
