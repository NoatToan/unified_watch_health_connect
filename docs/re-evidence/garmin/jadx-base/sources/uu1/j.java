package uu1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e23.q;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172860a;

        static {
            int[] iArr = new int[gg0.g.values().length];
            try {
                iArr[gg0.g.FINISH_WITH_LEG_TIME_GOALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.g.FINISH_WITH_AN_OVERALL_GOAL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f172860a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    public static final void a(String str, String str2, b92.a aVar, m mVar, int i14) {
        o0 o0Var;
        String str3;
        String str4;
        str.getClass();
        o0 o0VarE = mVar.E(2042524712);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (aVar == null || (str3 = aVar.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL)) == null) {
                str3 = str;
            }
            if (aVar == null || (str4 = aVar.f16961a.get("value")) == null) {
                str4 = str2;
            }
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            bVar2.getClass();
            r rVarZ = l.z(aVar2, eVar.f97920e, f14);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            boolean zB = o0VarE.B(str3);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zB) {
                objQ = new u91.c(str3, 5);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new u91.c(str3, 5);
                    o0VarE.K(objQ);
                }
            }
            String str5 = str4;
            mh.c(str, v.c((e23.l) objQ, rVarZ, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i15 & 14, 0, 131068);
            fVar.getClass();
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57758h;
            boolean zB2 = o0VarE.B(str5);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new u91.c(str5, 6);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new u91.c(str5, 6);
                    o0VarE.K(objQ2);
                }
            }
            mh.c(str2, u2Var.a(v.c((e23.l) objQ2, rVarZ, false), 1.0f, true), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i15 >> 3) & 14, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(str, str2, aVar, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    public static final void b(int i14, e23.a aVar, String str, m mVar) {
        str.getClass();
        o0 o0VarE = mVar.E(1732318258);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.training_goal);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new u11.b(aVar, 26);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new u11.b(aVar, 26);
                    o0VarE.K(objQ);
                }
            }
            p2Var.h(strQ, str, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, (i15 << 3) & 112, 0, 1020);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(str, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    public static final void c(fg0.k kVar, xv1.a aVar, m mVar, int i14) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        gg0.i unit;
        fg0.d customGoal;
        fg0.d customGoal2;
        Double value;
        aVar.getClass();
        o0 o0VarE = mVar.E(1642600825);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH2 = kVar.h();
            if (listH2 == null) {
                listH2 = j0.f134944a;
            }
            fg0.j eventCustomization = kVar.getEventCustomization();
            if (eventCustomization == null || (listH = eventCustomization.h()) == null) {
                listH = j0.f134944a;
            }
            o0VarE.C(-2008558548);
            for (mg0.a aVar2 : mg0.b.b(context, listH2, listH, kVar.n0())) {
                ng0.b bVar = ng0.b.f125905a;
                boolean z14 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(aVar))) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(kVar)));
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new ry0.g(28, aVar, kVar);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ry0.g(28, aVar, kVar);
                        o0VarE.K(objQ);
                    }
                }
                int i16 = mg0.a.f118363g;
                bVar.a(aVar2, (q) objQ, o0VarE, 0);
            }
            o0VarE.g0(false);
            og0.a aVar3 = og0.a.f131967a;
            fg0.j eventCustomization2 = kVar.getEventCustomization();
            double dDoubleValue = (eventCustomization2 == null || (customGoal2 = eventCustomization2.getCustomGoal()) == null || (value = customGoal2.getValue()) == null) ? 0.0d : value.doubleValue();
            fg0.j eventCustomization3 = kVar.getEventCustomization();
            if (eventCustomization3 == null || (customGoal = eventCustomization3.getCustomGoal()) == null || (unit = customGoal.getUnit()) == null) {
                unit = gg0.i.SECOND;
            }
            aVar3.getClass();
            double dJ = og0.a.j(dDoubleValue, unit);
            l3.f23124b.getClass();
            String strO1 = l3.a.o1((long) dJ);
            String strK1 = l3.a.k1(new l22.a(context), true, (int) dJ);
            String strQ = gl1.y.Q(o0VarE, R.string.overall_goal_time);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            String strQ2 = gl1.y.Q(o0VarE, R.string.overall_goal_time);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strQ2);
            linkedHashMap.put("value", strK1);
            b92.a aVarB = c0235a.b();
            int i17 = b92.a.f16960b;
            a(strQ, strO1, aVarB, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(kVar, aVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    public static final void d(fg0.k kVar, xv1.a aVar, m mVar, int i14) {
        int i15;
        ?? r14;
        o0 o0Var;
        boolean z14;
        Object obj;
        aVar.getClass();
        o0 o0VarE = mVar.E(830353297);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = y.a(gVar, aVar3, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarX, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarA = b0Var.a(aVar2, 1.0f, true);
            z zVarA2 = y.a(c2.j.f22694d, aVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String upperCase = gl1.y.Q(o0VarE, R.string.event_goal).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97934k, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97921f;
            float f15 = eVar2.f97920e;
            org.apache.commons.lang3.e.j(bVar2);
            mh.c(upperCase, b0Var.b(x2.f(l.B(aVar2, f15, f14, f15, eVar2.f97917b), 1.0f), aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0 o0Var2 = o0VarE;
            fg0.j eventCustomization = kVar.getEventCustomization();
            gg0.g gVarS = eventCustomization != null ? eventCustomization.s() : null;
            String strQ = gl1.y.Q(o0Var2, gVarS != null ? gVarS.f77155a : gg0.g.FINISH__THE_EVENT.f77155a);
            int i17 = i16 & 112;
            int i18 = i16 & 14;
            boolean z15 = (i18 == 4 || ((i16 & 8) != 0 && o0Var2.r(kVar))) | (i17 == 32 || ((i16 & 64) != 0 && o0Var2.r(aVar)));
            Object objQ = o0Var2.q();
            if (z15) {
                z14 = false;
                g gVar2 = new g(aVar, kVar, 0);
                o0Var2.K(gVar2);
                obj = gVar2;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    z14 = false;
                    g gVar3 = new g(aVar, kVar, 0);
                    o0Var2.K(gVar3);
                    obj = gVar3;
                } else {
                    z14 = false;
                    obj = objQ;
                }
            }
            b(z14 ? 1 : 0, (e23.a) obj, strQ, o0Var2);
            int i19 = gVarS == null ? -1 : a.f172860a[gVarS.ordinal()];
            if (i19 == 1) {
                o0Var2.C(1114947745);
                c(kVar, aVar, o0Var2, i18 | fg0.k.X | i17);
                o0Var2.g0(z14);
                Unit unit = Unit.INSTANCE;
            } else if (i19 != 2) {
                o0Var2.C(203853862);
                o0Var2.g0(z14);
                Unit unit2 = Unit.INSTANCE;
            } else {
                o0Var2.C(1114951934);
                e(kVar, aVar, o0Var2, i18 | fg0.k.X | i17);
                o0Var2.g0(z14);
                Unit unit3 = Unit.INSTANCE;
            }
            o0Var2.g0(true);
            o0Var2.g0(true);
            o0Var = o0Var2;
            r14 = z14;
        } else {
            o0 o0Var3 = o0VarE;
            r14 = 0;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(kVar, aVar, i14, r14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    public static final void e(fg0.k kVar, xv1.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        fg0.d customGoal;
        Double value;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1245821315);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            l3.a aVar2 = l3.f23124b;
            fg0.j eventCustomization = kVar.getEventCustomization();
            long jDoubleValue = (eventCustomization == null || (customGoal = eventCustomization.getCustomGoal()) == null || (value = customGoal.getValue()) == null) ? 0L : (long) value.doubleValue();
            aVar2.getClass();
            String strE1 = l3.a.e1(jDoubleValue);
            int i17 = i15;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_goal_time);
            if (strE1 == null) {
                strE1 = "";
            }
            boolean z15 = (i17 & 112) == 32 || ((i17 & 64) != 0 && o0VarE.r(aVar));
            if ((i17 & 14) == 4 || ((i17 & 8) != 0 && o0VarE.r(kVar))) {
                z14 = true;
            }
            boolean z16 = z15 | z14;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new g(aVar, kVar, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(aVar, kVar, 1);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            i16 = 1;
            p2Var.h(strQ, strE1, null, null, null, false, false, null, null, null, (e23.a) objQ, o0Var, 0, 0, 1020);
        } else {
            o0Var = o0VarE;
            i16 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(kVar, aVar, i14, i16);
        }
    }
}
