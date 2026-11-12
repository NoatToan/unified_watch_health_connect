package f10;

import android.content.Context;
import b82.g0;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d6.p;
import e11.f0;
import f5.z0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import u1.y0;
import v62.g2;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static final void a(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0VarE = mVar.E(2142896877);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarE = u1.n.e(aVar, jA, k2.i.a(j92.b.f97900c.f97911c));
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            bVar.getClass();
            r rVarZ = c2.l.z(rVarE, f14, eVar.f97917b);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
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
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22696f, aVar3, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97935l, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, i15 & 14, 0, 131070);
            fVar2.getClass();
            str3 = str2;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str3, i14, 9);
        }
    }

    public static final void b(r rVar, b bVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        boolean z14 = bVar.f67805a;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1485863850);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            r rVarE = u1.n.e(aVar2, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarD = w.d(c2.l.A(rVarE, eVar.f97920e, 0.0f, 2), false, null, null, aVar, 15);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            a(bVar.f67807c, bVar.f67808d, o0VarE, 0);
            r rVarF = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            r rVarC2 = c2.l.C(rVarF, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
            bVar2.getClass();
            r rVarA = c2.l.A(rVarC2, 0.0f, eVar.f97920e, 1);
            z zVarA = y.a(c2.j.f22696f, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14 || bVar.f67806b) {
                o0VarE.C(2010326466);
                d(0, null, o0VarE, z14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2010403346);
                o0VarE.g0(false);
            }
            String str = bVar.f67809e;
            p.f57793b.getClass();
            int i16 = p.f57795d;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i16, false, 2, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 24960, 110590);
            o0Var = o0VarE;
            c(0, bVar.f67810f, o0Var, bVar.f67811g);
            o0Var.g0(true);
            o0Var.g0(true);
            rVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar2, bVar, aVar, i14, 10);
        }
    }

    public static final void c(int i14, String str, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(671526129);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14) {
                o0VarE.C(-29664886);
                float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                bVar.getClass();
                float f15 = j92.b.f97901d.f97904c * f75992b;
                g6.f.a aVar3 = g6.f.f75994b;
                r rVarQ = x2.q(aVar, f15);
                s62.a.f157643a.getClass();
                i7.b(g2.a(t62.b.f162798a), null, rVarQ, sn.a.y(o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-29354483);
                o0VarE.g0(false);
            }
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, i15 & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(str, z14, i14);
        }
    }

    public static final void d(int i14, r rVar, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(428123380);
        int i15 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14) {
                o0VarE.C(276285105);
                float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                bVar.getClass();
                float f15 = j92.b.f97901d.f97904c * f75992b;
                g6.f.a aVar3 = g6.f.f75994b;
                y0.a(n5.c.a(2131232583, o0VarE, 0), null, x2.q(aVar, f15), null, null, 0.0f, null, o0VarE, 48, 120);
                o0VarE.g0(false);
            } else {
                o0VarE.C(276562834);
                o0VarE.g0(false);
            }
            String strQ = gl1.y.Q(o0VarE, z14 ? R.string.official_event : R.string.verified_source);
            d92.b.f58624b.getClass();
            rVar = aVar;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    public static final b e(Context context, List list, fg0.k kVar) {
        fg0.n nVar;
        String strG;
        String string;
        String string2;
        kVar.getClass();
        context.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            boolean z14 = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z14) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (d53.u.q(((fg0.n) next).getEventsProviderKey(), kVar.getProvider(), false)) {
                    if (!z14) {
                        z14 = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            nVar = (fg0.n) obj;
        } else {
            nVar = null;
        }
        fg0.d completionTarget = kVar.getCompletionTarget();
        if (completionTarget == null) {
            strG = "";
        } else if (completionTarget.getUnit() == gg0.i.SECOND) {
            l3.a aVar = l3.f23124b;
            Double value = completionTarget.getValue();
            Long lValueOf = value != null ? Long.valueOf((long) value.doubleValue()) : null;
            aVar.getClass();
            strG = String.valueOf(l3.a.g1(lValueOf));
        } else {
            Double dB = completionTarget.b();
            if (dB != null) {
                double dDoubleValue = dB.doubleValue();
                Locale locale = Locale.getDefault();
                if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                    l3.f23124b.getClass();
                    double dT1 = l3.a.T1(dDoubleValue / 1000.0d, 2);
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    strG = e5.g(String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dT1)}, 1)), StringUtils.SPACE, context.getString(R.string.unit_enum_km));
                } else {
                    l3.f23124b.getClass();
                    double dT2 = l3.a.T1(dDoubleValue / 1609.344d, 2);
                    p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                    strG = e5.g(String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dT2)}, 1)), StringUtils.SPACE, context.getString(R.string.unit_enum_mi));
                }
            } else {
                strG = "";
            }
        }
        List<String> listG0 = kVar.g0();
        boolean z15 = listG0 != null && listG0.contains("OFFICIAL");
        boolean z16 = (nVar != null ? nVar.getVerifiedStatus() : null) == gg0.j.VERIFIED;
        LocalDate date = kVar.getDate();
        String str = (date == null || (string2 = date.toString("MMM")) == null) ? "" : string2;
        LocalDate date2 = kVar.getDate();
        String str2 = (date2 == null || (string = date2.toString("d")) == null) ? "" : string;
        String strR = kVar.r(false);
        String str3 = strR == null ? "" : strR;
        og0.a aVar2 = og0.a.f131967a;
        String location = kVar.getLocation();
        aVar2.getClass();
        return new b(z15, z16, str, str2, str3, og0.a.s(location, strG), kVar.getCourseId() != null);
    }
}
