package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.List;
import l72.x0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class y {
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    public static final void a(ir0.e eVar, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-816444328);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (eVar == null || !eVar.m()) {
                o0VarE.C(-293018238);
                s.a(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-292935375);
                h4.r.a aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
                b0 b0Var = b0.f22601a;
                int iG = eVar.g();
                int iJ = eVar.j();
                g.b(iJ, iJ > 0 ? iG / iJ : 0, 0, Integer.valueOf(iG), o0VarE);
                m92.o.a(null, gl1.y.Q(o0VarE, R.string.common_weekly_timeline), null, null, z3.f.c(890686450, new t(eVar, 2), o0VarE), null, z3.f.c(-1209645068, new t(eVar, 3), o0VarE), o0VarE, 1597440, 45);
                List<ir0.f> list = eVar.f94793a;
                List listG0 = list != null ? h0.G0(list) : null;
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new qe2.c(lVar, 16);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qe2.c(lVar, 16);
                        o0VarE.K(objQ);
                    }
                }
                b(listG0, (e23.l) objQ, o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(eVar, lVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final void b(List<ir0.f> list, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        List<ir0.f> list2;
        c42.e0 e0Var;
        p2 p2VarI0;
        int i15;
        x00.a aVar;
        boolean z14;
        int i16;
        Object obj;
        ?? E = mVar.E(-439037347);
        int i17 = 32;
        int i18 = (E.r(list) ? 4 : 2) | i14 | (E.r(lVar) ? 32 : 16);
        boolean z15 = false;
        int i19 = 1;
        if (E.n(i18 & 1, (i18 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = E.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new c42.e0(lVar, i14, 23, list);
                }
            } else {
                x00.a aVar2 = new x00.a((Context) E.A(AndroidCompositionLocals_androidKt.f6042b));
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, E), m1.f128891a);
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                float f15 = 8;
                h4.r rVarB = c2.l.B(rVarE, f14, f15, f14, f14);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, E, 0);
                int iHashCode = Long.hashCode(E.U);
                i2 i2VarA0 = E.a0();
                h4.r rVarC = h4.k.c(rVarB, E);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (E.f135177b == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar4);
                } else {
                    E.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, E);
                b4.c(h5.g.a.f81809f, i2VarA0, E);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, E);
                b0 b0Var = b0.f22601a;
                E.C(-1663863622);
                for (ir0.f fVar : list) {
                    LocalDate localDateB = fVar.b();
                    DateTime dateTimeAtStartOfDay = localDateB != null ? localDateB.toDateTimeAtStartOfDay() : null;
                    if (dateTimeAtStartOfDay != null) {
                        E.C(267523503);
                        qi0.a aVar5 = qi0.a.WEEKDAY;
                        pi0.e eVar = aVar2.f188234b;
                        String strA = eVar.a(dateTimeAtStartOfDay, aVar5);
                        String strA2 = eVar.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        Integer numF = fVar.f();
                        String strD = (numF == null || numF.intValue() < 0) ? aVar2.d() : aVar2.b(numF);
                        h4.r rVarA = c2.l.A(h4.r.S, 0.0f, f15, i19);
                        int i24 = ((i18 & 112) == i17 ? i19 : z15) | (E.r(dateTimeAtStartOfDay) ? 1 : 0);
                        Object objQ = E.q();
                        if (i24 == 0) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj = objQ;
                                ci0.e eVar2 = new ci0.e(lVar, dateTimeAtStartOfDay, 9);
                                E.K(eVar2);
                                obj = eVar2;
                            }
                        } else {
                            obj = objQ;
                            ci0.e eVar3 = new ci0.e(lVar, dateTimeAtStartOfDay, 9);
                            E.K(eVar3);
                            obj = eVar3;
                        }
                        obj = objQ;
                        aVar = aVar2;
                        z14 = z15;
                        i16 = i19;
                        i15 = 32;
                        l72.l.e(strA, strA2, strD, null, null, null, rVarA, null, false, (e23.a) obj, E, 1572864, 440);
                        E.g0(z14);
                    } else {
                        i15 = i17;
                        aVar = aVar2;
                        z14 = z15;
                        i16 = i19;
                        E.C(267907903);
                        E.g0(z14);
                    }
                    i19 = i16;
                    z15 = z14;
                    i17 = i15;
                    f15 = f15;
                    aVar2 = aVar;
                    i18 = i18;
                }
                E.g0(z15);
                E.g0(i19);
                x1 x1Var2 = p3.n.f135158a;
                list2 = list;
            }
            p2VarI0.f135219d = e0Var;
        }
        list2 = list;
        E.e();
        p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            e0Var = new c42.e0(lVar, i14, 24, list2);
            p2VarI0.f135219d = e0Var;
        }
    }

    public static final void c(Integer num, Integer num2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1674218606);
        int i15 = (o0VarE.B(num) ? 4 : 2) | i14 | (o0VarE.B(num2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x00.a aVar = new x00.a(context);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strE = aVar.e();
            x0 x0Var = x0.f111346a;
            g6.f.a aVar4 = g6.f.f75994b;
            o0Var = o0VarE;
            x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 16, 7), z3.f.c(-189183389, new h(aVar, num, strE, context, num2, 2), o0VarE), o0Var, (x0.f111348c << 6) | 54, 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(num, num2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    public static final void d(ir0.e eVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        boolean z15;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1314963107);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                o0VarE.C(330961951);
                z15 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new qe2.c(lVar, 17);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qe2.c(lVar, 17);
                        o0VarE.K(objQ);
                    }
                }
                a(eVar, (e23.l) objQ, o0VarE, (i15 & 14) | ir0.e.f94792c);
                o0VarE.g0(false);
            } else {
                o0VarE.C(331100862);
                z15 = (i15 & 896) == 256;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new qe2.c(lVar, 18);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qe2.c(lVar, 18);
                        o0VarE.K(objQ2);
                    }
                }
                e(eVar, (e23.l) objQ2, o0VarE, (i15 & 14) | ir0.e.f94792c);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(eVar, z14, lVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    public static final void e(ir0.e eVar, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(1305588082);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
            b0 b0Var = b0.f22601a;
            if (eVar == null || !eVar.m()) {
                o0VarE.C(-1684502233);
                r.a(0, eVar != null ? Integer.valueOf(eVar.j()) : null, true, o0VarE, 390, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1684306282);
                r.a(Integer.valueOf(eVar.g()), Integer.valueOf(eVar.j()), false, o0VarE, 0, 4);
                o0VarE.g0(false);
            }
            m92.o.a(null, gl1.y.Q(o0VarE, R.string.common_weekly_timeline), null, null, z3.f.c(-1011386052, new t(eVar, 4), o0VarE), null, z3.f.c(-628712582, new t(eVar, 5), o0VarE), o0VarE, 1597440, 45);
            o0VarE = o0VarE;
            if (eVar == null || !eVar.m()) {
                o0VarE.C(-1683289978);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1683450465);
                List<ir0.f> list = eVar.f94793a;
                List listG0 = list != null ? h0.G0(list) : null;
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new qe2.c(lVar, 15);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qe2.c(lVar, 15);
                        o0VarE.K(objQ);
                    }
                }
                b(listG0, (e23.l) objQ, o0VarE, 0);
                o0VarE.g0(false);
            }
            i16 = 1;
            o0VarE.g0(true);
        } else {
            i16 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(eVar, lVar, i14, i16);
        }
    }
}
