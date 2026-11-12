package tn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.List;
import l72.u1;
import o4.d0;
import p005kotlin.Metadata;
import p13.x;
import p13.y0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltn/r;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f165491f = 0;

    static {
        new a(null);
    }

    public static String p(hc1.a aVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return y.P(R.string.string_line_string_pattern, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.I(aVar))}, mVar), y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(ge1.b.J(aVar))}, mVar)}, mVar);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-90035855, true, new n(this, 0)), 4, null), new h82.c.b("HEART_RATE", context.getString(R.string.activity_details_heart_rate), null, new z3.e(1195026674, true, new n(this, 5)), 4, null), new h82.c.b("HEART_RATE_VARIABILITY", context.getString(R.string.lbl_heart_rate_variability), null, new z3.e(-1814878093, true, new n(this, 6)), 4, null), new h82.c.b("PULSE_OX", context.getString(R.string.device_settings_pulse_ox), null, new z3.e(-529815564, true, new n(this, 7)), 4, null), new h82.c.b("RESPIRATION", context.getString(R.string.activities_respiration_title), null, new z3.e(755246965, true, new n(this, 8)), 4, null), new h82.c.b("STRESS", context.getString(R.string.title_stress), null, new z3.e(2040309494, true, new n(this, 9)), 4, null), new h82.c.b("DOWNLOADABLE_REPORTS", context.getString(R.string.lbl_downloadable_reports), null, new z3.e(-969595273, true, new n(this, 10)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-596936025);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            tn.a.f165449a.getClass();
            h82.e.a(tn.a.f165450b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 1);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(798523454);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-139764463, new n(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 4);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-763083484);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1397016975, new n(this, 12), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 0);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2120670099);
        int i15 = 2;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-88374015, new n(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 3);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(862098530);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1038317067, new n(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 2);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1584297704);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1832741627, new n(this, 11), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 8);
        }
    }

    public final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-639919342);
        int i15 = 4;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1376986911, new n(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    public final void n(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1457421826);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = 4;
        int i16 = i14 | ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2);
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            y0 y0Var = new y0(jg.b.z(bc1.a.f17414a));
            List listK = x.k(p(hc1.a.NORMAL, o0VarE), p(hc1.a.MODERATE, o0VarE), p(hc1.a.LOW, o0VarE), e0.f(ge1.b.I(hc1.a.HARMFUL) + 1, "< ", "%"));
            float f14 = 1.0f;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(x2.d(h4.r.S, 1.0f), 32, 16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
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
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.C(-232730589);
            int i17 = 0;
            while (i17 < i15) {
                long jA = n5.a.a(o0VarE, ((Number) y0Var.get(i17)).intValue());
                String str = (String) listK.get(i17);
                h4.r rVarF = x2.f(h4.r.S, f14);
                boolean zR = (((i16 & 14) == i15 || ((i16 & 8) != 0 && o0VarE.r(this))) ? z14 : false) | o0VarE.r(context) | o0VarE.B(str);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new rp.b(this, 23, context, str);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new rp.b(this, 23, context, str);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarF, z14);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                p3.c<?> cVar2 = cVar;
                int i18 = i17;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar2 == null) {
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
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u1.d(u2.f22900a, d0.a(jA), str, 1.0f, o0VarE, 3078, 0);
                o0VarE.g0(true);
                i17 = i18 + 1;
                z14 = true;
                cVar = cVar2;
                f14 = 1.0f;
                i15 = 4;
            }
            o0VarE.g0(false);
            o0VarE.g0(z14);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01ad  */
    public final void o(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-553028518);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = 4;
        int i16 = i14 | ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            f02.b0.f67725a.getClass();
            gl.c cVar2 = gl.c.f77766a;
            cVar2.getClass();
            d0 d0VarA = d0.a(gl.c.a(o0VarE).b());
            cVar2.getClass();
            gl.e eVar = gl.c.f77767b;
            d0 d0VarA2 = d0.a(eVar.K);
            cVar2.getClass();
            d0 d0VarA3 = d0.a(eVar.N);
            cVar2.getClass();
            List listK = x.k(d0VarA, d0VarA2, d0VarA3, d0.a(eVar.P));
            List listK2 = x.k(Integer.valueOf(R.string.stress_level_rest), Integer.valueOf(R.string.stress_level_low), Integer.valueOf(R.string.stress_level_medium), Integer.valueOf(R.string.stress_level_high));
            List listK3 = x.k(y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"0", "25"}, o0VarE), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"26", "50"}, o0VarE), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"51", "75"}, o0VarE), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"76", "100"}, o0VarE));
            float f14 = 1.0f;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(x2.d(h4.r.S, 1.0f), 32, 16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
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
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.C(-1538009238);
            int i17 = 0;
            while (i17 < i15) {
                long j8 = ((d0) listK.get(i17)).f128833a;
                String strQ = y.Q(o0VarE, ((Number) listK2.get(i17)).intValue());
                String str = (String) listK3.get(i17);
                h4.r rVarF = x2.f(h4.r.S, f14);
                boolean zR = ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(this))) | o0VarE.r(context) | o0VarE.B(strQ) | o0VarE.B(str);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new rp.b(this, context, strQ, str);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new rp.b(this, context, strQ, str);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarF, true);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                p3.c<?> cVar3 = cVar;
                List list = listK3;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar3 == null) {
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
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                u1.d(u2Var, d0.a(j8), strQ, 0.55f, o0VarE, 3078, 0);
                u1.d(u2Var, null, str, 0.45f, o0VarE, 3078, 1);
                o0VarE.g0(true);
                i17++;
                listK3 = list;
                cVar = cVar3;
                i15 = 4;
                f14 = 1.0f;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 7);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Ltn/r$a;", "", "<init>", "()V", "", "FIRSTBEAT_ANALYTICS_RESPIRATION_RATE_URL", "Ljava/lang/String;", "FIRSTBEAT_ANALYTICS_STRESS_RECOVERY_URL", "AHA_URL", "FPH_URL", "MC_URL", "HEART_RATE", "HEART_RATE_VARIABILITY", "PULSE_OX", "RESPIRATION", "STRESS", "DOWNLOADABLE_REPORTS", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
