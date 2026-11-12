package w52;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.l2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class y {
    public static final void a(com.garmin.android.apps.connectmobile.workouts.data.model.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(312699220);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 220);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarH, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b(pVar.f48286c, o0VarE, 0);
            c(o0VarE, 0);
            o(pVar.f48284a, pVar.f48285b, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(pVar, i14, 1);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        String str2;
        p3.o0 o0VarE = mVar.E(-2033589207);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            f5.k.f68985a.getClass();
            str2 = str;
            jf.r.a(str2, null, rVarD, null, null, f5.k.a.f68987b, null, o0VarE, (i15 & 14) | 1573296, 1976);
        } else {
            str2 = str;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str2, i14, 10);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(442261647);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            o4.w.a aVar = o4.w.f129023a;
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            o4.d0 d0VarA = o4.d0.a(j8);
            o4.d0 d0VarA2 = o4.d0.a(j8);
            d92.b.f58623a.getClass();
            c2.q.a(u1.n.d(rVarD, o4.w.a.i(aVar, p13.x.k(d0VarA, d0VarA2, o4.d0.a(d92.b.a(o0VarE).c().b())), 0.0f, 14), null, 6), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 2);
        }
    }

    public static final void d(int i14, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(535214769);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            g(((Resources) o0VarE.A(AndroidCompositionLocals_androidKt.f6043c)).getQuantityString(R.plurals.lbl_duration_minute, i14, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1)), gl1.y.Q(o0VarE, R.string.txt_duration), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 13);
        }
    }

    public static final void e(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1908319487);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strJ = null;
            if (str != null && str.length() > 0) {
                strJ = str;
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 56012354, R.string.lbl_none, o0VarE, false);
            } else {
                o0VarE.C(56011083);
                o0VarE.g0(false);
            }
            g(strJ, gl1.y.Q(o0VarE, R.string.lbl_workout_exercise_equipment), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 11);
        }
    }

    public static final void f(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1513049358);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str2 = null;
            if (str != null && str.length() > 0) {
                str2 = str;
            }
            if (str2 == null) {
                o0VarE.C(428424378);
                o0VarE.g0(false);
            } else {
                o0VarE.C(428424379);
                g(str2, gl1.y.Q(o0VarE, R.string.user_settings_goals_section_title), o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 9);
        }
    }

    public static final void g(String str, String str2, p3.m mVar, int i14) {
        String str3;
        p3.o0 o0VarE = mVar.E(1777583469);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.e1.a(t62.b.f162798a);
            long jE = d92.b.a(o0VarE).f().e();
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            bVar.getClass();
            i7.b(dVarA, "", x2.q(rVarC2, j92.b.f97901d.f97904c), jE, o0VarE, 48, 0);
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131070);
            fVar2.getClass();
            str3 = str2;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            str3 = str2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rv1.s(str, str3, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    public static final void h(String str, List<String> list, p3.m mVar, int i14) {
        ArrayList arrayListB;
        String strK0;
        p3.o0 o0VarE = mVar.E(1642604639);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str2 = null;
            if (((Boolean) o0VarE.A(l2.f91259a)).booleanValue()) {
                o0VarE.C(-2022159578);
                arrayListB = new zw1.b(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b))).b(list);
                if (arrayListB != null) {
                    strK0 = p13.h0.k0(arrayListB, null, null, null, null, 63);
                    if (strK0.length() > 0) {
                        str2 = strK0;
                    }
                }
                if (str2 == null) {
                    o0VarE.C(-2022159579);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2022159578);
                    g(str2, gl1.y.Q(o0VarE, R.string.lbl_primary_muscle_groups), o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            } else {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (com.garmin.android.apps.connectmobile.k1.f37122a.e()) {
                    o0VarE.C(-2022159578);
                    arrayListB = new zw1.b(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b))).b(list);
                    if (arrayListB != null) {
                        strK0 = p13.h0.k0(arrayListB, null, null, null, null, 63);
                        if (strK0.length() > 0) {
                            str2 = strK0;
                        }
                    }
                    if (str2 == null) {
                        o0VarE.C(-2022159579);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-2022159578);
                        g(str2, gl1.y.Q(o0VarE, R.string.lbl_primary_muscle_groups), o0VarE, 0);
                        o0VarE.g0(false);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2021977267);
                    if (str != null && str.length() > 0) {
                        str2 = str;
                    }
                    if (str2 == null) {
                        o0VarE.C(-2021977268);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-2021977267);
                        g(str2, gl1.y.Q(o0VarE, R.string.lbl_msn_workout_body_parts), o0VarE, 0);
                        o0VarE.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    o0VarE.g0(false);
                }
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv1.c(i14, 5, str, list);
        }
    }

    public static final void i(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-828876026);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_key_features);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(strQ, c2.l.z(aVar, f14, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 3);
        }
    }

    public static final void j(List<String> list, p3.m mVar, int i14) {
        ArrayList arrayList;
        p3.o0 o0VarE = mVar.E(188510782);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str = null;
            if (list == null) {
                o0VarE.C(-1892430084);
                o0VarE.g0(false);
                arrayList = null;
            } else {
                o0VarE.C(-1892430083);
                i62.g gVar = new i62.g(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(gVar.a((String) it.next()));
                }
                o0VarE.g0(false);
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                String strK0 = p13.h0.k0(arrayList, null, null, null, null, 63);
                if (strK0.length() > 0) {
                    str = strK0;
                }
            }
            if (str == null) {
                o0VarE.C(-1892192128);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1892192127);
                g(str, gl1.y.Q(o0VarE, R.string.lbl_sport_training_focus), o0VarE, 0);
                o0VarE.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 24);
        }
    }

    public static final void k(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1321401067);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            g(str, gl1.y.Q(o0VarE, R.string.common_type), o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 8);
        }
    }

    public static final void l(com.garmin.android.apps.connectmobile.workouts.data.model.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1422101280);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            i(o0VarE, 0);
            k(pVar.f48287d, o0VarE, 0);
            f(pVar.f48288e, o0VarE, 0);
            h(pVar.f48289f, pVar.f48293j, o0VarE, 0);
            d(pVar.f48290g, o0VarE, 0);
            e(pVar.f48291h, o0VarE, 0);
            j(pVar.f48294k, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(pVar, i14, 2);
        }
    }

    public static final void m(com.garmin.android.apps.connectmobile.workouts.data.model.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(51971450);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            int i16 = i15 & 14;
            a(pVar, o0VarE, i16);
            if (pVar.f48292i) {
                o0VarE.C(-1391869145);
                l(pVar, o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1391827822);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(pVar, i14, 0);
        }
    }

    public static final void n(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.data.model.p pVar, p3.m mVar, int i14) {
        int i15;
        v0Var.getClass();
        p3.o0 o0VarE = mVar.E(1322250623);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.r(pVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            m(pVar, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(v0Var, pVar, i14, 4);
        }
    }

    public static final void o(String str, String str2, p3.m mVar, int i14) {
        String upperCase;
        String str3 = str2;
        p3.o0 o0VarE = mVar.E(1545307634);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str3) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22696f, aVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            long jW = ds.e0.w(o0VarE);
            o4.m1.a aVar4 = o4.m1.f128891a;
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarW = x2.w(u1.n.e(aVar, jW, aVar4), 250, 0.0f, 2);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97917b;
            bVar2.getClass();
            mh.c(str, c2.l.z(rVarW, f14, f15), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 130044);
            str3 = str2;
            o0VarE = o0VarE;
            if (str3 != null) {
                upperCase = str3.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = "";
            }
            fVar.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).c().f(), aVar4);
            bVar2.getClass();
            float f16 = eVar.f97920e;
            bVar2.getClass();
            mh.c(upperCase, c2.l.z(rVarE, f16, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rv1.s(str, str3, i14, 5);
        }
    }
}
