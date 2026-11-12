package d40;

import am.j;
import am.r1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import ci0.f;
import cn1.p;
import com.garmin.android.apps.connectmobile.R;
import d92.b;
import e23.l;
import f5.g0;
import g02.q1;
import g6.m;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import l72.w;
import n50.e;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    public static final void a(String str, e eVar, l<? super m, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        String str2 = str;
        str2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1554277329);
        c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), j.c(b.f58623a, o0VarE), m1.f128891a);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            int i16 = 6;
            if (z15) {
                objQ = new f(lVar, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(lVar, i16);
                    o0VarE.K(objQ);
                }
            }
            r rVarF = g0.f(rVarE, (l) objQ);
            d.f81522a.getClass();
            g.a aVar2 = d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            z zVarA = y.a(kVar, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
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
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            w.f111301a.b(o0VarE, 0);
            r rVarF2 = x2.f(aVar, 1.0f);
            b.f58625c.getClass();
            r rVarY = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
            s2 s2VarA = q2.a(c2.j.f22692b, d.a.f81534l, o0VarE, 48);
            int i17 = i15;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            r rVarA = u2.f22900a.a(aVar, 1.0f, true);
            z zVarA2 = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarA, o0VarE);
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
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            Double d14 = eVar.f123744a;
            double dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
            Double d15 = eVar.f123745b;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : Double.NaN;
            Double d16 = eVar.f123746c;
            double dDoubleValue3 = d16 != null ? d16.doubleValue() : Double.NaN;
            if (zf.b.D(Double.valueOf(dDoubleValue)) && dDoubleValue > 0.0d && zf.b.D(Double.valueOf(dDoubleValue2)) && zf.b.D(Double.valueOf(dDoubleValue3))) {
                o0VarE.C(680788546);
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                s20.e eVar3 = s20.e.f156007a;
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                Context context = (Context) o0VarE.A(y3Var);
                eVar3.getClass();
                String strP = gl1.y.P(R.string.title_course_distance, new Object[]{s20.e.c(dDoubleValue, context, zY)}, o0VarE);
                j92.f fVar2 = b.f58624b;
                fVar2.getClass();
                mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), 1.3f, o0VarE), o0VarE, 0, 0, 131070);
                boolean zR = r1.r();
                l3.a aVar4 = l3.f23124b;
                Context context2 = (Context) o0VarE.A(y3Var);
                aVar4.getClass();
                String strP2 = gl1.y.P(R.string.string_space_dot_space_string_pattern, new Object[]{gl1.y.P(R.string.course_ascent_subtitle, new Object[]{l3.a.c0(context2, dDoubleValue2, zR, true, false)}, o0VarE), gl1.y.P(R.string.course_descent_subtitle, new Object[]{l3.a.c0((Context) o0VarE.A(y3Var), dDoubleValue3, zR, true, false)}, o0VarE)}, o0VarE);
                fVar2.getClass();
                mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.f(j92.f.f97933j, o0VarE), 1.3f, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(false);
                str2 = str;
                z14 = true;
            } else {
                o0VarE.C(682525445);
                b.f58624b.getClass();
                str2 = str;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.f(j92.f.f97933j, o0VarE), 1.3f, o0VarE), o0VarE, i17 & 14, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(false);
                z14 = true;
            }
            e5.u(o0Var, z14, z14, z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(str2, eVar, lVar, i14);
        }
    }
}
