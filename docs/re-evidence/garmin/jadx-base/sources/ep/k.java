package ep;

import a11.b0;
import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import cq.t;
import cr.x;
import e11.c0;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import i3.bc;
import i3.i7;
import i3.m4;
import i3.mh;
import i3.u;
import i3.v7;
import i3.w7;
import i3.x3;
import java.util.Iterator;
import l72.p2;
import l72.v2;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import s5.x0;
import u1.a2;
import v62.h1;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ep/k$a", "Li3/bc;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f64829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f64830b;

        public a(Long l14, Long l15) {
            this.f64829a = l14;
            this.f64830b = l15;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            boolean z14 = j8 <= DateTime.now(DateTimeZone.UTC).withTimeAtStartOfDay().getMillis();
            Long l14 = this.f64829a;
            boolean z15 = l14 == null || j8 >= l14.longValue();
            Long l15 = this.f64830b;
            return z14 && z15 && (l15 == null || (j8 > l15.longValue() ? 1 : (j8 == l15.longValue() ? 0 : -1)) <= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, Long l14, e23.l<? super Long, Unit> lVar, Long l15, Long l16, p3.m mVar, int i14, int i15) {
        Long l17;
        int i16;
        Long l18;
        int i17;
        Long l19;
        Long l24;
        String strB;
        o0 o0VarE = mVar.E(1555432507);
        int i18 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(l14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            l17 = l15;
        } else {
            l17 = l15;
            i16 = i18 | (o0VarE.B(l17) ? 2048 : 1024);
        }
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i16 | 24576;
            l18 = l16;
        } else {
            l18 = l16;
            i17 = i16 | (o0VarE.B(l18) ? 16384 : 8192);
        }
        int i25 = i17;
        if (o0VarE.n(i25 & 1, (i25 & 9363) != 9362)) {
            Long l25 = i19 != 0 ? null : l17;
            Long l26 = i24 != 0 ? null : l18;
            x1 x1Var = p3.n.f135158a;
            int year = g22.l.d(b63.o.INSTANCE).f16206a.getYear();
            int i26 = year - 20;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean z14 = ((i25 & 7168) == 2048) | ((57344 & i25) == 16384);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a(l25, l26);
                o0VarE.K(objQ2);
            }
            m4 m4VarP = x3.p(l14, new j23.l(i26, year), (a) objQ2, o0VarE, (i25 >> 3) & 14, 10);
            if (l14 == null || (strB = j0.b(new DateTime(l14.longValue()), "MMM d, yyyy", DateTimeZone.getDefault())) == null) {
                strB = "";
            }
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(188859496, new l1(p1Var, 6, (byte) 0), o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new dv0.f(p1Var, 24);
                o0VarE.K(objQ3);
            }
            Long l27 = l25;
            Long l28 = l26;
            p2Var.h(str, strB, null, null, null, false, false, null, eVarC, null, (e23.a) objQ3, o0VarE, (i25 & 14) | 100663296, 6, 764);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-510567336);
                r.a aVar = r.S;
                bc bcVarE = m4VarP.e();
                j23.l lVar2 = m4VarP.f87404a;
                boolean z15 = (i25 & 896) == 256;
                Object objQ4 = o0VarE.q();
                if (z15 || objQ4 == c2565a) {
                    objQ4 = new b0(lVar, p1Var, 11);
                    o0VarE.K(objQ4);
                }
                o0VarE = o0VarE;
                vx.c.a(aVar, null, 0, bcVarE, lVar2, true, 0L, (e23.l) objQ4, o0VarE, 196614, 70);
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(-510239449);
                o0VarE.g0(false);
            }
            l24 = l28;
            l19 = l27;
        } else {
            o0VarE.e();
            l19 = l17;
            l24 = l18;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(str, l14, lVar, l19, l24, i14, i15, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(r rVar, boolean z14, e23.l lVar, double d14, p3.m mVar, int i14) {
        r rVar2;
        o0 o0Var;
        int i15;
        o0 o0Var2;
        o0 o0VarE = mVar.E(1791528871);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.m(d14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarE, R.string.lbl_watts);
            String strQ2 = y.Q(o0VarE, R.string.power_curve_list_watts_item_label);
            String strQ3 = y.Q(o0VarE, R.string.lbl_watt_kg);
            String strQ4 = y.Q(o0VarE, R.string.lbl_watts_per_kg_long);
            String str = z14 ? strQ3 : strQ;
            String str2 = z14 ? strQ4 : strQ2;
            String strP = y.P(R.string.string_string_bracket_pattern, new Object[]{y.Q(o0VarE, R.string.power_curve_label), str}, o0VarE);
            String strP2 = y.P(R.string.string_string_bracket_pattern, new Object[]{y.Q(o0VarE, R.string.power_curve_label), str2}, o0VarE);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarC = c2.l.C(aVar, f14, eVar.f97920e, 0.0f, 0.0f, 12);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r rVarA = v2.a(aVar, d14 > 1.0d, new eb0.a(p1Var, 1), o0VarE, 6);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarA, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            bVar.getClass();
            r rVarC4 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            h4.g.b bVar3 = h4.d.a.f81534l;
            r rVarC5 = u2Var.c(rVarC4, bVar3);
            boolean zB = o0VarE.B(strP2);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == obj) {
                objQ2 = new t(strP2, 19);
                o0VarE.K(objQ2);
            }
            mh.c(strP, v.c((e23.l) objQ2, rVarC5, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0 o0Var3 = o0VarE;
            if (d14 > 1.0d) {
                o0Var3.C(1376640594);
                s62.a.f157643a.getClass();
                u4.d dVarA = h1.a(t62.b.f162798a);
                long jB = d92.b.a(o0Var3).f().b();
                bVar.getClass();
                i7.b(dVarA, null, u2Var.c(x2.q(aVar, j92.b.f97901d.f97903b), bVar3), jB, o0Var3, 48, 0);
                i15 = 0;
                o0Var3.g0(false);
            } else {
                i15 = 0;
                o0Var3.C(1376976417);
                o0Var3.g0(false);
            }
            o0Var3.g0(true);
            if (d14 > 1.0d) {
                o0Var3.C(-1175907575);
                g6.f.a aVar3 = g6.f.f75994b;
                r rVarI = x2.i(aVar, i15, 250);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                long jW = ds.e0.w(o0Var3);
                Object objQ3 = o0Var3.q();
                if (objQ3 == obj) {
                    objQ3 = new dv0.f(p1Var, 23);
                    o0Var3.K(objQ3);
                }
                u.a(zBooleanValue, (e23.a) objQ3, rVarI, 0L, null, null, null, jW, 0.0f, 0.0f, z3.f.c(-1658937507, new cv0.h(strQ4, strQ3, z14, lVar, strQ2, strQ, p1Var), o0Var3), o0Var3, 432, 48, 1912);
                o0 o0Var4 = o0Var3;
                o0Var4.g0(i15);
                o0Var2 = o0Var4;
            } else {
                o0Var3.C(-1174825179);
                o0Var3.g0(i15);
                o0Var2 = o0Var3;
            }
            o0Var2.g0(true);
            rVar2 = aVar;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.i2(rVar2, z14, lVar, d14, i14);
        }
    }

    public static final void c(String str, String str2, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1504164937);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            v7.f89994a.getClass();
            w7 w7VarA = v7.a(o0VarE);
            d92.b.f58623a.getClass();
            w7 w7VarA2 = w7.a(w7VarA, d92.b.a(o0VarE).f().b());
            r.a aVar2 = r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new e70.a(19);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((e23.l) objQ, aVar2, true);
            z3.e eVarC = z3.f.c(895896039, new b82.o(str2, str, 7), o0VarE);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new e52.c(aVar, 6);
                o0VarE.K(objQ2);
            }
            u.b(eVarC, (e23.a) objQ2, rVarC, null, z3.f.c(2107445603, new an1.i(z14, 19), o0VarE), true, w7VarA2, null, o0VarE, 221190, 392);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ea0.a(str, str2, z14, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x031c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0342  */
    /* JADX WARN: Code duplicated, block: B:82:0x036d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(r rVar, o oVar, p3.m mVar, int i14) {
        o oVar2;
        r rVar2;
        oVar.getClass();
        o0 o0VarE = mVar.E(-36693864);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.r(oVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p0.c(oVar.f64851j, o0VarE, 0);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Boolean bool = Boolean.TRUE;
            boolean zR = o0VarE.r(oVar) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new l(oVar, context, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l(oVar, context, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, bool, o0VarE);
            r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
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
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97918c;
            float f16 = eVar2.f97920e;
            r rVarE = u1.n.e(x2.f(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7), 1.0f), ds.e0.f(o0VarE), m1.f128891a);
            z zVarA2 = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
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
            boolean z14 = ((n) p1VarC.getF182175a()).f64839b;
            boolean zR2 = o0VarE.r(oVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new j(oVar, 5);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new j(oVar, 5);
                    o0VarE.K(objQ2);
                }
            }
            b(null, z14, (e23.l) objQ2, ((n) p1VarC.getF182175a()).f64838a, o0VarE, 0);
            String strQ = y.Q(o0VarE, R.string.lbl_power_curve_compare_activity);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            bVar2.getClass();
            bVar2.getClass();
            bVar2.getClass();
            bVar2.getClass();
            rVar2 = aVar;
            mh.c(strQ, c2.l.B(aVar, f16, f15, f16, eVar2.f97922g), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            x.e(((n) p1VarC.getF182175a()).f64841d, ((n) p1VarC.getF182175a()).f64839b, o0VarE, 0);
            bVar2.getClass();
            bVar2.getClass();
            oVar2 = oVar;
            t0.a(c2.l.z(rVar2, f16, f15), null, null, null, 0, 0, z3.f.c(-1090509143, new c0(4, oVar2, p1VarC), o0VarE), o0VarE, 1572864, 62);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            if (((n) p1VarC.getF182175a()).f64840c == c.CUSTOM) {
                o0VarE.C(871062407);
                z zVarA3 = c2.y.a(kVar, aVar3, o0VarE, 0);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC3 = h4.k.c(rVar2, o0VarE);
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
                b4.c(eVar, zVarA3, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                p1 p1VarC2 = p0.c(oVar2.f64845d, o0VarE, 0);
                p1 p1VarC3 = p0.c(oVar2.f64847f, o0VarE, 0);
                DateTime dateTimeK = j0.K((String) p1VarC2.getF182175a(), "MMM d, yyyy");
                Long lValueOf = dateTimeK != null ? Long.valueOf(dateTimeK.getMillis()) : null;
                DateTime dateTimeK2 = j0.K((String) p1VarC3.getF182175a(), "MMM d, yyyy");
                Long lValueOf2 = dateTimeK2 != null ? Long.valueOf(dateTimeK2.getMillis()) : null;
                T f182175a = p1VarC2.getF182175a();
                T f182175a2 = p1VarC3.getF182175a();
                c cVar2 = ((n) p1VarC.getF182175a()).f64840c;
                boolean zB = o0VarE.B(lValueOf) | o0VarE.B(lValueOf2) | o0VarE.r(oVar2);
                Object objQ3 = o0VarE.q();
                if (zB) {
                    objQ3 = new m(lValueOf, lValueOf2, oVar2, null);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new m(lValueOf, lValueOf2, oVar2, null);
                        o0VarE.K(objQ3);
                    }
                }
                l0.g(f182175a, f182175a2, cVar2, (p) objQ3, o0VarE);
                String strQ2 = y.Q(o0VarE, R.string.lbl_start);
                boolean zR3 = o0VarE.r(oVar2);
                Object objQ4 = o0VarE.q();
                if (zR3) {
                    objQ4 = new j(oVar2, 6);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new j(oVar2, 6);
                        o0VarE.K(objQ4);
                    }
                }
                Long l14 = lValueOf;
                a(strQ2, l14, (e23.l) objQ4, null, lValueOf2, o0VarE, 0, 8);
                String strQ3 = y.Q(o0VarE, R.string.common_end);
                boolean zR4 = o0VarE.r(oVar2);
                Object objQ5 = o0VarE.q();
                if (zR4) {
                    objQ5 = new j(oVar2, 7);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new j(oVar2, 7);
                        o0VarE.K(objQ5);
                    }
                }
                a(strQ3, lValueOf2, (e23.l) objQ5, l14, null, o0VarE, 0, 16);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(872458740);
                o0VarE.g0(false);
            }
            e(((n) p1VarC.getF182175a()).f64841d.f64813b, ((n) p1VarC.getF182175a()).f64839b, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            oVar2 = oVar;
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(rVar2, oVar2, i14, 19);
        }
    }

    public static final void e(i53.c<b> cVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        b next;
        o0 o0VarE = mVar.E(1164671449);
        int i16 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        int i17 = 6;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1981522038, R.string.lbl_power_curve_records_watts_per_kilogram, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1981609396, R.string.common_watts, o0VarE, false);
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.power_curve_records_title);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            bVar.getClass();
            mh.c(strQ, c2.l.y(aVar, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            d2.f16532a.d(null, z3.f.c(-2064004504, new as.s(strJ, 13), o0VarE), o0VarE, 48, 1);
            if (cVar.isEmpty()) {
                i15 = 6;
                z15 = true;
                o0VarE.C(-385147981);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-386799940);
                String strQ2 = y.Q(o0VarE, R.string.no_value);
                int i18 = 0;
                for (Object obj : f.f64816a) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    int iIntValue = ((Number) obj).intValue();
                    Iterator<b> it = cVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        b bVar3 = next;
                        Integer num = bVar3.f64803c;
                        if (num != null && num.intValue() == iIntValue && bVar3.f64801a.f117347b != 0.0f && bVar3.f64805e != null) {
                            break;
                        }
                    }
                    b bVar4 = next;
                    o0 o0Var = o0VarE;
                    d2.f16532a.g(i18, 384, 0, v2.a(r.S, (bVar4 != null ? bVar4.f64804d : null) != null, new c0(3, bVar4, context), o0VarE, i17), o0Var, z3.f.c(-1832753121, new i(iIntValue, context, bVar4, strQ2, z14, 0), o0VarE));
                    i17 = i17;
                    o0VarE = o0Var;
                    i18 = i19;
                }
                i15 = i17;
                z15 = true;
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            i15 = 6;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(cVar, z14, i14, i15);
        }
    }
}
