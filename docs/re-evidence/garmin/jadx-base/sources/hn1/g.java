package hn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e2.i0;
import e2.k0;
import e23.p;
import e23.q;
import fn1.r;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.mc;
import j20.x;
import km1.a0;
import km1.c0;
import l72.j0;
import l72.x0;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.w;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import r53.b2;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:101:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a0 a0Var, DateTime dateTime, DateTime dateTime2, s sVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1VarC;
        boolean z14;
        T t7;
        p1 p1VarC2;
        String strA;
        boolean z15;
        boolean z16;
        boolean z17;
        T t14;
        sm1.a0 a0Var2;
        b0Var.getClass();
        o0 o0VarE = mVar.E(-587831092);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(sVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(b0Var) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            b2 b2Var = sVar != null ? sVar.f160188h : null;
            if (b2Var == null) {
                o0VarE.C(-1494154024);
                o0VarE.g0(false);
                p1VarC = null;
            } else {
                o0VarE.C(2030011465);
                p1VarC = s9.c.c(b2Var, o0VarE);
                o0VarE.g0(false);
            }
            boolean z18 = (p1VarC == null || (a0Var2 = (sm1.a0) p1VarC.getF182175a()) == null) ? false : a0Var2.f160098n;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            km1.f fVar = new km1.f((Context) o0VarE.A(y3Var), z18);
            Context context = (Context) o0VarE.A(y3Var);
            r0 r0Var = new r0();
            r0 r0Var2 = new r0();
            if (z18) {
                o0VarE.C(-1493707964);
                if (dateTime == null || dateTime2 == null) {
                    z17 = false;
                    o0VarE.C(-1493239182);
                    o0VarE.g0(false);
                    t14 = 0;
                } else {
                    o0VarE.C(-1493627767);
                    u82.f fVar2 = (u82.f) sVar.f160197q.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), o0VarE).getF182175a();
                    z17 = false;
                    o0VarE.g0(false);
                    t14 = fVar2;
                }
                r0Var.f105810a = t14;
                o0VarE.g0(z17);
            } else {
                o0VarE.C(-1493175725);
                if (dateTime == null || dateTime2 == null) {
                    z14 = false;
                    o0VarE.C(-1492690606);
                    o0VarE.g0(false);
                    t7 = 0;
                } else {
                    o0VarE.C(-1492716367);
                    u82.a aVar = sVar != null ? sVar.f160196p : null;
                    if (aVar == null) {
                        o0VarE.C(-1493008729);
                        z14 = false;
                        o0VarE.g0(false);
                        p1VarC2 = null;
                    } else {
                        o0VarE.C(2030048410);
                        p1VarC2 = aVar.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), o0VarE);
                        z14 = false;
                        o0VarE.g0(false);
                    }
                    u82.f fVar3 = p1VarC2 != null ? (u82.f) p1VarC2.getF182175a() : null;
                    o0VarE.g0(z14);
                    t7 = fVar3;
                }
                r0Var2.f105810a = t7;
                o0VarE.g0(z14);
            }
            boolean zB = o0VarE.B(r0Var2.f105810a);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = hb.a.n(r0Var2.f105810a instanceof u82.f.b, o0VarE);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb.a.n(r0Var2.f105810a instanceof u82.f.b, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            boolean zB2 = o0VarE.B(r0Var2.f105810a);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = hb.a.n(r0Var2.f105810a instanceof u82.f.b, o0VarE);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = hb.a.n(r0Var2.f105810a instanceof u82.f.b, o0VarE);
                }
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            if (z18) {
                o0VarE.C(-1492232798);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(-1492200559);
                    z16 = false;
                    o0VarE.g0(false);
                    strA = null;
                } else {
                    o0VarE.C(2030076065);
                    strA = g22.n.a(y.Q(o0VarE, R.string.no_data_label));
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-1492111216);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-1492072591);
                    z15 = false;
                    o0VarE.g0(false);
                    strA = null;
                } else {
                    o0VarE.C(2030080545);
                    strA = g22.n.a(y.Q(o0VarE, R.string.intensity_lbl_no_im_data));
                    z15 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            }
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new CustomLineChart(context);
                o0VarE.K(objQ4);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new CustomBarChart(context);
                o0VarE.K(objQ5);
            }
            boolean z19 = z18;
            o0Var = o0VarE;
            r.a(y.Q(o0VarE, R.string.lbl_activity_history), fVar.b(c0.ACTIVITY_HISTORY, a0Var != null ? a0Var.getTrainingFeedback() : null), y.Q(o0VarE, z18 ? R.string.tr_factor_acute_load : R.string.title_intensity_minutes), e5.g(y.Q(o0VarE, R.string.common_lbl_daily_totals), " • ", y.Q(o0VarE, R.string.lbl_four_weeks)), mcVar, b0Var, ((Boolean) p1Var2.getF182175a()).booleanValue() | ((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(375355252, new av0.g(z19, customLineChart, (CustomBarChart) objQ5, dateTime, dateTime2, context, r0Var, p1Var3, strA, r0Var2), o0VarE), z3.f.c(-1691077469, new b(z19, p1Var3, 0), o0VarE), z3.f.c(730676290, new c(z19, r0Var2), o0VarE), o0Var, (i16 & 57344) | 918552576 | (i16 & 458752), 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(a0Var, dateTime, dateTime2, sVar, mcVar, b0Var, i14, 0);
        }
    }

    public static final void b(t2 t2Var, ir0.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(567981319);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            oi0.h hVar = new oi0.h((Context) o0VarE.A(y3Var));
            x00.a aVar = new x00.a((Context) o0VarE.A(y3Var));
            l22.a aVar2 = aVar.f188233a;
            String string = aVar2.getString(R.string.intensity_lbl_avg_daily_moderate);
            Context context = (Context) o0VarE.A(y3Var);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ha0.b(20);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, string);
            String strF = hVar.f(eVar != null ? eVar.b() : 0);
            Integer numValueOf = eVar != null ? Integer.valueOf(eVar.b()) : null;
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strD = (numValueOf == null || numValueOf.intValue() < 0) ? aVar.d() : aVar.b(numValueOf);
            String string2 = aVar2.getString(R.string.intensity_lbl_avg_daily_moderate);
            String strE = aVar.e();
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", e5.g(strF, StringUtils.SPACE, strA));
            b92.a aVarB = c0235a.b();
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string2, strE, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(t2Var, eVar, i14, 1);
        }
    }

    public static final void c(t2 t2Var, ir0.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1121739976);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            oi0.h hVar = new oi0.h((Context) o0VarE.A(y3Var));
            x00.a aVar = new x00.a((Context) o0VarE.A(y3Var));
            l22.a aVar2 = aVar.f188233a;
            String string = aVar2.getString(R.string.common_lbl_avg_daily_total);
            Context context = (Context) o0VarE.A(y3Var);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ha0.b(21);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, string);
            String strF = hVar.f(eVar != null ? eVar.d() : 0);
            int iY = oe2.f.y(eVar != null ? Integer.valueOf(eVar.b()) : null, eVar != null ? Integer.valueOf(eVar.f()) : null);
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strD = iY < 0 ? aVar.d() : aVar.b(Integer.valueOf(iY));
            String string2 = aVar2.getString(R.string.common_lbl_avg_daily_total);
            String strE = aVar.e();
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", e5.g(strF, StringUtils.SPACE, strA));
            b92.a aVarB = c0235a.b();
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string2, strE, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(t2Var, eVar, i14, 2);
        }
    }

    public static final void d(t2 t2Var, ir0.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(324865524);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            oi0.h hVar = new oi0.h((Context) o0VarE.A(y3Var));
            x00.a aVar = new x00.a((Context) o0VarE.A(y3Var));
            l22.a aVar2 = aVar.f188233a;
            String string = aVar2.getString(R.string.intensity_lbl_avg_daily_vigorous);
            Context context = (Context) o0VarE.A(y3Var);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ha0.b(19);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, string);
            String strF = hVar.f(eVar != null ? eVar.f() : 0);
            Integer numValueOf = eVar != null ? Integer.valueOf(eVar.f()) : null;
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strD = (numValueOf == null || numValueOf.intValue() < 0) ? aVar.d() : aVar.b(numValueOf);
            String string2 = aVar2.getString(R.string.intensity_lbl_avg_daily_vigorous);
            String strE = aVar.e();
            h.f84527a.getClass();
            z3.e eVar2 = h.f84528b;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", x.d(strF, "(", y.Q(o0VarE, R.string.lbl_times_two), ") ", strA));
            b92.a aVarB = c0235a.b();
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | 196608 | (x0.f111348c << 24), 36, aVarB, t2Var, eVar2, null, strD, string2, strE, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(t2Var, eVar, i14, 0);
        }
    }

    public static final void e(boolean z14, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(415933875);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            i53.c cVarE = i53.a.e(w.c(new j0(y.Q(o0VarE, R.string.chronic_load_title), null, null, false, z14, 14, null)));
            f82.b bVar = new f82.b();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b71.n(lVar, 8, (byte) 0);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            e82.a.b(cVarE, bVar, i0VarA, null, null, (p) objQ, o0Var, 0, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c21.a(z14, lVar, i14, 2);
        }
    }

    public static final void f(final ir0.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1236239968);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            z3.e eVarC = z3.f.c(-2087548625, new q() { // from class: hn1.e
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i18 = i16;
                    ir0.e eVar3 = eVar;
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i18) {
                        case 0:
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                int i19 = (iIntValue & 14) | (ir0.e.f94792c << 3);
                                g.b(t2Var, eVar3, mVar2, i19);
                                g.d(t2Var, eVar3, mVar2, i19);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                int i24 = iIntValue & 14;
                                g.c(t2Var, eVar3, mVar2, (ir0.e.f94792c << 3) | i24);
                                x0.f111346a.h(t2Var, mVar2, i24 | (x0.f111348c << 3));
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i18 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i18, 0);
            bVar2.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), z3.f.c(1388093094, new q() { // from class: hn1.e
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = i17;
                    ir0.e eVar3 = eVar;
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i19) {
                        case 0:
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                int i110 = (iIntValue & 14) | (ir0.e.f94792c << 3);
                                g.b(t2Var, eVar3, mVar2, i110);
                                g.d(t2Var, eVar3, mVar2, i110);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                int i24 = iIntValue & 14;
                                g.c(t2Var, eVar3, mVar2, (ir0.e.f94792c << 3) | i24);
                                x0.f111346a.h(t2Var, mVar2, i24 | (x0.f111348c << 3));
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(eVar, i14, 29);
        }
    }
}
