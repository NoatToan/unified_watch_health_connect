package kh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104763a;

        static {
            int[] iArr = new int[dh0.g.values().length];
            try {
                iArr[dh0.g.BMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.g.BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dh0.g.VIGOROUS_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dh0.g.VIGOROUS_MINUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dh0.g.RESTING_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f104763a = iArr;
        }
    }

    public static final void a(double d14, ih0.i iVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1021364385);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14 | (o0VarE.r(iVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            f(y.Q(o0VarE, R.string.lbl_weight_characteristic_bmi), y.P(R.string.lbl_maintain_value, new Object[]{ih0.i.d(Double.valueOf(d14))}, o0VarE), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(d14, iVar, i14, 2);
        }
    }

    public static final void b(double d14, boolean z14, ih0.i iVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-342432288);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            g(((i15 << 6) & 7168) | ((i15 << 3) & 57344), 4, null, aVar, y.Q(o0VarE, R.string.lbl_reduce_bmi), y.P(R.string.lbl_weekly_avg_param, new Object[]{ih0.i.d(Double.valueOf(d14))}, o0VarE), o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(d14, z14, iVar, aVar, i14, 0);
        }
    }

    public static final void c(double d14, ih0.i iVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(585609016);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14 | (o0VarE.r(iVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            f(y.Q(o0VarE, R.string.lbl_body_fat), y.P(R.string.lbl_maintain_value, new Object[]{iVar.a(Double.valueOf(d14), true)}, o0VarE), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(d14, iVar, i14, 0);
        }
    }

    public static final void d(double d14, boolean z14, ih0.i iVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-199515463);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            g(((i15 << 3) & 57344) | ((i15 << 6) & 7168), 4, null, aVar, y.Q(o0VarE, R.string.lbl_reduce_body_fat), y.P(R.string.lbl_weekly_avg_param, new Object[]{iVar.a(Double.valueOf(d14), true)}, o0VarE), o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(d14, z14, iVar, aVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v26 */
    public static final void e(List<dh0.d> list, e23.l<? super dh0.g, Unit> lVar, e23.l<? super dh0.g, Unit> lVar2, p3.m mVar, int i14) {
        ?? r14;
        Double d14;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-178791052);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                dh0.d dVar = (dh0.d) obj;
                if (ih0.f.b(dVar) && (d14 = dVar.f59566c) != null && d14.doubleValue() > 0.0d) {
                    arrayList.add(obj);
                }
            }
            List listN0 = h0.N0(arrayList, new ih0.h());
            listN0.getClass();
            List listZ0 = h0.z0(list, h0.g1(listN0));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listZ0) {
                if (ih0.f.b((dh0.d) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (ih0.f.a((dh0.d) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            ih0.i iVar = new ih0.i((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarC = c2.l.C(u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 0.0f, 16, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (arrayList3.isEmpty()) {
                o0VarE.C(-1806389672);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1806701036);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    dh0.g gVar = ((dh0.d) it.next()).f59564a;
                    int i16 = a.f104763a[gVar.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        o0VarE.C(1090556893);
                        boolean zK = ((i15 & 112) == 32) | o0VarE.k(gVar.ordinal());
                        Object objQ = o0VarE.q();
                        if (zK) {
                            r14 = 0;
                            objQ = new m(lVar, gVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                r14 = 0;
                                objQ = new m(lVar, gVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                r14 = 0;
                            }
                        }
                        w.e((e23.a) objQ, o0VarE, r14);
                        o0VarE.g0(r14);
                    } else {
                        o0VarE.C(1090559437);
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(false);
            }
            if (listN0.isEmpty()) {
                o0VarE.C(-1804808424);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1806292208);
                r1.b(y.Q(o0VarE, R.string.lbl_recommendations), z3.f.c(-216619433, new jt1.m(listN0, 10, iVar, lVar2), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
            if (arrayList2.isEmpty()) {
                o0VarE.C(-1804000936);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1804741867);
                r1.b(y.Q(o0VarE, R.string.lbl_on_target), z3.f.c(1068443096, new k41.e(11, arrayList2, iVar), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(list, lVar, lVar2, i14, 0);
        }
    }

    public static final void f(String str, String str2, p3.m mVar, int i14) {
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -142767043);
        int i15 = (o0VarK.B(str) ? 4 : 2) | i14 | (o0VarK.B(str2) ? 32 : 16);
        if (o0VarK.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            float f14 = 8;
            h4.r rVarF = x2.f(c2.l.z(h4.r.S, 16, f14), 1.0f);
            Object objQ = o0VarK.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new kb0.d(18);
                o0VarK.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, true);
            d92.b.f58623a.getClass();
            ve.a(rVarC, k2.i.a(f14), d0.c(0.5f, d92.b.a(o0VarK).c().a(), 14), 0L, 0.0f, 0.0f, null, z3.f.c(868243672, new b82.o(str, str2, 16), o0VarK), o0VarK, 12582912, 120);
        } else {
            o0VarK.e();
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str2, i14, 17);
        }
    }

    public static final void g(int i14, int i15, b92.a aVar, e23.a aVar2, String str, String str2, p3.m mVar, boolean z14) {
        int i16;
        b92.a aVar3 = aVar;
        str.getClass();
        str2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-301770361);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar3) : o0VarE.r(aVar3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            if (i17 != 0) {
                aVar3 = null;
            }
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-1298276267, new p(str, aVar3 != null ? aVar3.f16961a.get("label_secondary") : null, str2, z14), o0VarE);
            g6.f.a aVar4 = g6.f.f75994b;
            l72.l.c(eVarC, null, c2.l.z(h4.r.S, 16, 8), null, false, aVar2, o0VarE, ((i16 << 3) & 458752) | 390, 26);
        } else {
            o0VarE.e();
        }
        b92.a aVar5 = aVar3;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(str, str2, aVar5, z14, aVar2, i14, i15, 0);
        }
    }

    public static final void h(double d14, ih0.i iVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-223473639);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14 | (o0VarE.r(iVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.hr_zones_lbl_resting_heart_rate);
            int i16 = (int) d14;
            if (i16 <= 0) {
                i16 = 0;
            }
            f(strQ, y.P(R.string.lbl_maintain_hr, new Object[]{String.valueOf(i16)}, o0VarE), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(d14, iVar, i14, 1);
        }
    }

    public static final void i(double d14, boolean z14, ih0.i iVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1657425766);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = (int) d14;
            g(((i15 << 6) & 7168) | ((i15 << 3) & 57344), 4, null, aVar, y.Q(o0VarE, R.string.lbl_reduce_resting_heart_rate), y.P(R.string.lbl_monthly_avg_resting_hr, new Object[]{String.valueOf(i16 > 0 ? i16 : 0)}, o0VarE), o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(d14, z14, iVar, aVar, i14, 3);
        }
    }

    public static final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-851316769);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            f(y.Q(o0VarE, R.string.lbl_vigorous_days), y.P(R.string.lbl_maintain_vigorous_days, new Object[]{3}, o0VarE), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 9);
        }
    }

    public static final void k(double d14, boolean z14, ih0.i iVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        l22.a aVar2 = iVar.f93454a;
        aVar.getClass();
        o0 o0VarE = mVar.E(474089387);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_increase_vigorous_days);
            Double dValueOf = Double.valueOf(d14);
            String strP = y.P(R.string.lbl_6w_avg_quantity, new Object[]{aVar2.a(p005kotlin.jvm.internal.s.c(dValueOf, 1.0d) ? R.string.lbl_day_per_week_quantity : R.string.lbl_days_per_week_quantity, ih0.i.c(dValueOf))}, o0VarE);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            Double dValueOf2 = Double.valueOf(d14);
            c0235a.f16962a.put("label_secondary", aVar2.a(R.string.string_space_string_space_string_pattern, aVar2.getString(R.string.lbl_4_weeks), aVar2.getString(R.string.common_avg), aVar2.a(p005kotlin.jvm.internal.s.c(dValueOf2, 1.0d) ? R.string.lbl_day_per_week_quantity : R.string.lbl_days_per_week_quantity, ih0.i.c(dValueOf2))));
            b92.a aVarB = c0235a.b();
            int i16 = b92.a.f16960b;
            g(((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0, aVarB, aVar, strQ, strP, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(d14, z14, iVar, aVar, i14, 2);
        }
    }

    public static final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1191336030);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            f(y.Q(o0VarE, R.string.lbl_vigorous_minutes), y.P(R.string.lbl_maintain_vigorous_minutes, new Object[]{75}, o0VarE), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 8);
        }
    }

    public static final void m(double d14, boolean z14, ih0.i iVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        l22.a aVar2 = iVar.f93454a;
        aVar.getClass();
        o0 o0VarE = mVar.E(100395563);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_increase_vigorous_minutes);
            String strP = y.P(R.string.lbl_6w_avg_quantity, new Object[]{aVar2.a(R.string.lbl_min_per_week_quantity, ih0.i.c(Double.valueOf(d14)))}, o0VarE);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", aVar2.a(R.string.string_space_string_space_string_pattern, aVar2.getString(R.string.lbl_4_weeks), aVar2.getString(R.string.common_avg), aVar2.a(R.string.lbl_min_per_week_quantity, ih0.i.c(Double.valueOf(d14)))));
            b92.a aVarB = c0235a.b();
            int i16 = b92.a.f16960b;
            g(((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0, aVarB, aVar, strQ, strP, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(d14, z14, iVar, aVar, i14, 1);
        }
    }
}
