package rv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import bv1.v;
import c2.b0;
import c2.c1;
import c2.t0;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Integer num, List list, boolean z14, boolean z15, p3.m mVar, int i14) {
        ArrayList arrayList;
        g1 g1Var;
        boolean z16;
        String strW;
        h4.r.a aVar;
        p1 p1Var;
        String str;
        o0 o0VarE = mVar.E(-404459434);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(0);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(list != null ? (yw1.p) h0.b0(list) : null);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            if (list == null) {
                o0VarE.C(-1867392788);
                o0VarE.g0(false);
                arrayList = null;
            } else {
                o0VarE.C(-1867392787);
                arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yw1.p pVar = (yw1.p) it.next();
                    if (pVar instanceof yw1.q) {
                        o0VarE.C(1752381912);
                        g1Var = new g1(gl1.y.Q(o0VarE, R.string.lbl_average), null, null, null, 14, null);
                        o0VarE.g0(false);
                    } else {
                        if (!(pVar instanceof yw1.r)) {
                            throw kg.f.h(o0VarE, 1752380182, false);
                        }
                        o0VarE.C(1752384822);
                        g1Var = new g1(gl1.y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null);
                        o0VarE.g0(false);
                    }
                    arrayList.add(g1Var);
                }
                o0VarE.g0(false);
            }
            i53.f fVarJ = arrayList != null ? i53.a.j(arrayList) : null;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar2, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String str2 = uv1.d.f172948l.f172957b;
            if (str2 == null) {
                o0VarE.C(-895526293);
                z16 = false;
                o0VarE.g0(false);
                strW = null;
            } else {
                z16 = false;
                o0VarE.C(-895526292);
                strW = gl1.d.W(str2);
                o0VarE.g0(false);
            }
            if (strW == null) {
                strW = "";
            }
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarB = b0Var.b(aVar2, aVar3);
            bVar.getClass();
            boolean z17 = z16;
            mh.c(strW, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (num != null) {
                o0VarE.C(-895200234);
                if (z14) {
                    o0VarE.C(-1137255060);
                    c22.x0.f23314a.getClass();
                    str = c22.x0.Tb;
                } else {
                    o0VarE.C(-1137253460);
                    c22.x0.f23314a.getClass();
                    str = c22.x0.Kb;
                }
                String strW2 = gl1.d.W(str);
                o0VarE.g0(z17);
                String strP = gl1.y.P(R.string.mct_next_phase_days, new Object[]{num}, o0VarE);
                l72.x0 x0Var = l72.x0.f111346a;
                bVar.getClass();
                aVar = aVar2;
                x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(1408272428, new c40.i(strP, strW2, 9), o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
                o0VarE.g0(z17);
            } else {
                aVar = aVar2;
                o0VarE.C(-894573662);
                o0VarE.g0(z17);
            }
            if (fVarJ == null || ((yw1.p) p1Var3.getF182175a()) == null) {
                o0VarE.C(-893686814);
                o0VarE.g0(z17);
            } else {
                o0VarE.C(-894492132);
                h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                int iIntValue = ((Number) p1Var2.getF182175a()).intValue();
                boolean zR = o0VarE.r(list);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    p1Var = p1Var3;
                    objQ3 = new a(list, p1Var2, p1Var, 2);
                    o0VarE.K(objQ3);
                } else {
                    p1Var = p1Var3;
                }
                k1.a(fVarJ, iIntValue, rVarC2, null, 0.0f, (e23.l) objQ3, o0VarE, 0, 24);
                yw1.p pVar2 = (yw1.p) p1Var.getF182175a();
                if (pVar2 instanceof yw1.q) {
                    o0VarE.C(-1137216228);
                    yw1.p pVar3 = (yw1.p) p1Var.getF182175a();
                    pVar3.getClass();
                    b((yw1.q) pVar3, z15, o0VarE, (i15 >> 6) & 112);
                    o0VarE.g0(z17);
                } else if (pVar2 instanceof yw1.r) {
                    o0VarE.C(-1137211688);
                    yw1.p pVar4 = (yw1.p) p1Var.getF182175a();
                    pVar4.getClass();
                    c((yw1.r) pVar4, z15, o0VarE, (i15 >> 6) & 112);
                    o0VarE.g0(z17);
                } else {
                    o0VarE.C(-1137208156);
                    o0VarE.g0(z17);
                }
                o0VarE.g0(z17);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(num, list, z14, z15, i14, 7);
        }
    }

    public static final void b(yw1.q qVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        String str;
        String str2;
        String strP0;
        final int i16;
        Integer num = qVar.f199962a;
        o0 o0VarE = mVar.E(-164510284);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (num != null) {
                l3.f23124b.getClass();
                str = l3.f23131i.format(num);
            } else {
                str = null;
            }
            c22.x0.f23314a.getClass();
            final String strW = gl1.d.W(c22.x0.Ib);
            final String strW2 = gl1.d.W(c22.x0.Jb);
            Double d14 = qVar.f199963b;
            String str3 = d14 != null ? l3.f23129g.format(d14.doubleValue()) : null;
            final String strQ = gl1.y.Q(o0VarE, R.string.average_weekly_distance_abbreviated);
            final String strQ2 = gl1.y.Q(o0VarE, R.string.average_weekly_distance);
            final String strQ3 = gl1.y.Q(o0VarE, z14 ? R.string.lbl_km : R.string.lbl_mile);
            final String strQ4 = gl1.y.Q(o0VarE, z14 ? R.string.lbl_kilometers : R.string.lbl_miles);
            Double d15 = qVar.f199965d;
            if (d15 != null) {
                double dDoubleValue = d15.doubleValue();
                l3.f23124b.getClass();
                str2 = l3.f23131i.format(dDoubleValue);
            } else {
                str2 = null;
            }
            final String strQ5 = gl1.y.Q(o0VarE, R.string.average_weekly_calories_abbreviated);
            final String strQ6 = gl1.y.Q(o0VarE, R.string.average_weekly_calories_accessibility);
            final String str4 = qVar.f199964c;
            final String strQ7 = gl1.y.Q(o0VarE, R.string.average_weekly_time_abbreviated);
            final String strQ8 = gl1.y.Q(o0VarE, R.string.average_weekly_time);
            Long l14 = qVar.f199966e;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                l3.f23124b.getClass();
                strP0 = l3.a.P0(context, jLongValue * 60000, true);
            } else {
                strP0 = null;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new rk0.n(26);
                o0VarE.K(objQ);
            }
            final String strA = oi0.c.A(context, (e23.l) objQ, strP0);
            final String strW3 = gl1.d.W(c22.x0.Gb);
            final String strW4 = gl1.d.W(c22.x0.Hb);
            List listK = x.k(str, str3, str2, str4, strP0);
            if (listK == null || !listK.isEmpty()) {
                Iterator it = listK.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    if ((((String) it.next()) != null) && (i17 = i17 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
                i16 = i17;
            } else {
                i16 = 0;
            }
            if (str == null && str3 == null && str2 == null && str4 == null && strP0 == null) {
                o0VarE.C(-363252690);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-365829131);
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                final String str5 = str2;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.j.i iVarI = c2.j.i(eVar.f97920e);
                bVar2.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar.f97920e);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                final String str6 = str;
                final String str7 = str3;
                final String str8 = strP0;
                t0.a(c2.l.A(rVarF2, 0.0f, eVar.f97917b, 1), iVarI, iVarI2, null, 2, 0, z3.f.c(1126528682, new e23.q() { // from class: rv1.f
                    /* JADX WARN: Type inference failed for: r14v1 */
                    /* JADX WARN: Type inference failed for: r14v2, types: [b92.a, kotlin.jvm.internal.j] */
                    /* JADX WARN: Type inference failed for: r14v3 */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String str9;
                        Object obj4;
                        ?? r14;
                        Object obj5;
                        Object obj6;
                        Object obj7;
                        c1 c1Var = (c1) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        c1Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(c1Var) ? 4 : 2;
                        }
                        int i18 = iIntValue;
                        if (mVar2.n(i18 & 1, (i18 & 19) != 18)) {
                            x1 x1Var3 = p3.n.f135158a;
                            String str10 = str6;
                            if (str10 != null) {
                                mVar2.C(-458423387);
                                l72.x0 x0Var = l72.x0.f111346a;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("merge", e5.g(strW2, " , ", str10));
                                b92.a aVarB = c0235a.b();
                                int i19 = b92.a.f16960b;
                                r14 = 0;
                                str9 = " , ";
                                obj4 = "merge";
                                x0Var.a((i18 & 14) | (l72.x0.f111348c << 24), 60, aVarB, c1Var, null, null, str10, strW, null, null, mVar2);
                                mVar2.f();
                            } else {
                                str9 = " , ";
                                obj4 = "merge";
                                r14 = 0;
                                mVar2.C(-458097608);
                                mVar2.f();
                            }
                            String str11 = str7;
                            if (str11 != null) {
                                mVar2.C(-458030989);
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(r14, 1, r14);
                                Object obj8 = obj4;
                                c0235a2.f16962a.put(obj8, j20.x.d(strQ2, str9, str11, StringUtils.SPACE, strQ4));
                                b92.a aVarB2 = c0235a2.b();
                                int i24 = b92.a.f16960b;
                                obj5 = obj8;
                                x0Var2.a((i18 & 14) | (l72.x0.f111348c << 24), 52, aVarB2, c1Var, null, null, str11, strQ, strQ3, null, mVar2);
                                mVar2.f();
                            } else {
                                obj5 = obj4;
                                mVar2.C(-457626408);
                                mVar2.f();
                            }
                            String str12 = str4;
                            if (str12 != null) {
                                mVar2.C(-457566051);
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(r14, 1, r14);
                                Object obj9 = obj5;
                                c0235a3.f16962a.put(obj9, e5.g(strQ8, str9, str12));
                                b92.a aVarB3 = c0235a3.b();
                                int i25 = b92.a.f16960b;
                                obj6 = obj9;
                                x0Var3.a((i18 & 14) | (l72.x0.f111348c << 24), 60, aVarB3, c1Var, null, null, str12, strQ7, null, null, mVar2);
                                mVar2.f();
                            } else {
                                obj6 = obj5;
                                mVar2.C(-457232584);
                                mVar2.f();
                            }
                            String str13 = str5;
                            if (str13 != null) {
                                mVar2.C(-457174459);
                                l72.x0 x0Var4 = l72.x0.f111346a;
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(r14, 1, r14);
                                Object obj10 = obj6;
                                c0235a4.f16962a.put(obj10, e5.g(strQ6, str9, str13));
                                b92.a aVarB4 = c0235a4.b();
                                int i26 = b92.a.f16960b;
                                obj7 = obj10;
                                x0Var4.a((i18 & 14) | (l72.x0.f111348c << 24), 60, aVarB4, c1Var, null, null, str13, strQ5, null, null, mVar2);
                                mVar2.f();
                            } else {
                                obj7 = obj6;
                                mVar2.C(-456848680);
                                mVar2.f();
                            }
                            String str14 = str8;
                            if (str14 != null) {
                                mVar2.C(-456796910);
                                l72.x0 x0Var5 = l72.x0.f111346a;
                                b92.a.C0235a c0235a5 = new b92.a.C0235a(r14, 1, r14);
                                c0235a5.f16962a.put(obj7, e5.g(strW4, str9, strA));
                                b92.a aVarB5 = c0235a5.b();
                                int i27 = b92.a.f16960b;
                                x0Var5.a((i18 & 14) | (l72.x0.f111348c << 24), 60, aVarB5, c1Var, null, null, str14, strW3, null, null, mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(-456483624);
                                mVar2.f();
                            }
                            if (i16 % 2 != 0) {
                                mVar2.C(-456347968);
                                l72.x0.f111346a.h(c1Var, mVar2, (i18 & 14) | (l72.x0.f111348c << 3));
                                mVar2.f();
                            } else {
                                mVar2.C(-456294152);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 1597440, 40);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(qVar, z14, i14, 9);
        }
    }

    public static final void c(yw1.r rVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        final String str;
        final String str2;
        final String str3;
        String strP0;
        Integer num = rVar.f199967a;
        o0 o0VarE = mVar.E(819035860);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(rVar) : o0VarE.r(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (num != null) {
                l3.f23124b.getClass();
                str = l3.f23131i.format(num);
            } else {
                str = null;
            }
            final String strQ = gl1.y.Q(o0VarE, R.string.lbl_total_steps);
            Double d14 = rVar.f199969c;
            if (d14 != null) {
                str2 = l3.f23129g.format(d14.doubleValue());
            } else {
                str2 = null;
            }
            final String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_total_distance);
            final String strQ3 = gl1.y.Q(o0VarE, z14 ? R.string.lbl_km : R.string.lbl_mile);
            final String strQ4 = gl1.y.Q(o0VarE, z14 ? R.string.lbl_kilometers : R.string.lbl_miles);
            Double d15 = rVar.f199971e;
            if (d15 != null) {
                double dDoubleValue = d15.doubleValue();
                l3.f23124b.getClass();
                str3 = l3.f23131i.format(dDoubleValue);
            } else {
                str3 = null;
            }
            final String strQ5 = gl1.y.Q(o0VarE, R.string.calories_total_label);
            final String str4 = rVar.f199970d;
            final String strQ6 = gl1.y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
            Long l14 = rVar.f199972f;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                l3.f23124b.getClass();
                strP0 = l3.a.P0(context, jLongValue * 60000, true);
            } else {
                strP0 = null;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new rk0.n(25);
                o0VarE.K(objQ);
            }
            final String strA = oi0.c.A(context, (e23.l) objQ, strP0);
            final String strQ7 = gl1.y.Q(o0VarE, R.string.total_intensity_minutes);
            final boolean z15 = (str3 == null || str4 == null || strP0 == null) ? false : true;
            if (str == null && str2 == null && str3 == null && str4 == null && strP0 == null) {
                o0VarE.C(192307726);
                o0VarE.g0(false);
            } else {
                o0VarE.C(189828346);
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.j.i iVarI = c2.j.i(eVar.f97920e);
                bVar2.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar.f97920e);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                final String str5 = strP0;
                t0.a(c2.l.A(rVarF2, 0.0f, eVar.f97917b, 1), iVarI, iVarI2, null, 2, 0, z3.f.c(-1358947638, new e23.q() { // from class: rv1.e
                    /* JADX WARN: Type inference failed for: r13v1 */
                    /* JADX WARN: Type inference failed for: r13v2, types: [b92.a, h4.d$b, kotlin.jvm.internal.j] */
                    /* JADX WARN: Type inference failed for: r13v6 */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Object obj4;
                        ?? r14;
                        Object obj5;
                        Object obj6;
                        Object obj7;
                        int i16;
                        c1 c1Var = (c1) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        c1Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(c1Var) ? 4 : 2;
                        }
                        int i17 = iIntValue;
                        if (mVar2.n(i17 & 1, (i17 & 19) != 18)) {
                            x1 x1Var2 = p3.n.f135158a;
                            String str6 = str;
                            if (str6 != null) {
                                mVar2.C(-47293900);
                                l72.x0 x0Var = l72.x0.f111346a;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                String str7 = strQ;
                                c0235a.f16962a.put("merge", e5.g(str7, " , ", str6));
                                b92.a aVarB = c0235a.b();
                                int i18 = b92.a.f16960b;
                                int i19 = (i17 & 14) | (l72.x0.f111348c << 24);
                                r14 = 0;
                                obj4 = "merge";
                                x0Var.a(i19, 60, aVarB, c1Var, null, null, str6, str7, null, null, mVar2);
                                mVar2.f();
                            } else {
                                obj4 = "merge";
                                r14 = 0;
                                mVar2.C(-46982536);
                                mVar2.f();
                            }
                            String str8 = str2;
                            if (str8 != null) {
                                mVar2.C(-46920350);
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(r14, 1, r14);
                                String str9 = strQ2;
                                Object obj8 = obj4;
                                c0235a2.f16962a.put(obj8, j20.x.d(str9, " , ", str8, StringUtils.SPACE, strQ4));
                                b92.a aVarB2 = c0235a2.b();
                                int i24 = b92.a.f16960b;
                                obj5 = obj8;
                                x0Var2.a((i17 & 14) | (l72.x0.f111348c << 24), 52, aVarB2, c1Var, null, null, str8, str9, strQ3, null, mVar2);
                                mVar2.f();
                            } else {
                                obj5 = obj4;
                                mVar2.C(-46530184);
                                mVar2.f();
                            }
                            String str10 = str4;
                            if (str10 != null) {
                                mVar2.C(-46474632);
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(r14, 1, r14);
                                String str11 = strQ6;
                                Object obj9 = obj5;
                                c0235a3.f16962a.put(obj9, e5.g(str11, " , ", str10));
                                b92.a aVarB3 = c0235a3.b();
                                int i25 = b92.a.f16960b;
                                obj6 = obj9;
                                x0Var3.a((i17 & 14) | (l72.x0.f111348c << 24), 60, aVarB3, c1Var, null, null, str10, str11, null, null, mVar2);
                                mVar2.f();
                            } else {
                                obj6 = obj5;
                                mVar2.C(-46167112);
                                mVar2.f();
                            }
                            String str12 = str3;
                            if (str12 != null) {
                                mVar2.C(-46107096);
                                l72.x0 x0Var4 = l72.x0.f111346a;
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(r14, 1, r14);
                                String str13 = strQ5;
                                Object obj10 = obj6;
                                c0235a4.f16962a.put(obj10, e5.g(str13, " , ", str12));
                                b92.a aVarB4 = c0235a4.b();
                                int i26 = b92.a.f16960b;
                                obj7 = obj10;
                                x0Var4.a((i17 & 14) | (l72.x0.f111348c << 24), 60, aVarB4, c1Var, null, null, str12, str13, null, null, mVar2);
                                mVar2.f();
                            } else {
                                obj7 = obj6;
                                mVar2.C(-45784200);
                                mVar2.f();
                            }
                            String str14 = str5;
                            if (str14 != null) {
                                mVar2.C(-45707971);
                                l72.x0 x0Var5 = l72.x0.f111346a;
                                h4.r rVarZ = x2.z(h4.r.S, r14, 3);
                                b92.a.C0235a c0235a5 = new b92.a.C0235a(r14, 1, r14);
                                String str15 = strQ7;
                                c0235a5.f16962a.put(obj7, e5.g(str15, " , ", strA));
                                b92.a aVarB5 = c0235a5.b();
                                int i27 = b92.a.f16960b;
                                int i28 = (i17 & 14) | 1572864 | (l72.x0.f111348c << 24);
                                i16 = 3;
                                x0Var5.a(i28, 28, aVarB5, c1Var, null, rVarZ, str14, str15, null, null, mVar2);
                                mVar2.f();
                            } else {
                                i16 = 3;
                                mVar2.C(-45356648);
                                mVar2.f();
                            }
                            if (z15) {
                                mVar2.C(-45314240);
                                l72.x0.f111346a.h(c1Var, mVar2, (i17 & 14) | (l72.x0.f111348c << i16));
                                mVar2.f();
                            } else {
                                mVar2.C(-45260424);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 1597440, 40);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(rVar, z14, i14, 8);
        }
    }
}
